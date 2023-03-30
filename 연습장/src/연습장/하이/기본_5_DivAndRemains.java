package 연습장.하이;

import java.util.Scanner;

public class 기본_5_DivAndRemains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("2자리수 정수 입력(10~99)>> ");
			if(scan.hasNextInt()) { //hasNextInt scan이 Int타입일때 if문을 실행함 
			/*1. 여기서 if문이 실행이 가능한 이유가 무엇인가요?
				 제가 알기로는 hasNextInt는 Scanner 객체에 입력된 값이 int일때만 true가 될텐데 아직 int값을 입력받지 않았고 아래에서 
				 int num에 입력받을텐데 if문이 실행이 되는 이유가 궁금합니다.
				
				*/
				  
				 
				int num = scan.nextInt();
				if(num>=10&&num<=99) {//중첩if문 사용해서 num에서 받은 값이 10과 같거나 크면서 99와 같거나 작으면 아래 if문을 출력함
					
					int ten = num/10;
					int one = num%10;
					if(ten == one) {
						System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
					}else {
						System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
					}
					break;
				}else {
					System.out.println("입력한 수가 2자리수가 아닙니다."); //	if(num>=10&&num<=99) 입력받은 수가9이하거나 100이상일때 else로 출력함
				}
			} else {
				System.out.println("입력한 값이 숫자가 아닙니다."); //if(scan.hasNextInt()) scan에 입력받은수가 int가 아닐때
				scan.nextLine();
			//2. 이 부분에서는 nextLine을 쓰면 왜 "2자리수 정수 입력"이 다시 실행되는지에 대해서 궁금합니다.
			}
		}
		scan.close();
	
	}
}



