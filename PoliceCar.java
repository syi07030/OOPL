//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_2�� ���õ� Ŭ����
public class PoliceCar extends Car{//Car Ŭ������ �ڼ� class
	public PoliceCar() {//������
		super("Thief",112,"PoliceCar","PoliceOfficer");//������ �����ڸ� ȣ��, �ʱ�ȭ
	}
	public String toString() {//override(Object class�κ��� ��ӹ��� �޼����� body �κ� ����)
		return getStr();
	}
}
