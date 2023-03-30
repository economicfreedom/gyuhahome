package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		//byte bytevalue3 = bytevalue1 + bytevalue2;
		int intvalue1 = bytevalue1+bytevalue2;
	    System.out.println(intvalue1);
				
	    char charValue1 = 'A';
	    char charValue2 = 1;
	    //char charValue3= charValue1 + charValue2;
	    int intValue2 = charValue1 + charValue2;
	    System.out.println(intValue2);
	    System.out.println("유니코드="+intValue2);
	    System.out.println("출력문자="+(char)intValue2);
	    //char 타입은 출력할때 강제타입변환하면 문자로 출력이 될 수가 있음
	    
	    int intValue3 = 10;
	    int intValue4 = intValue3 / 4; //10/4==>2.5
	    System.out.println(intValue4);
	    double doubleValue = intValue3 / 4.0; 
	    System.out.println(doubleValue);
	    
	    int x = 1;
	    int y = 2;
	    double result =(double) x/y ;
	    System.out.println(result);
	    
	}

}
