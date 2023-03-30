package verify;

public class MusicRunnable implements Runnable {//Runnable은 인터페이스 객체이므로 implements를 선언해야함 extedns말고
	@Override
	public void run() {//Runnable에는 run()메소드가 하나 정의됨 구현 클래스는 run()을 재정의해서 작업스레드가 실행할 코드를 작생해야함함
		for(int i=0;i<3;i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			//Runnable은 작업 스레드가 실행할 수 있는 코드를 가지고 있는 개체라고 해서 붙여진 이름
			//Runnable은 인터페이스 타입이기 때문에 구현 객체를 만들어 대입해야합니다. 
			}
		}
	}
}
