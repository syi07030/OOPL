import java.util.Scanner; //Scanner class �������

class SharedArea{ //SimulThread�� PrintThread���� ������������ ����ϱ� ���� Ŭ����(�ؿ��� public class �̹� ���������Ƿ� ���⼭�� default)
	public double ratio; //�ո� ������ ������ ����
	public boolean isReady; //PrintThread�� ������ ����ص� ���������� ���� ���θ� �˷��ִ� ����	
}

class SimulThread extends Thread{ //Thread�� ��ӹ޴� Ŭ����(�ؿ��� public class �̹� ���������Ƿ� ���⼭�� default)
	SharedArea sh;//���������� �����͸� �����ϱ� ���� ��ü ����
	public int re; //������ Ƚ���� �����ϱ� ���� ����
	public SimulThread() {} //default ������
	public SimulThread(int n) { //main���� ������ Ƚ���� ���ڷ� �޾Ƽ� re�� �����ϴ� ������
		re=n;
	}
	public void run() {
		double front=0; //�ո��� ������ Ƚ���� �����ϴ� ����
		for(int i=0;i<re;i++) { //������ Ƚ����ŭ �ݺ�
			int cCase=(int)Math.round(Math.random()); //0 �Ǵ� 1�� ���� �������� ���ؼ� ����
			if(cCase==1) front++; //���� cCase�� ���� 1�̸� �ո��� ������ Ƚ�� 1�� ����
		}

		sh.ratio=front/re*100; //�ո��� ������ ���� ����ؼ� �������� ������ ����
		sh.isReady=true; //���� ����ؼ� ���������Ƿ� PrintThread���� ���������� �����ص� �ȴٴ� ���θ� true�� �ٲ�
		synchronized(sh) { //����ȭ�����ν�
			sh.notify(); //sh���� ��ٸ��� �ִ� �ٸ� thread���� ��ȣ�� ��
		}
	}
}

class PrintThread extends Thread{//Thread�� ��ӹ޴� Ŭ����(�ؿ��� public class �̹� ���������Ƿ� ���⼭�� default)
	SharedArea sh;//���������� ������ ���� ����ϱ� ���� ��ü ����
	public void run() {
		if(sh.isReady!=true) {//���������� sh�� false���
			try {
				synchronized(sh) {//����ȭ
					sh.wait();//��ȣ�� �� ������ ��ٸ�
				}
			}catch(InterruptedException e) {//wait()�� �����Ƿ� ����ó��
				System.out.println("���� �߻�");
			}
		}
		System.out.println("Front Ratio: "+sh.ratio+"%");//��ȣ�� �� ��� �ո� ���� �� ���
	}
	
}

public class Week13_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//Scanner ��ü ����
		System.out.println("Input the number of coin toss:");
		int N=kbd.nextInt(); //���� Ƚ�� �Է� ����
		SimulThread thread1 = new SimulThread(N);//���� Ƚ���� ���ڷ� �ϴ� �����ڷ� SimulThread Ŭ����Ÿ���� ������ ����
		PrintThread thread2 = new PrintThread();//PrintThreadŸ���� ������ ����
		SharedArea sharea = new SharedArea();//�����͸� ���� ������ ���������� SharedArea ��ü ����
		
		thread1.sh=sharea;//thread1�� sh�� sharea�� ����ų �� �ֵ���(�ּҰ��� ���������ν� ���� ��ü�� ����Ų��)
		thread2.sh=sharea;//thread2�� sh�� sharea�� ����ų �� �ֵ���(�ּҰ��� ���������ν� ���� ��ü�� ����Ų��)
		
		thread1.start();//thread1 ���۽�Ű��
		thread2.start(); //thread2 ���۽�Ű��

	}

}
