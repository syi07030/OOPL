public class Play extends Production { // Production Ŭ������ �θ�� ������ �ڼ� class Play
//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

	private int performanceCost;

	public void setPerformanceCost(int cost) { // private ���� performanceCost�� ���� setter �޼���
		performanceCost = cost;
	}

	public int getPerformanceCost() { // private ���� performanceCost�� ���� getter �޼���
		return performanceCost;
	}

	public void display() { // Override
		super.display(); // �θ��� display()�޼��忡�ٰ� perfomanceCost ����ϴ� �� ÷��
		System.out.println("performance cost:" + performanceCost);
	}

	public Play() {
	} // Ȥ�� ���� default ������ ����

	public Play(String title, String director, String writer) { // 3���� String ���ڸ� ���� �޼��忡�� �޾Ƽ� �ʱ�ȭ�����ִ� ������
		super(title, director, writer); // super�� �θ� class�� ������ ȣ��
	}
}