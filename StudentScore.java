//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//HW1_4_한근영

public class StudentScore extends StudentInformation{ //StudentInformation 클래스의 자손 클래스
	private int korean; //국어 점수를 저장하는 private 변수
	private int math; //수학 점수를 저장하는 private 변수
	private int english; //영어 점수를 저장하는 private 변수
	
	public void setKorean(int korean) { //private 변수 korean에 대한 setter 메서드
		this.korean=korean;
	}
	public void setMath(int math) { //private 변수 math에 대한 setter 메서드
		this.math=math;
	}
	public void setEnglish(int english) { //private 변수 english에 대한 setter 메서드
		this.english=english;
	}
	public int getKorean(){ //private 변수 korean에 대한 getter 메서드
		return korean;
	}
	public int getMath() { //private 변수 math에 대한 getter 메서드
		return math;
	}
	public int getEnglish(){ //private 변수 english에 대한 getter 메서드
		return english;
	}
	
	public StudentScore() {} //default 생성자
	public StudentScore(String name, String id, int korean, int math, int english) { //5개의 인자를 받는 생성자
		super(name,id); //조상의 생성자를 호출해서 이름과 id 저장
		setKorean(korean); //국어,수학,영어 점수 각각 setter 메서드 이용해서 저장
		setMath(math);
		setEnglish(english);
	}
	
	public void display() { //override, getter 메서드를 이용해서 국어,수학,영어 점수 출력하는 부분 추가
		super.display();
		System.out.print("\t"+getKorean()+"\t"+getMath()+"\t"+getEnglish()+"\t");
	}

}
