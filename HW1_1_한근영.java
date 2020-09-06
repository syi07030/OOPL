import java.util.Scanner; //Scanner class 끌어오기
public class HW1_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조변수 kbd -> Scanner 클래스에 대한 객체 생성
		Time t = new Time(); //참조변수 t ->Time 클래스 타입의 객체 생성
		System.out.println("Hour:");
		int hour=kbd.nextInt(); //몇 시인지 입력받아 그 값을 저장하는 int형 변수 hour
		System.out.println("Minute:");
		int minute=kbd.nextInt(); //몇 분인지 입력받아 그 값을 저장하는 int형 변수 minute
		
		t.setTime(hour,minute); //t가 가리키는 객체에 대한 setTime()메서드, int형 hour,minute을 인자로
		System.out.println(t.getTime('h')+":"+t.getTime('m')); //t가 가리키는 객체에 대해 getTime()메서드 이용해서 몇 시 몇 분인지 출력

	}

}
