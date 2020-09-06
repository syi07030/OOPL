import java.util.Scanner; //Scanner 클래스 끌어오기

class Facto{ //밑에 메인 메서드가 포함되어 있는 클래스를 public으로 선언해서 Facto클래스는 default 타입으로 선언
	static int result; //static 변수
	static int factoVal(int x) { //static 메서드, 메인 메서드에서 정수 값을 인자로 받아서 factorial 값을 구해서 반환
		int total=1;
		for(int n=x;n>0;n--) { //메인 메서드에서 인자로 받은 정수 값에서 1까지 total에 반복적으로 곱해서 factorial 값 구함
			total*=n;
		}
		result=total; //최종적인 factorial값을 result에 저장, result는 클래스 변수이므로 사용 가능
		return total; //최종적인 factorial값인 total 값 반환
	}
}
public class Week4_2_한근영 {

	public static void main(String[] args) { //메인 메서드
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in);//참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		System.out.printf("첫번째 원소 입력:");
		int n1=kbd.nextInt(); //정수형 변수 n1에 입력받은 첫번째 원소 값 저장
		System.out.printf("두번째 원소 입력:");
		int n2=kbd.nextInt(); //정수형 변수 n2에 입력받은 두번째 원소 값 저장
		Facto.result=Facto.factoVal(n1) - Facto.factoVal(n2); //입력받은 정수 n1,n2를 인자로 받는 각각의 클래스 메서드 factoVal을 호출하고 각각이 반환한 값의 차이를 클래스 변수 result에 저장
		System.out.println("Factorial("+n1+") - Factorial("+n2+") = "+Facto.result);
		kbd.close();
	}

}
