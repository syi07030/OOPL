//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

//Week6_1�� ���õ� Ŭ����
public class Buyer {
	public int i; //item �迭������ �ε��� ������ ���Ǵ� ����
	public int money; //���� ������ �ִ� ���� ���� ����Ǵ� ����
	public int bonusPoint=0; //���� ������ �ִ� bonusPoint�� ���� ����Ǵ� ����
	public int check=0; //���� �޼��忡�� �ݾ׺����� �ݺ����� ���������� ���� �ʿ��� ����
	public Product item[]=new Product[10]; //�������� item -> Product Ŭ���� Ÿ���� �迭 ����, ũ��� 10
	public void buy(Product pd) { //Product Ÿ���� ���������� ���ڷ� �޴� �޼���(���� �޼��忡�� ���ڷ� ProductŬ������ �ڼ� Ŭ���� Ÿ���� ��ü�� ����Ű�� ����������)
		if(pd.price>money) { //���� ������ �ִ� ���� �׼����� ���ڷ� ���� ���������� ����Ű�� ��ü�� price���� �� ũ��
			System.out.println("\nMoney is not enough.\n");
			check=1; //check ���� 1�� �ٲ�
		}
		else { //���� ������ �ִ� ���� �׼��� price������ ũ�ų� ������
		System.out.println("You bought "+pd+"("+pd.price+")."); //���⼭ pd�� pd�� ����Ű�� ��ü�� Ÿ�Կ� �´� ������ Ŭ�������� toString���� �����Ѵ�� ��� 
		money=money-pd.price; //money �� ��ȭ
		bonusPoint=bonusPoint+pd.bonusPoint; //bonusPoint �� ��ȭ
		
		item[i++]=pd; //���� �ε��� ���� item �迭��  pd(���� �޼��忡�� ��ü�� ����Ű�� �ּҰ�)�� �����ϰ�, �ε��� �� ����
		}
	}
	public void summary() { //Shopping list, ���� ��, ���� bonus point �� ����ϴ� �޼���
		System.out.print("\nShopping List: ");
		for(int j=0;j<i;j++) { //item �迭�� ����Ǿ� �ִ� ��� ��ǰ(�� ��ǰ) �̸����� ����ϴ� �ݺ���
			System.out.print(item[j]+" ");
		}
		System.out.println("\nMoney left: "+money);
		System.out.println("Current bonus point: "+bonusPoint);
	}
}
