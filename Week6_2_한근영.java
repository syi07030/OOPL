import java.util.Scanner;//Scanner class 끌어오기
public class Week6_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		FireEngine f = new FireEngine(); //FireEngine class에 대한 객체 생성
		Ambulance a = new Ambulance(); //Ambulance class에 대한 객체 생성
		PoliceCar p = new PoliceCar(); //PoliceCar class에 대한 객체 생성
		Emergency e = new Emergency(); //Emergency 클래스에 대한 객체 생성
		int num=0;//입력받을 정수를 저장할 변수, while문을 한 번이라도 실행시키기 위해 일단 0으로 초기화
		while(num!=5) {//num값이 5가 아닐 경우에 반복문 실행
		System.out.println("What kind of Emergency?");
		System.out.println("1.Fire   2.Patient   3.Thief   4.Record   5.End");
		num=kbd.nextInt(); //입력받은 정수 값을 num에 저장
		switch(num) {//num의 값에 따라
		case 1: e.EM_Call(f); break; //num 값이 1이면 참조변수 e가 가리키는 객체에 대해서 EM_Call()메서드 실행, 이 때 인자로 FireEngine 타입의 객체를 가리키는 참조변수
		                             //이 메서드가 정의된 클래스를 보면 인자로 Car 타입을 인자로 받는데 Car는 FireEngine의 조상 클래스이므로 가능
		case 2: e.EM_Call(a); break; //num 값에 따라 메서드가 다른 인자를 받아서 실행
		case 3: e.EM_Call(p); break;
		case 4: e.EM_record(); break; //num이 4일 경우 e가 가리키는 객체에 대해서 EM_record() 메서드 실행
		case 5: break; //5일 경우 그냥 switch문 빠져나감, 결국 while문 조건이 false이기 때문에 while문도 빠져나가게 됨
		default: System.out.println("Wrong Input"); //num이 위의 조건과 다 맞지 않는 수일 때 출력
		}
		}
		System.out.println("Finished");
		kbd.close();

	}

}
