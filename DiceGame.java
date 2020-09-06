//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//HW1_2_한근영

import java.util.Scanner; //Scanner 클래스 끌어오기
public class DiceGame { //public class
	private int diceFace; //1~6 사이의 숫자를 랜덤하게 생성한 주사위 눈의 수를 저장할 private 변수
	private int userGuess; //사용자가 입력한 수를 저장할 private 변수
	Scanner kbd = new Scanner(System.in); //참조변수 kbd -> Scanner 클래스에 대한 객체 생성
	
	public DiceGame() {} 
	//default 생성자(default 외에 다른 생성자는 사용하지 않고 있으므로 다른 생성자를 정의할 필요가 없음, 따로 정의한 다른 생성자가 없기 때문에 이렇게 정의 안 해도 default 생성자가 자동 생성되기는 함)
	
	public void setDiceFace(int diceFace) { //private 변수 diceFace에 대한 setter 메서드
		this.diceFace=diceFace;
	}
	public void setUserGuess(int userGuess) { //private 변수 userGuess에 대한 setter 메서드
		this.userGuess=userGuess;
	}
	public int getDiceFace() { //private 변수 diceFace에 대한 getter 메서드
		return diceFace;
	}
	public int getUserGuess() { //private 변수 userGuess에 대한 getter 메서드
		return userGuess;
	}
	
	private int rollDice() { //private 메서드
		diceFace= (int)(Math.random()*6+1); //Math.random()을 이용해서 1~6 사이의 숫자를 랜덤하게 생성해 diceFace에 저장
		return diceFace; //diceFace 값 반환
	}
	private int getUserInput() { //private 메서드
		while(true) { //while문 실행
		userGuess=kbd.nextInt(); //메서드 내에서 사용자로부터 입력을 받은 수를 userGuess에 일단 저장
		if((userGuess>=1)&&(userGuess<=6)) { //사용자가 입력한 값인 userGuess 값이 1~6 사이의 값이면
			break; //while문 빠져나감
		}
		else { //userGuess 값이 범위 안에 없으면
			System.out.println("Input number between 1~6."); 
		}//else문 빠져나가서 다시 while문 처음으로 돌아가 다시 입력받고 반복해서 범위 체크, 적절한 입력이 들어올 때까지 반복
		}
		return userGuess; //while문 빠져나오면 userGuess값 반환
	}
	private void checkUserGuess(int userInput) { //private 메서드
		if(userInput==diceFace) System.out.println("Bingo!"); //사용자가 입력한 값이 diceFace값과 동일하면 Bingo 출력
		else System.out.println("Wrong!\nThe face was "+diceFace); //값이 서로 다르면 Wrong,현재의 diceFace 값 함께 출력
	}
	public void startPlaying() { //public 메서드
		rollDice(); //rollDice()호출
		checkUserGuess(getUserInput()); //checkUserGuess()호출, 인자로 getUserInput()의 반환값을 받음
	}

}
