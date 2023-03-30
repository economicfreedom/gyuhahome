package sec02.문제;

public class no2 {

	public static void main(String[] args) {
		/*와일리문과 math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 눈1,눈2 형태로 출력하고 눈의 합이 5가 아니면 계속 주사위를 
		 * 던지고 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요,눈의 합이 5가 되는 조합은 1,4 4,1 2,3 3,2입니다. */
		while(true) {
			int 눈1 =(int) (Math.random()*6)+1;
			int 눈2 =(int) (Math.random()*6)+1;
			System.out.println(눈1+눈2);
			두주사위의합은:
				if(눈1+눈2==5) {
					break;
				}
			}
			System.out.println("프로그램 종료");
		
	}
	}

