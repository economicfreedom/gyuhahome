package sec01.exam02;

import java.awt.Toolkit;
import java.util.Iterator;

public class BeepPrintExample {

	public static void main(String[] args) {
		
	Runnable beepTask = new BeepTask();
	Thread thread = new Thread(beepTask);
	thread.start();
		
		
	for	(int i=0; i<5; i++){
		System.out.println("��");
		try {Thread.sleep(500);}catch(Exception e) {}
	}
	}

}
