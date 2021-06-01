package com.java.act13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

//Scanner sc = new Scanner(System.in);
//1_2_3_4_5 작성
public class Exam1 {
	public static void main(String[] args) {
	//new myFrame();
	}}



/*  13- 4-2
class myth extends Thread{
	JLabel jf;
	int x = 300;
	public myth(JLabel jf) {
	this.jf = jf;
	}
	@Override
	public void run() {
	while (true) {
		try {
		if (x==100) x=130; 
		else x =100;
		jf.setLocation(x,x);
			sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
			return;
		}
	}
	
	}
}

class myFrame extends JFrame{
JLabel jl = new JLabel("진동레이블");
	public myFrame() { //여기서부터작성
		// TODO Auto-generated constructor stub
		setTitle("진동프레임만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		jl.setBounds(100,100,200,300);
		add(jl);
		myth th = new myth(jl);
		th.start();
		setVisible(true);
		setSize(500,500);
		
	}
}
*/
/* 13- 4-1
class myth extends Thread{
	JFrame jf;
	int x = 300;
	public myth(JFrame jf) {
	this.jf = jf;
	}
	@Override
	public void run() {
	while (true) {
		try {
		if (x==300) x=330; 
		else x =300;
		jf.setLocation(x,x);
			sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
			return;
		}
	}
	
	}
}

class myFrame extends JFrame{

	public myFrame() { //여기서부터작성
		// TODO Auto-generated constructor stub
		setTitle("진동프레임만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myth th = new myth(this);
		th.start();
		setVisible(true);
		setSize(200,200);
		
	}
}
*/

//new myFrame(); 13-3 
/*	class myth extends Thread{
			JLabel clock;
			public myth(JLabel clock) {
			this.clock = clock;
			}
			
			public void run() {
				while (true) {
					try {
			/*			Calendar c = Calendar.getInstance();
						int hour = c.get(Calendar.HOUR_OF_DAY);
						int min = c.get(Calendar.MINUTE);
						int sec = c.get(Calendar.SECOND);
						
						String clockText = Integer.toString(hour);
						clockText = clockText.concat(":");
						clockText = clockText.concat(Integer.toString(min));
						clockText = clockText.concat(":");
						clockText = clockText.concat(Integer.toString(sec));
						
						clock.setText(clockText);
						sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						return;
					}
					
				}
			
			}
		}
		class myFrame extends JFrame{
			JLabel clock = new JLabel();
			public myFrame() {
			setTitle("디지털시계만들기");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			myth th = new myth(clock);
			c.add(clock);
			
			th.start();
			
			setVisible(true);
			setSize(500,500);
	
			}
		}
		*/
		//1_2_3_4작성  여기서부터작성
/* 13-2 ,
class MyPanel extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int x=(int)(Math.random()*300);
		int y=(int)(Math.random()*300);
		g.drawOval(x, y, 50, 50);
	}
}

class myThread extends Thread{
	MyPanel jp;
	public myThread(MyPanel j) {
	jp=j;
	}
	public void run() {
		while (true) {
			try {
				
				sleep(500);
				jp.repaint();
			} catch (Exception e) {
				// TODO: handle exception
				return;
			}
			
		}
	
	}
}


class myFrame extends JFrame{
	MyPanel myp = new MyPanel();
	myThread th = new myThread(myp);
	public myFrame() {
	setTitle("원을 0.5초간격으로 이동하는 프레임");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setContentPane(myp);
	
	myp.setLayout(null);
	myp.setOpaque(true);
	myp.addMouseListener(new MouseAdapter() {
		
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			th.start();
		}
	});
	
	
	
	setVisible(true);
	setSize(500,500);
	
	}
}

/*
public class Exam1 {
	public static void main(String[] args) {
		new myFrame();
	}

	
}*/

/*	13-1 new myFrame();*/

/* class CountRunnable implements Runnable {

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("스레드실행시작");
	for (int i = 1; i < 11; i++) {
		System.out.print(i+"");
	}
	System.out.print("\n스레드 종료");
}

}*/
/*	Scanner sc = new Scanner(System.in);
String st;
System.out.println("아무키나 입력>.");
sc.nextLine();

CountRunnable runnable = new CountRunnable();
Thread th = new Thread(runnable);
th.start();
}*/



		
		
		




