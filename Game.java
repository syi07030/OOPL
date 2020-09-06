//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//Week8_�ѱٿ�

import java.util.Scanner; //Scanner class import �ϱ�
public class Game {
	public int youV, comV; //You�� Computer�� ���� �� �� �̰���� �����ִ� public ��� ������
	public int youInput, comInput; // You�� �Է��� ���ڿ� Computer�� ������ ���� �����ϴ� public ��� ������
	Scanner kbd = new Scanner(System.in); // �������� kbd -> Scanner Ŭ������ ���� ��ü ����

	public void play() { // ���ӽ��� �� �ݺ������� ���� ���� �� ���� ��� ����ϴ� �޼���
		System.out.println("���������� ������ �����մϴ�.\n");
		while (!((youV == 3)||(comV == 3))) { // You�� Computer �� �ϳ��� �̱� Ƚ���� 3���� ������ �ݺ��ؼ� input()�޼��� ȣ��,����
			input();
		}
		System.out.println("You("+youV+")   Com("+comV+")"); //���� ��� ���
		if(youV==3) System.out.println("����� �̰���ϴ�."); //You�� 3�� �̰����� ����� �̰�ٰ� ���
		else System.out.println("��ǻ�Ͱ� �̰���ϴ�."); //Computer�� 3�� �̰����� ��ǻ�Ͱ� �̰�ٰ� ���
		System.out.println("������ �����մϴ�."); //���� ����
	}

	public void input() { 
		try { //���� ó���ϱ� ���� try~catch�� ����
			System.out.println("����� ������?(You(" + youV + ") - Com(" + comV + "))\n����(1) ����(2) ��(3)");
			youInput = kbd.nextInt(); // ����ڷκ��� ���� �Է� ����
			if ((youInput < 1) || (youInput > 3)) throw new Exception(); //���� ����ڰ� �Է��� ���� ������ ����� ���� �߻�,ó���ϱ� ���� catch�� �̵�
			comInput = (int) (Math.random() * 3 + 1); // ��ǻ�Ͱ� 1~3 �� �������� �ϳ��� ���� ������
			System.out.println("<You>\t<Com>");
			System.out.println(show(youInput) + "\t" + show(comInput)); //show()�޼��� ȣ���Ͽ� You�� Computer�� ������ �����ߴ��� ���
			writeOutput(); //writeOutput()�޼��� ȣ��-���� �̰���� ��� ���
		} catch (Exception e) { //���� ó��
			System.out.println("������ �߸��Ǿ����ϴ�.\n"); //��, ����ڰ� �Է��� ���� ���� ����� ������ �߸��Ǿ��ٰ� ���
		}
	}

	public void writeOutput() { // You�� Computer�� �Է��� �� �� �� ���� �̰���� ��� ������ִ� �޼���
		if (youInput == comInput)
			System.out.println("���\n"); // ���� �Ȱ����� ��� ���
		else {
			if ((youInput - comInput == 1) || (youInput - comInput == -2)) { // You�� Computer�� ���� ���� ����, �� ����, ���� �� �� �ϳ����
				System.out.println("��� ��\n"); // You ��
				youV++; //You�� �¸� Ƚ�� ����
			} else {
				System.out.println("��ǻ�� ��\n"); // �� �ܴ� Computer ��
				comV++; //Computer�� �¸� Ƚ�� ����
			}
		}

	}

	public String show(int num) {// You�� Computer�� ���� ������ �´��� �����ֱ� ���� �޼���
		if (num == 1)
			return "����"; // ���ڷ� ���� ���� 1�̸� ���� ��ȯ
		else if (num == 2)
			return "����"; // ���ڷ� ���� ���� 2�̸� ���� ��ȯ
		else
			return "��"; // ���ڷ� ���� ���� 3�̸� �� ��ȯ
	}
}
