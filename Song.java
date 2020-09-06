
public class Song {
	//System.out.println("===============");
	//System.out.println("전공: 사이버보안");
	//System.out.println("학번: 1971090");
	//System.out.println("성명: 한근영");
	//System.out.println("===============");

	public String title; //public String형인 인스턴스 변수 title, singer 그리고 int형 인스턴스 변수 price
	public String singer;
	public int price;
	
	public void play() { //public method인 play()는 다음과 같이 title과 singer를 출력
		System.out.println("노래 들어요: "+'"'+title+'"'+" by "+singer);
	}
	public void price() { //public method인 price()는 다음과 같이 price값 출력
		System.out.println(price+"원입니다.");
	}
}
