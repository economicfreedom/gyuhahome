package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
	speed += 10;
	
	/* 재정의 앞 Car 클래스에 있는 stop 메소드에 final이 붙었기 떄문에 재정의 불가
	   @Override
	 public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0 ;*/
	
	}
}
	 