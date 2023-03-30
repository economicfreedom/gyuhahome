package Ex01_퀴즈;

public class Q10 {
	public static void main(String[] args) {
		
		int n = 1314;
		int i= 0;
		int count = 0;
		while(n>i) {
			
			n/=10;
			count++;
		}
		System.out.println("그 수는 "+count+"자리입니다.");
	}
}
