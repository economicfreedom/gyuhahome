package sec02.verify.exam06;

import java.util.Scanner;

public class Exercise06 {
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo ==1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				 scores = new int[studentNum];
			
			}else if(selectNo == 2){
			 for(int i=0; i<scores.length; i++) {
				 System.out.print("scores["+i+"]>");
				 scores[i]=Integer.parseInt(scanner.nextLine());
			}
			}else if(selectNo == 3) {
			 for(int g=0; g<scores.length; g++) {
				 System.out.println("scores["+g+"]>");
				 scores[g]=Integer.parseInt(scanner.nextLine());
			} 
			 }else if(selectNo == 4) {
				int 최대치 = 0;
				int sum = 0;
				double 규하= 0;
				for (int i=0; i<scores.length; i++) {
					최대치 = (최대치<scores[i]) ?scores[i]:최대치;
					sum += scores[i];
			  }
				규하 = (double)sum/studentNum;
				System.out.println("최고 점수:"+최대치);
			    System.out.println("평균 점수:"+규하);
			 }else if (selectNo == 5) {
				 run = false;
			 }
				
			}
				
			System.out.println("프로그램 종료");
			
 				
				
			}
		

	}


