/*
 * Copyright (C) 2007 Quadduc <quadduc@gmail.com>
 * 
 * This file is part of Lateral GM.
 * Lateral GM is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.gcreator.components;

//import com.sun.org.apache.xml.internal.serializer.utils.Messages;
import org.gcreator.components.impl.DocumentUndoManager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jedit.EGMLTokenMarker;
import jedit.JEditTextArea;
import jedit.KeywordMap;
import jedit.SyntaxDocument;


public class GMLTextArea extends JEditTextArea
	{
	private static final long serialVersionUID = 1L;
	private final EGMLTokenMarker gmlTokenMarker = new EGMLTokenMarker();
	public final ResourceChangeListener rcl = new ResourceChangeListener();
	private final DocumentUndoManager undoManager = new DocumentUndoManager();
	private static Timer timer;
	private Integer lastUpdateTaskID = 0;

	public GMLTextArea(String text)
		{
		super();
		setDocument(new SyntaxDocument());
		//getDocument().getDocumentProperties().put(PlainDocument.tabSizeAttribute,Prefs.tabSize);
		updateTokenMarker();
		setTokenMarker(gmlTokenMarker);
		//painter.setFont(Prefs.codeFont);
		//painter.setStyles(PrefsStore.getSyntaxStyles());
		painter.setBracketHighlightColor(Color.gray);
		//putClientProperty(InputHandler.KEEP_INDENT_PROPERTY,Boolean.TRUE);
		//putClientProperty(InputHandler.SMART_HOME_END_PROPERTY,Boolean.TRUE);
		text = text.replace("\r\n","\n");
		//text = Util.convertIndents(text);
		setText(text);
		setCaretPosition(0);
		//LGM.currentFile.addChangeListener(rcl);
		addCaretListener(undoManager);
		document.addUndoableEditListener(undoManager);
		inputHandler.addKeyBinding("C+Z",undoManager.getUndoAction());
		inputHandler.addKeyBinding("C+Y",undoManager.getRedoAction());
		}

	private static JButton makeToolbarButton(Action a)
		{
		JButton b = new JButton(a);
		b.setToolTipText(b.getText());
		b.setText(null);
		b.setRequestFocusEnabled(false);
		return b;
		}

	private JButton makeInputHandlerToolbarButton(final ActionListener l, String key)
		{
		final GMLTextArea source = this;
		Action a = new AbstractAction(""+key)
			{
				private static final long serialVersionUID = 1L;

				public void actionPerformed(ActionEvent e)
					{
					getInputHandler().executeAction(l,source,null);
					}
			};
		return makeToolbarButton(a);
		}

	public void addEditorButtons(JToolBar tb)
		{
		tb.add(makeToolbarButton(getUndoManager().getUndoAction()));
		tb.add(makeToolbarButton(getUndoManager().getRedoAction()));
		tb.addSeparator();
		//tb.add(makeInputHandlerToolbarButton(InputHandler.CUT,"ScriptFrame.CUT"));
		//tb.add(makeInputHandlerToolbarButton(InputHandler.COPY,"ScriptFrame.COPY"));
		//tb.add(makeInputHandlerToolbarButton(InputHandler.PASTE,"ScriptFrame.PASTE"));
		}

	public DocumentUndoManager getUndoManager()
		{
		return undoManager;
		}

	public String getTextCompat()
		{
		String s = getText();
		s = s.replaceAll("\r?\n","\r\n");
		String tab = "";
	//	for (int i = 0; i < Prefs.tabSize; i++)
	//		tab += " ";
		/*
		 * If anyone knows how to replace only the tabs at the
		 * start of the line using regexes, please fix this.
		 */
		s = s.replaceAll("\t",tab);
		return s;
		}

	public void updateTokenMarker()
		{
		KeywordMap km = new KeywordMap(false);
//		int[] kmResources = { Resource.BACKGROUND,Resource.FONT,Resource.GMOBJECT,Resource.PATH,
//				Resource.ROOM,Resource.SCRIPT,Resource.SOUND,Resource.SPRITE,Resource.TIMELINE };
//		for (int j : kmResources)
//			{
//			ResourceList<?> rl = LGM.currentFile.getList(j);
//			for (Resource<?> r : rl)
//				{
//				String n = r.getName();
//				if (n.length() > 0) km.add(n,Token.KEYWORD3);
//				}
//			}
		gmlTokenMarker.setCustomKeywords(km);
		}

	private class ResourceChangeListener implements ChangeListener
		{
		public void stateChanged(ChangeEvent e)
			{
			if (timer == null) timer = new Timer();
			timer.schedule(new UpdateTask(),500);
			}
		}

	private class UpdateTask extends TimerTask
		{
		private int id;

		public UpdateTask()
			{
			synchronized (lastUpdateTaskID)
				{
				id = ++lastUpdateTaskID;
				}
			}

		public void run()
			{
			synchronized (lastUpdateTaskID)
				{
				if (id != lastUpdateTaskID) return;
				}
			SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
						{
						updateTokenMarker();
						int fl = getFirstLine();
						painter.invalidateLineRange(fl,fl + getVisibleLines());
						}
				});
			}
		}
	}
