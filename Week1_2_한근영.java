import java.util.Scanner;
public class Week1_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		System.out.println("���� �� �� �Է�");
		int a, b, c; //�Է¹��� ���� �� ���� ���� ������ int�� ���� a,b,c ����
		Scanner val = new Scanner(System.in); //������ ���� val --> ScannerŬ������ ���� ��ü ����
		a=val.nextInt(); //���� a,b,c ������ val�̶�� ��ü�� ������ ������ �Է� �޴� method�� ����Ͽ� ������ �� ����
		b=val.nextInt();
		c=val.nextInt();
		
		float aCal, bCal, cCal, avr; //����ȯ�� ���� float�� ���� aCal,bCal,cCal ����
		aCal=(float)a; //float�� ���� aCal�� a�� ����ִ� ���� float������ Ÿ�� ��ȯ�ؼ� ����
		bCal=(float)b; //bCal�� ��������
		cCal=(float)c; //cCal�� ��������
		avr=(aCal+bCal+cCal)/3; //���� avr�� ��� �� ����ؼ� ����((float+float+float)/int -> ������� float!) 
		
		System.out.printf("���: %.2f", avr); //��� ���� �Ҽ��� ���� ��°�ڸ����� ���

	}

}
