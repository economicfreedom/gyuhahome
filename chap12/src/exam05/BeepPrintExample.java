package exam05;

import java.awt.Toolkit;
import java.util.Iterator;

public class BeepPrintExample {

	public static void main(String[] args) {

		Thread thread = new Thread() {
			public void run() {

				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for	(int i=0; i<5; i++){
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
				}
		};
		thread.start();


		for	(int i=0; i<5; i++){
			System.out.println("¶ò");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
