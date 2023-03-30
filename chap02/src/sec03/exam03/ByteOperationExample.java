package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		
		byte result = 10 + 20;
		/*
		 위에 코드는 좌측에 있는 변수 타입에 맞게 컴파일러에서 연산이 되어서 에러가 안남 
		 */
		
		byte x = 10;
		byte y = 20;
		int result1 = x + y ;
		
		byte x2 = 30;
		long y2 = 40;
		long result2 = x2 + y2;
		/*위에 코드는 jvm에서 연산됨 jvm에서 연산이 될때는 산술연산식이 int로 변환돼어서 int로 산출됨
		 변수가 사용되면 변환됨 인트로 변환되던지 long타입이 있다면 롱으로 변환됨
		 */
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
		
		
		
	}

}
