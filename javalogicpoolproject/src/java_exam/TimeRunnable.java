package java_exam;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TimeRunnable implements Runnable {
	
	private JLabel timerLabel; //타이머값출력레이블
	  
	public TimeRunnable(JLabel timerLabel) {
		// TODO Auto-generated constructor stub
		this.timerLabel = timerLabel;//초카운트 출력레이블
	}
	
	
	//스레드코드 run()이 종료하면 스레드종료

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n =0; //타이머카운트값
		while(true) { //무한루프
			timerLabel.setText(Integer.toString(n)); //레이블에  카운트값을출력
			n++;//카운트증가
			try {
				Thread.sleep(1000); //1초동안잠을잔다.
			}
			catch (InterruptedException e) 
			{
				// TODO: handle exception
				return; //예외가 발생하면 스레드종료
			}
			
		}

	}
}
	 class RunnableTimerEx extends JFrame {
		// TODO Auto-generated method stub
		public RunnableTimerEx() {
			// TODO Auto-generated constructor stub
			setTitle("런에이블 타이머스레드");
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    Container c = getContentPane();
		    c.setLayout(new FlowLayout());
		    
		    //타이머값을 출력할 레이블생성
		    JLabel timerLabel = new JLabel();
		    timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		    c.add(timerLabel); // 테이블 컨탠트팬에부착
		    
		    //타이머스레드사용시 Runnable 객체생성, 타이머값출력레이블 생성자에전달
		    TimeRunnable runnable = new TimeRunnable(timerLabel);
		    Thread th = new Thread(); //스레드객체생성
		    
		    setSize(250,150);
		    setVisible(true);
		    
		    th.start(); //타이머스레드가 실행을 시작하게된다
		}


	


	
	
	
	
	
	

	public static void main(String[] args) {
		new RunnableTimerEx();
	}

}
