//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_1�� ���õ� Ŭ����
public class Product { //�θ� Ŭ����, Tv, Computer, Video, Audio, Notebook�� �ڽ� Ŭ������ ����
	public int price; //���� ������ ����
	public int bonusPoint; //bonusPoint �� ������ ����
	public Product(){}//default ������
	public Product(int price){ //Product ������, ���ڷ� int���� �ϳ� ����
		this.price=price; //���ڷ� ���� price ���� ���� ����ǰ� �ִ� ��ü�� price���� ����
		bonusPoint=(int)(price/10.0); //bonusPoint�� ����� �ؼ� int������ ����ȯ�� ������ ����
	}
}
