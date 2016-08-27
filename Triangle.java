package com.rakesh.example.springbeans;

import java.awt.List;
import java.util.* ;

public class Triangle {
	
	private ArrayList<Point> points;
	
	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}

	public void Draw(){
		
		for(Point point : points){
		System.out.println("Point  (" + point.getX() + " , " + point.getY()+ " ) ");
		}
	}
}
