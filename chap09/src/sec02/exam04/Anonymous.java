package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		//arg1 = 10;
		//arg2 = 10; 매개변수,로컬변수는 파이널을 선언하지 않아도 파이널 특성을 가지기 때문에 값 변경이 불가함
		
		//field는 파이널 특성을 가지지 않아서 변경해도 상관없음
		field= 10;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1+ var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}

}
