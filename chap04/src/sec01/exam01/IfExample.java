package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");			
		}
		
		if(score<90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B등급입니다.");
	/*	if(score<90)
			 System.out.println("점수가 90보다 작습니다.");
			false가 되어 위에 조건문 까지만 입력이 되어서 위에 조건문은 출력이 안됨
			 System.out.println("등급은 B등급입니다."); 
			 위에 출력은 조건문이 충족되어 출력이 된 것이 아닌 시스템 아웃 프린트를 해서 출력된것이기 때문에 헷갈리지 말 것*/
			
	}

}
