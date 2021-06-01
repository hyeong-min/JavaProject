package com.java.act3;


import java.util.Scanner;

public class Exam1_2_3_4_5_6_7_8 {
	// Scanner sc = new Scanner(System.in);
	// int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
	/* 3-4 예제로직 String s = sc.next(); 문자열읽기
	//char c = s.charAt(0); 문자열의첫번째문자*/
	// 3-6 예제로직 int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산돈의종류
	// 3-7 예제로직 int i = (int)(Math.random()*10+1);
	public static void main(String[] args) {
	//1_2_3_4_5_6_7_8작성
	
	}}

/*3-7	Scanner sc = new Scanner(System.in);
int n [] = new int [10];
System.out.print("랜덤한정수들>>");
for (int m = 0; m < 10; m++) {
 int i = (int)(Math.random()*10+1);  //1~10까지 범위의 정수를 랜덤생성시
 n[m]=i; // 랜덤생성정수 배열에넣기
 System.out.println(i+""); //출력
}
System.out.println();
double sum =0; //double로 선언해야 %.1f로 소수점까지 계산출력가능
for (int m = 0; m < 10; m++) {
sum+=n[m]; //평균구하기
}
sum/=10;
System.out.printf("평균은%.1f",sum); //평균을 소수점 첫쨰자리까지만 출력하고 prinf사용
	*/


/*	3-6 int [] unit = {50000, 10000, 1000, 500,100,50,10,1};
int money;
Scanner sc = new Scanner(System.in);
System.out.println("금액입력>>");
money = sc.nextInt();
for (int i = 0; i < unit.length; i++) {
	System.out.printf("%d원짜리 :%d개 \n",unit[i],money/unit[i]);
	money = money -(money/unit[i]*unit[i]);
}
sc.close();*/

			
/*3-5
Scanner sc = new Scanner(System.in);
int arr[] = new int[10];

System.out.println("양정수 10개입력>>");
for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
}
System.out.println("3의배수는");
for (int i = 0; i < arr.length; i++) {
	if (arr[i]%3 ==0) {
		System.out.println(arr[i]+"");
	}
}*/



/* 3-4 System.out.println("소문자알파벳하나입력>");
Scanner sc = new Scanner(System.in);
String s = sc.next();
char c = s.charAt(0);
for (int i = 0; i <=c-'a'; i++) {
	for (char j = 'a'; j < c-i; j++) {
		System.out.print(j);
	}
	System.out.println();
}*/


/*	3-3 System.out.println("정수입력>>");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for (int i = 0; i < num; i++) {
	for (int j = 0; j < num-i; j++) {
		System.out.print("*");
	}
	System.out.println();
}*/

	
/* 3-8
Scanner sc = new Scanner(System.in);
System.out.println("정수몇개?");
int num = sc.nextInt();
int arr[] = new int[num];
int flag;
for (int i = 0; i < num; i++) {
	int r = (int)(Math.random()*100+1);
	flag = 1;
	for (int j = 0; j < i; j++) {
		if (arr[j]==r) {
			i--;
			flag =0;
			break;
		}
	}
	if(flag == 1) arr[i] =r;
}
	for (int i = 0; i < num; i++) {
		System.out.println(arr[i]+"");
	}
	sc.close(); */


/* 3-4 System.out.println("소문자알파벳하나입력>");
Scanner sc = new Scanner(System.in);
String s = sc.next();
char c = s.charAt(0);
for (int i = 0; i <=c-'a'; i++) {
	for (char j = 'a'; j < c-i; j++) {
		System.out.print(j);
	}
	System.out.println();
}*/


/* 3-2 array
int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
 for (int i = 0; i < n.length; i++) {
	for (int j = 0; j < n[i].length; j++) {
		System.out.print(n[i][j]+"");
	}
	System.out.println();
}
*/

//do while 3-1
	/*	int sum =0,i=0;
	do {
		sum+=i;
		i+=2;
	}while(i<100);
	System.out.println(sum);*/

/*for 3-1
int sum = 0;
for (int i = 0; i < 100; i+=2) {
	sum += i;
}
System.out.println(sum);*/

//while 3-1
/*		int sum=0,i=0;
		while (i<100) {
			sum += i;
			i+=2;
		}
		System.out.println(sum);

		*/
/*		int sum=0,i=0; 1
while(i<100) {
	sum+=i;
	i+=2;
}
System.out.println(sum);*/

/*int sum=0; 2
for(int i =0; i<100; i+=2) {
	sum+=i;
}
System.out.println(sum);
		
	}*/