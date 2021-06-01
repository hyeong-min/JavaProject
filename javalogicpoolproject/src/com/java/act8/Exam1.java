package com.java.act8;


//8-1,2 예제경로 "c:\\temp\\phone.txt"

public class Exam1 {

	public static void main(String[] args) {
	
			
		}
		
		// TODO Auto-generated method stub
//1_2_3_4_5작성
	
/*	8-4 예제 System.out.println("c:\\windows\\system.ini 파일을 읽어서 출력합니다>>");
try {
	Scanner sc = new Scanner(new FileReader("c:\\\\windows\\\\system.ini")); //파일로부터 읽기위한목적
    int exam1 =1;
    while (sc.hasNext()) { // 파일에 읽을것이 있는동안에는
		String line = sc.nextLine();
		System.out.printf("%4d", exam1++);//행번호 출력
		System.out.println(":"+line); //소스 한행출력
    }
    sc.close();
} catch (IOException e) {
System.out.println("입출력오류가 발생했습니다.");

	/* 8-3 FileReader fr = null;
	File f = new File("c:\\temp\\phone.txt");
	try {
		fr = new FileReader(f);
		System.out.println(f.getPath()+"을 출력합니다");

		while (true) {
			int c = fr.read();
			if (c==-1) 
				break;
				System.out.print((char) c);
			
		}
	fr.close();


	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
			
			*/

/* 8-2	BufferedReader fr = null;
File f = new File("c:\\temp\\phone.txt");
try {
	fr = new BufferedReader(new FileReader(f));
	System.out.println(f.getPath()+"를 출력합니다");
	while (true) {
		String line = fr.readLine();
		if (line == null) 
			break;
		System.out.print(line+"\n");
		
	}
	fr.close();
} catch (IOException e) {
	// TODO: handle exception
	e.printStackTrace();
}
*/
		
		/*8-1		FileWriter fw = null;
		File f = new File("c:\\temp\\phone.txt");
		try {
			
			fw = new FileWriter(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("전화번호 입력프로그램입니다.");
			while (true) {
				System.out.print("이름 전화번호>>");
				String line = sc.nextLine();
				if (line.equals("그만")) 
					break;
					fw.write(line+"\r\n");
				}
				System.out.println(f.getPath()+"에 저장하였습니다");
				sc.close();
					fw.close();
			
		}
		 catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/

		

		
	}
	

	






