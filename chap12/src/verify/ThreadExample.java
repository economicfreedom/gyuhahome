package verify;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();//������ ��ü ������ ȣ��
		thread1.start();
		
		//Runnable���� run()�޼ҵ尡 �ϳ� ���ǵ� ���� Ŭ������ run()�� �������ؼ� �۾������尡 ������ �ڵ带 �ۻ��ؾ�����
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		
	}
}
