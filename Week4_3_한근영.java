public class Week4_3_�ѱٿ� {
	public static void main(String[] args) { //���� �޼���
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		int a=5, b=10;
		double da=3.4, db=5.2;
		char ca='a',cb='b';
		int iarr[]= {1,2,3}; //���� �迭 ����, �ٷ� �ʱ�ȭ
		double darr[]= {1.1,2.2,3.3}; //�Ǽ� �迭 ����, �ٷ� �ʱ�ȭ
		char carr[]= {'a','p','p','l','e'}; //���� �迭 ����, �ٷ� �ʱ�ȭ
		System.out.println("a+b="+sum(a,b)); //������ �޴� ���ڿ� ������ sum()�޼��带 ȣ��
		System.out.println("da+b="+sum(da,b));
		System.out.println("a+db="+sum(a,db));
		System.out.println("da+db="+sum(da,db));
		System.out.println("ca+cb="+sum(ca,cb));
		System.out.println("sum of Int_Arr="+sum(iarr));
		System.out.println("sum of Double_Arr="+sum(darr));
		System.out.println("sum of Char_Arr="+sum(carr));
	}
	//�Ʒ��� sum()�޼��� ����(�����ε�)-�Ű������� �ٸ����� ����� ����
	//static �޼����� ���� �޼��忡���� �ν��Ͻ��޼���� ȣ���� �� ���� static �޼���� ȣ���� �� �ֱ� ������ sum()�޼���� �����Ͽ� ��� static �޼���� ����, ���� �޼��忡�� ȣ���� �� ������ ������ �Ǳ� ������ Ÿ���� �׳� default�� ��
	static int sum(int a, int b) {return a+b;} //int��,int�� �Ű�����
	static double sum(double a, int b) {return a+b;} //double��,int�� �Ű�����
	static double sum(int a, double b) {return a+b;} //int��,double�� �Ű�����
	static double sum(double a, double b) {return a+b;} //double��,double�� �Ű�����
	static String sum(char a, char b) {return ""+a+b;} //char��,char�� �Ű�����, ����Ÿ���� String���̹Ƿ� �� ���ڸ� �����Ű�� ���� �� ���ڿ��� ""�� �� ���ڸ� �������ν� ��ȯ�� �� ���ڿ��� �� �� �ֵ���
	static int sum(int[] arr) { //���� �迭
		int total=0;//���������̹Ƿ� �ʱ�ȭ �ʿ�
		for(int i=0;i<arr.length;i++) {//�ݺ����� �̿��� �迭�� �ε������� ������Ű�鼭 �迭 ���� �������� ��� ���� 
			total+=arr[i];
		}
		return total;
	}
	static double sum(double[]arr) { //�Ǽ� �迭
		double total=0.0;//����� double������
		for(int i=0;i<arr.length;i++) {//�ݺ����� �̿��� �迭�� �ε������� ������Ű�鼭 �迭 ���� �Ǽ����� ��� ���� 
			total+=arr[i];
		}
		return total;
	}
	static String sum(char[] arr) { //���� �迭
		String total="";//����� String������, �� ���ڿ��� �ʱ�ȭ
		for(int i=0;i<arr.length;i++) {//�ݺ����� �̿��� �迭�� �ε������� ������Ű�鼭 �迭 ���� ���ڵ��� ��� ����, total�� ���ʿ� �� ���ڿ��� �ʱ�ȭ�Ǿ������Ƿ� ���ڵ��� ���⿡ +�� �̿��� �����Ű�� ���������δ� ���ڿ��� �� 
			total+=arr[i];
		}
		return total;
	}
}
