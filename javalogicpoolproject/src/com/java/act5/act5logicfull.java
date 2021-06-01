package com.java.act5;

import java.util.Scanner;

/* 예제 1-2 기본로직 class TV{
	private int size;
	public TV(int size) { this.size = size;}
	   protected int getsize() { return size; }
}*/

/*		// TODO Auto-generated method stub
예제 5-1 기본로직 ColorTV myTv = new ColorTV(32,1024);
myTv.printProperty();*/

/*예제5-2 기본로직 IPTV iptv = new IPTV("192.1.1.2",32,2048);
iptv.printProperty();*/

/*예제 5-3 기본로직 클래스따로파서작성	Won2Dollar toDollar = new Won2Dollar(1200);
toDollar.run();*/

/*예제 5-4 기본로직 Km2Mile toMile = new Km2Mile(1.6); //1마일은 1.6km
 * toMile.run(); */

/*예제5-5 기본클래스포인트로직
 *  class Point {

	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
this.x=x;
this.y=y;
	}
}*/
/* 5-5 메인로직 ColorPoint cp = new ColorPoint(5,5,"YELLOW");
cp.setXY(10,20);
cp.setColor("RED");
String str = cp.toString();
System.out.println(str+"입니다");*/

/*	예제 5-6로직 ColorPoint zeroPoint = new ColorPoint();
System.out.println(zeroPoint.toString() + "입니다.");

ColorPoint cp = new ColorPoint(10, 10);
cp.setXY(5, 5);
cp.setColor("RED");
System.out.println(cp.toString()+"입니다");

}*/
/* 예제 5-7 로직 
 * 메인로직
 *  ColorPoint zeroPoint = new ColorPoint();
		 System.out.println(zeroPoint.toString() + "입니다.");

		 ColorPoint cp = new ColorPoint(10, 10);
		 cp.setXY(5, 5);
		 cp.setColor("RED");
		 System.out.println(cp.toString()+"입니다");
 * 
 * */


public class act5logicfull{
	 public static void main(String[] args) {
		// 1_2_3_4_5_6_7_8 까지작성
		 
	
}
}


/* 5-3예제로직 abstract class Converter {

abstract protected double convert(double src); 
abstract protected String getSrcString();
abstract protected String getDestString();
protected double ratio;

public void run() {
	// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	 System.out.println(getSrcString()+"을"+getDestString()+"로 바꿉니다");
	 System.out.print(getSrcString()+"을 입력하세요>>");
	 double val = sc.nextDouble();
	 double res = convert(val);
	 System.out.println("변환결과:"+res+getDestString()+"입니다");
	 sc.close();
}
}*/



/*//5-1 class TV{
private int size;
public TV(int size) { this.size = size;}
   protected int getsize() { return size; }
}

class ColorTV extends TV{
private int resolution;
public ColorTV(int size, int resolution) {
	super(size);
	this.resolution = resolution;
	// TODO Auto-generated constructor stub
}

public void printProperty() {
	// TODO Auto-generated method stub
	System.out.println(getsize()+"인치"+resolution+"컬러");
}

}
*/ 
/*	ColorTV myTv = new ColorTV(32,1024);
myTv.printProperty();*/
