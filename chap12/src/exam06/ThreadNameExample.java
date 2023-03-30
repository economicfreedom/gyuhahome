package exam06;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+mainThread.getName());
		
		ThreadA threadA = new ThreadA(); //객체 생성 호출
		
		System.out.println("작업 스레드 이름 : "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB(); //객체 생성 호출
		System.out.println("작업 스레드 이름 : "+threadB.getName());
		threadB.start();
		
		

	}

}
