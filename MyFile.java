
public class MyFile {
	//System.out.println("===============");
	//System.out.println("����: ���̹�����");
	//System.out.println("�й�: 1971090");
	//System.out.println("����: �ѱٿ�");
	//System.out.println("===============");

	private String title; //private�� ��� ���� title�̱� ������ getter, setter �޼��� �ʿ�
	private int page; //page�� ���������� private�̾ getter, setter �޼��� �ʿ�
	public void setTitle(String t) { //title�� ���ڿ��� �����ϱ� ���� setter �޼���
		title= t;
	}
	public String getTitle() { //title�� ����� ���ڿ��� ��ȯ�ϱ� ���� getter �޼���
		return title;
	}
	public void setPage(int p) { //page�� ���� setter �޼���
		page=p;
	}
	public int getPage() { //page�� ���� getter �޼���
		return page;
	}
	public void fileCopy(MyFile newFile) { //MyFileŸ���� �������� newFile -> main Ŭ�������� ���⿡�� fNew�� ����Ű�� ��ü�� �ּҰ��� ����
		newFile.title=this.title; //newFile�� ����Ű�� ��ü�� �ν��Ͻ� ������ title�� this(���� ����ǰ� �ִ�, main class������ fOld)�� ����Ű�� �ִ� ��ü�� title�� ����Ǿ� �ִ� ���ڿ��� �����ϰ� ����
		newFile.page=this.page; //page�� ��������
	}
	public void fileInfo() { //title�� page ����ϴ� �޼���
		System.out.println("��������:"+title);
		System.out.println("������:"+page);
	}

}
