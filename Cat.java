public class Cat extends Pet{ // Pet Ŭ������ �θ�� ������ �ڼ� class Cat
//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");
	
	private String color;
	public String getColor() { // private ���� color�� ���� getter �޼���
		return color;
	}
	public void setColor(String newColor) { // private ���� color�� ���� setter �޼���
		color = newColor;
	}
	
	public void writeOutput() { //Override
		super.writeOutput(); //�θ��� writeOutput()�޼��忡�ٰ� color ��� �߰�
		System.out.println("Color: "+color);
	}
	
	public void move() { //Override
		System.out.println(super.getName() +" creeps and jumps."); //�̸� �ڿ� ������ ���� �κ� ����
	}
	public Cat() {} //default ������
	public Cat(String name, int age, double weight, String color) { //4���� �ٸ� Ÿ���� ���ڸ� ���� �޼��忡�� �޴� ������
		super(name,age,weight); //�θ��� ������ ȣ��
		setColor(color); //�� �κи� �߰�
	}
}
