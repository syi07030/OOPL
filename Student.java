//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//Week10_1_�ѱٿ�

public class Student { //Student Ŭ����
	public String name; //�̸��� ������ ��� ����
	public String ID; //id�� ������ ��� ����
	public int age; //���̸� ������ ��� ����
	
	public Student() {} //default ������
	public Student(String name, String ID, int age) { //3���� ���ڸ� �ް� ���� ���ڵ��� ������ �̸�,id,���� ���� ������ �ʱ�ȭ��Ű�� ������
		this.name=name;
		this.ID=ID;
		this.age=age;
	}
	
	public String toString() { //override
		return name+"\t"+ID+"\t"+age;
	}

}
