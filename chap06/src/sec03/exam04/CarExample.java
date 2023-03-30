package sec03.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.회사);
		System.out.println(car1.모델);
		System.out.println(car1.색상);
		System.out.println(car1.최대속도);
		
		Car car2 = new Car("자가용");
		System.out.println(car2.회사);
		System.out.println(car2.모델);
		System.out.println(car2.색상);
		System.out.println(car2.최대속도);
		
		Car car3 = new Car("택시","빨강");
		System.out.println(car3.회사);
		System.out.println(car3.모델);
		System.out.println(car3.색상);
		System.out.println(car3.최대속도);
		
		Car car4 = new Car("버스","파랑",87456);
		System.out.println(car4.회사);
		System.out.println(car4.모델);
		System.out.println(car4.색상);
		System.out.println(car4.최대속도);
		
		
		
				

	}

}
