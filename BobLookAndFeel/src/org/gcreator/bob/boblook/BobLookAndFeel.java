/*
 * @(#)BobLookAndFeel.java	1.185 06/03/29
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.gcreator.bob.boblook;

import java.util.*;

import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.border.*;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class BobLookAndFeel extends BasicLookAndFeel
{
    private static final long serialVersionUID = 1;
    
    public String getName() {
        return "Bob Look";
    }

    public String getID() {
        return "Bob";
    }

    public String getDescription() {
        return "The Bob Look and Feel";
    }


    public boolean isNativeLookAndFeel() {
        return false;
    }


    public boolean isSupportedLookAndFeel() {
        return true;
    }
    
    @Override
    protected void initClassDefaults(UIDefaults table)
    {
	final String basicPackageName = "javax.swing.plaf.basic.";
	Object[] uiDefaults = {
		   "ButtonUI", basicPackageName + "BasicButtonUI",
		 "CheckBoxUI", basicPackageName + "BasicCheckBoxUI",
             "ColorChooserUI", basicPackageName + "BasicColorChooserUI",
       "FormattedTextFieldUI", basicPackageName + "BasicFormattedTextFieldUI",
		  "MenuBarUI", basicPackageName + "BasicMenuBarUI",
		     "MenuUI", basicPackageName + "BasicMenuUI",
		 "MenuItemUI", basicPackageName + "BasicMenuItemUI",
	 "CheckBoxMenuItemUI", basicPackageName + "BasicCheckBoxMenuItemUI",
      "RadioButtonMenuItemUI", basicPackageName + "BasicRadioButtonMenuItemUI",
	      "RadioButtonUI", basicPackageName + "BasicRadioButtonUI",
	     "ToggleButtonUI", basicPackageName + "BasicToggleButtonUI",
		"PopupMenuUI", basicPackageName + "BasicPopupMenuUI",
	      "ProgressBarUI", basicPackageName + "BasicProgressBarUI",
		"ScrollBarUI", basicPackageName + "BasicScrollBarUI",
	       "ScrollPaneUI", basicPackageName + "BasicScrollPaneUI",
		"SplitPaneUI", basicPackageName + "BasicSplitPaneUI",
		   "SliderUI", basicPackageName + "BasicSliderUI",
		"SeparatorUI", basicPackageName + "BasicSeparatorUI",
		  "SpinnerUI", basicPackageName + "BasicSpinnerUI",
	 "ToolBarSeparatorUI", basicPackageName + "BasicToolBarSeparatorUI",
       "PopupMenuSeparatorUI", basicPackageName + "BasicPopupMenuSeparatorUI",
	       "TabbedPaneUI", basicPackageName + "BasicTabbedPaneUI",
		 "TextAreaUI", basicPackageName + "BasicTextAreaUI",
		"TextFieldUI", basicPackageName + "BasicTextFieldUI",
	    "PasswordFieldUI", basicPackageName + "BasicPasswordFieldUI",
		 "TextPaneUI", basicPackageName + "BasicTextPaneUI",
               "EditorPaneUI", basicPackageName + "BasicEditorPaneUI",
		     "TreeUI", basicPackageName + "BasicTreeUI",
		    "LabelUI", basicPackageName + "BasicLabelUI",
		     "ListUI", basicPackageName + "BasicListUI",
		  "ToolBarUI", basicPackageName + "BasicToolBarUI",
		  "ToolTipUI", basicPackageName + "BasicToolTipUI",
		 "ComboBoxUI", basicPackageName + "BasicComboBoxUI",
		    "TableUI", basicPackageName + "BasicTableUI",
	      "TableHeaderUI", basicPackageName + "BasicTableHeaderUI",
	    "InternalFrameUI", basicPackageName + "BasicInternalFrameUI",
	      "DesktopPaneUI", basicPackageName + "BasicDesktopPaneUI",
	      "DesktopIconUI", basicPackageName + "BasicDesktopIconUI",
	       "OptionPaneUI", basicPackageName + "BasicOptionPaneUI",
	            "PanelUI", basicPackageName + "BasicPanelUI",
		 "ViewportUI", basicPackageName + "BasicViewportUI",
		 "RootPaneUI", basicPackageName + "BasicRootPaneUI",
                 "FileChooserUI", "org.gcreator.bob.boblook.BobFileChooserUI",
	};
	table.putDefaults(uiDefaults);
    }
    
    @Override
    protected void initSystemColorDefaults(UIDefaults table)
    {
	String[] defaultSystemColors = {
  	        "desktop", "#005C5C", /* Color of the desktop background */
	  "activeCaption", "#000080", /* Color for captions (title bars) when they are active. */
      "activeCaptionText", "#FFFFFF", /* Text color for text in captions (title bars). */
    "activeCaptionBorder", "#C0C0C0", /* Border color for caption (title bar) window borders. */
        "inactiveCaption", "#808080", /* Color for captions (title bars) when not active. */
    "inactiveCaptionText", "#C0C0C0", /* Text color for text in inactive captions (title bars). */
  "inactiveCaptionBorder", "#C0C0C0", /* Border color for inactive caption (title bar) window borders. */
	         "window", "#FFFFFF", /* Default color for the interior of windows */
	   "windowBorder", "#000000", /* ??? */
	     "windowText", "#000000", /* ??? */
		   "menu", "#C0C0C0", /* Background color for menus */
	       "menuText", "#000000", /* Text color for menus  */
		   "text", "#C0C0C0", /* Text background color */
	       "textText", "#000000", /* Text foreground color */
	  "textHighlight", "#000080", /* Text background color when selected */
      "textHighlightText", "#FFFFFF", /* Text color when selected */
       "textInactiveText", "#808080", /* Text color when disabled */
	        "control", "#C0C0C0", /* Default color for controls (buttons, sliders, etc) */
	    "controlText", "#000000", /* Default color for text in controls */
       "controlHighlight", "#C0C0C0", /* Specular highlight (opposite of the shadow) */
     "controlLtHighlight", "#FFFFFF", /* Highlight color for controls */
	  "controlShadow", "#808080", /* Shadow color for controls */
        "controlDkShadow", "#000000", /* Dark shadow color for controls */
	      "scrollbar", "#E0E0E0", /* Scrollbar background (usually the "track") */
		   "info", "#FFFFE1", /* ??? */
	       "infoText", "#000000"  /* ??? */
	};

	loadSystemColors(table, defaultSystemColors, isNativeLookAndFeel());
    }
}