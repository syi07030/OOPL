public class Production { //부모 class(Play, Film을 자손으로 가짐)
//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

	private String title;
	private String director;
	private String writer;

	public String getTitle() { // private 변수 title에 대한 getter 메서드
		return title;
	}

	public void setTitle(String newTitle) { // private 변수 title에 대한 setter 메서드
		title = newTitle;
	}

	public String getDirector() { // private 변수 director에 대한 getter 메서드
		return director;
	}

	public void setDirector(String newDirector) { // private 변수 director에 대한 setter 메서드
		director = newDirector;
	}

	public String getWriter() { // private 변수 writer에 대한 getter 메서드
		return writer;
	}

	public void setWriter(String newWriter) { // private 변수 writer에 대한 setter 메서드
		title = newWriter;
	}

	public void display() { // title, director, writer 출력하는 메서드
		System.out.println("Title:" + title);
		System.out.println("Director:" + director);
		System.out.println("Writer:" + writer);
	}

	public Production() {
	} // default 생성자(안 쓸 것 같지만 혹시 몰라서 정의)

	public Production(String title, String director, String writer) { // 3개의 String 인자를 메인 메서드에서 받아서 초기화시켜주는 생성자
		this.title=title;
		this.director=director;
		this.writer=writer;
	}

}
