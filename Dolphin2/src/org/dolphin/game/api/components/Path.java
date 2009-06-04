package org.dolphin.game.api.components;

import java.util.ArrayList;

public class Path {
	ArrayList<PathPoint> al = new ArrayList<PathPoint>();
	boolean closed=true,smooth=false;
	int precision=4,distance=0;
	
	public Path(boolean closed,boolean smooth,int precision){
		this.closed=closed;
		this.smooth=smooth;
		this.precision=precision;
	}
	
	public void findDistance(){
		for (int i = 0; i < al.size()-1; i++) {
			
			distance+=org.dolphin.game.api.Math.pointDistance(al.get(i).x, al.get(i).y, al.get(i+1).x, al.get(i+1).y);
			
		}
	}
	
	public void setClosed(boolean closed){
		if (closed) {
			if(al.size()>0){
		al.add(al.get(0));
		this.closed=true;
		}
		}
		else{
			if (this.closed)
			al.remove(al.size());
			this.closed=false;
			}
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