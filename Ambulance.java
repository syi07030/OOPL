//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_2�� ���õ� Ŭ����
public class Ambulance extends Car{//Car Ŭ������ �ڼ� class
	public Ambulance() {//������
		super("Patient",119,"Ambulance","Doctor");//������ �����ڸ� ȣ��, �ʱ�ȭ
	}
	public String toString() {//override(Object class�κ��� ��ӹ��� �޼����� body �κ� ����)
		return getStr();
	}
}
