import java.util.Scanner;
public class Week1_3_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		System.out.println("화씨온도 입력: ");
		int f; //입력받을 화씨온도 값을 저장할 int형 변수 f 선언
		Scanner val=new Scanner(System.in); //참조형 변수 val --> Scanner클래스에 대한 객체 생성
		f=val.nextInt(); //변수 f에 val이라는 객체가 가지는 정수를 입력 받는 method를 사용하여 화씨온도 값 저장
		float fTemp=(float)f; //f에 들어있는 값을 float 타입으로 변환하여 변수 fTemp에 저장
		float c;
		c=(fTemp-32)*5/9; //float형 변수 c에 섭씨온도 값 계산해서 저장((float-int)*int/int -> 결과 값은 float!, 연산순서 주의!)
		System.out.printf("\n화씨온도: "+f);
		System.out.printf("\n섭씨온도: %.1f",c); //c의 값을 소수점 아래 첫째자리까지 출력		

	}

}
