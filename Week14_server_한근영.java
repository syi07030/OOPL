import java.io.*; //java.io�� �ִ� ��� Ŭ���� �������
import java.net.*; //java.net�� �ִ� ��� Ŭ���� �������
import java.util.*; //java.util�� �ִ� ��� Ŭ���� �������

public class Week14_server_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		ServerSocket serverSocket = null; 
		Socket socket = null; 
		
		try { //����ó�� ���� try-catch��
			serverSocket = new ServerSocket(9000); //ServerSocket �����(9000��Ʈ open)
			socket=serverSocket.accept(); //Server�� request�� �޾Ƶ鿩 socket�� �����ϰ� client�� ����
			
			Scanner in = new Scanner(socket.getInputStream()); //�����͸� �ޱ� ���� inputstream ����
			PrintWriter out = new PrintWriter(socket.getOutputStream());  //�����͸� ������ ���� outputstream ����
			
			String greet = in.nextLine(); //client�κ��� "Hello?" �ޱ�
			System.out.println(greet); //���� ���ڿ� ���
			
			out.println("How many numbers?"); //���ڿ� ���ۿ� ������
			out.flush();//���ۿ� �ִ� ������ client���� ��������
			
			String num_s = in.nextLine(); //client�κ��� ���� ���ڿ� ����
			int numR=Integer.parseInt(num_s);//���� ���ڿ� ���������� ��ȯ
			System.out.println(num_s);
			out.println("Input "+numR+" numbers"); //���ڿ� ���ۿ� ������
			out.flush();//���ۿ� �ִ� ������ client���� ��������
			
			int num=0; //client�κ��� ���� ���� ����
			int sum=0; //client�κ��� ���� ���ڵ��� ���� ����
			double avr=0; //client�κ��� ���� ���ڵ��� ��� ����
			for(int i=0;i<numR;i++) { //numR��ŭ �ݺ�
				num=Integer.parseInt(in.nextLine()); //client�κ��� ���� ���ڿ��� ���������� ��ȯ�Ͽ� num�� ����
				sum+=num; //sum ���
			}
			avr=(double)sum/numR; //��� ���
			
			out.println("Sum: "+sum); //���ڿ� outputstream�� ���ۿ� ������
			out.flush(); //���ۿ� �ִ� ������ client���� ������
			out.println("Avg: "+avr); //���ڿ� outputstream�� ���ۿ� ������
			out.flush(); //���ۿ� �ִ� ������ client���� ������
			
			System.out.println("Service finished.");
			in.close(); //inputStream �ݱ�
			out.close(); //outputStream �ݱ�
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}
		
		try {
			socket.close(); //socket �ݱ�
			serverSocket.close(); //serverSocket �ݱ�
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}

	}

}
