import java.util.Scanner;
public class Week1_3_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		System.out.println("ȭ���µ� �Է�: ");
		int f; //�Է¹��� ȭ���µ� ���� ������ int�� ���� f ����
		Scanner val=new Scanner(System.in); //������ ���� val --> ScannerŬ������ ���� ��ü ����
		f=val.nextInt(); //���� f�� val�̶�� ��ü�� ������ ������ �Է� �޴� method�� ����Ͽ� ȭ���µ� �� ����
		float fTemp=(float)f; //f�� ����ִ� ���� float Ÿ������ ��ȯ�Ͽ� ���� fTemp�� ����
		float c;
		c=(fTemp-32)*5/9; //float�� ���� c�� �����µ� �� ����ؼ� ����((float-int)*int/int -> ��� ���� float!, ������� ����!)
		System.out.printf("\nȭ���µ�: "+f);
		System.out.printf("\n�����µ�: %.1f",c); //c�� ���� �Ҽ��� �Ʒ� ù°�ڸ����� ���		

	}

}
