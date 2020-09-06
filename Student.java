//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//Week10_1_한근영

public class Student { //Student 클래스
	public String name; //이름을 저장할 멤버 변수
	public String ID; //id를 저장할 멤버 변수
	public int age; //나이를 저장할 멤버 변수
	
	public Student() {} //default 생성자
	public Student(String name, String ID, int age) { //3개의 인자를 받고 받은 인자들의 값으로 이름,id,나이 변수 각각을 초기화시키는 생성자
		this.name=name;
		this.ID=ID;
		this.age=age;
	}
	
	public String toString() { //override
		return name+"\t"+ID+"\t"+age;
	}

}
