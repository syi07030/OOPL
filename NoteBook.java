//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_1�� ���õ� Ŭ����
public class NoteBook extends Product{//Product�� �ڼ� class
	public NoteBook(){//������
		super(300);//�θ� ������ ȣ��, ���ڷ� 300
	}
	public String toString() {//Override(��ӹ��� Object Ŭ������ ���ǵ� �޼���)
		return "NoteBook";
	}
}
