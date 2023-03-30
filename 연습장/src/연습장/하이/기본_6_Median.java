package 연습장.하이;

import java.util.Scanner;

public class 기본_6_Median {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 세개를 입력하세요");
		
		int one =scan.nextInt();
		int two =scan.nextInt();
		int three =scan.nextInt();
		int median ;
// one이 two보다 크면서 three보다 작거나 or  one이three보다 크면서 two보다 작거나
		if((one>two&&one<three)||(one>three&&one<two)) {
			median =one;
			System.out.println("중간 값은 첫 번째 정수: "+median);
			
			
//two가 one보다 크거나 	three보다 작거나 or two가 three보다 크거나 one보다 작거나
		}else if ((two>one&&two<three)||(two>three&&two<one)) {
			median= two;
			System.out.println("중간 값은 두 번째 정수: "+median);
//둘다 아니면
		}else {
			median=three;
			System.out.println("중간 값은 세 번째 정수: "+median);
		}
		scan.close();
	}

}
