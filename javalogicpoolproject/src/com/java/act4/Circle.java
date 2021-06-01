package com.java.act4;

public class Circle {

	
	private double x,y;
	private int radius;
	public Circle(double x, double y,int radius) {
		// TODO Auto-generated constructor stub
		this.x = x; //x,y,radius 초기화
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("("+x+","+y+")"+radius);
	}
	public int getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}
	}

