import java.util.Scanner; //Scanner class �������

public class Week2_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); //������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		System.out.printf("Input the amount of money(0~100000) :");
		int num = kbd.nextInt(); //int�� ���� num�� kbd��� ��ü�� ������ ������ �Է� �޴� method�� ����Ͽ� �Է¹��� �� ����
		if (num >= 0 && num <= 100000) { //�Է¹��� ���� 0~100000 ������ ������ Ȯ���ϰ� ���̸� if�� �� ����
			int paper_5m = 0, paper_1m = 0, paper_5t = 0, paper_1t = 0; //5����, 1����, 5õ��, 1õ��
			int coin_5h = 0, coin_1h = 0, coin_50 = 0, coin_10 = 0; //500��, 100��, 50��, 10�� ������ ������ ������ ���� ����

			paper_5m = num / 50000; //�Է¹��� ���� num�� 50000���� �������� ���� ���� 5���� ���� ������ ��Ÿ���� ������ ����
			num = num % 50000; //50000���� ���� ������ŭ�� ���� ���� �� �� �������� ���� ������ ������ �̿��Ͽ� �ٽ� num�� ����
			paper_1m = num / 10000; //������ �ٲ� num�� ���ؼ� �ٽ� 10000���� �������� ���� ���� 1���� ���� ������ ��Ÿ���� ������ ����
			num = num % 10000; //10000���� ���� ������ŭ�� ���� ���� �������� ���� �ٽ� num�� ����
			paper_5t = num / 5000; //5000���� ���ؼ��� ��������
			num = num % 5000;
			paper_1t = num / 1000; //1000���� ���ؼ��� ��������
			num = num % 1000;
			coin_5h = num / 500;//500���� ���ؼ��� ��������
			num = num % 500;
			coin_1h = num / 100; //100���� ���ؼ��� ��������
			num = num % 100;
			coin_50 = num / 50; //50���� ���ؼ��� ��������
			num = num % 50;
			coin_10 = num / 10; //10���� ���ؼ��� ��������
			num = num % 10;//10���� ���� ������ŭ�� ���� ���� �������� ���� ���������ν� ���� num���� ����� �������� ��Ÿ�� �� ���� �������� ���� ����Ǿ� ����
			System.out.println("The output will be");
			System.out.println("50000 won: " + paper_5m + "\n10000 won: " + paper_1m + "\n5000 won: " + paper_5t
					+ "\n1000 won: " + paper_1t + "\n500 won: " + coin_5h + "\n100 won: " + coin_1h + "\n50 won: "
					+ coin_50 + "\n10 won: " + coin_10 + "\nRemainder: " + num); //���� ����� ������ ������ ����ϰ� ������ �κ��� num�� ���������� �����ִ� ���� ��� 
		} else //ó���� �Է¹��� num���� 1~100000������ ���� �ƴ϶�� ������ ����ϰ� ����
			System.out.println("�߸��� �Է�");
	}

}
