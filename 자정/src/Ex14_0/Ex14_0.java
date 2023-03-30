package Ex14_0;

public class Ex14_0 {
	public static void main(String[] args) {
//		Object obj =	(a,b) -> a > b ? a: b  //람다식. 익명객체
		Object obj = new Object() {
		int max(int a, int b) {
			return a > b ? a:b;
		}
		};
		
	}
}
