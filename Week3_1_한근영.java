import java.util.Scanner; //Scanner class 끌어오기

public class Week3_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Song song1 = new Song();//참조형 변수 song1 -> Song 클래스에 대한 객체 생성
		Song song2 = new Song();//참조형 변수 song2 -> Song 클래스에 대한 또 다른 객체 생성
		Scanner kbd = new Scanner(System.in); //참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		
		System.out.println("*Song 1*");
		System.out.printf("곡명입력: ");
		song1.title=kbd.nextLine();// song1이 가리키는 객체의 title멤버 변수에 kbd라는 객체가 가지는 문자열을 입력 받는 method를 사용하여 입력받은 값 저장
		System.out.printf("가수명입력: ");
		song1.singer=kbd.nextLine(); //song1이 가리키는 객체의 singer멤버 변수에 마찬가지로 kbd 이용해 문자열 저장
		System.out.printf("가격입력: ");
		song1.price=kbd.nextInt(); //song1이 가리키는 객체의 price멤버 변수에 마찬가지로 kbd 이용해 정수값 저장
		
		System.out.println("\n*Song 2*");
		kbd.nextLine(); //위에서 nextInt()가 버퍼에 있는 엔터값을 안 가져갔기 때문에 엔터값을 여기서 가져감
		System.out.printf("곡명입력: ");
		song2.title=kbd.nextLine(); //song2가 가리키는 객체의 title멤버 변수에 kbd라는 객체가 가지는 문자열을 입력 받는 method를 사용하여 입력받은 값 저장
		System.out.printf("가수명입력: ");
		song2.singer=kbd.nextLine(); //song2가 가리키는 객체의 singer멤버 변수에 마찬가지로 kbd 이용해 문자열 저장
		System.out.printf("가격입력: ");
		song2.price=kbd.nextInt();//song2가 가리키는 객체의 price멤버 변수에 마찬가지로 kbd 이용해 정수값 저장
		
		System.out.println("\n노래를 고르세요");
		System.out.println("1:"+song1.title+" "+"2:"+song2.title); //song1의 title과 song2의 title 문자열 출력
		int num=kbd.nextInt(); //int형 변수 num에 kbd의 정수를 입력 받는 method를 사용하여 입력받은 값 저장
		switch(num) { //switch문 이용해서 num의 값이 1이면 song1에 대해서 method인 play()와 price()를 실행하고, num 값이 2이면 song2에 대해서 method인 play()와  price() 실행
		case 1:
			song1.play();
			song1.price();
			break;
		case 2:
			song2.play();
			song2.price();
			break;
		}
		System.out.println("감사합니다.");

	}

}
