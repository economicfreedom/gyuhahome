package exam07;

public class Calculator {
	private int memory;
	public int getMomory() {
		return memory;
		
	}
	public void setMemory(int memory) { //게산기 메모리에 값을 저장하는 메소드
		this.memory = memory;// 매개값을 memory필드에 저장;
		try {
			Thread.sleep(2000); // <스레드를 2초간 일시정지 시킴
		}catch(InterruptedException e) {} 
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}					// / 스레드 이름읽기                     /        /메모리값 /			
}
