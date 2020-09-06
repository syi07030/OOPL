import java.util.Scanner;//Scanner class 끌어오기
public class Week5_1_한근영 {
	public static void main(String[] args) { //메인 메서드
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		System.out.println("Input Title for Play");
		String p_title = kbd.nextLine(); //title 입력받아서 문자열 p_title에 저장
		System.out.println("Input Director for Play");
		String p_director = kbd.nextLine(); //director 입력받아서 문자열 p_director에 저장
		System.out.println("Input Writer for Play");
		String p_writer = kbd.nextLine(); //writer 입력받아서 문자열 p_writer에 저장
		
		Play p = new Play(p_title, p_director,p_writer); //참조형 변수 p -> Play 클래스에 대한 객체 생성, 3개의 string타입을 인자로 받는 생성자
		
		System.out.println("Input Title for Film");
		String f_title = kbd.nextLine(); //title 입력받아서 문자열 f_title에 저장
		System.out.println("Input Director for Film");
		String f_director = kbd.nextLine(); //director 입력받아서 문자열 f_director에 저장
		System.out.println("Input Writer for Film");
		String f_writer = kbd.nextLine(); //writer 입력받아서 문자열 f_writer에 저장
		
		Film f = new Film(f_title, f_director, f_writer); //참조형 변수 f -> Film 클래스에 대한 객체 생성, 3개의 string 타입을 인자로 받는 생성자
		
		System.out.println("Input Performance Cost for Play");
		p.setPerformanceCost(kbd.nextInt()); //정수를 입력받아서 객체 p의 변수 performanceCost에 setter 메서드 사용해 저장
		System.out.println("Input boxOfficeGross for Film");
		f.setBoxOfficeGross(kbd.nextInt()); //정수를 입력받아서 객체 f의 변수 setBoxOfficeGross에 setter 메서드 사용해 저장
		
		System.out.print("\n");
		p.display(); //title, director, writer, performanceCost 출력
		System.out.print("\n");
		f.display(); //title, director, writer, boxOfficeGross 출력
		kbd.close();

	}

}
