package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1="data1";
		parent.method1();             //<여기서는 child가 parent로 자동타입변환이 되어서 parent내부에 있는 method1,2,를 사용이 가능
		parent.method2();
		/*
		 * parent.field2="data2";
		 * parent.method3(); 여기까지 작성된 코드로는 타입변환 불가능
		 */
		
		Child child = (Child) parent;   //<여기서 위에 주석이 달린 method3를 사용 할 수 있게 위에 선언된 parent로 변환 child를 여기서 다시 child로 강제 타입 변환시켜 사용가능하게함
		child.field2="yyy";
		child.method3();
		
				

	}

}
