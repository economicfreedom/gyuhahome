package exam06;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : "+mainThread.getName());
		
		ThreadA threadA = new ThreadA(); //��ü ���� ȣ��
		
		System.out.println("�۾� ������ �̸� : "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB(); //��ü ���� ȣ��
		System.out.println("�۾� ������ �̸� : "+threadB.getName());
		threadB.start();
		
		

	}

}
