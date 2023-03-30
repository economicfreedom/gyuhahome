package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		/*String str = "1a";
		 * int value = Integer.parseInt(str) <이런식으로 하면 NumberFormatException 발생
		 * 기본타입(byte,short,char,int,long,float,double,boolean)의 값을 문자열로 바꾸고 싶다면
		 * String str = String.valueOf<O는 대문자(기본타임값);을 하면됨 타입 문자열을 기본타입으로 변환시 대소문자를 잘 확인하자
		 * 숫자열을 문자열로 바꾸고 싶을때 두번째 방법
		 * String str1 =" + 3; 이와 같이 하면 큰 따움표는 숫자3과 결합이 되어 "3" str1에 저장이됨 
		 */
		
		String str = "10";
		int value1= Integer.parseInt(str);//괄호안에 str를 넣나 "10"를 넣나 결국 결과는 같음
		double value2= Double.parseDouble("3.14");
		boolean value3= Boolean.parseBoolean("true");
		
		System.out.println("value1:"+value1);
		System.out.println("value2:"+value2);
		System.out.println("value3:"+value3);
		
		
		int value4 = 10;
		String str1 = String.valueOf(value4);//위와 같음
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		String strvalue = "A";
		
	}
	
	
	
	

}
