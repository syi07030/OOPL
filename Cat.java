public class Cat extends Pet{ // Pet 클래스를 부모로 가지는 자손 class Cat
//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");
	
	private String color;
	public String getColor() { // private 변수 color에 대한 getter 메서드
		return color;
	}
	public void setColor(String newColor) { // private 변수 color에 대한 setter 메서드
		color = newColor;
	}
	
	public void writeOutput() { //Override
		super.writeOutput(); //부모의 writeOutput()메서드에다가 color 출력 추가
		System.out.println("Color: "+color);
	}
	
	public void move() { //Override
		System.out.println(super.getName() +" creeps and jumps."); //이름 뒤에 나오는 내용 부분 변경
	}
	public Cat() {} //default 생성자
	public Cat(String name, int age, double weight, String color) { //4개의 다른 타입의 인자를 메인 메서드에서 받는 생성자
		super(name,age,weight); //부모의 생성자 호출
		setColor(color); //이 부분만 추가
	}
}
