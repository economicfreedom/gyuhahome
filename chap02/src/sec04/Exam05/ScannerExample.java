package sec04.Exam05;

import java.util.Scanner;//스캐너 임풋 설명은 6장


public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입련된 문자열: \" " + inputData + "\"");
			if(inputData.equals("q")){
				break;
			
		
		   }
		}

		System.out.println("종료");
		
	}

}
