import java.util.Scanner; //Scanner Ŭ���� �������
public class HW1_4_�ѱٿ� {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //�������� kbd -> Scanner Ŭ������ ���� ��ü ����
		System.out.println("How many students are there?");
		int num=kbd.nextInt(); //�л��� �� �� �ִ����� �Է¹޾Ƽ� �����ϴ� ����
		kbd.nextLine(); //���ۿ� �����ִ� ���Ͱ� ����
		StudentScore[] s = new StudentScore[num]; //StudentScore Ŭ���� Ÿ���� �������� �迭 ����, ũ��� num�� ����ŭ
		System.out.println("Input the information.");
		//�ݺ������� �л������� ������ �Է¹޾� �迭�� �ν��Ͻ� ����
		for(int i=0;i<num;i++) { //�迭�� �ε��� ���� ������Ű�鼭
			System.out.print("\nID:");
			String id=kbd.nextLine(); //id �Է¹ޱ�
			System.out.print("Name:");
			String name=kbd.nextLine(); //�̸� �Է¹ޱ�
			System.out.print("Korean:");
			int korean=kbd.nextInt(); //���� ���� �Է¹ޱ�
			System.out.print("Math:");
			int math=kbd.nextInt(); //���� ���� �Է¹ޱ�
			System.out.print("English:");
			int english=kbd.nextInt(); //���� ���� �Է¹ޱ�
			kbd.nextLine(); //���ۿ� �����ִ� ���Ͱ� ����
			
			s[i]=new StudentScore(name,id,korean,math,english); //�Է¹��� id,�̸�,����,����,���� ������ ���ڷ� �޴� ������ �̿��ؼ� StudenScore Ÿ���� ��ü ����
		}
		System.out.println("\nNAME\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG");
		//�̸�,id,����,����,���� ����,����,��� �ݺ������� ���
		for(int i=0;i<num;i++) {
			s[i].display(); //s[i]�� ����Ű�� ��ü�� ���� display()�޼��� ����, �̸�,id,����,����,���� ���� ���
			int sum=s[i].getKorean()+s[i].getMath()+s[i].getEnglish(); //�� �л��� getter �޼��� �̿��ؼ� ���� ����� �� sum�� ����
			System.out.print(sum+"\t"); //�� �л��� ����,����,���� ������ ���� ���
			double avg= (double)(sum)/3; //��� ����ؼ� avg�� ����(double�� ����ȯ)
			System.out.printf("%.2f\n",avg); //�л� �� ���� ����,����,���� ������ ��� �Ҽ��� ��°�ڸ����� ���
		}
		
		double sumK=0,sumM=0,sumE=0; //����,����,���� �� ������ ������ ������ ����
		System.out.print("Subject Avg\t\t");
		for(int i=0;i<num;i++) { //�迭�� �ε��� ���� 0���� num�̸����� ������Ű�鼭 �� �л����� ���� ������ �ݺ������� ����
			sumK+=s[i].getKorean(); //���� ������ �� ����
			sumM+=s[i].getMath(); //���� ������ �� ����
			sumE+=s[i].getEnglish(); //���� ������ �� ����
		}
		//����,����,���� ������ ����� �Ҽ��� ��°�ڸ����� ���
		System.out.printf("%.2f\t",(sumK/num));
		System.out.printf("%.2f\t",(sumM/num));
		System.out.printf("%.2f\n",(sumE/num));
		
		//����,����,���� �� ���� ��պ��� ���� ������ ���� �л��� �̸� ���
		System.out.println("\n<Students over the average>");
		System.out.println("Korean:"); //���� ���񿡼�
		for(int i=0;i<num;i++) { //�ε����� ������Ű�鼭 �ݺ������� ã��
			if(s[i].getKorean()>(sumK/num)) { //���� ���� ��պ��� ���� ���� ������ ���� �л��� ������
				System.out.print(s[i].getName()+"\t"); //getter�޼��� �̿��ؼ� �̸� ���
			}
		}
		//���а��񿡼��� �ݺ�
		System.out.println("\nMath:");
		for(int i=0;i<num;i++) {
			if(s[i].getMath()>(sumM/num)) {
				System.out.print(s[i].getName()+"\t");
			}
		}
		//������񿡼��� �ݺ�
		System.out.println("\nEnglish:");
		for(int i=0;i<num;i++) {
			if(s[i].getEnglish()>(sumE/num)) {
				System.out.print(s[i].getName()+"\t");
			}
		}

	}

}
