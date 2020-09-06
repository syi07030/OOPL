import java.util.Scanner; //Scanner 클래스 끌어오기

class Song{ //밑에 public class가 이미 있으므로 default 타입으로 Song 클래스 선언
	public String title;
	public String singer;
	public int price;
	public void play() { //제목 및 가수를 출력하는 public 메서드
		System.out.println(title+" by "+singer);
	}
	
	public Song(){} //default 생성자
	public Song(String title, int price){ //title과 price만 있는 생성자
		this(title,"모름",price); //singer부분을 "모름"이라는 인자로 받아서 this()로 아래의 생성자 호출
	}
	public Song(String newTitle, String newSinger, int newPrice){ //title, singer, price 모두 있는 생성자(여기서는 매개변수 이름이 newTitle,newSinger, newPrice)
		title=newTitle; //인스턴스 변수 title, singer, price 각각에 인자로 받은 값들을 저장
		singer=newSinger;
		price=newPrice;
	}
}

public class Week4_1_한근영 {

	public static void main(String[] args) { //메인 메서드
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		Song s;//참조형 변수 s 선언
		System.out.printf("곡명:");
		String title = kbd.nextLine(); //String형 title 변수에 입력받은 문자열 저장
		while(title.equals("")) { //만약 곡명이 입력되지 않을경우 while문 반복
			System.out.println("곡명은 반드시 필요합니다.");
			System.out.printf("곡명:"); 
			title = kbd.nextLine(); //다시 입력받음
		}
		System.out.printf("가수명:");
		String singer=kbd.nextLine();//String형 singer변수에 입력받은 문자열 저장
		System.out.printf("가격:");
		int price = kbd.nextInt();//int형 price변수에 입력받은 정수 저장
		
		if(singer.equals("")) { //만약 가수명이 없을경우 title과 price만을 인자로 받는 생성자 호출
			s=new Song(title,price);
		}
		else { //가수명이 있으면 title, singer, price 모두 인자로 받는 생성자 호출
			s=new Song(title,singer,price);
		}
		
		System.out.println("몇번 들으시겠습니까?");
		int num = kbd.nextInt(); //정수를 num에 입력받은 후
		for(int i=0;i<num;i++) {//s에 대해서 메서드인 play()를 num에 입력받은 값만큼 반복
			s.play();
		}
		
		System.out.println("총 "+num*s.price+"원입니다."); //s.price와 num을 곱한 값은 총 얼마인지 나타냄(인스턴스 변수 price는 public이니까 바로 접근 가능)
		kbd.close();
	}

}
