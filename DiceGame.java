//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//HW1_2_�ѱٿ�

import java.util.Scanner; //Scanner Ŭ���� �������
public class DiceGame { //public class
	private int diceFace; //1~6 ������ ���ڸ� �����ϰ� ������ �ֻ��� ���� ���� ������ private ����
	private int userGuess; //����ڰ� �Է��� ���� ������ private ����
	Scanner kbd = new Scanner(System.in); //�������� kbd -> Scanner Ŭ������ ���� ��ü ����
	
	public DiceGame() {} 
	//default ������(default �ܿ� �ٸ� �����ڴ� ������� �ʰ� �����Ƿ� �ٸ� �����ڸ� ������ �ʿ䰡 ����, ���� ������ �ٸ� �����ڰ� ���� ������ �̷��� ���� �� �ص� default �����ڰ� �ڵ� �����Ǳ�� ��)
	
	public void setDiceFace(int diceFace) { //private ���� diceFace�� ���� setter �޼���
		this.diceFace=diceFace;
	}
	public void setUserGuess(int userGuess) { //private ���� userGuess�� ���� setter �޼���
		this.userGuess=userGuess;
	}
	public int getDiceFace() { //private ���� diceFace�� ���� getter �޼���
		return diceFace;
	}
	public int getUserGuess() { //private ���� userGuess�� ���� getter �޼���
		return userGuess;
	}
	
	private int rollDice() { //private �޼���
		diceFace= (int)(Math.random()*6+1); //Math.random()�� �̿��ؼ� 1~6 ������ ���ڸ� �����ϰ� ������ diceFace�� ����
		return diceFace; //diceFace �� ��ȯ
	}
	private int getUserInput() { //private �޼���
		while(true) { //while�� ����
		userGuess=kbd.nextInt(); //�޼��� ������ ����ڷκ��� �Է��� ���� ���� userGuess�� �ϴ� ����
		if((userGuess>=1)&&(userGuess<=6)) { //����ڰ� �Է��� ���� userGuess ���� 1~6 ������ ���̸�
			break; //while�� ��������
		}
		else { //userGuess ���� ���� �ȿ� ������
			System.out.println("Input number between 1~6."); 
		}//else�� ���������� �ٽ� while�� ó������ ���ư� �ٽ� �Է¹ް� �ݺ��ؼ� ���� üũ, ������ �Է��� ���� ������ �ݺ�
		}
		return userGuess; //while�� ���������� userGuess�� ��ȯ
	}
	private void checkUserGuess(int userInput) { //private �޼���
		if(userInput==diceFace) System.out.println("Bingo!"); //����ڰ� �Է��� ���� diceFace���� �����ϸ� Bingo ���
		else System.out.println("Wrong!\nThe face was "+diceFace); //���� ���� �ٸ��� Wrong,������ diceFace �� �Բ� ���
	}
	public void startPlaying() { //public �޼���
		rollDice(); //rollDice()ȣ��
		checkUserGuess(getUserInput()); //checkUserGuess()ȣ��, ���ڷ� getUserInput()�� ��ȯ���� ����
	}

}
