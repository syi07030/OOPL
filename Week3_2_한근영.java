import java.util.Scanner; //Scanner class �������
public class Week3_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Circle c = new Circle(); //������ ���� c -> Circle Ŭ������ ���� ��ü ����
		Scanner kbd = new Scanner(System.in); //������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		System.out.printf("�������Է�:"); 
		c.setRadius(kbd.nextDouble()); //kbd�� method nextDouble()�� �̿��� double�� ���� ���ڷ� �Է¹ް� c�� ����Ű�� ��ü���� private member������ radius�� �ٷ� ������ �� ������ setRadius method�� �̿��� �� ���� 
		System.out.printf("������:"+c.getRadius()); //���������� private �ν��Ͻ� ������ radius���� �ҷ����� ���� getRadius() �޼��� ���
		c.circleInfo();//c�� ����Ű�� ��ü�� ���ؼ� circleInfo()�޼��� ����
		
	}

}
