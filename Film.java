public class Film extends Production { // Production Ŭ������ �θ�� ������ �ڼ� class Film
//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

	private int boxOfficeGross;

	public void setBoxOfficeGross(int gross) { // private ���� boxOfficeGross�� ���� setter �޼���
		boxOfficeGross = gross;
	}

	public int getBoxOfficGross() { // private ���� boxOfficeGross�� ���� getter �޼���
		return boxOfficeGross;
	}

	public void display() { // Override
		super.display(); // �θ��� display()�޼��忡�ٰ� boxOfficGross ����ϴ� �� ÷��
		System.out.println("boxOfficeGross:" + boxOfficeGross);
	}

	public Film() {
	} // Ȥ�� ���� default ������ ����

	public Film(String title, String director, String writer) { // 3���� String ���ڸ� ���� �޼��忡�� �޾Ƽ� �ʱ�ȭ�����ִ� ������
		super(title, director, writer); // super�� �θ� class�� ������ ȣ��
	}
}
