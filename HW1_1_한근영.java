import java.util.Scanner; //Scanner class �������
public class HW1_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //�������� kbd -> Scanner Ŭ������ ���� ��ü ����
		Time t = new Time(); //�������� t ->Time Ŭ���� Ÿ���� ��ü ����
		System.out.println("Hour:");
		int hour=kbd.nextInt(); //�� ������ �Է¹޾� �� ���� �����ϴ� int�� ���� hour
		System.out.println("Minute:");
		int minute=kbd.nextInt(); //�� ������ �Է¹޾� �� ���� �����ϴ� int�� ���� minute
		
		t.setTime(hour,minute); //t�� ����Ű�� ��ü�� ���� setTime()�޼���, int�� hour,minute�� ���ڷ�
		System.out.println(t.getTime('h')+":"+t.getTime('m')); //t�� ����Ű�� ��ü�� ���� getTime()�޼��� �̿��ؼ� �� �� �� ������ ���

	}

}
