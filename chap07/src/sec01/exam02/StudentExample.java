package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student("최규하","123456-1234567",1);
		System.out.println("이름 :"+student.이름);
		System.out.println("주민등록번호 :"+student.주민등록번호);
		System.out.println("학생번호 :"+student.학생번호);
	}

}
