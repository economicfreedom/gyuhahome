package verify;

public class MusicRunnable implements Runnable {//Runnable�� �������̽� ��ü�̹Ƿ� implements�� �����ؾ��� extedns����
	@Override
	public void run() {//Runnable���� run()�޼ҵ尡 �ϳ� ���ǵ� ���� Ŭ������ run()�� �������ؼ� �۾������尡 ������ �ڵ带 �ۻ��ؾ�����
		for(int i=0;i<3;i++) {
			System.out.println("������ ����մϴ�.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			//Runnable�� �۾� �����尡 ������ �� �ִ� �ڵ带 ������ �ִ� ��ü��� �ؼ� �ٿ��� �̸�
			//Runnable�� �������̽� Ÿ���̱� ������ ���� ��ü�� ����� �����ؾ��մϴ�. 
			}
		}
	}
}
