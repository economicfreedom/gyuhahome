package exam07;

public class Calculator {
	private int memory;
	public int getMomory() {
		return memory;
		
	}
	public void setMemory(int memory) { //�Ի�� �޸𸮿� ���� �����ϴ� �޼ҵ�
		this.memory = memory;// �Ű����� memory�ʵ忡 ����;
		try {
			Thread.sleep(2000); // <�����带 2�ʰ� �Ͻ����� ��Ŵ
		}catch(InterruptedException e) {} 
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}					// / ������ �̸��б�                     /        /�޸𸮰� /			
}
