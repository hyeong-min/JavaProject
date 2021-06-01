package java_exam;

public class Thread {

	
	/*public static int sum(int n, int m) {
		// TODO Auto-generated method stub
return n + m;
	}   // 메소드
	*/

public static void main(String[] args) {
	
	ThreadGroup main = Thread.currentThread().getThreadGroup(); 
	ThreadGroup grp1 = new ThreadGroup("Group1");
	ThreadGroup grp2 = new ThreadGroup("Group2");
	
	ThreadGroup subGrp1 = new ThreadGroup(grp2, "subGroup1"); //부모
	
	
	grp1.setMaxPriority(3); //스레드 그룹 grp1의 최대우선순위 3으로 변경
	
	Runnable r = new Runnable() {
		
		@Override
		public void run() {

			try {
				Thread.sleep(1000); // 스레드를 1초간멈춘다
			} catch (InterruptedException e) {
				// TODO: handle exception
				
			}
			
			
		}

	};
	
	Thread th1 = new Thread(grp1, r, "th1");
	Thread th2 = new Thread(subGrp1, r, "th2");
	Thread th3 = new Thread(grp2, r, "th3");
	
	th1.start();
	th2.start();
	th3.start();
	
	System.out.println(">> List Group"+main.getName()+
			",ACtive ThreadGroup :" + main.activeGroupCount()+
			",Active Thread :" + main.activeCount());
	main.list();

	
	
	
	
	
	
	
	
	
	/*int a = 67;
	double b = 12.8;
	double total = a+b;
	System.out.println(total);
	
	int c = 10;
	int d = 3;
	int total1 = c/d;
	System.out.println(total1);
	
	double e = 10.0;
	int f = 3 ;
	double total2 = e/f;
	System.out.println(total2);
	
	int g = 10;
	int h = 9;
	boolean total3 = (g==h);
	System.out.println(total3);
	
	double bodyTemp = 36.5;
	System.out.println(bodyTemp);
	
	while (true) {
		System.out.println("1");
		
	}
	*/
	
	
	/*
	int height = 0;
	double size = 0.25;
	double total = height + size;
	char c = 'a';
	String name = "yoon hyeong min";
	
	System.out.println(total);
	System.out.println(c);
	System.out.println(name);*/
	/*int i;
	int j;
	i = 10;
	j = 20;
	System.out.println(i+j);*/
	
/*int i = 20;
int s;
char a;

s = sum(i,10); // 메소드호출
a ='?';

System.out.println(a); // 문자?출력
System.out.println("Hello"); //Hello 문자열출력
System.out.println(s); // 정수s값 30출력
		
	}
*/
}
}