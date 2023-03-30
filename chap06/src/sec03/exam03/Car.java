package sec03.exam03;

public class Car {
	//Field
	//매개변수의 오버로딩은 매개변수,순서가 다르면 오버로딩이 아니다
	String 회사 ="현대자동차";
	String 모델;
	String 색상;
	int 최대속도;
	
	//Constructor
	Car(){		
	}

	Car(String 모델){
		this.모델 = 모델;
	}
	Car(String 모델, String 색상){
		this.모델=모델;
		this.색상=색상;
	}
	
	Car(String 모델, String 색상,int 최대속도){ 
		this.모델=모델;
		this.색상=색상;
		this.최대속도 = 최대속도;
	}
}
