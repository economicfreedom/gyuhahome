package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car 내차 = new Car();
		내차.시동켜기();
		내차.run();
		int 속도 =내차.얻은속도();
		System.out.println("현재 속도: "+속도+"km/h");
				
	}

}
