//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_1�� ���õ� Ŭ����
public class Tv extends Product{ //Product�� �ڼ� class
	public Tv(){ //Tv ������
		super(100); //�θ� ������ ȣ��, ���ڷ� 100
	}
	public String toString() { //Override(��ӹ��� Object Ŭ������ ���ǵ� �޼���)
		return "Tv";
	}
}
