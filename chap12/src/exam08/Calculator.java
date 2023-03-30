package exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {//synchronized < ��Ƽ������� �������ٵǴ� ���� ���´� user1,2�� ���ÿ� ���� �Ǹ鼭 ���� ���� ��� �ϰ� ����°��� ���� 
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e ) {}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
	//���� �����尡 User2 �����带 ���������� ����ȭ �޼ҵ��� setMemory()�� �������� ���ϰ� user1�� setMemory�� ��� ������ ���� ����ؾ��� User1 �����尡 setMemory �޼ҵ带 ���
	//�����ϰ� ���� User2 �����尡 setMemory()�޼ҵ带 �����մϴ�.
	
}
