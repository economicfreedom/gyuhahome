package sec01.exam01;

import java.awt.Toolkit;
import java.util.Iterator;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	for	(int i=0; i<5; i++){
		toolkit.beep();
		try {Thread.sleep(500);}catch(Exception e) {}
	}
	for	(int i=0; i<5; i++){
		System.out.println("��");
		try {Thread.sleep(500);}catch(Exception e) {}
	}
	}

}
