//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

//Week6_1과 관련된 클래스
public class Video extends Product{//Product의 자손 class
	public Video(){//생성자
		super(110);//부모 생성자 호출, 인자로 110
	}
	public String toString() {//Override(상속받은 Object 클래스에 정의된 메서드)
		return "Video";
	}

}
