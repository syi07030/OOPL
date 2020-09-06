import java.util.Scanner; //Scanner 클래스 끌어오기
public class HW1_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조변수 kbd -> Scanner 클래스에 대한 객체 생성
		while(true) { //while문 실행
		System.out.println("\n<< GAME START >>\nDice is rolled!!!\nGuess the number! What do you think?");
		DiceGame game = new DiceGame(); //참조변수 game->DiceGame 클래스 타입의 객체 생성
		game.startPlaying(); //game이 가리키는 객체에 대한 startPlaying()메서드 실행(사용자로부터 입력받은 숫자와 랜덤으로 생성한 주사위 눈의 숫자를 비교하여 같은지 다른지 판단하고 그에 따른 출력 )
		System.out.println("Try again?(y/n)"); //반복 여부 물어보기
		String anw=kbd.next(); //반복 여부에 대한 답을 y 또는 n으로 입력받기(앞에서 숫자를 입력받고 버퍼에 남은 엔터값은 버리고 입력받기 위해 next()이용)
		if(anw.equalsIgnoreCase("n")) break; //만약 anw가 n또는 N이면 while문 빠져나감, Y나 y면 while문 계속 반복
		}
		System.out.println("Game finished."); //while문 빠져나오면 종료 표시
	}
}
