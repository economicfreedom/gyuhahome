package 연습장.하이;

import java.util.Scanner;

public class 기본_4A_ExArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하시오");
		System.out.print("첫 번째 정수: ");
		float a =scan.nextFloat();
		System.out.print("두 번째 정수: ");
		float b =scan.nextFloat();
		System.out.print("세 번째 정수: ");
		float c =scan.nextFloat();
		
		if(c == 0) {
			float d = a*b/2;
			System.out.println("삼각형의 넓이는:"+d);
		}else {
			float d = (a+b)*c/2;
			System.out.println("사다리꼴의 넓이는: "+d);
		}
		scan.close();
	}

}
