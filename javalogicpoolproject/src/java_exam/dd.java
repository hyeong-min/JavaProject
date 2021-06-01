package java_exam;

import java.util.ArrayList;
import java.util.Iterator;

public class dd extends Thread{

	int n = 0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000); 
			} catch (InterruptedException e) {return;
				// TODO: handle exception
			}
		}
		// TODO Auto-generated method stub
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		dd th =  new dd(); //스래드객채생성
		th.start();
		
	}
}
