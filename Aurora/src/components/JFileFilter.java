/*
 * JFileFilter.java
 *
 * Created on 11 April 2007, 16:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package components;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class JFileFilter extends FileFilter
	{
	private static final long serialVersionUID = 1L;
	private String filter;
	private String desc;

	public JFileFilter(String a,String b)
		{
		filter = a;
		desc = b;
		}

	public boolean accept(File f)
		{
		if (f.isDirectory()) return true;
		String fname = f.getName().toLowerCase();
		if (fname.matches(filter))
			return true;
		return false;
		}

	public String getDescription()
		{
		return desc;
		}
	}
