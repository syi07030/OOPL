import java.io.*;//java.io�� �ִ� ��� Ŭ���� �������
import java.net.*;//java.net�� �ִ� ��� Ŭ���� �������
import java.util.*;//java.util�� �ִ� ��� Ŭ���� �������

public class Week14_client_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Socket socket=null;
		
		try {
			socket = new Socket("192.168.0.8",9000); //server�� ip�� port�� ����Ͽ� socket�� �����ϰ� connection�� request
			Scanner in=new Scanner(socket.getInputStream()); //�����͸� �ޱ� ���� inputstream ����
			PrintWriter out = new PrintWriter(socket.getOutputStream()); //�����͸� ������ ���� outputstream ����
			Scanner kbd = new Scanner(System.in); //����ڰ� �Է��ϴ� ������ �ޱ� ���� �Է� ��Ʈ�� ����
			
			out.println("Hello?"); //���ڿ� ���ۿ� ������
			out.flush(); //���ۿ� �ִ� ������ server���� ������
			
			String que=in.nextLine(); //server�κ��� ���� ���ڿ� ����
			System.out.println(que);//���� ���ڿ� ���
			int numR=kbd.nextInt();//���� ����ڷκ��� �Է¹ޱ�
			
			out.println(Integer.toString(numR)); //����ڷκ��� ���� ���� ���ڿ��� ��ȯ �� outputstream�� ���ۿ� ������
			out.flush();// ���ۿ� �ִ� ������ server���� ������
			
			que=in.nextLine(); //server�κ��� ���� ���ڿ� ����
			System.out.println(que);//���� ���ڿ� ���
			for(int i=0;i<numR;i++) { //numR��ŭ �ݺ�
				int num=kbd.nextInt(); //����ڷκ��� ���� �Է¹ޱ�
				out.println(Integer.toString(num)); //����ڷκ��� �Է¹��� ���� ���ڿ��� ��ȯ �� ���ۿ� ������
				out.flush(); //���ۿ� �ִ� ������ server���� ������
			}
			
			String anw = in.nextLine(); //server�κ��� ���ڿ� �ޱ�
			System.out.println(anw); //���
			anw=in.nextLine(); //server�κ��� ���ڿ� �ޱ�
			System.out.println(anw); //���
			in.close(); //in ��Ʈ�� �ݱ�
			out.close(); //out ��Ʈ�� �ݱ�
			kbd.close(); //kbd ��Ʈ�� �ݱ�
			
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}

		try {
			socket.close(); //socket �ݱ�
			
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}
	}

}
