import java.util.Scanner; //Scanner class �������

public class Week3_3_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in);//������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		String title;
		int page;
		MyFile fOld=new MyFile();//������ ���� fOld -> MyFile Ŭ������ ���� ��ü ����
		MyFile fNew=new MyFile();//������ ���� fNew -> MyFile Ŭ������ ���� �� �ٸ� ��ü ����
		System.out.println("--File�����Է�(����,��������)--");
		fOld.setTitle(kbd.nextLine()); //title�� private �ν��Ͻ� �����̱� ������ setTitle() method�� �̿��� �Է¹��� ���ڿ��� fOld�� ����Ű�� ��ü�� title�� ����
		fOld.setPage(kbd.nextInt());//pag�� private �ν��Ͻ� �����̱� ������ setPage() method�� �̿��� �Է¹��� �������� fOld�� ����Ű�� ��ü�� page�� ����
		fOld.fileCopy(fNew); //fOld�� ����Ű�� ��ü�� ���ؼ� fileCopy()�޼��� ����, fNew��� MyFile�̶�� Ŭ������ ���� �� �ٸ� ��ü�� ����Ű�� �ּҸ� ���ڷ� ����
		System.out.println("<���� File>");
		fOld.fileInfo(); //fOld�� ����Ű�� ��ü�� ���ؼ� fileInfo()�޼��� ����
		System.out.println("<����� File>");
		fNew.fileInfo();//fNew�� ����Ű�� ��ü�� ���ؼ� fileInfor()�޼��� ����

	}

}
