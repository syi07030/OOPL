import java.util.Scanner;//Scanner class 끌어오기
public class Week6_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		Buyer b=new Buyer(); //참조 변수 b -> Buyer 클래스에 대한 객체 생성
		System.out.println("How much do you have?");
		b.money=kbd.nextInt(); //nextInt() 메서드를 이용해 현재 가지고 있는 돈의 액수를 입력받아서 b가 가리키는 Buyer 타입 객체의 money에 저장
		
		Tv t = new Tv(); //참조 변수 t -> Tv 클래스에 대한 객체 생성
		Computer c=new Computer(); //참조 변수 c -> Computer 클래스에 대한 객체 생성
		Video v=new Video();//참조 변수 v -> Video 클래스에 대한 객체 생성
		Audio a=new Audio();//참조 변수 a -> Audio 클래스에 대한 객체 생성
		NoteBook n=new NoteBook();//참조 변수 n -> NoteBook 클래스에 대한 객체 생성
		int num=1; //변수 num은 아래의 반복문에서 입력받는 정수를 저장하는데 반복문이 무조건 한 번은 실행되야 하므로 일단 1로 초기화
		while(num!=0) { //num 값이 0이 아니라면 반복문 실행
		System.out.println("What do you want to buy? Input 0 to quit.");
		System.out.println("1.TV(100)     2.Computer(200)     3.Video(110)     4.Audio(50)     5.NoteBook(300)");
		num=kbd.nextInt(); //nextInt() 메서드를 이용해서 num에 입력받은 정수 저장
		switch(num) { //num의 값에 따라
		case 1: b.buy(t);break; //num이 1이면 b가 가리키는 객체에 대해서 buy()메서드 실행, 이 때 인자로는 Tv 클래스에 대한 객체를 가리키는 참조 변수 t,
		                        //이 때 buy()메서드는 Product 클래스 타입을 받는데 이 때 Tv는 Product의 자손이므로 t가 인자로 들어갈 수 있음
		                        //밑에도 num의 값에 따라 buy()메서드의 인자로 들어가는 참조변수가 달라짐
		case 2: b.buy(c);break;
		case 3: b.buy(v);break;
		case 4: b.buy(a);break;
		case 5: b.buy(n);break;
		case 0: break; //num의 값이 0이라면 아무것도 안 하고 switch문 빠져나옴,반복문의 조건에서도 false이기 때문에 반복문에서도 빠져나오게 됨
		default: System.out.println("No such item."); break; //위의 조건에 모두 해당되지 않는 값일 때 이렇게 출력하고 빠져나옴
		}
		if(b.check==1) break; //금액이 부족할 경우에 반복문에서 빠져나올 수 있도록 하는 역할
		}
		
		b.summary(); //b가 가리키는 객체에 대해 summary() 메서드
		kbd.close();
	}
}
