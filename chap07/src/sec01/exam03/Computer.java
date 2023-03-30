package sec01.exam03;

/* public으로 바꿀순 있으니 private으로는 변경이 불가능함*/public class Computer extends Calculator {
	@Override //부모가 가진 메소드를 검사를함 부모가 가진 메소드가 없을경우 컴파일 에러가 발생
	//메소드 재정의(overriding)
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return Math.PI * r * r;
		
		
	
	}

	}
