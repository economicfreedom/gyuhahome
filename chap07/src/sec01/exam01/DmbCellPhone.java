package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	
	//필드
	int channel;
	
	
	//생성자
	DmbCellPhone(String model, String color,int channel){
		//super(); 컴파일러가 익스텐즈를 컴파일할때 기본적으로 super()를 생성해줌
		this.model = model;
		this.color = color;
		this.channel = channel;
		
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+ "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
