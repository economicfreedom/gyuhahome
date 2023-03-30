package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "최규하";
		String strVar2 = "최규하";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같네");
			
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다르네");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strvar2는 문자열이 같음");
		}
		String strVar3 = new String("최규하");
		String strVar4 = new String("최규하");
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같네");
			
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다르네");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같네");
		}
	}

}
