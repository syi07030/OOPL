import java.util.Scanner;//Scanner class 끌어오기

public class Week2_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in);//참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		String anw = "y"; //문자열 참조형 변수 anw 생성 후 "y"를 저장해 밑에 있는 while문이 처음에는 무조건 실행될 수 있도록 함 
		while (anw.equalsIgnoreCase("y")) { //anw에 있는 문자열과 "y"를 대소문자 상관없이 비교해서 참이면 while문 실행
			System.out.println("입력할 온도의 종류? C(섭씨) 또는 F(화씨) :");
			String type = kbd.nextLine(); //문자열 참조형 변수 type에 kbd라는 객체가 가지는 문자열을 입력 받는 method를 사용하여 입력받은 문자열 저장
			double c = 0, cal_f = 0; //double형 변수 c(실수로 입력받을 섭씨 온도값)와 cal_f(계산할 때 화씨 온도 값 형변환에 필요한 변수)생성
			int f = 0, cal_c = 0; //int형 변수 f(정수로 입력받을 화씨 온도값)와 cal_c(계산할 때 섭씨 온도 값 형변환 할 때 필요한 변수) 생성
			if (type.equalsIgnoreCase("c")) { //type에 입력받은 문자열을 "c"와 대소문자 상관없이 비교해서 참이면 if문 안 실행
				System.out.println("섭씨온도(실수)입력");
				c = kbd.nextDouble(); //double형 변수 c에 kbd라는 객체가 가지는 실수를 입력 받는 method를 사용하여 입력받은 실수값 저장
				cal_c = (int) c; //화씨온도 값(정수)을 계산하기 위해서는 섭씨 온도 값을 int형으로 형변환 해주어야 함
				f = (cal_c) * 9 / 5 + 32; //화씨 온도 계산(결과는 int형)
				System.out.println("섭씨 " + c + "도/화씨 " + f + "도");
				System.out.println("계속하시겠습니까?(Y)");
				kbd.nextLine(); //버퍼에 남아있는 엔터 값 가져감으로써 anw에 사용자가 입력하는 문자열이 알맞게 저장되도록
			} 
			else if (type.equalsIgnoreCase("f")) { //type에 입력받은 문자열을 "f"와 대소문자 상관없이 비교해서 참이면 else if문 안 실행
				System.out.println("화씨온도(정수)입력");
				f = kbd.nextInt(); //int형 변수 f에 kbd라는 객체가 가지는 정수를 입력 받는 method를 사용하여 입력받은 정수값 저장
				cal_f = (double) f; //섭씨온도 값(실수)을 계산하기 위해서는 화씨 온도 값을 double형으로 형변환 해주어야 함
				c = (cal_f - 32) * 5 / 9; //섭씨 온도 계산(결과는 double형)
				System.out.printf("화씨 %d도/섭씨 %.1f도\n", f, c); //특히 섭씨 온도 계산 값을 출력할 때 소수점 아래 첫째자리까지 출력
				System.out.println("계속하시겠습니까?(Y)");
				kbd.nextLine();//버퍼에 남아있는 엔터 값 가져감으로써 anw에 사용자가 입력하는 문자열이 알맞게 저장되도록
			} 
			else {
				System.out.println("잘못된 입력\n"); //type에 입력받은 문자열이 위의 두 상황에 모두 해당이 안 된다면 "잘못된 입력"이라고 출력
				System.out.println("계속하시겠습니까?(Y)"); //여기에서는 버퍼에 남아있는 엔터 값이 없어서 kdb.nextLine()생략
			}
			
			anw = kbd.nextLine();//if,else if, else문을 각각 상황에 맞춰 실행 후 공통적으로 anw에 다시 새로운 문자열 저장, 다시 위로 올라가서 while문 조건식을 확인하는 기준이 됨
		}
		System.out.printf("프로그램 종료"); //while문 조건식이 거짓이면 while문을 빠져나와 "프로그램 종료"출력
	}
}
