public class Play extends Production { // Production 클래스를 부모로 가지는 자손 class Play
//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

	private int performanceCost;

	public void setPerformanceCost(int cost) { // private 변수 performanceCost에 대한 setter 메서드
		performanceCost = cost;
	}

	public int getPerformanceCost() { // private 변수 performanceCost에 대한 getter 메서드
		return performanceCost;
	}

	public void display() { // Override
		super.display(); // 부모의 display()메서드에다가 perfomanceCost 출력하는 거 첨가
		System.out.println("performance cost:" + performanceCost);
	}

	public Play() {
	} // 혹시 몰라서 default 생성자 정의

	public Play(String title, String director, String writer) { // 3개의 String 인자를 메인 메서드에서 받아서 초기화시켜주는 생성자
		super(title, director, writer); // super로 부모 class의 생성자 호출
	}
}