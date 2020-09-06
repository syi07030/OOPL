//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//Week9_2_한근영

import java.io.*; //java.io에 있는 모든 클래스 import하기
public class Pet implements Serializable{ //자손 클래스인 Dog에서 Serializable을 구현해야 하기 때문에 부모 클래스인 Pet도 구현해야 함
	private String name; //이름을 저장하는 private 멤버 변수
	private int age; //나이를 저장하는 private 멤버 변수
	private double weight; //무게를 저장하는 private 멤버 변수
	public Pet() {} //default 생성자
	public Pet(String newName, int newAge, double newWeight) { //3개의 인자를 받는 생성자
		setPet(newName, newAge, newWeight); //setPet()메서드 호출
	}
	public void setPet(String newName, int newAge, double newWeight) { //이름과 나이, 무게를 한 번에 저장하는 메서드
		setName(newName); //각각에 대한 setter 메서드 호출해서 초기화
		setAge(newAge);
		setWeight(newWeight);
	}
	public void setName(String newName) { //private 멤버 변수 name에 대한 setter 메서드
		name=newName;
	}
	public void setAge(int newAge) { //private 멤버 변수 age에 대한 setter 메서드
		age=newAge;
	}
	public void setWeight(double newWeight) { //private 멤버 변수 weight에 대한 setter 메서드
		weight=newWeight;
	}
	public String getName() { //private 멤버 변수 name에 대한 getter 메서드
		return name;
	}
	public int getAge() { //private 멤버 변수 age에 대한 getter 메서드
		return age;
	}
	public double getWeight() { //private 멤버 변수 weight에 대한 getter 메서드
		return weight;
	}
}

class Dog extends Pet implements Serializable{ //Serializable을 구현하고 Pet의 자손 클래스인 Dog(Pet이 public 클래스로 이미 되어 있기 때문에 Dog는 그냥 default로 정의)
	private String breed; //종이 무엇인지 저장하는 private 멤버 변수
	private boolean boosterShot; //예방접종 여부를 저장하는 private 멤버 변수
	public char checkBoosterShot; //예방접종 여부를 나타내기 위해 사용하는 멤버 변수 추가
	
	public void setBreed(String breed) { //private 멤버 변수 breed에 대한 setter 메서드
		this.breed=breed;
	}
	public void setBoosterShot(boolean boosterShot) { //private 멤버 변수 boosterShot에 대한 setter 메서드
		this.boosterShot=boosterShot;
		if(this.boosterShot==true) checkBoosterShot='O'; //만약 boosterShot값이 true이면 checkBoosterShot은 O라는 char타입의 값을 가짐
		else checkBoosterShot='X'; //false이면 X라는 char 타입의 값을 가짐
	}
	public String getBreed() { //private 멤버 변수 breed에 대한 getter 메서드
		return breed;
	}
	public boolean getBoosterShot() { //private 멤버 변수 boosterShot에 대한 getter 메서드
		return boosterShot;
	}
	public String toString() { //toString()메서드 overriding
		return getName()+"\t"+getAge()+"\t"+getWeight()+"\t"+getBreed()+"\t\t"+ checkBoosterShot; //이름,나이,무게,종,예방접종 여부 다 출력
	}
	
	public Dog() {} //default 생성자
	public Dog(String newName, int newAge, double newWeight, String newBreed, boolean newBoosterShot) { //5개의 인자를 받는 생성자
		super(newName,newAge,newWeight);//이름,나이,무게는 조상의 생성자를 호출해서 값을 초기화하고
		setBreed(newBreed); //종과 예방접종 여부는 setter 메서드 호출해서 값 초기화
		setBoosterShot(newBoosterShot);
	}
}
