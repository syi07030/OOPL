public class Dog extends Pet{ // Pet Ŭ������ �θ�� ������ �ڼ� class Dog
//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

	private Boolean boosterShot;
	public Boolean getBoosterShot() { // private ���� boosterShot�� ���� getter �޼���
		return boosterShot;
	}
	public void setBoosterShot(Boolean newBoosterShot) { // private ���� boosterShot�� ���� setter �޼���
		boosterShot = newBoosterShot;
	}
	
	public void writeOutput() { //Override
		super.writeOutput(); //�θ��� writeOutput()�޼��忡�ٰ� boosterShot ���� ��� �߰�
		if(boosterShot==true) { //boosterShot�� true�̸� O�� ǥ���ϰ� flase�� X�� ���
			System.out.println("BoosterShot: O");
			}
		else {
			System.out.println("BoosterShot: X");
			}
	}
	
	public void move() { //Override
		System.out.println(super.getName() +" walks and runs.");//�̸� �ڿ� ������ ���� �κ� ����
	}
	
	public Dog() {} //default ������
	public Dog(String name, int age, double weight, Boolean boosterShot) { //4���� �ٸ� Ÿ���� ���ڸ� ���� �޼��忡�� �޴� ������
		super(name,age,weight); //�θ��� ������ ȣ��
		setBoosterShot(boosterShot); //�� �κи� �߰�
	}

}
