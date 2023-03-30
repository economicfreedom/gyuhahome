package sec02.exam01;

public class Car {
	Tire frontLefTitre = new HankookTire();
	Tire frontRightTitre = new HankookTire();
	Tire backLeftTitre = new HankookTire();
	Tire backRightTitre = new HankookTire();

	
	void run() {
		frontLefTitre.roll();
		frontRightTitre.roll();
		backLeftTitre.roll();
		backRightTitre.roll();
	}
}
