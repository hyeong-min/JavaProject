package com.java.act6;

import java.util.Calendar;

/* 6-1 예제코드
Mypoint p = new Mypoint(3,50);
Mypoint q = new Mypoint(4,50);
System.out.println(p);
if (p.equals(q)){
	System.out.println("같은점");
}else {
	System.out.println("다른점");
}*/

public class Exam1 {

	public static void main(String[] args) {
	//1_2_(3_4)pass_5_6_7_8작성
	Calendar now = Calendar.getInstance();
	
	int hour = now.get(Calendar.HOUR_OF_DAY);
	int minute = now.get(Calendar.MINUTE);
	System.out.println("현재시간은"+hour+"시"+minute+"분입니다");
if (hour>4 && hour<12) {
	System.out.println("좋은아침");
}else if (hour>=12 && hour<=18)
	
}
}

/* 6-5 로직	Calendar now = Calendar.getInstance(); // 캘린더
//now는 현재 시간값을 가지고있음

int hour = now.get(Calendar.HOUR_OF_DAY);
int minute = now.get(Calendar.MINUTE);
System.out.println("현재시간은"+hour+"시"+minute+"분입니다");

if (hour>4 && hour<12) 
	System.out.println("좋은아침");
else if (hour>=12 && hour<=18)
	System.out.println("좋은오후");
else if (hour>=18 && hour<22)
	System.out.println("좋은저녁");
else
	System.out.println("좋은밤");
	
	*/

/*	6-1 
 private int x,y;
	public Mypoint(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point("+x+","+y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Mypoint p  = (Mypoint)obj;
		if (x==p.x && y==p.y) {
			return true;
		}else {
			return false;	
		}
		
	}
		
}*/

/* 6-2 써클클래스 public class Circle {

private int x,y,radius;

public Circle(int x, int y, int radius) {
	// TODO Auto-generated constructor stub
	this.x = x ;
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
	Circle p = (Circle)obj;
	if (p.x == x &&p.y ==y) { // 중심이같으면 같은원
		return true;
	}else {
		return false;	
	}
	
}

}*/




//6-2 예제로직
/*Circle a = new Circle(2,3,5); //중심 (2,3)에 반지름 5인원
Circle b = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인원
System.out.println("원 a:"+a);
System.out.println("원 b:"+b);
if (a.equals(b)) {
	System.out.println("같은원");
	
}else {
	System.out.println("서로 다른원");
}*/

/*6-3 기본코드 Calc c =new Calc(10,20);
System.out.println(c.sum());
메인로직
*private int x,y;
	public Calc(int x, int y) {
		this.x=x;
		this.y=y;
		
		// TODO Auto-generated constructor stub
	}
public int sum() {
	return x+y;
	// TODO Auto-generated method stub
}
*
*/



/*	6-4 예제코드Calc클래스
 *  private int x,y;
	public Calc(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	public int sum() {
		// TODO Auto-generated method stub
		return x+y;

	}
	*/
	
	/* 6-4 MainApp 클래스 예제코드
	Calc c = new Calc(10, 20);
	System.out.println(c.sum());
	*/

/* 6-4 예제로직
public void draw() {
	// TODO Auto-generated method stub
System.out.println("Shape");


}

public class GraphicEditor {
public static void main(String[] args) {
	Shape shape = new Circle();
	shape.draw();
}
}

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}*/



