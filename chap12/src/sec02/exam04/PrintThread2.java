package sec02.exam04;

public class PrintThread2 extends Thread {
	public void run() {
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()){
				break;//if������ ��������
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
