//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//Week9_2_�ѱٿ�

import java.io.*; //java.io�� �ִ� ��� Ŭ���� import�ϱ�
public class Pet implements Serializable{ //�ڼ� Ŭ������ Dog���� Serializable�� �����ؾ� �ϱ� ������ �θ� Ŭ������ Pet�� �����ؾ� ��
	private String name; //�̸��� �����ϴ� private ��� ����
	private int age; //���̸� �����ϴ� private ��� ����
	private double weight; //���Ը� �����ϴ� private ��� ����
	public Pet() {} //default ������
	public Pet(String newName, int newAge, double newWeight) { //3���� ���ڸ� �޴� ������
		setPet(newName, newAge, newWeight); //setPet()�޼��� ȣ��
	}
	public void setPet(String newName, int newAge, double newWeight) { //�̸��� ����, ���Ը� �� ���� �����ϴ� �޼���
		setName(newName); //������ ���� setter �޼��� ȣ���ؼ� �ʱ�ȭ
		setAge(newAge);
		setWeight(newWeight);
	}
	public void setName(String newName) { //private ��� ���� name�� ���� setter �޼���
		name=newName;
	}
	public void setAge(int newAge) { //private ��� ���� age�� ���� setter �޼���
		age=newAge;
	}
	public void setWeight(double newWeight) { //private ��� ���� weight�� ���� setter �޼���
		weight=newWeight;
	}
	public String getName() { //private ��� ���� name�� ���� getter �޼���
		return name;
	}
	public int getAge() { //private ��� ���� age�� ���� getter �޼���
		return age;
	}
	public double getWeight() { //private ��� ���� weight�� ���� getter �޼���
		return weight;
	}
}

class Dog extends Pet implements Serializable{ //Serializable�� �����ϰ� Pet�� �ڼ� Ŭ������ Dog(Pet�� public Ŭ������ �̹� �Ǿ� �ֱ� ������ Dog�� �׳� default�� ����)
	private String breed; //���� �������� �����ϴ� private ��� ����
	private boolean boosterShot; //�������� ���θ� �����ϴ� private ��� ����
	public char checkBoosterShot; //�������� ���θ� ��Ÿ���� ���� ����ϴ� ��� ���� �߰�
	
	public void setBreed(String breed) { //private ��� ���� breed�� ���� setter �޼���
		this.breed=breed;
	}
	public void setBoosterShot(boolean boosterShot) { //private ��� ���� boosterShot�� ���� setter �޼���
		this.boosterShot=boosterShot;
		if(this.boosterShot==true) checkBoosterShot='O'; //���� boosterShot���� true�̸� checkBoosterShot�� O��� charŸ���� ���� ����
		else checkBoosterShot='X'; //false�̸� X��� char Ÿ���� ���� ����
	}
	public String getBreed() { //private ��� ���� breed�� ���� getter �޼���
		return breed;
	}
	public boolean getBoosterShot() { //private ��� ���� boosterShot�� ���� getter �޼���
		return boosterShot;
	}
	public String toString() { //toString()�޼��� overriding
		return getName()+"\t"+getAge()+"\t"+getWeight()+"\t"+getBreed()+"\t\t"+ checkBoosterShot; //�̸�,����,����,��,�������� ���� �� ���
	}
	
	public Dog() {} //default ������
	public Dog(String newName, int newAge, double newWeight, String newBreed, boolean newBoosterShot) { //5���� ���ڸ� �޴� ������
		super(newName,newAge,newWeight);//�̸�,����,���Դ� ������ �����ڸ� ȣ���ؼ� ���� �ʱ�ȭ�ϰ�
		setBreed(newBreed); //���� �������� ���δ� setter �޼��� ȣ���ؼ� �� �ʱ�ȭ
		setBoosterShot(newBoosterShot);
	}
}
