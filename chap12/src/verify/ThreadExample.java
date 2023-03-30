package verify;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();//스레드 객체 생성과 호출
		thread1.start();
		
		//Runnable에는 run()메소드가 하나 정의됨 구현 클래스는 run()을 재정의해서 작업스레드가 실행할 코드를 작생해야함함
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		
	}
}
