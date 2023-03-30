package sec03.exam02;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
		
				
	}
	
	@Override
	public void sound() { //추상메소드 재정의
		System.out.println("애옹");
	}
	public void breathe() {
		System.out.println("고양이가 숨을 쉽니다.");
	}
}
