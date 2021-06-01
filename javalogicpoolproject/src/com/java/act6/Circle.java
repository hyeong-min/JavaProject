package com.java.act6;

public class Circle {
	private int x,y,radius;

	public Circle(int x, int y, int radius) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle("+x+","+y+")반지름"+radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Circle p= (Circle)obj;
		if (p.x==x && p.y==y) 
		return true;
	else 
		return false;
	
}
}

