package sec02.exam01;
import java.awt.Toolkit;
import java.util.Iterator;
	public class SleepExample {
		public static void main(String[] args) {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 10; i++) {
				toolkit.beep();
				try {
					Thread.sleep(3000);
					System.out.println("¶ò");
				}catch(InterruptedException e) {
					
				}
				
			}
		}
}
