
public class Song {
	//System.out.println("===============");
	//System.out.println("����: ���̹�����");
	//System.out.println("�й�: 1971090");
	//System.out.println("����: �ѱٿ�");
	//System.out.println("===============");

	public String title; //public String���� �ν��Ͻ� ���� title, singer �׸��� int�� �ν��Ͻ� ���� price
	public String singer;
	public int price;
	
	public void play() { //public method�� play()�� ������ ���� title�� singer�� ���
		System.out.println("�뷡 ����: "+'"'+title+'"'+" by "+singer);
	}
	public void price() { //public method�� price()�� ������ ���� price�� ���
		System.out.println(price+"���Դϴ�.");
	}
}
