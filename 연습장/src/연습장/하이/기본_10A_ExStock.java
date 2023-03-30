package 연습장.하이;

import java.util.Scanner;

public class 기본_10A_ExStock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     // 사용자로부터 코스피 지수를 입력받음
        System.out.print("코스피 지수를 입력하세요(1800~2500): ");
        int kospi = scan.nextInt();

        // 사용자로부터 환율을 입력받음
        System.out.print("환율을 입력하세요(1100~1200): ");
        int exchangeRate = scan.nextInt();

        // 조건문을 사용하여 주식 시장의 상황을 판단
        if (exchangeRate >= 1150) { // 환율이 1150 이상인 경우
            if (kospi >= 2200) { // 코스피 지수가 2200 이상인 경우
                System.out.println("상승장"); // 상승장을 출력
            } else if (kospi >= 2000) { // 코스피 지수가 2199~2000인 경우
                System.out.println("횡보장"); // 횡보장을 출력
            } else { // 코스피 지수가 2000 미만인 경우
                System.out.println("하락장"); // 하락장을 출력
            }
        } else if (exchangeRate<1150){ // 환율이 1150 미만인 경우
            if (kospi >= 2300) { // 코스피 지수가 2300 이상인 경우
                System.out.println("상승장"); // 상승장을 출력
            } else if (kospi >= 2000) { // 코스피 지수가 2299~2000인 경우
                System.out.println("횡보장"); // 횡보장을 출력
            } else { // 코스피 지수가 2000 미만인 경우
                System.out.println("하락장"); // 하락장을 출력
            }
        }
		scan.close();

    }
}