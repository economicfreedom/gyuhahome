package sec02.exam02;

public class PrintThread1 extends Thread{
	//�ʵ� ����
	private boolean stop; //setter������ �ϱ� ���� stop�� private�� �ɾ �ٸ� Ŭ�������� ������ ���� setStop���� ���������ڸ� public���� �ؼ� �����Ͽ��� ó���ϰ���
	
	public void setStop(boolean stop) {
		this.stop = stop;
		
	}
	public void run() {	//�Ҹ��� Ÿ�� �ʵ� stop�� Ʈ�簡 �ɶ� run �޼ҵ带 �����Ŵ
		while(!stop) {
			System.out.println("������");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	
		
	}

