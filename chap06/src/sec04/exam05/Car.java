package sec04.exam05;

public class Car {
	//필드
	int 속도;
	
	//생성자
	
	//메소드
	int 얻은속도() {
		return 속도;
	}
	void 시동켜기() {
		System.out.println("시동를 킵니다");
	}
	void run() {
		for(int i=10; i<=50; i+=10) {
			속도 = i;
			System.out.println("달립니다.(시속:"+속도+"km/h");
		}
	}
}
