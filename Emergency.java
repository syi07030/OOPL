//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_2�� ���õ� Ŭ����
public class Emergency {
	public int i; //emgList �迭�� �ε����� ��Ÿ���� ���� ����
	public Car[] emgList = new Car[10]; //Car Ÿ���� �������� �迭(ũ��� 10)
	public void EM_Call(Car c) { //���ڷ� Car Ÿ���� ���� -> Car�� �ڼ� Ÿ�Ե� ��� ����
		if(c instanceof PoliceCar) { //c�� ���� Ÿ���� PoliceCar Ÿ�� �Ǵ� �װ��� �ڼ� Ŭ������ ���� ��ü�� 
			System.out.println("call 112"); //112 ���
		}
		else if (c instanceof Car) { //c�� ���� Ÿ���� Car Ÿ�� �Ǵ� �װ��� �ڼ� Ŭ���� Ÿ���̸�(������ if������ PoliceCar Ÿ���� �� �� Ȯ���߱� ������
			                         //���⼭�� FireEngine �Ǵ� Ambulance Ÿ���̸�)
			System.out.println("call 119");//119 ���
		}
		emgList[i]=c;//��ü �迭�� �ν��Ͻ��� c ���� -> c�� �ᱹ ���� �޼��忡�� � ��ü�� ����Ű�� ���������̹Ƿ� �� �ּҸ� �迭�� ���������ν� ��ü�� ������� ��
		i++; //�ε��� �� ����
	}
	
	public void EM_record() {//�迭�� ��� �ν��Ͻ����� ����ϴ� �޼���
		System.out.println("Emergency\tNumber\t\tCar_Type\tRequird");
		for(int j=0;j<i;j++) { //�ݺ��� �̿��ؼ� emgList�� getStr()�� �� ���
			System.out.println(emgList[j].getStr());
		}
	}

}
