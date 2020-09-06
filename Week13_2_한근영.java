import javax.swing.JOptionPane;//������ popup dialog window�� ����ϱ� ���� JOptionPane class �������

class SA{//thread���� ������������ ����ϱ� ���� Ŭ����(�Ʒ����� public class�� �̹� ���������Ƿ� ���⼭�� default)
	public String[] words = new String[] {"spring","summer","fall","winter","happy","love","dog","cat",
			"bird","hot","cold","apple","cake","tea","java"};//���ڿ� 15���� ������ ���� ���ڿ� �迭
	String testWord=null;//�ܼ� â�� ���Ƿ� �ߴ� ���ڿ��� �����ϱ� ���� ���ڿ� ����
	public int check=0;//thread�� ����Ǿ����� �˷��ֱ� ���� ����
}

class MyThread extends Thread{//Thread Ŭ������ ��ӹ��� Ŭ����(�Ʒ����� public class �̹� ���������Ƿ� ���⼭�� �׳� default��)
	SA sh;//���������� �����͸� �����ϰ� ����ϱ� ���� ��ü ����
	public boolean stop;//���α׷��� ���������� �����Ű�� ���� �ʿ��� ����
	public int i=0;//���ڿ� �迭�� �ε����� ���Ǵ� ����
	
	public void setStop(boolean stop) {//���α׷��� ���������� ����ñ�� ���� �ʿ��� �޼���
		this.stop=stop;
	}
	public void run() {
		for(int j=0;j<20;j++) {//20�� �ݺ�
			if(stop==true) break;//���� stop�� true�̸� �ݺ����� ����, �� thread ����
			i=(int)(Math.random()*15); //0~14������ ���� �� �������� ���ؼ� ����
			System.out.printf("%s\n",sh.words[i]);//�ܼ� â�� sh�� �ִ� ���ڿ� �迭���� ������ ���ڿ��� ���
			sh.testWord=sh.words[i];//���Ƿ� ��µ� ���ڿ��� �������� sh�� �ִ� testWord�� ����
		try {
			sleep(1000);//1�� ���� thread�� ������ ����

		}catch(InterruptedException e) {//sleep()�� �����Ƿ� ����ó��
			System.out.println("InterruptedException");
		}
	}
		if(stop==false) {//20�� �ݺ��ߴµ��� stop�� ������ false���
			sh.check=1;//���������� sh�� �ִ� ���� check�� ���� 1�� �ٲٰ�
			System.out.println("����!");//���� ���
		}
	}
	
}

public class Week13_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		MyThread th = new MyThread(); //thread ����
		SA sa = new SA(); //������������ ����� ��ü sa ����
		th.sh=sa;//th�� sh�� sharea�� ����ų �� �ֵ���(�ּҰ��� ���������ν� ���� ��ü�� ����Ų��)
		th.start(); //th thread ����
		
		while(true) {//��� �ݺ�
			String st = JOptionPane.showInputDialog("���ڿ� �Է�");//windowâ���� ����ڰ� �Է��ϴ� ���ڿ� ����
			if(sa.check==1) break;//�������� ����ϴ� ��ü�� check���� 1�̸� �ݺ��� ��������, �� ����
			System.out.println("<"+st+">�� �Է��ϼ̽��ϴ�.");//�ܼ�â���� ����ڰ� �Է��� ���ڿ� ���
			if(st.equals(sa.testWord)) {//���� ����ڰ� �Է��� ���ڿ��� sa�� ����Ǿ� �ִ� testWord�� ������ �Ȱ��ٸ�
				System.out.println("����!\nTimer is stopped.");
				th.setStop(true);//stop�� ���� true�� �ٲ��ְ�
				break;//�ݺ��� ��������,����
			}
			
		}
	}
}