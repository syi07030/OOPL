//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//Week8_한근영

import java.util.Scanner; //Scanner class import 하기
public class Game {
	public int youV, comV; //You와 Computer가 각각 몇 번 이겼는지 보여주는 public 멤버 변수들
	public int youInput, comInput; // You가 입력한 숫자와 Computer가 선택한 값을 저장하는 public 멤버 변수들
	Scanner kbd = new Scanner(System.in); // 참조변수 kbd -> Scanner 클래스에 대한 객체 생성

	public void play() { // 게임시작 및 반복적으로 게임 진행 후 최종 결과 출력하는 메서드
		System.out.println("가위바위보 게임을 시작합니다.\n");
		while (!((youV == 3)||(comV == 3))) { // You와 Computer 중 하나라도 이긴 횟수가 3번일 때까지 반복해서 input()메서드 호출,실행
			input();
		}
		System.out.println("You("+youV+")   Com("+comV+")"); //최종 결과 출력
		if(youV==3) System.out.println("당신이 이겼습니다."); //You가 3번 이겼으면 당신이 이겼다고 출력
		else System.out.println("컴퓨터가 이겼습니다."); //Computer가 3번 이겼으면 컴퓨터가 이겼다고 출력
		System.out.println("게임을 종료합니다."); //게임 종료
	}

	public void input() { 
		try { //예외 처리하기 위한 try~catch문 형식
			System.out.println("당신의 선택은?(You(" + youV + ") - Com(" + comV + "))\n가위(1) 바위(2) 보(3)");
			youInput = kbd.nextInt(); // 사용자로부터 선택 입력 받음
			if ((youInput < 1) || (youInput > 3)) throw new Exception(); //만약 사용자가 입력한 값이 범위를 벗어나면 예외 발생,처리하기 위해 catch로 이동
			comInput = (int) (Math.random() * 3 + 1); // 컴퓨터가 1~3 중 랜덤으로 하나의 수를 선택함
			System.out.println("<You>\t<Com>");
			System.out.println(show(youInput) + "\t" + show(comInput)); //show()메서드 호출하여 You와 Computer가 무엇을 선택했는지 출력
			writeOutput(); //writeOutput()메서드 호출-누가 이겼는지 결과 출력
		} catch (Exception e) { //예외 처리
			System.out.println("범위가 잘못되었습니다.\n"); //즉, 사용자가 입력한 값이 범위 벗어나면 범위가 잘못되었다고 출력
		}
	}

	public void writeOutput() { // You와 Computer가 입력한 값 비교 후 누가 이겼는지 결과 출력해주는 메서드
		if (youInput == comInput)
			System.out.println("비김\n"); // 값이 똑같으면 비김 출력
		else {
			if ((youInput - comInput == 1) || (youInput - comInput == -2)) { // You와 Computer가 각각 바위 가위, 보 바위, 가위 보 중 하나라면
				System.out.println("당신 승\n"); // You 승
				youV++; //You의 승리 횟수 증가
			} else {
				System.out.println("컴퓨터 승\n"); // 그 외는 Computer 승
				comV++; //Computer의 승리 횟수 증가
			}
		}

	}

	public String show(int num) {// You와 Computer가 각각 무엇을 냈는지 보여주기 위한 메서드
		if (num == 1)
			return "가위"; // 인자로 받은 값이 1이면 가위 반환
		else if (num == 2)
			return "바위"; // 인자로 받은 값이 2이면 바위 반환
		else
			return "보"; // 인자로 받은 값이 3이면 보 반환
	}
}
