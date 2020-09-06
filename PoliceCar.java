//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

//Week6_2와 관련된 클래스
public class PoliceCar extends Car{//Car 클래스의 자손 class
	public PoliceCar() {//생성자
		super("Thief",112,"PoliceCar","PoliceOfficer");//조상의 생성자를 호출, 초기화
	}
	public String toString() {//override(Object class로부터 상속받은 메서드의 body 부분 수정)
		return getStr();
	}
}
