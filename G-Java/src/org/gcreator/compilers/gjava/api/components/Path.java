package org.gcreator.compilers.gjava.api.components;

import java.util.Vector;

public class Path
	{
	
	public Vector x = new Vector();
	public Vector y = new Vector();
	public Vector speed = new Vector();
	public int connection_kind;
	public int precision;
	public int closed;
	public int at_end;
	public int rel_speed;
	public int relative;
	public int points;
	
	Path(int size)
		{
		x.setSize(size);
		setup_path();
		}
	
	public void setup_path()
		{
		
		}
	
	}
