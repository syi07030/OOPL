import java.util.Scanner;//Scanner class �������
public class Week6_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		Buyer b=new Buyer(); //���� ���� b -> Buyer Ŭ������ ���� ��ü ����
		System.out.println("How much do you have?");
		b.money=kbd.nextInt(); //nextInt() �޼��带 �̿��� ���� ������ �ִ� ���� �׼��� �Է¹޾Ƽ� b�� ����Ű�� Buyer Ÿ�� ��ü�� money�� ����
		
		Tv t = new Tv(); //���� ���� t -> Tv Ŭ������ ���� ��ü ����
		Computer c=new Computer(); //���� ���� c -> Computer Ŭ������ ���� ��ü ����
		Video v=new Video();//���� ���� v -> Video Ŭ������ ���� ��ü ����
		Audio a=new Audio();//���� ���� a -> Audio Ŭ������ ���� ��ü ����
		NoteBook n=new NoteBook();//���� ���� n -> NoteBook Ŭ������ ���� ��ü ����
		int num=1; //���� num�� �Ʒ��� �ݺ������� �Է¹޴� ������ �����ϴµ� �ݺ����� ������ �� ���� ����Ǿ� �ϹǷ� �ϴ� 1�� �ʱ�ȭ
		while(num!=0) { //num ���� 0�� �ƴ϶�� �ݺ��� ����
		System.out.println("What do you want to buy? Input 0 to quit.");
		System.out.println("1.TV(100)     2.Computer(200)     3.Video(110)     4.Audio(50)     5.NoteBook(300)");
		num=kbd.nextInt(); //nextInt() �޼��带 �̿��ؼ� num�� �Է¹��� ���� ����
		switch(num) { //num�� ���� ����
		case 1: b.buy(t);break; //num�� 1�̸� b�� ����Ű�� ��ü�� ���ؼ� buy()�޼��� ����, �� �� ���ڷδ� Tv Ŭ������ ���� ��ü�� ����Ű�� ���� ���� t,
		                        //�� �� buy()�޼���� Product Ŭ���� Ÿ���� �޴µ� �� �� Tv�� Product�� �ڼ��̹Ƿ� t�� ���ڷ� �� �� ����
		                        //�ؿ��� num�� ���� ���� buy()�޼����� ���ڷ� ���� ���������� �޶���
		case 2: b.buy(c);break;
		case 3: b.buy(v);break;
		case 4: b.buy(a);break;
		case 5: b.buy(n);break;
		case 0: break; //num�� ���� 0�̶�� �ƹ��͵� �� �ϰ� switch�� ��������,�ݺ����� ���ǿ����� false�̱� ������ �ݺ��������� ���������� ��
		default: System.out.println("No such item."); break; //���� ���ǿ� ��� �ش���� �ʴ� ���� �� �̷��� ����ϰ� ��������
		}
		if(b.check==1) break; //�ݾ��� ������ ��쿡 �ݺ������� �������� �� �ֵ��� �ϴ� ����
		}
		
		b.summary(); //b�� ����Ű�� ��ü�� ���� summary() �޼���
		kbd.close();
	}
}
