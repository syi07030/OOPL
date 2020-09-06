import java.util.Scanner; //Scanner class 끌어오기
public class Week3_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Circle c = new Circle(); //참조형 변수 c -> Circle 클래스에 대한 객체 생성
		Scanner kbd = new Scanner(System.in); //참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		System.out.printf("반지름입력:"); 
		c.setRadius(kbd.nextDouble()); //kbd의 method nextDouble()을 이용해 double형 값을 인자로 입력받고 c가 가리키는 객체에서 private member변수인 radius에 바로 접근할 수 없으니 setRadius method를 이용해 값 저장 
		System.out.printf("반지름:"+c.getRadius()); //마찬가지로 private 인스턴스 변수인 radius값을 불러오기 위해 getRadius() 메서드 사용
		c.circleInfo();//c가 가리키는 객체에 대해서 circleInfo()메서드 실행
		
	}

}
