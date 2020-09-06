import java.util.Scanner; //Scanner class 끌어오기

public class Week2_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); //참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		System.out.printf("Input the amount of money(0~100000) :");
		int num = kbd.nextInt(); //int형 변수 num에 kbd라는 객체가 가지는 정수를 입력 받는 method를 사용하여 입력받은 값 저장
		if (num >= 0 && num <= 100000) { //입력받은 값이 0~100000 사이의 값인지 확인하고 참이면 if문 안 실행
			int paper_5m = 0, paper_1m = 0, paper_5t = 0, paper_1t = 0; //5만원, 1만원, 5천원, 1천원
			int coin_5h = 0, coin_1h = 0, coin_50 = 0, coin_10 = 0; //500원, 100원, 50원, 10원 각각의 개수를 저장할 변수 생성

			paper_5m = num / 50000; //입력받은 수인 num을 50000으로 나누었을 때의 몫을 5만원 지폐 개수를 나타내는 변수에 저장
			num = num % 50000; //50000원에 대한 개수만큼의 돈을 빼고 난 후 나머지의 돈을 나머지 연산을 이용하여 다시 num에 저장
			paper_1m = num / 10000; //위에서 바뀐 num에 대해서 다시 10000으로 나누었을 때의 몫을 1만원 지폐 개수를 나타내는 변수에 저장
			num = num % 10000; //10000원에 대한 개수만큼의 돈을 빼고 나머지의 돈을 다시 num에 저장
			paper_5t = num / 5000; //5000원에 대해서도 마찬가지
			num = num % 5000;
			paper_1t = num / 1000; //1000원에 대해서도 마찬가지
			num = num % 1000;
			coin_5h = num / 500;//500원에 대해서도 마찬가지
			num = num % 500;
			coin_1h = num / 100; //100원에 대해서도 마찬가지
			num = num % 100;
			coin_50 = num / 50; //50원에 대해서도 마찬가지
			num = num % 50;
			coin_10 = num / 10; //10원에 대해서도 마찬가지
			num = num % 10;//10원에 대한 개수만큼의 돈을 빼고 나머지의 돈을 저장함으로써 이제 num에는 지폐와 동전으로 나타낼 수 없는 나머지의 값만 저장되어 있음
			System.out.println("The output will be");
			System.out.println("50000 won: " + paper_5m + "\n10000 won: " + paper_1m + "\n5000 won: " + paper_5t
					+ "\n1000 won: " + paper_1t + "\n500 won: " + coin_5h + "\n100 won: " + coin_1h + "\n50 won: "
					+ coin_50 + "\n10 won: " + coin_10 + "\nRemainder: " + num); //각각 지폐와 동전의 개수를 출력하고 나머지 부분은 num에 마지막으로 남아있는 값을 출력 
		} else //처음에 입력받은 num값이 1~100000사이의 값이 아니라면 다음을 출력하고 종료
			System.out.println("잘못된 입력");
	}

}
