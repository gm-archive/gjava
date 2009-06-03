package org.dolphin.game.api.components;

import java.util.ArrayList;

public class Path {
	ArrayList<PathPoint> al = new ArrayList<PathPoint>();
	boolean closed=true,smooth=false;
	int precision=4;
	
	public Path(boolean closed,boolean smooth,int precision){
		this.closed=closed;
		this.smooth=smooth;
		this.precision=precision;
	}
	
	public void addPoint(double x,double y, double speed){
		al.add(new PathPoint(x,y,speed));
	}
	
	public double getPointX(int position){
		return al.get(position).x;
	}
	
	public double getPointY(int position){
		return al.get(position).y;
	}
	
	public double getPointSpeed(int position){
		return al.get(position).speed;
	}
	
}

class PathPoint{
	double x,y,speed;
	
	PathPoint(double x, double y,double speed){
		this.x=x;
		this.y=y;
		this.speed=speed;
	}
}