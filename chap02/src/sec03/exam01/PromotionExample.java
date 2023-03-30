package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		//자동타입변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:"+intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue:"+intValue);
		
		intValue = 30;
		long longValue = intValue;
		System.out.println("longvalue:"+ longValue);
		
		longValue= 100;
		float floatValue = longValue;
		System.out.println("longValue:"+longValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("floatValue"+floatValue);
		

	}

}
