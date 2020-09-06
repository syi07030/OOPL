import java.util.Scanner;
public class Week1_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		System.out.println("정수 세 개 입력");
		int a, b, c; //입력받을 정수 세 개의 값을 저장한 int형 변수 a,b,c 선언
		Scanner val = new Scanner(System.in); //참조형 변수 val --> Scanner클래스에 대한 객체 생성
		a=val.nextInt(); //변수 a,b,c 각각에 val이라는 객체가 가지는 정수를 입력 받는 method를 사용하여 각각의 값 저장
		b=val.nextInt();
		c=val.nextInt();
		
		float aCal, bCal, cCal, avr; //형변환을 위한 float형 변수 aCal,bCal,cCal 선언
		aCal=(float)a; //float형 변수 aCal에 a에 들어있는 값을 float형으로 타입 변환해서 저장
		bCal=(float)b; //bCal도 마찬가지
		cCal=(float)c; //cCal도 마찬가지
		avr=(aCal+bCal+cCal)/3; //변수 avr에 평균 값 계산해서 저장((float+float+float)/int -> 결과값도 float!) 
		
		System.out.printf("평균: %.2f", avr); //평균 값을 소수점 이하 둘째자리까지 출력

	}

}
