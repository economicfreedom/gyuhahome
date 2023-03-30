package 예제풀기;

import java.util.Scanner;

public class 도형계산기 {

	public static void main(String[] args) {
		Scanner calc = new Scanner(System.in);
		System.out.print("도형의 넓이를 계산합니다.\n"+"현재 준비된 도형은 다음과 같습니다.\n"+"O원형\n"+"원의 둘레\n"+"△삼각형\n"+"□사각형\n");
	//	System.out.println("원의 둘레를 원하시면 \"둘레\"라고 입력해주세요");
		System.out.print("원하시는 도형 입력해주세요: ");
		String figure = calc.nextLine();

		int h;
		int a;
		int r;;
		switch(figure) {

		case "정삼각형":
			System.out.println("정삼각형의 넓이를 구합니다.");	
			System.out.print("높이를 입력하세요 :");
			h=calc.nextInt();
			System.out.print("길이를 입력하세요 :");
			a=calc.nextInt();


			System.out.println("정삼각형의 넓이는"+(h*a/2));
			break;
		case "정사각형":
			System.out.println("정사각형을 구하는 식입니다.");
			System.out.print("높이를 입력하세요 :");
			h=calc.nextInt();
			System.out.print("길이를 입력하세요 :");
			a=calc.nextInt();
			System.out.println("정사각형의 넓이는 :"+(h*a));
			break;
		case "원형":
			System.out.println("원의 넓이를 구합니다.");
			System.out.print("반지름을 입력하세요");
			r=calc.nextInt();
			double r2 =  r*2*3.14;
			String r3 = String.format("%.2f", r2);
			System.out.println("원의 넓이는 "+r3);
			System.out.print("둘레도 구하시겠습니까? Y/N");	
			String 선택 =calc.nextLine();
			
			
			if(선택.equals("Y")) {			
				System.out.println("원의 둘레를 구합니다.");
				System.out.print("지름을 입력하세요");
				int d =calc.nextInt();
				double d2 = d*3.14;
				String d3 = String.format("%.2f", d2);			
				System.out.println("원의 둘레는: "+d3+"입니다.");											
				break;

			}else {
				System.out.println("프로그램을 종료합니다.");
			

			}
			break;
		}

	}



}


