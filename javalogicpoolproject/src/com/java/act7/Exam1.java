package com.java.act7;

import java.util.*;

public class Exam1 {
	
	public static void main(String[] args) {
		//1_2_3_4_5입력  
		/*7-5 실행시 문제있는구문 주말에 고칠것 여기서부터작성
     		Student[] student = new  Student[4];//Student 객체배열선언
		ArrayList<Student> manage = new ArrayList<Student>(); // Arraylist선언
		Scanner sc = new Scanner(System.in); // 스캐너선언
		System.out.println("학생이름 학과 학번 학점평균입력>>");
		for (int i = 0; i < student.length; i++) {
			System.out.println(">>");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text,",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String num = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			student[i] = new Student(name,department,num,grade);
			manage.add(student[i]);
		}
		for (int i = 0; i < manage.size(); i++) {
			System.out.println("-------------");
			Student s = manage.get(i);
			System.out.println("이름"+s.getName());
			System.out.println("학과"+s.getDepartment());
			System.out.println("학번"+s.getNum());
			System.out.println("학점평균"+s.getGrade());
		}
		System.out.println("-----------------");
		while (true) {
			System.out.println("학생이름 >>");
			String name = sc.next();
			if (name.equals("그만")) 
				break;
				for (int i = 0; i < manage.size(); i++) {
					Student s = manage.get(i);
					s.find_student(name);
					
				}
			}
			sc.close();	*/
		}
	}


 

/*7-4 Vector<Integer> stack = new Vector<Integer>(); // Vector 클래스벡터 클래스는 확장 가능한 객체 배열을 구현합니다. 배열과 마찬가지로 정수 인덱스를 사용하여 액세스할 수 있는 구성 요소가 포함되어 있습니다. 그러나 Vector의 크기는 Vector가 생성된 후 항목을 추가하고 제거하는 데 필요한 만큼 커지거나 축소될 수 있습니다
//Integer 정수 클래스는 개체에서 원시 입력 값을 래핑합니다. 정수 유형의 개체에는 유형이 int인 단일 필드가 포함됩니다.
//또한 이 클래스는 int를 String으로 변환하고 String을 int로 변환하는 여러 메소드와 int를 처리할 때 유용한 다른 상수 및 메소드를 제공합니다.
Scanner sc = new Scanner(System.in);

while (true) {
	System.out.println("강수량입력 0입력시 종료");
	int n = sc.nextInt();
	if (n==0) 
		break;
		stack.add(n); // add 지정한 요소를 이 벡터의 끝에 추가합니다.
	int avr =0;
	for (int i = 0; i < stack.size(); i++) {
		System.out.println(stack.get(i));
		avr+=stack.get(i);
	}
	System.out.println();
	avr/=stack.size();
	System.out.println("현재평균"+avr);
}


	sc.close();
*/
/*	7-3	HashMap<String, Integer> nations = new HashMap<String,Integer>();
//HashMap 맵 인터페이스의 해시 테이블 기반 구현입니다. 이 구현은 모든 선택적 맵 작업을 제공하며 null 값과 null 키를 허용합니다. (HashMap 클래스는 동기화되지 않고 null을 허용한다는 점을 제외하면 거의 해시 테이블과 동일합니다.) 이 클래스는 지도 순서를 보장하지 않습니다. 특히 시간이 지남에 따라 순서가 일정하게 유지되도록 보장하지는 않습니다.
//이 구현은 해시 함수가 버킷 간에 요소를 적절히 분산시킨다고 가정하여 기본 작업(가져오기 및 퍼트)에 대해 일정한 시간 성능을 제공합니다. 반복 수집 뷰를 사용하려면 해시 맵 인스턴스의 "용량"에 비례하는 시간(버킷 수)과 해당 크기(키-값 매핑 수)가 필요합니다. 따라서 반복 성능이 중요한 경우 초기 용량을 너무 높게(또는 부하 계수를 너무 낮게) 설정하지 않는 것이 매우 중요합니다.
System.out.print("나라이름과 인구를 입력하세요.(예: Korea 5000)");
Scanner sc = new Scanner(System.in);
while (true) { // 그만입력될때까지 반복
	String nation = sc.next();
	if (nation.equals("그만")) 
		break; //입력끝
		int population = sc.nextInt();
		nations.put(nation, population); // 해시맵 나라이름과 인수저장
	
}
while (true) {
	System.out.println("인구검색>>");
	String nation = sc.next();
	if (nation.equals("그만")) 
		break;
		Integer n = nations.get(nation);
		if (n==null) 
			System.out.println(nation+"나라는 없습니다");
		else
			System.out.println(nation+"의인구는"+n);
	}
	sc.close();*/

/* 7-2
/*	ArrayList<Character> stack = new ArrayList<Character>(); // ArrayList 목록 인터페이스의 크기 조정 가능한 배열 구현입니다. 모든 선택적 목록 작업을 구현하고 Null을 포함한 모든 요소를 허용합니다. 이 클래스는 목록 인터페이스를 구현하는 방법 외에도 내부적으로 목록을 저장하는 데 사용되는 배열의 크기를 조작하는 방법을 제공합니다. (이 클래스는 동기화되지 않았다는 점을 제외하면 거의 Vector와 동일합니다.)
	Scanner sc = new Scanner(System.in); //Character 문자 클래스는 객체의 원시 형식 문자 값을 래핑합니다. 클래스 문자 객체는 유형이 문자인 단일 필드를 포함합니다.
	                                     //또한, 이 클래스는 문자의 범주( 소문자, 숫자 등)를 결정하고 대문자에서 소문자로 또는 반대로 문자를 변환하기 위한 많은 정적 방법을 제공합니다.	
	System.out.println("6개학점빈칸분리입력(A/B/C/D/F)");
	for (int i = 0; i < 6; i++) {
		char c =sc.next().charAt(0); //charAt 공용 문자At(int 색인)
		                             //지정한 인덱스에서 문자 값을 반환합니다. 인덱스의 범위는 0에서 길이() - 1입니다. 시퀀스의 첫 번째 문자 값은 인덱스 0에서, 다음 문자 값은 인덱스 1에서 배열 인덱싱까지입니다.
		                             //인덱스에서 지정한 문자 값이 대리인일 경우 대리 값이 반환됩니다.

		stack.add(c);
	}
	int sum = 0;
	for (int i = 0; i < stack.size(); i++) {
		char c =stack.get(i);
		switch (c) {
		case 'A':
			sum+=4;
			break;
		case 'B':
			sum+=3;
			break;
		case 'C':
			sum+=2;
			break;
		case 'D':
			sum+=1;
			break;
		case 'E':
			sum+=0;
			break;

		}
	}
	double avr = (double)sum/stack.size();
	System.out.println(avr);
	sc.close();*/
		
		
		
		
		/* 7-1 public static void	printBig(Vector<Integer> v) {

		int big = v.get(0); // get 이 벡터의 지정된 위치에 있는 요소를 반환합니다.
		for (int i = 1; i < v.size(); i++) { // size 이 벡터의 성분 수를 반환합니다.
			if (big<v.get(i)) {
				big = v.get(i);
			}
			System.out.println("가장큰수는"+big);
		}}*/

/*main로직	
 * Vector<Integer> v = new Vector<Integer>(); // Vector 클래스벡터 클래스는 확장 가능한 객체 배열을 구현합니다. 배열과 마찬가지로 정수 인덱스를 사용하여 액세스할 수 있는 구성 요소가 포함되어 있습니다. 그러나 Vector의 크기는 Vector가 생성된 후 항목을 추가하고 제거하는 데 필요한 만큼 커지거나 축소될 수 있습니다
//Integer 정수 클래스는 개체에서 원시 입력 값을 래핑합니다. 정수 유형의 개체에는 유형이 int인 단일 필드가 포함됩니다.
//또한 이 클래스는 int를 String으로 변환하고 String을 int로 변환하는 여러 메소드와 int를 처리할 때 유용한 다른 상수 및 메소드를 제공합니다.
Scanner sc = new Scanner(System.in);
System.out.println("정수(-1이입력될때까지)>>");
while (true) {
	int n = sc.nextInt();
	if (n==-1) 
		break;
		v.add(n); // add 지정한 요소를 이 벡터의 끝에 추가합니다.
	
}
	if (v.size()==0) {
		System.out.println("수가 하나도없음");
		sc.close();
		return;
	}
	printBig(v);
	sc.close(); // close 이 스캐너를 닫습니다.
	//이 스캐너가 아직 닫히지 않은 경우 기본 판독값도 Closeable 인터페이스를 구현하는 경우 판독값의 Close 메소드가 호출됩니다. 이 스캐너가 이미 닫혀 있으면 이 메서드를 호출해도 아무런 효과가 없습니다.
    //스캐너를 닫은 후 검색 작업을 수행하려고 하면 잘못된 상태 예외가 발생합니다.
*/
		
		
		
	
		


		





	



	



