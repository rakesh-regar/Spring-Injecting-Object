package com.rakesh.example.springbeans;

public class Circle implements Shape{
    Point center ;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void Draw() {
		System.out.println("Cirlcle ");
		System.out.println("Cirlcle center : ( " + center.getX()+ "," + center.getY()+ ")");
	}

}
