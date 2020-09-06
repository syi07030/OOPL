import java.util.Scanner; //Scanner Ŭ���� �������

class Facto{ //�ؿ� ���� �޼��尡 ���ԵǾ� �ִ� Ŭ������ public���� �����ؼ� FactoŬ������ default Ÿ������ ����
	static int result; //static ����
	static int factoVal(int x) { //static �޼���, ���� �޼��忡�� ���� ���� ���ڷ� �޾Ƽ� factorial ���� ���ؼ� ��ȯ
		int total=1;
		for(int n=x;n>0;n--) { //���� �޼��忡�� ���ڷ� ���� ���� ������ 1���� total�� �ݺ������� ���ؼ� factorial �� ����
			total*=n;
		}
		result=total; //�������� factorial���� result�� ����, result�� Ŭ���� �����̹Ƿ� ��� ����
		return total; //�������� factorial���� total �� ��ȯ
	}
}
public class Week4_2_�ѱٿ� {

	public static void main(String[] args) { //���� �޼���
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in);//������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		System.out.printf("ù��° ���� �Է�:");
		int n1=kbd.nextInt(); //������ ���� n1�� �Է¹��� ù��° ���� �� ����
		System.out.printf("�ι�° ���� �Է�:");
		int n2=kbd.nextInt(); //������ ���� n2�� �Է¹��� �ι�° ���� �� ����
		Facto.result=Facto.factoVal(n1) - Facto.factoVal(n2); //�Է¹��� ���� n1,n2�� ���ڷ� �޴� ������ Ŭ���� �޼��� factoVal�� ȣ���ϰ� ������ ��ȯ�� ���� ���̸� Ŭ���� ���� result�� ����
		System.out.println("Factorial("+n1+") - Factorial("+n2+") = "+Facto.result);
		kbd.close();
	}

}
