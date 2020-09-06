import java.util.Scanner; //Scanner class 끌어오기
public class Week1_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		System.out.println("Input base: ");
		int base, height; //밑변과 높이 값을 정수로 받을 변수 선언
		Scanner val = new Scanner(System.in); //참조형 변수 val --> Scanner클래스에 대한 객체 생성
		base=val.nextInt(); //변수 base에 val이라는 객체가 가지는 정수를 입력 받는 method를 사용하여 밑변 값 저장 
		System.out.println("Input height: ");
		height=val.nextInt(); //변수 height에 val이라는 객체가 가지는 정수를 입력 받는 method를 사용하여 높이 값 저장
		float baseCal, heightCal, area; //형변환을 위한 변수 생성   
		baseCal = (float)base; //float형 변수인 baseCal에 int형 변수인 base에 들어 있는 값을 float타입으로 형변환 해서 저장
		heightCal= (float)height; //heightCal도 마찬가지로 height에 들어있는 값을 형변환해서 저장
		area = baseCal*heightCal/2; // float형인 변수 area에 넓이 값 계산해서 저장(float*float/int -> float*float/float이므로 결과도 float형)
		System.out.println("The area: "+area);
		
	}

}
