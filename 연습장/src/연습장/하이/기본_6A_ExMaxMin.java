package 연습장.하이;

import java.util.Scanner;

public class 기본_6A_ExMaxMin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int min;
		int max;
		
		if(a>b&&a>c) {
			max=a;
			
		}else if(b>a&b>c) {
			max = b;
			
		}else {
			max = c;
		}if(a<b&&a<c) {
			min=a;
		}else if(b<c&&b<a) {
			min=b;
		}else{
			min=c;
			
		
		}
		
		System.out.println("최대값은: "+max);
		System.out.println("최소값은: "+min);
		scan.close();
	}

}
