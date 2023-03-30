package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person 사람1 = new Person("123456-1234567","최규하");
		
		System.out.println(사람1.나라);
		System.out.println(사람1.주민번호);
		System.out.println(사람1.이름);

		
		//사람1.나라 = "usa";
		//사람1.주민번호="645321-7654321";
		사람1.이름 = "강석주";
	}

}
