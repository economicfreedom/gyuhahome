package sec02.exam03;

public class KumhoTire extends Tire {
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) { //여기까지만 작성 했을땐 super가 작성 되지 않아 3라인에서 컴파일 에러가 발생됨
		super(location,maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ " KumhoTire 수명: "+
				(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire 펑크 ***");
			return false; //리턴 폴스 까지 생성해야 boolean 타입에서 컴파일 에러가 안 남
		}
	}
	

}
