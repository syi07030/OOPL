//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_2�� ���õ� Ŭ����
public class Car { //�θ� Ŭ����, FireEngine, Ambulance, PoliceCar Ŭ�������� �ڼ����� ����
	private String emgType; //Fire,Patient,Thief �߿��� �ϳ��� �����ϱ� ���� ��� ����
	private int number; //112, 119 �� �ϳ��� �����ϱ� ���� ��� ����
	private String carType; //FireEngine,Ambulance,PoliceCar �� �ϳ��� �����ϱ� ���� ��� ����
	private String reqPerson; //FireFighter, PoliceOfficer, Doctor �� �ϳ��� �����ϱ� ���� ��� ���� 
	
	public void setEmgType(String emgType) { //private ������� emgType�� ���� setter �޼���
		this.emgType=emgType;
	}
	public void setNumber(int number) { //private ������� number�� ���� setter �޼���
		this.number=number;
	}
	public void setCarType(String carType) { //private ������� carType�� ���� setter �޼���
		this.carType=carType;
	}
	public void setReqPerson(String reqPerson) { //private ������� reqPerson�� ���� setter �޼���
		this.reqPerson=reqPerson; 
	}
	
	public String getEmgType() { //private ������� emgType�� ���� getter �޼���
		return emgType;
	}
	public int getNumber() { //private ������� number�� ���� getter �޼���
		return number;
	}
	public String getCarType() { //private ������� carType�� ���� getter �޼���
		return carType;
	}
	public String getReqPerson() { //private ������� reqPerson�� ���� getter �޼���
		return reqPerson;
	}
	
	public Car() {} //default ������
	public Car(String emgType, int number, String carType, String reqPerson) { //4���� ���ڸ� �޴� ������
		setEmgType(emgType); //setter �޼������ ȣ���ؼ� �ʱ�ȭ ������
		setNumber(number);
		setCarType(carType);
		setReqPerson(reqPerson);
	}
	
	public String getStr() { //getter �޼��带 �̿��� ������ ��� ������ִ� �޼���
		return getEmgType()+"\t\t"+getNumber()+"\t\t"+getCarType()+"\t"+getReqPerson();
	}
}
