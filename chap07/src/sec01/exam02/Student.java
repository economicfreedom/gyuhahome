package sec01.exam02;

public class Student extends People {
	public int 학생번호;
	
	public Student(String 이름, String 주민등록번호, int 학생번호) {
		super(이름,주민등록번호);
		/*클래시를 선언할때 
		  public Student(){
		  Super () } 이렇게 생성되는데 기본생성자가 없어서 에러가 나는데
		  그렇다고 해서 부모 클래스에서 public People()를 생성 할 수 없으니
		  자식 생성자에서 받은 매개값을 부모생성자에 넣어줘야함
		 */
		this.학생번호 = 학생번호;
		
		
		
		
		
		
	}
	

}
