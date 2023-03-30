package 예제풀기;

public class 밥값_계산하기 {

	public static void main(String[] args) {
		int donprice = 8000;
		int kalprice = 10000;
		int kingprice = 5000;

		int donNumber = 16;
		int kalNumber = 8;
		int kingNumber = 1;
		
		System.out.printf("%s x %2d = %6d\n","돈까스",donNumber,donprice*donNumber);
		System.out.printf("%s x %2d = %6d\n","칼국수",kalNumber,kalprice*kalNumber);
		System.out.printf("%s x %2d = %6d\n","왕만두",kingNumber,kingprice*kingprice);
		int sum = donNumber*donprice+kalNumber*kalprice+kingNumber*kingprice;
		System.out.printf("%s: %d\n","총합",sum);
		
		
	}

}
