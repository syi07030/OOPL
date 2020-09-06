//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

//Week6_2와 관련된 클래스
public class Car { //부모 클래스, FireEngine, Ambulance, PoliceCar 클래스들을 자손으로 가짐
	private String emgType; //Fire,Patient,Thief 중에서 하나를 저장하기 위한 멤버 변수
	private int number; //112, 119 중 하나를 저장하기 위한 멤버 변수
	private String carType; //FireEngine,Ambulance,PoliceCar 중 하나를 저장하기 위한 멤버 변수
	private String reqPerson; //FireFighter, PoliceOfficer, Doctor 중 하나를 저장하기 위한 멤버 변수 
	
	public void setEmgType(String emgType) { //private 멤버변수 emgType에 대한 setter 메서드
		this.emgType=emgType;
	}
	public void setNumber(int number) { //private 멤버변수 number에 대한 setter 메서드
		this.number=number;
	}
	public void setCarType(String carType) { //private 멤버변수 carType에 대한 setter 메서드
		this.carType=carType;
	}
	public void setReqPerson(String reqPerson) { //private 멤버변수 reqPerson에 대한 setter 메서드
		this.reqPerson=reqPerson; 
	}
	
	public String getEmgType() { //private 멤버변수 emgType에 대한 getter 메서드
		return emgType;
	}
	public int getNumber() { //private 멤버변수 number에 대한 getter 메서드
		return number;
	}
	public String getCarType() { //private 멤버변수 carType에 대한 getter 메서드
		return carType;
	}
	public String getReqPerson() { //private 멤버변수 reqPerson에 대한 getter 메서드
		return reqPerson;
	}
	
	public Car() {} //default 생성자
	public Car(String emgType, int number, String carType, String reqPerson) { //4개의 인자를 받는 생성자
		setEmgType(emgType); //setter 메서드들을 호출해서 초기화 시켜줌
		setNumber(number);
		setCarType(carType);
		setReqPerson(reqPerson);
	}
	
	public String getStr() { //getter 메서드를 이용해 다음을 모두 출력해주는 메서드
		return getEmgType()+"\t\t"+getNumber()+"\t\t"+getCarType()+"\t"+getReqPerson();
	}
}
