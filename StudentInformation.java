//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//HW1_4_�ѱٿ�

public class StudentInformation { //public class, StudentScore Ŭ������ ���� Ŭ����
	private String name; //�̸��� ������ private ����
	private String id; //id�� ������ private ����
	
	public void setName(String name) { //private ���� name�� ���� setter �޼���
		this.name=name;
	}
	public void setId(String id) { //private ���� id�� ���� setter �޼���
		this.id=id;
	}
	public String getName() { //private ���� name�� ���� getter �޼���
		return name;
	}
	public String getId() { //private ���� id�� ���� getter �޼���
		return id;
	}
	
	public StudentInformation() {} //default ������
	public StudentInformation(String name, String id) { //�� ���� String�� ���ڸ� �޴� ������,���� ���ڸ� ������� name�� id�� ���� setter �޼��带 �̿��� ����
		setName(name);
		setId(id);
	}
	
	public void display() { //getter �޼��带 �̿��ؼ� name�� id�� ����ϴ� �޼���
		System.out.print(getName()+"\t"+getId());
	}

}
