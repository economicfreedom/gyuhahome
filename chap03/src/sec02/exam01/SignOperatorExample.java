package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {

		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		byte b = 100;
		int result3= -b;
		//byte reslut3 = -b; 바이트 타입 값을 부호 연산하면 int 타입 값으로 바뀌므로 컴파일에러 발생
		System.out.println("result3="+result3);
		
				
		

	}

}