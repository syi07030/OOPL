//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_2�� ���õ� Ŭ����
public class FireEngine extends Car{ //Car Ŭ������ �ڼ� class
	public FireEngine() { //������
		super("Fire",119,"FireEngine","FireFighter"); //������ �����ڸ� ȣ��, �ʱ�ȭ
	}
	public String toString() { //override(Object class�κ��� ��ӹ��� �޼����� body �κ� ����)
		return getStr();
	}
}
