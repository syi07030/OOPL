import java.util.Scanner;//Scanner class �������

public class Week2_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in);//������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		String anw = "y"; //���ڿ� ������ ���� anw ���� �� "y"�� ������ �ؿ� �ִ� while���� ó������ ������ ����� �� �ֵ��� �� 
		while (anw.equalsIgnoreCase("y")) { //anw�� �ִ� ���ڿ��� "y"�� ��ҹ��� ������� ���ؼ� ���̸� while�� ����
			System.out.println("�Է��� �µ��� ����? C(����) �Ǵ� F(ȭ��) :");
			String type = kbd.nextLine(); //���ڿ� ������ ���� type�� kbd��� ��ü�� ������ ���ڿ��� �Է� �޴� method�� ����Ͽ� �Է¹��� ���ڿ� ����
			double c = 0, cal_f = 0; //double�� ���� c(�Ǽ��� �Է¹��� ���� �µ���)�� cal_f(����� �� ȭ�� �µ� �� ����ȯ�� �ʿ��� ����)����
			int f = 0, cal_c = 0; //int�� ���� f(������ �Է¹��� ȭ�� �µ���)�� cal_c(����� �� ���� �µ� �� ����ȯ �� �� �ʿ��� ����) ����
			if (type.equalsIgnoreCase("c")) { //type�� �Է¹��� ���ڿ��� "c"�� ��ҹ��� ������� ���ؼ� ���̸� if�� �� ����
				System.out.println("�����µ�(�Ǽ�)�Է�");
				c = kbd.nextDouble(); //double�� ���� c�� kbd��� ��ü�� ������ �Ǽ��� �Է� �޴� method�� ����Ͽ� �Է¹��� �Ǽ��� ����
				cal_c = (int) c; //ȭ���µ� ��(����)�� ����ϱ� ���ؼ��� ���� �µ� ���� int������ ����ȯ ���־�� ��
				f = (cal_c) * 9 / 5 + 32; //ȭ�� �µ� ���(����� int��)
				System.out.println("���� " + c + "��/ȭ�� " + f + "��");
				System.out.println("����Ͻðڽ��ϱ�?(Y)");
				kbd.nextLine(); //���ۿ� �����ִ� ���� �� ���������ν� anw�� ����ڰ� �Է��ϴ� ���ڿ��� �˸°� ����ǵ���
			} 
			else if (type.equalsIgnoreCase("f")) { //type�� �Է¹��� ���ڿ��� "f"�� ��ҹ��� ������� ���ؼ� ���̸� else if�� �� ����
				System.out.println("ȭ���µ�(����)�Է�");
				f = kbd.nextInt(); //int�� ���� f�� kbd��� ��ü�� ������ ������ �Է� �޴� method�� ����Ͽ� �Է¹��� ������ ����
				cal_f = (double) f; //�����µ� ��(�Ǽ�)�� ����ϱ� ���ؼ��� ȭ�� �µ� ���� double������ ����ȯ ���־�� ��
				c = (cal_f - 32) * 5 / 9; //���� �µ� ���(����� double��)
				System.out.printf("ȭ�� %d��/���� %.1f��\n", f, c); //Ư�� ���� �µ� ��� ���� ����� �� �Ҽ��� �Ʒ� ù°�ڸ����� ���
				System.out.println("����Ͻðڽ��ϱ�?(Y)");
				kbd.nextLine();//���ۿ� �����ִ� ���� �� ���������ν� anw�� ����ڰ� �Է��ϴ� ���ڿ��� �˸°� ����ǵ���
			} 
			else {
				System.out.println("�߸��� �Է�\n"); //type�� �Է¹��� ���ڿ��� ���� �� ��Ȳ�� ��� �ش��� �� �ȴٸ� "�߸��� �Է�"�̶�� ���
				System.out.println("����Ͻðڽ��ϱ�?(Y)"); //���⿡���� ���ۿ� �����ִ� ���� ���� ��� kdb.nextLine()����
			}
			
			anw = kbd.nextLine();//if,else if, else���� ���� ��Ȳ�� ���� ���� �� ���������� anw�� �ٽ� ���ο� ���ڿ� ����, �ٽ� ���� �ö󰡼� while�� ���ǽ��� Ȯ���ϴ� ������ ��
		}
		System.out.printf("���α׷� ����"); //while�� ���ǽ��� �����̸� while���� �������� "���α׷� ����"���
	}
}
