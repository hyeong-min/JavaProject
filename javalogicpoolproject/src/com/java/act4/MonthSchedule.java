package com.java.act4;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Woodstox;

public class MonthSchedule {
	
	private Scanner sc;
	private Day days[];

	 MonthSchedule(int day) {
		// TODO Auto-generated constructor stub
		 this.days = new Day[day];
		 for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		 sc = new Scanner(System.in);
	}
	 
	 public void input() {
		// TODO Auto-generated method stub
		 System.out.print("날짜(1~30)?");
		 int day = sc.nextInt();
		 System.out.println("할일(빈칸없이입력)?");
		 String work = sc.next();
		 day--;
		 if (day <0 || day >30) {
			 System.out.println("날짜잘못입력");
			 return;
			
		}
days[day].set(work);
	}
	 public void view() {
		// TODO Auto-generated method stub
		 System.out.println("날짜(1~30)?");
		 int day = sc.nextInt();
		 day --;
		 if (day <0 || day>30) {
			System.out.println("날짜를 잘못입력하였습니다");
			return;
		}
		 System.out.print((day+1)+"일의할일은");
		 days[day].show();
	}
	 public void finish() {
		// TODO Auto-generated method stub
		 System.out.println("프로그램을 종료합니다.");
sc.close();
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("이번달 스케쥴 관리프로그램");
		while (true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3>>");
			int select = sc.nextInt();
			switch (select) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;

			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
	      april.run();
	}

}
