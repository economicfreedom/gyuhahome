package sec01.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "981130-1234123";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String seocndNum = ssn.substring(7);
		System.out.println(seocndNum);

	}

}
