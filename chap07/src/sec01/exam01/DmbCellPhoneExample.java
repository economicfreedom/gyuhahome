package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("규하폰","스페이스 그레이",10);
		
		System.out.println("모델 "+dmbCellPhone.model);
		System.out.println("색상 "+dmbCellPhone.color);
		System.out.println("채널 "+dmbCellPhone.channel);

		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("하이");
		dmbCellPhone.receiveVoice("안녕하세요 저는 고양이애오");
		dmbCellPhone.sendVoice("반갑다 레오야");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
