import java.io.*; //java.io�� �ִ� ��� Ŭ���� import�ϱ�
import java.util.Scanner; //Scanner Ŭ���� import�ϱ�

public class Week9_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//�������� kbd -> Scanner Ŭ������ ���� ��ü ����
		System.out.println("File name for input:");
		String oldFile=kbd.next(); //�����͸� �о� �� ���� �̸� ����ڷκ��� �Է¹ޱ�(���� �̸��� space ���� ������ next()�� ����)
		System.out.println("File name for output:");
		String newFile=kbd.next(); //�����͸� binary ���·� ������ ���� �̸� ����ڷκ��� �Է¹ޱ�
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(oldFile)); //oldFile�� ���� �Է� ��Ʈ�� ����(������ �о���� ����)
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(newFile)); //newFile�� ����� �̸��� binary file�� �̿� ���� ��� ��Ʈ�� ����
			System.out.println("The numbers in File, "+oldFile);
			try {
				while(true) { //�Է� ���Ͽ� ����Ǿ� �ִ� ���ڸ� �� �о�� ������ �ݺ�, ������ �� �о���� EOFException �߻�
					int oldInteger=inputStream.readInt(); //�Է� ��Ʈ���� ���� oldFile�� ����Ǿ� �ִ� ���� �о����
					outputStream.writeInt(2*oldInteger); //�о�� ���ڿ� 2�� ���� ���� �ٽ� ��� ��Ʈ���� ���� ������Ͽ� ����(��Ȯ�� �����ڸ� ���ۿ�)
					System.out.println(oldInteger); //�о�� ���� ���
				}
			}catch(EOFException e) { //EOFException ó��
				System.out.println("End of reading from File, "+oldFile);
				System.out.println(newFile+" is generated.");
			}
			inputStream.close(); //�Է� ��Ʈ�� ����
			outputStream.close(); //��� ��Ʈ�� ����(���ۿ� �ִ� �����͸� ��� ���Ϸ� ������)
			
			ObjectInputStream newInputStream = new ObjectInputStream(new FileInputStream(newFile)); //���� ������ ���Ͽ� ���� �Է� ��Ʈ�� ����
			try {
				System.out.println("\nThe numbers in new File, "+newFile);
				while(true) { //�Է� ���Ͽ� ����Ǿ� �ִ� ���ڸ� �� �о�� ������ �ݺ�, ������ �� �о���� EOFException �߻�
					int doubleInteger=newInputStream.readInt(); //�Է� ��Ʈ���� ���� newFile�� ����Ǿ� �ִ� ���� �о����
					System.out.println(doubleInteger); //�о�� ���� ���
				}
			}catch(EOFException e) { //EOFException ó��
				System.out.println("End of reading from 2nd File, "+newFile);
			}
			newInputStream.close(); //newFile�� ���� �Է� ��Ʈ�� ����
			kbd.close(); //kbd ��Ʈ�� ����
			
		}catch(FileNotFoundException e) { //������ ã�� �� ���� �� �߻��ϴ� ���ܿ� ���� ó��
			System.out.println("Cannot find file "+oldFile);
			System.exit(1); //����
		}catch(IOException e) { //Input,Output�� ������ ���ܿ� ���� ó��
			System.out.println("IO Exception");
			System.exit(1); //����
		}catch(Exception e) { //�� ���� ���ܿ� ���� ó��
			System.out.println("Exception");
			System.exit(1); //����
		}
	}

}
