package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		dog.breathe();
		cat.breathe();
		
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		
		Animal animal = null;
		
		animal = new Dog();	// <-자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();
		animal.breathe();
		
		
		animal = new Cat(); // <-자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();
		animal.breathe();
		
		System.out.println("----");
		
		
		//메소드의 다형성
		animalSound(new Dog());
		animalBreathe(new Dog());
		animalSound(new Cat());
		animalBreathe(new Cat());
		
		

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}
	
	public static void animalBreathe(Animal animal) {
		animal.breathe();
	}
}
