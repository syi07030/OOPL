//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//Week9_1_�ѱٿ�

import java.io.*; //java.io�� �ִ� ��� Ŭ���� import�ϱ�
import java.util.Scanner; //Scanner Ŭ���� import�ϱ�
public class MakeBinaryFile { //���� 4�� �ڵ� ���� ����
	public static void main(String[] args) {
		String fileName="numbers.dat"; //filename�� numbers.dat���� ����
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName)); //numbers.dat�̶�� binary file �����ϰ� �̿� ���� ��� ��Ʈ�� ����
			Scanner kbd=new Scanner(System.in); //�������� kbd -> Scanner Ŭ������ ���� ��ü ����
			System.out.println("Enter nonnegative integers.");
			System.out.println("Place a negative number at the end.");
			
			int i; //�Է¹޴� ���� �� ������ ����
			do {
				i=kbd.nextInt(); //���� ����ڷκ��� �Է¹���
				outputStream.writeInt(i); //�Է¹��� ���� ���� ��� ��Ʈ���� ���� ������Ͽ� ����(��Ȯ�� �����ڸ� ���ۿ�)
			}while(i>=0); //�Է¹޴� ���� ���� ������ �ƴ� ������ �ݺ�
			System.out.println("Numbers are sentinel value");
			System.out.println("writtem to the file "+fileName);
			outputStream.close(); //��� ��Ʈ�� ����
			kbd.close(); //kbd ��Ʈ�� ����
		}catch(IOException e) { //try���� IOException �߻����� �� ó��
			System.out.println("Problems with output to file "+fileName);
		}
	}
}
