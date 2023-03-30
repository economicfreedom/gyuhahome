package sec01.exam25;

public class VlaueCompareExample {

	public static void main(String[] args) {
//		포장 객체는 내부 값 비교하기 위해 == 및 != 연산자 사용하지 않는 것이 좋음
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: "+(obj1 == obj2));
		System.out.println("==결과: "+(obj1.equals(obj2)));
		
		
//		byte,short,int가 -128~127이 범위에서 박싱이 되었다면 박싱된 객체에서 공유해서 사용됨  아래 같은 경우 객체의 번지가 같아짐
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: "+(obj3 == obj4));
		System.out.println("equals()결과: "+(obj3.equals(obj4)));

	}

}
