import java.util.Scanner;//Scanner class �������
public class Week5_1_�ѱٿ� {
	public static void main(String[] args) { //���� �޼���
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		System.out.println("Input Title for Play");
		String p_title = kbd.nextLine(); //title �Է¹޾Ƽ� ���ڿ� p_title�� ����
		System.out.println("Input Director for Play");
		String p_director = kbd.nextLine(); //director �Է¹޾Ƽ� ���ڿ� p_director�� ����
		System.out.println("Input Writer for Play");
		String p_writer = kbd.nextLine(); //writer �Է¹޾Ƽ� ���ڿ� p_writer�� ����
		
		Play p = new Play(p_title, p_director,p_writer); //������ ���� p -> Play Ŭ������ ���� ��ü ����, 3���� stringŸ���� ���ڷ� �޴� ������
		
		System.out.println("Input Title for Film");
		String f_title = kbd.nextLine(); //title �Է¹޾Ƽ� ���ڿ� f_title�� ����
		System.out.println("Input Director for Film");
		String f_director = kbd.nextLine(); //director �Է¹޾Ƽ� ���ڿ� f_director�� ����
		System.out.println("Input Writer for Film");
		String f_writer = kbd.nextLine(); //writer �Է¹޾Ƽ� ���ڿ� f_writer�� ����
		
		Film f = new Film(f_title, f_director, f_writer); //������ ���� f -> Film Ŭ������ ���� ��ü ����, 3���� string Ÿ���� ���ڷ� �޴� ������
		
		System.out.println("Input Performance Cost for Play");
		p.setPerformanceCost(kbd.nextInt()); //������ �Է¹޾Ƽ� ��ü p�� ���� performanceCost�� setter �޼��� ����� ����
		System.out.println("Input boxOfficeGross for Film");
		f.setBoxOfficeGross(kbd.nextInt()); //������ �Է¹޾Ƽ� ��ü f�� ���� setBoxOfficeGross�� setter �޼��� ����� ����
		
		System.out.print("\n");
		p.display(); //title, director, writer, performanceCost ���
		System.out.print("\n");
		f.display(); //title, director, writer, boxOfficeGross ���
		kbd.close();

	}

}
