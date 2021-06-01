package com.java.act4;


import java.awt.Rectangle;
import java.util.Scanner;


/*4-1 기본로직	TV myTV = new TV("LG", 2017,32);
myTV.show();*/

/*	4-2기본로직	Scanner sc = new Scanner(System.in);

System.out.println("수학과학영어순으로 3개점수입력>>");
int math = sc.nextInt();
int science = sc.nextInt();
int english = sc.nextInt();

Grade me = new Grade(math,science,english);
System.out.println("평균은"+me.average());;
sc.close();*/


/*	4-4 예제로직Rectangle r = new Rectangle(2,2,8,7);
Rectangle s = new Rectangle(5,5,6,6);
Rectangle t = new Rectangle(1,1,10,10);

r.show();
System.out.println("s의 면적은"+s.square());
if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
	if (t.contains(s)) System.out.println("t는 s를포함합니다.");*/

/*4-5 예제로직 
 4-5 서브클래스로직 class Circle{
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
}*/
/*4-5 메인클래스로직	Scanner sc = new Scanner(System.in);
Circle c [] = new Circle[3]; //3개의 Circle 배열선언
for (int i = 0; i < c.length; i++) {
System.out.println("x,y,radius>>");
double x = sc.nextDouble(); //x값읽기
double y = sc.nextDouble(); // y값읽기
int radius = sc.nextInt(); //radius값읽기
c[i] = new Circle(x, y, radius); // Circle 객체생성
}
for (int i = 0; i < c.length; i++) {
c[i].show();
sc.close();
}*/
/* 4-7예제로직
 * 
 * class Day {
   private String work; // 하루의 할 일을 나타내는 문자열
   public void set(String work) { this.work = work; }
   public String get() { return work; }
   public void show() {
      if(work == null) System.out.println("없습니다.");
      else System.out.println(work + "입니다.");
   }
}
 * public static void main(String[] args) {
      // TODO Auto-generated method stub
	   Exam7MonthSchedule april = new Exam7MonthSchedule(30); // 4월달의 할 일
      april.run();
   }
 * 
 * */


public class Exam1{
public static void main(String[] args) {
//1_2_3_4_5_6_7_8 작성

}

}

/*4-6 예제로직
 * 
 * public class Circle {

	
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
 * 
 * 
 * public class CircleManger {

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

 * */

/* 4-4 class Rectangle{
private int x,y,width,height;

public Rectangle(int x, int y, int width, int height) {
	// TODO Auto-generated constructor stub
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
}

public void show() {
	// TODO Auto-generated method stub
	System.out.println("("+x+","+y+")에서 크기가"+width+"x"+height+"인사각형");
}

public int square() {
	// TODO Auto-generated method stub
	return (width*height);
}

public boolean contains(Rectangle r) {
	// TODO Auto-generated method stub
	if (x<r.x&&y<r.y)
		if ((width+x)>(r.x+r.width)&&(height+y)>(r.y+r.height))	
	return false;
	return true;
}

}*/

/*	4-3 private String title;
private String artist;
private String year;
private String country;

public Exam1(String title, String artist, String year, String country) {
	// TODO Auto-generated constructor stub
	this.title = title;
	this.artist = artist;
	this.year = year;
	this.country = country;
}

public static void main(String[] args) {
//1_2_3_4작성

	Exam1 me = new Exam1("DQ","ABBA","1978","스훼덴");
	// TODO Auto-generated method stub
	show(me);
	System.out.println(me.year+"년"+me.country+"국적의" +me.artist+"가부른"+me.title);
}

public static void show(Exam1 me) {

}*/
/*	4-3	// TODO Auto-generated method stub
Exam3 exam3 = new Exam3("DancingQueen", "ABBA", "1978", "스웨덴");
//Exam3객체생성 == Song

show(exam3); //  노래정보를 출력하는  메소드

System.out.println(exam3.year+"년"+exam3.country+"국적의"+exam3.artist+"가 부른"+exam3.country);
}
static void show(Exam3 exam3) {
// TODO Auto-generated method stub
}

*/

/* 4-2 private int math;
private int science;
private int english;

public Exam1(int math, int science, int english) {
	// TODO Auto-generated constructor stub
	this.math = math;
	this.science = science;
	this.english = english;
}*/
/*	Scanner sc = new Scanner(System.in);

System.out.println("수학과학영어순으로 3개점수입력>>");
int math = sc.nextInt();
int science = sc.nextInt();
int english = sc.nextInt();

Exam1 me = new Exam1(math,science,english);
System.out.println("평균은"+me.average());;
sc.close();
}

public int average() {
// TODO Auto-generated method stub
return (math+science+english)/3;*/


/* 4-1
private String brand;
 private int year;
 private int inch;
public Exam1TV(String brand, int year, int inch) {
	this.brand = brand;
	this.year = year;
	this.inch = inch;
}
public void show() {
	// TODO Auto-generated method stub
System.out.println(brand+"에서만든"+year+"년형"+inch+"인치 TV");
}
*/