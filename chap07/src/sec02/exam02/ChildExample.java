package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		/*parent.method3();child클레스에서 Parent클레스를 상속 받았지만 위 타입변환 과정에서 child클래스를 상속 받았기 떄문에 
		child는 클레스엔 있지만 상위 클래스인 parent 클레스엔 method2가 없기 때문에 타입변환 과정에서 상속 받지 못함
		*/
	}

}
