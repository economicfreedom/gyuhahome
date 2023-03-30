package sec05.exam03;

public class Car {
	 int speed;
	 void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	public static void main(String[] args) {
		Car 내자동차 = new Car();
		내자동차.speed = 60;
		내자동차.run();
		

	}

}
 