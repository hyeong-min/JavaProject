package java_exam;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerThread extends Thread{
	
	private JLabel timerLable; //타이머값 출력 해주는 객체자료형 레이블
	
	public TimerThread(JLabel timerLable) {
		// TODO Auto-generated constructor stub
		this.timerLable = timerLable; // 타이머카운트출력레이블
	}
	//스레드코드 , run()이 실행되면 스레드종료

	@Override
	public void run() {
	int n = 0; //타이머 카운트값
	while(true) {
		timerLable.setText(Integer.toString(n)); // 레이블에 카운트값출력
		n++;
		try {
			Thread.sleep(1000); //1초동안 잠을잔다.
		} 
		catch (InterruptedException e) {
			// TODO: handle exception
			return;
		}
		
	}
	
	}
}

 class ThreadTimerEX extends JFrame {
	// TODO Auto-generated method stub
	public ThreadTimerEX() {
		// TODO Auto-generated constructor stub
		setTitle("스레드를 상속받는 타이머스레드예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머 값을 출력할 레이블생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
		c.add(timerLabel); // 레이블 컨탠트팬에부착
		
		//타이머 스레드 객체생성, 타이머값을 출력할 레이블을 생성자에 전달
		TimerThread th = new TimerThread(timerLabel); // 스레드객체를만듬
		
		setSize(300,170);
		setVisible(true);
		
		th.start(); // 타이머스레드 실행시작
	}


	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new ThreadTimerEX();

	}

}
