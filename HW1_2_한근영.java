import java.util.Scanner; //Scanner Ŭ���� �������
public class HW1_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //�������� kbd -> Scanner Ŭ������ ���� ��ü ����
		while(true) { //while�� ����
		System.out.println("\n<< GAME START >>\nDice is rolled!!!\nGuess the number! What do you think?");
		DiceGame game = new DiceGame(); //�������� game->DiceGame Ŭ���� Ÿ���� ��ü ����
		game.startPlaying(); //game�� ����Ű�� ��ü�� ���� startPlaying()�޼��� ����(����ڷκ��� �Է¹��� ���ڿ� �������� ������ �ֻ��� ���� ���ڸ� ���Ͽ� ������ �ٸ��� �Ǵ��ϰ� �׿� ���� ��� )
		System.out.println("Try again?(y/n)"); //�ݺ� ���� �����
		String anw=kbd.next(); //�ݺ� ���ο� ���� ���� y �Ǵ� n���� �Է¹ޱ�(�տ��� ���ڸ� �Է¹ް� ���ۿ� ���� ���Ͱ��� ������ �Է¹ޱ� ���� next()�̿�)
		if(anw.equalsIgnoreCase("n")) break; //���� anw�� n�Ǵ� N�̸� while�� ��������, Y�� y�� while�� ��� �ݺ�
		}
		System.out.println("Game finished."); //while�� ���������� ���� ǥ��
	}
}
