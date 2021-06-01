package com.java.act2;

import java.util.Scanner;

public class Exam1_2_3_4_5_6_7_8_9_10_11_12 {
	//Scanner sc =new Scanner(System.in);
	
/*	public static boolean inRect(int x, int y) {
		if ((x>=100 && x<=200) && (y >=100 && y<=200)) {
			return true;
		}else 
			return false;
	}*/
	
 public static void main(String[] args) {
	 //1_2_3_4_5_6_7_8작성
	 System.out.println("점 xy좌표입력");
	 Scanner sc =new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	if ((x>=100 && x<=200)&&(y>=100 && y<=200)) {
		System.out.println("("+x+","+y+")"+"는 사각형안에 있습니다");
	}else {
		System.out.println("("+x+","+y+")"+"는 사각형안에 없습니다");
	}
	
	 
	}
	
	}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

//2-12 if ver
/*	 System.out.println("연산>>");
	 Scanner sc = new Scanner(System.in);
	 double a,c,result;
	 String b ;
	 a = sc.nextDouble();
	 b = sc.next();
	 c = sc.nextDouble();
	 if (b.equals("-")) {
		result = a-c;
		System.out.println(a+b+c+"계산결과는"+result);
	}else if (b.equals("+")) {
		result = a+c;
		System.out.println(a+b+c+"계산결과는"+result);
	}else if (b.equals("*")) {
		result = a*c;
		System.out.println(a+b+c+"계산결과는"+result);
	}else if (b.equals("/")) {
		if(c==0) {
			System.out.println("0으로 나눌수없습니다");
		}
		else {
			result = a/c;
			System.out.println(a+b+c+"계산결과는"+result);
		}
	}
	 
	*/ 
 













 
//switch 버전 
/*	 System.out.println("달을입력하세요>>");
 Scanner sc = new Scanner(System.in);
 int num =sc.nextInt();
 switch (num) {
case 0:
case 1:
	System.out.println("겨울");
	break;
case 3:
case 4:
case 5:
	System.out.println("봄");
	break;
case 6:
case 7:
case 8:
	System.out.println("여름");
	break;
case 9:
case 10:
case 11:
	System.out.println("가을");
	break;
case 12:	
	System.out.println("겨울");
	break;
default:
	System.out.println("잘못입력");
	break;
}sc.close();
*/ 
	 
	
	
	 //2-11 if-else 버전
		/* System.out.println("달을입력하세요>.");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 if (num>=3 && num<=5) {
			System.out.println("봄입니다");
		}else if (num>=6 && num<=8) {
			System.out.println("여름입니다");
		}else if (num>=9 && num <=11) {
			System.out.println("봄입니다");
		}else if(num==12 || num ==1 || num ==0){
			System.out.println("겨울입니다");
		}else {
			System.out.println("잘못입력");
		}
		 sc.close();*/
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 /*sysout류 */ 
	// 2-2 System.out.println("2자리정수10~99입력");
    // 2-1 System.out.println("원화입력>>");
	 
	 
	 //2-1로직
	// int num = sc.nextInt();
	// int won = sc.nextInt();
	// double dollor = won/1100;
	// System.out.println(won+"원은 $"+dollor+"입니다");
	

//2-9
/*int x,y,r_x,r_y; // 원중심 
double r, distance; // 반지름
	 
Scanner sc =new Scanner(System.in);
System.out.println("원의 중심과 반지름입력 >>");
r_x = sc.nextInt();
r_y= sc.nextInt();
r = sc.nextDouble();

System.out.println("점입력>>");
x = sc.nextInt();
y = sc.nextInt();

distance = Math.sqrt(((x-r_x)*(x-r_x)+(y-r_y)*(y-r_y)));

if (distance<r) {
	System.out.println("("+x+","+y+")"+"는 원안에있다");
}else {
	System.out.println("("+x+","+y+")"+"는 원안에없다");
}

}
	 
*/

	 //2-12 Switch ver
	 /*System.out.println("연산 >>");
	 Scanner sc = new Scanner(System.in);
	 double a,c,result;
	 String b;

	 a = sc.nextDouble();
	 b = sc.next();
	 c = sc.nextDouble();
	 
	switch (b) {
	case "+":
		result = a+c;
		System.out.println(a+b+c+"의 계산결과는"+result);
		break;
	case "-":
		result = a-c;
		System.out.println(a+b+c+"의 계산결과는"+result);
		break;
	case "*":
		result = a*c;
		System.out.println(a+b+c+"의 계산결과는"+result);
		break;
	case "/":
		if (c==0) {
			System.out.println("0으로 나눌수없습니다.");
			break;
		}else {
			result = a/c;
			System.out.println(a+b+c+"의 계산결과는"+result);
		}
		break;

	default:
System.out.println("잘못입력하셨습니다.");
	}
	 
	 sc.close();
	 
	 
	 */

	 
	//2-10
	/* Scanner sc = new Scanner(System.in);

	 int x1,y1,x2,y2; // 원중심 
	 double r1,r2, distance; // 원의 반지름 

	 	System.out.println("첫번쨰 원중심반지름입력>>");
	 	x1 = sc.nextInt();
	 	y1 = sc.nextInt();
	 	r1 = sc.nextDouble();
	 	System.out.println("두번쨰원중심 반지름입력>>");
	 	x2 = sc.nextInt();
	 	y2 = sc.nextInt();
	 	r2 =sc.nextDouble();
	 	 
	 	 distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
	 	 if (distance<=r1+r2) {
	 	System.out.println("두원은 서로 겹친다");
	 	}else {
	 		System.out.println("두원은 서로 겹치지않는다");
	 	}
	 	 sc.close();
	 */
	 
	
/* 
System.out.println("원의 중심과 반지름을 입력>>");
Scanner sc = new Scanner(System.in);

int x,y,r_x,r_y; // 원중심 
double r, distance; // 원의 반지름 

	 r_x = sc.nextInt();
	 r_y = sc.nextInt();
	 r = sc.nextDouble();
	 System.out.print("점입력>>");
	 x = sc.nextInt();
	 y = sc.nextInt();
	 
	 distance = Math.sqrt(((x-r_x)*(x-r_x))+((y-r_y)*(y-r_y)));
	 if (distance<r) {
	System.out.println("점("+x+","+y+")는 원안에 있다");
	}else {
		System.out.println("점("+x+","+y+")는 원안에 없다");
	}
	 sc.close();
	 
	*/ 
	 
	 
	 /*
		public static final int fm = 50000;
		public static final int wm = 10000;
		public static final int ft = 5000;
		public static final int wt = 1000;
		public static final int fh = 500;
		public static final int wh = 100;
		public static final int fifty = 50;
		public static final int ten = 10;
		*/ 

	 /*	
	 System.out.println("금액입력>>");
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 System.out.println("오만원권" + num/fm+ "매"); num%=fm;
	 System.out.println("만원권" + num/wm+ "매"); num%=wm;
	 System.out.println("오천원권" + num/ft+ "매"); num%=ft;
	 System.out.println("천원권" + num/wt+ "매"); num%=wt;
	 System.out.println("오백원" + num/fh+ "매"); num%=fh;
	 System.out.println("백원" + num/wh+ "매"); num%=wh;
	 System.out.println("오십원" + num/fifty+ "매"); num%=fifty;
	 System.out.println("십원" + num/ten+ "매"); num%=ten;
	*/
	 
	 
	 
	 
	 
	 /*	public static boolean inRect(int x, int y) {
		if ((x>=100 && x<=200) && (y >=100 && y<=200)) {
			return true;
		}else 
			return false;
		// TODO Auto-generated method stub

	}
	*/
	 
	/*Scanner sc = new Scanner(System.in);
	
	int x1, y1;
	 int x2, y2;
	 boolean a,b; // a는 x1,y1의 결과  b는 x2,y2의결과
	 
System.out.println("(x1,y1)의 값을입력해주세요>>");
	x1 = sc.nextInt();
y1 = sc.nextInt();
	 System.out.println("(x2,y2)의 값을입력해주세요>>");
	x2 = sc.nextInt(); 
	 y2 = sc.nextInt();
	 a = inRect(x1, y1);
	 b = inRect(x2, y2);
	 
	 if (a==true || b == true) {
		System.out.println("두 사각형은 충돌합니다");
	}else {
		System.out.println("두사각형은 충돌하지않습니다");
	}
	 sc.close();
	 
	 */
	 /* 
     int x,y;
	 System.out.println("점(x,y)의 좌표를 입력>>");
	 Scanner sc = new Scanner(System.in);
	 x = sc.nextInt();
	 y = sc.nextInt();
	 
	 if ((100<=x && x <=200)&&(100<= y && y<=200)) {
		System.out.println("("+x+","+y+")는 사각형안에있습니다");
	}else {
		System.out.println("("+x+","+y+")는 사각형안에없습니다.");
	}
	 sc.close();
	 */
	 
	 
	 
	 
	/*
	 System.out.println("1~99사이의 정수를 입력하세요");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	 
	if (num!=0 && num>=1 && num<=99) {
		int a,b;
		a=num/10;
		b=num%10;
		
		if ((a==3 || a==6 || a==9) &&(b==3 || b==6 || b==9)) {
			System.out.println("박수짝짝");
		}else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9) ) {
			System.out.println("박수짝");}
		}
	else {
		System.out.println("숫자의 범위를 벗어났습니다.");
	}
	sc.close();
	*/

	 
	 
	/* 
	 int a,b,c;
	 
	 System.out.println("정수3개입력>>");
	 Scanner sc = new Scanner(System.in);
	 
	 a = sc.nextInt();
	 b = sc.nextInt();
	 c = sc.nextInt();
	 
	 if (b<a&&a<c) {
		System.out.println("중간값은"+a+"입니다");
	}else if (a<b&&b<c) {
		System.out.println("중간값은"+b+"입니다");
	}else {
		System.out.println("중간값은"+c+"입니다");
	}
	 */

	/* System.out.print("금액을 입력하세요>>");
	 Scanner sc = new Scanner(System.in);
	 int total = sc.nextInt();
	 
	 System.out.print("오만원권"+total/50000+"매"); total%=50000;
	 */

	 
	/* int num,a,b;
	 
	 System.out.println("두자릿수 정수입력>>");
	 Scanner sc = new Scanner(System.in);
	 num = sc.nextInt();
	 
	 a = num/10;
	 b = num%10;
	 
	 if (a==b) {
		System.out.println("YES");
	}else {
		System.out.println("No");
	}*/
	 
/*	 System.out.println("원화를 입력하세요>>");
	 Scanner sc = new Scanner(System.in);
	 int won = sc.nextInt();
	 double dollor = won/1100;
	 System.out.println(won+"원은 $"+dollor+"입니다");
*/


