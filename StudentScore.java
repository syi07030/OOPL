//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//HW1_4_�ѱٿ�

public class StudentScore extends StudentInformation{ //StudentInformation Ŭ������ �ڼ� Ŭ����
	private int korean; //���� ������ �����ϴ� private ����
	private int math; //���� ������ �����ϴ� private ����
	private int english; //���� ������ �����ϴ� private ����
	
	public void setKorean(int korean) { //private ���� korean�� ���� setter �޼���
		this.korean=korean;
	}
	public void setMath(int math) { //private ���� math�� ���� setter �޼���
		this.math=math;
	}
	public void setEnglish(int english) { //private ���� english�� ���� setter �޼���
		this.english=english;
	}
	public int getKorean(){ //private ���� korean�� ���� getter �޼���
		return korean;
	}
	public int getMath() { //private ���� math�� ���� getter �޼���
		return math;
	}
	public int getEnglish(){ //private ���� english�� ���� getter �޼���
		return english;
	}
	
	public StudentScore() {} //default ������
	public StudentScore(String name, String id, int korean, int math, int english) { //5���� ���ڸ� �޴� ������
		super(name,id); //������ �����ڸ� ȣ���ؼ� �̸��� id ����
		setKorean(korean); //����,����,���� ���� ���� setter �޼��� �̿��ؼ� ����
		setMath(math);
		setEnglish(english);
	}
	
	public void display() { //override, getter �޼��带 �̿��ؼ� ����,����,���� ���� ����ϴ� �κ� �߰�
		super.display();
		System.out.print("\t"+getKorean()+"\t"+getMath()+"\t"+getEnglish()+"\t");
	}

}
