//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_1�� ���õ� Ŭ����
public class Computer extends Product{//Product�� �ڼ� class
	public Computer(){//������
		super(200);//�θ� ������ ȣ��, ���ڷ� 200
	}
	public String toString() {//Override(��ӹ��� Object Ŭ������ ���ǵ� �޼���)
		return "Computer";
	}
}
