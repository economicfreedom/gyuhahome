package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("제작회사: "+myCar.회사 );
		System.out.println("모델명: "+myCar.모델);
		System.out.println("색상: "+myCar.색상);
		System.out.println("최대속도: "+myCar.최대속도);
		System.out.println("현재속도: "+myCar.speed);
		
		myCar.speed=60;
		System.out.println("수정된 속도: "+myCar.speed);

		
				

	}

}
