package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phonne; abastract(추상 클레스)때문에 생성자 호출 불가 Phone의 자식 클레스를 만들어서 자식 아래와 같이 자식 클레스를 출력해야함
		
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
	}

}
