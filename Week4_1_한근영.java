import java.util.Scanner; //Scanner Ŭ���� �������

class Song{ //�ؿ� public class�� �̹� �����Ƿ� default Ÿ������ Song Ŭ���� ����
	public String title;
	public String singer;
	public int price;
	public void play() { //���� �� ������ ����ϴ� public �޼���
		System.out.println(title+" by "+singer);
	}
	
	public Song(){} //default ������
	public Song(String title, int price){ //title�� price�� �ִ� ������
		this(title,"��",price); //singer�κ��� "��"�̶�� ���ڷ� �޾Ƽ� this()�� �Ʒ��� ������ ȣ��
	}
	public Song(String newTitle, String newSinger, int newPrice){ //title, singer, price ��� �ִ� ������(���⼭�� �Ű����� �̸��� newTitle,newSinger, newPrice)
		title=newTitle; //�ν��Ͻ� ���� title, singer, price ������ ���ڷ� ���� ������ ����
		singer=newSinger;
		price=newPrice;
	}
}

public class Week4_1_�ѱٿ� {

	public static void main(String[] args) { //���� �޼���
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		Song s;//������ ���� s ����
		System.out.printf("���:");
		String title = kbd.nextLine(); //String�� title ������ �Է¹��� ���ڿ� ����
		while(title.equals("")) { //���� ����� �Էµ��� ������� while�� �ݺ�
			System.out.println("����� �ݵ�� �ʿ��մϴ�.");
			System.out.printf("���:"); 
			title = kbd.nextLine(); //�ٽ� �Է¹���
		}
		System.out.printf("������:");
		String singer=kbd.nextLine();//String�� singer������ �Է¹��� ���ڿ� ����
		System.out.printf("����:");
		int price = kbd.nextInt();//int�� price������ �Է¹��� ���� ����
		
		if(singer.equals("")) { //���� �������� ������� title�� price���� ���ڷ� �޴� ������ ȣ��
			s=new Song(title,price);
		}
		else { //�������� ������ title, singer, price ��� ���ڷ� �޴� ������ ȣ��
			s=new Song(title,singer,price);
		}
		
		System.out.println("��� �����ðڽ��ϱ�?");
		int num = kbd.nextInt(); //������ num�� �Է¹��� ��
		for(int i=0;i<num;i++) {//s�� ���ؼ� �޼����� play()�� num�� �Է¹��� ����ŭ �ݺ�
			s.play();
		}
		
		System.out.println("�� "+num*s.price+"���Դϴ�."); //s.price�� num�� ���� ���� �� ������ ��Ÿ��(�ν��Ͻ� ���� price�� public�̴ϱ� �ٷ� ���� ����)
		kbd.close();
	}

}
