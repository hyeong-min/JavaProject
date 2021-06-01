package com.java.act4;

import java.util.Scanner;

public class CircleManger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle c [] = new Circle[3]; //3개의 Circle 배열선언
		int max=0;
		for (int i = 0; i < c.length; i++) {
		System.out.println("x,y,radius>>");
		double x = sc.nextDouble(); //x값읽기
		double y = sc.nextDouble(); // y값읽기
		int radius = sc.nextInt(); //radius값읽기
		c[i] = new Circle(x, y, radius); // Circle 객체생성
		}
		for (int i = 0; i < c.length; i++) 
			if (max < c[i].getRadius()) 
				max = c[i].getRadius();
		for (int i = 0; i < c.length; i++) {
			if (max == c[i].getRadius()) {
				System.out.println("가장면적이큰원은");
				c[i].show();
			}
			sc.close();
		}	
		
		
		
	

}
}
