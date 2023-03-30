package sec02.exam02;

public class PrintThread1 extends Thread{
	//필드 생성
	private boolean stop; //setter설정을 하기 위해 stop에 private를 걸어서 다른 클래스에선 접근을 막고 setStop에서 접근제한자를 public으로 해서 접근하여금 처리하게함
	
	public void setStop(boolean stop) {
		this.stop = stop;
		
	}
	public void run() {	//불리언 타입 필드 stop이 트루가 될때 run 메소드를 종료시킴
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
		
	}

