//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//HW1_4_한근영

public class StudentInformation { //public class, StudentScore 클래스의 조상 클래스
	private String name; //이름을 저장할 private 변수
	private String id; //id를 저장할 private 변수
	
	public void setName(String name) { //private 변수 name에 대한 setter 메서드
		this.name=name;
	}
	public void setId(String id) { //private 변수 id에 대한 setter 메서드
		this.id=id;
	}
	public String getName() { //private 변수 name에 대한 getter 메서드
		return name;
	}
	public String getId() { //private 변수 id에 대한 getter 메서드
		return id;
	}
	
	public StudentInformation() {} //default 생성자
	public StudentInformation(String name, String id) { //두 개의 String형 인자를 받는 생성자,받은 인자를 멤버변수 name과 id에 각각 setter 메서드를 이용해 저장
		setName(name);
		setId(id);
	}
	
	public void display() { //getter 메서드를 이용해서 name과 id를 출력하는 메서드
		System.out.print(getName()+"\t"+getId());
	}

}
