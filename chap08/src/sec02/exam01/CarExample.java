package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLefTitre= new KumhoTire();
		myCar.frontRightTitre = new KumhoTire();
		
		myCar.run();
		

	}

}
 