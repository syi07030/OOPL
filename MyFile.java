
public class MyFile {
	//System.out.println("===============");
	//System.out.println("전공: 사이버보안");
	//System.out.println("학번: 1971090");
	//System.out.println("성명: 한근영");
	//System.out.println("===============");

	private String title; //private한 멤버 변수 title이기 때문에 getter, setter 메서드 필요
	private int page; //page도 마찬가지로 private이어서 getter, setter 메서드 필요
	public void setTitle(String t) { //title에 문자열을 저장하기 위한 setter 메서드
		title= t;
	}
	public String getTitle() { //title에 저장된 문자열을 반환하기 위한 getter 메서드
		return title;
	}
	public void setPage(int p) { //page에 대한 setter 메서드
		page=p;
	}
	public int getPage() { //page에 대한 getter 메서드
		return page;
	}
	public void fileCopy(MyFile newFile) { //MyFile타입의 지역변수 newFile -> main 클래스에서 여기에는 fNew가 가리키는 객체의 주소값이 들어간다
		newFile.title=this.title; //newFile이 가리키는 객체의 인스턴스 변수인 title에 this(현재 실행되고 있는, main class에서는 fOld)가 가리키고 있는 객체의 title에 저장되어 있는 문자열과 동일하게 저장
		newFile.page=this.page; //page도 마찬가지
	}
	public void fileInfo() { //title과 page 출력하는 메서드
		System.out.println("파일제목:"+title);
		System.out.println("페이지:"+page);
	}

}
