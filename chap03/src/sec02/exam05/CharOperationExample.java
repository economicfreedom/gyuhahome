package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 ='A'+1; //char c1=66;으로 컴파일됨
		char c2 = 'A';
		char c3=(char) (c2+1);//char c3=c2+1이렇게 하는 것이 아니라 강제타입변환을 사용해서 연산 해야됨
		//char c3 = c+1; <char 변수가 산술 연산에 사용되면 int타입으로 변환되므로 연산 결과는 int타입이 됨
		
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		System.out.println("c3:"+c3);
		//System.out.println("c3:"+3);	
		}

}
