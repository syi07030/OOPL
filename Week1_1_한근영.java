import java.util.Scanner; //Scanner class �������
public class Week1_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		System.out.println("Input base: ");
		int base, height; //�غ��� ���� ���� ������ ���� ���� ����
		Scanner val = new Scanner(System.in); //������ ���� val --> ScannerŬ������ ���� ��ü ����
		base=val.nextInt(); //���� base�� val�̶�� ��ü�� ������ ������ �Է� �޴� method�� ����Ͽ� �غ� �� ���� 
		System.out.println("Input height: ");
		height=val.nextInt(); //���� height�� val�̶�� ��ü�� ������ ������ �Է� �޴� method�� ����Ͽ� ���� �� ����
		float baseCal, heightCal, area; //����ȯ�� ���� ���� ����   
		baseCal = (float)base; //float�� ������ baseCal�� int�� ������ base�� ��� �ִ� ���� floatŸ������ ����ȯ �ؼ� ����
		heightCal= (float)height; //heightCal�� ���������� height�� ����ִ� ���� ����ȯ�ؼ� ����
		area = baseCal*heightCal/2; // float���� ���� area�� ���� �� ����ؼ� ����(float*float/int -> float*float/float�̹Ƿ� ����� float��)
		System.out.println("The area: "+area);
		
	}

}
