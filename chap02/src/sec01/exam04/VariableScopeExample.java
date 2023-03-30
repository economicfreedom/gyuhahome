package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2= v1 - 10;		
		}
		/*int v3=v1 + v2 + 5;*/
		/*v2 변수를 사용할 수 없으니 에러 발생 v1은 메소드 블럭에서 선언된 변수이기 때문에 사용이 가능하나
		v2는 if블록에서 선언된 변수이기 때문에 v2는 메소드 블록에서 사용 불가능*/
	}
}