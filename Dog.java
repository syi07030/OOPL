public class Dog extends Pet{ // Pet 클래스를 부모로 가지는 자손 class Dog
//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

	private Boolean boosterShot;
	public Boolean getBoosterShot() { // private 변수 boosterShot에 대한 getter 메서드
		return boosterShot;
	}
	public void setBoosterShot(Boolean newBoosterShot) { // private 변수 boosterShot에 대한 setter 메서드
		boosterShot = newBoosterShot;
	}
	
	public void writeOutput() { //Override
		super.writeOutput(); //부모의 writeOutput()메서드에다가 boosterShot 여부 출력 추가
		if(boosterShot==true) { //boosterShot이 true이면 O로 표시하고 flase면 X로 출력
			System.out.println("BoosterShot: O");
			}
		else {
			System.out.println("BoosterShot: X");
			}
	}
	
	public void move() { //Override
		System.out.println(super.getName() +" walks and runs.");//이름 뒤에 나오는 내용 부분 변경
	}
	
	public Dog() {} //default 생성자
	public Dog(String name, int age, double weight, Boolean boosterShot) { //4개의 다른 타입의 인자를 메인 메서드에서 받는 생성자
		super(name,age,weight); //부모의 생성자 호출
		setBoosterShot(boosterShot); //이 부분만 추가
	}

}
