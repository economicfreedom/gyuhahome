package sec01.exam04;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable=100; 파이널이 선언 되었기 때문에 변수값 수정이 불가능함
		class Inner{
			public void method() {
				
			}
			
		}
	}


	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg=100;
		//loacalVariable = 100; 자바 7이후에선 자동으로 선언됨
	class Ineer{
		public void method() {
			int result = arg+localVariable;
		}
	}
	}
}