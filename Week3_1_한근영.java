import java.util.Scanner; //Scanner class �������

public class Week3_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Song song1 = new Song();//������ ���� song1 -> Song Ŭ������ ���� ��ü ����
		Song song2 = new Song();//������ ���� song2 -> Song Ŭ������ ���� �� �ٸ� ��ü ����
		Scanner kbd = new Scanner(System.in); //������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		
		System.out.println("*Song 1*");
		System.out.printf("����Է�: ");
		song1.title=kbd.nextLine();// song1�� ����Ű�� ��ü�� title��� ������ kbd��� ��ü�� ������ ���ڿ��� �Է� �޴� method�� ����Ͽ� �Է¹��� �� ����
		System.out.printf("�������Է�: ");
		song1.singer=kbd.nextLine(); //song1�� ����Ű�� ��ü�� singer��� ������ ���������� kbd �̿��� ���ڿ� ����
		System.out.printf("�����Է�: ");
		song1.price=kbd.nextInt(); //song1�� ����Ű�� ��ü�� price��� ������ ���������� kbd �̿��� ������ ����
		
		System.out.println("\n*Song 2*");
		kbd.nextLine(); //������ nextInt()�� ���ۿ� �ִ� ���Ͱ��� �� �������� ������ ���Ͱ��� ���⼭ ������
		System.out.printf("����Է�: ");
		song2.title=kbd.nextLine(); //song2�� ����Ű�� ��ü�� title��� ������ kbd��� ��ü�� ������ ���ڿ��� �Է� �޴� method�� ����Ͽ� �Է¹��� �� ����
		System.out.printf("�������Է�: ");
		song2.singer=kbd.nextLine(); //song2�� ����Ű�� ��ü�� singer��� ������ ���������� kbd �̿��� ���ڿ� ����
		System.out.printf("�����Է�: ");
		song2.price=kbd.nextInt();//song2�� ����Ű�� ��ü�� price��� ������ ���������� kbd �̿��� ������ ����
		
		System.out.println("\n�뷡�� ������");
		System.out.println("1:"+song1.title+" "+"2:"+song2.title); //song1�� title�� song2�� title ���ڿ� ���
		int num=kbd.nextInt(); //int�� ���� num�� kbd�� ������ �Է� �޴� method�� ����Ͽ� �Է¹��� �� ����
		switch(num) { //switch�� �̿��ؼ� num�� ���� 1�̸� song1�� ���ؼ� method�� play()�� price()�� �����ϰ�, num ���� 2�̸� song2�� ���ؼ� method�� play()��  price() ����
		case 1:
			song1.play();
			song1.price();
			break;
		case 2:
			song2.play();
			song2.price();
			break;
		}
		System.out.println("�����մϴ�.");

	}

}
