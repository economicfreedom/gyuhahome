package sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		
		
		Anonymous anony = new Anonymous();
		
		anony.feild.turnOn();
		anony.feild.turnOff();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTv를 켭니다.");
			}
			public void turnOff() {
				System.out.println("SmartTv를 끕니다.");
			}
			});
			}
		}
		

