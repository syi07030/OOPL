public class Production { //�θ� class(Play, Film�� �ڼ����� ����)
//	System.out.println("===============");
//	System.out.println("����: ���̹�����");
//	System.out.println("�й�: 1971090");
//	System.out.println("����: �ѱٿ�");
//	System.out.println("===============");

	private String title;
	private String director;
	private String writer;

	public String getTitle() { // private ���� title�� ���� getter �޼���
		return title;
	}

	public void setTitle(String newTitle) { // private ���� title�� ���� setter �޼���
		title = newTitle;
	}

	public String getDirector() { // private ���� director�� ���� getter �޼���
		return director;
	}

	public void setDirector(String newDirector) { // private ���� director�� ���� setter �޼���
		director = newDirector;
	}

	public String getWriter() { // private ���� writer�� ���� getter �޼���
		return writer;
	}

	public void setWriter(String newWriter) { // private ���� writer�� ���� setter �޼���
		title = newWriter;
	}

	public void display() { // title, director, writer ����ϴ� �޼���
		System.out.println("Title:" + title);
		System.out.println("Director:" + director);
		System.out.println("Writer:" + writer);
	}

	public Production() {
	} // default ������(�� �� �� ������ Ȥ�� ���� ����)

	public Production(String title, String director, String writer) { // 3���� String ���ڸ� ���� �޼��忡�� �޾Ƽ� �ʱ�ȭ�����ִ� ������
		this.title=title;
		this.director=director;
		this.writer=writer;
	}

}
