package sec01.exam22;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// Integer라는 클래스 타입에 obj라는 변수를 선언하고 100이라는 기본값을 대입함
//		기본값을 클래스타입의 변수에 대입한다는 것은 자바 문법에 맞지 않음
//		100이라는 하는 기본값을 인티저라고 하는 객체로 포장을해서 그 인티저 객체를 obj에 대입함
		Integer obj = 100;
		System.out.println("value: "+obj.intValue());
//		obj라는 래퍼객체 안에 있는 기본타입의 값이
//		value안에 기본타입의 값이 저장됨
//		
		int value =  obj;
		System.out.println("value: "+value);
//		연산식에선 객체와 기본타입의 값을 더하기 할 수 없음
//		obj가 래퍼객체일경우 자동언박싱이 되어서 안에 있는 값이 나와서 100과 연산이됨
//		그 결과를 result에 저장됨
		
		
		int result = obj + 100;
		
		System.out.println("result: "+result);
		
		
	}

}
