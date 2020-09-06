import java.io.*; //java.io�� ��� Ŭ���� �������
import java.util.Scanner; //java.util.Scanner Ŭ���� �������
import java.util.*; //java.utill�� ��� Ŭ���� �������

public class HW2_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); //Scanner Ŭ������ ��ü ����->�������� kbd
		System.out.println("Input the filename to read.");
		String readFile = kbd.next(); //�о�� ���� �̸�(�Է� ����) ����
		System.out.println("Input the filename to write.");
		String writeFile = kbd.next(); //��� ���� �̸� ����

		Scanner inputStream=null;//�ؽ�Ʈ ���Ϸκ��� �о�� �Է� ��Ʈ�� ����
		PrintWriter outputStream=null; //�ؽ�Ʈ ���Ϸ� ������ ��� ��Ʈ�� ����

		try {//����ó�� ���� try-catch�� ���
			inputStream = new Scanner(new File(readFile)); //readFile�� ������ ���Ͽ� ���� �Է� ��Ʈ��
			outputStream = new PrintWriter(new File(writeFile)); //writeFile�� ������ ���Ͽ� ���� ��� ��Ʈ��
		
				while (inputStream.hasNextLine()) {//�о�� �����Ͱ� ���� �����Ѵٸ�
					String line = inputStream.nextLine(); //�Է����Ϸκ��� �ٺ��� �о�ͼ� line�� ����
					StringTokenizer tk = new StringTokenizer(line, ", \n"); //, \n�� �и��ڷ� �Ͽ� token�� �и��ؼ� ����
					while (tk.hasMoreTokens()) { //token�� �� �ִٸ�
						String word = tk.nextToken(); //word�� ���� token�� ��ȯ
						if (word.length()>4) //���� word�� ���̰� 4���� ũ�ٸ�
							outputStream.println(word); //��� ��Ʈ���� �̿��ؼ� word�� ��� ���Ͽ� ����(��Ȯ�� ���ϸ� ���ۿ�)
					}
				}			
		} catch (FileNotFoundException e) { //������ ã�� ���Կ� ���� exception handling
			System.exit(1);
		} catch (IOException e) { //input,output�� ���� exception handling
			System.exit(1);
		} catch (Exception e) { //�� ���� exception handling
			System.exit(1);
		}
		outputStream.close(); //��� ��Ʈ�� �ݱ�
		System.out.println(writeFile + " is generated.");
		inputStream.close(); //�Է� ��Ʈ�� �ݱ�
		kbd.close(); //kbd ��Ʈ�� �ݱ�
		System.exit(0); //����
	}
}
