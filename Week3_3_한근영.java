import java.util.Scanner; //Scanner class 끌어오기

public class Week3_3_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in);//참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		String title;
		int page;
		MyFile fOld=new MyFile();//참조형 변수 fOld -> MyFile 클래스에 대한 객체 생성
		MyFile fNew=new MyFile();//참조형 변수 fNew -> MyFile 클래스에 대한 또 다른 객체 생성
		System.out.println("--File정보입력(제목,페이지수)--");
		fOld.setTitle(kbd.nextLine()); //title은 private 인스턴스 변수이기 때문에 setTitle() method를 이용해 입력받은 문자열을 fOld가 가리키는 객체의 title에 저장
		fOld.setPage(kbd.nextInt());//pag는 private 인스턴스 변수이기 때문에 setPage() method를 이용해 입력받은 정수값을 fOld가 가리키는 객체의 page에 저장
		fOld.fileCopy(fNew); //fOld가 가리키는 객체에 대해서 fileCopy()메서드 실행, fNew라는 MyFile이라는 클래스에 대한 또 다른 객체를 가리키는 주소를 인자로 받음
		System.out.println("<원래 File>");
		fOld.fileInfo(); //fOld가 가리키는 객체에 대해서 fileInfo()메서드 실행
		System.out.println("<복사된 File>");
		fNew.fileInfo();//fNew가 가리키는 객체에 대해서 fileInfor()메서드 실행

	}

}
