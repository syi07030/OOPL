import java.util.Scanner;//Scanner class �������
public class Week6_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		FireEngine f = new FireEngine(); //FireEngine class�� ���� ��ü ����
		Ambulance a = new Ambulance(); //Ambulance class�� ���� ��ü ����
		PoliceCar p = new PoliceCar(); //PoliceCar class�� ���� ��ü ����
		Emergency e = new Emergency(); //Emergency Ŭ������ ���� ��ü ����
		int num=0;//�Է¹��� ������ ������ ����, while���� �� ���̶� �����Ű�� ���� �ϴ� 0���� �ʱ�ȭ
		while(num!=5) {//num���� 5�� �ƴ� ��쿡 �ݺ��� ����
		System.out.println("What kind of Emergency?");
		System.out.println("1.Fire   2.Patient   3.Thief   4.Record   5.End");
		num=kbd.nextInt(); //�Է¹��� ���� ���� num�� ����
		switch(num) {//num�� ���� ����
		case 1: e.EM_Call(f); break; //num ���� 1�̸� �������� e�� ����Ű�� ��ü�� ���ؼ� EM_Call()�޼��� ����, �� �� ���ڷ� FireEngine Ÿ���� ��ü�� ����Ű�� ��������
		                             //�� �޼��尡 ���ǵ� Ŭ������ ���� ���ڷ� Car Ÿ���� ���ڷ� �޴µ� Car�� FireEngine�� ���� Ŭ�����̹Ƿ� ����
		case 2: e.EM_Call(a); break; //num ���� ���� �޼��尡 �ٸ� ���ڸ� �޾Ƽ� ����
		case 3: e.EM_Call(p); break;
		case 4: e.EM_record(); break; //num�� 4�� ��� e�� ����Ű�� ��ü�� ���ؼ� EM_record() �޼��� ����
		case 5: break; //5�� ��� �׳� switch�� ��������, �ᱹ while�� ������ false�̱� ������ while���� ���������� ��
		default: System.out.println("Wrong Input"); //num�� ���� ���ǰ� �� ���� �ʴ� ���� �� ���
		}
		}
		System.out.println("Finished");
		kbd.close();

	}

}
