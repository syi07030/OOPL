import java.util.Scanner; //Scanner class 끌어오기

public class Week3_4_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in);//참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		MenuOrder menu = new MenuOrder();//참조형 변수 menu -> MenuOrder 클래스에 대한 객체 생성
		System.out.println("--- 음료가격 설정 ---");
		System.out.printf("Coke가격:");
		menu.setPrice("coke", kbd.nextInt()); //"coke" 문자열과  kbd를 이용해 정수로 입력받은 정수값을 인자로 받아 menu가 가리키는 객체에서 setPrice 메서드 실행
		System.out.printf("Lemonade가격:");
		menu.setPrice("lemonade", kbd.nextInt()); //"lemonade"문자열과 정수 값을 인자로 받고 나머지 동일
		System.out.printf("Coffee가격:");
		menu.setPrice("coffee", kbd.nextInt());//"coffee"문자열과 정수 값을 인자로 받고 나머지 동일

		String anw = "y"; //계속 할지 말지를 결정할 문자열 anw에 일단 아래의 while문을 한 번은 실행시키기 위해 "y"로 저장

		while (anw.equalsIgnoreCase("y")) { //대소문자 관계없이 anw에 저장되어 있는 문자열이 "y"이면 while문 실행
			System.out.println("\n--- 돈을 넣으세요 ---");
			menu.setInputMoney(kbd.nextInt()); //menu가 가리키는 객체에서 private한 멤버 변수인 inputMoney에 값을 저장하기 위해 setter 메서드 실행
			menu.showMenu(); //menu가 가리키는 객체에서 showMenu()메서드 실행
			int num;
			num = kbd.nextInt(); //int형인 변수 num에 kbd를 이용해 정수 값 입력받기
			switch (num) { //num의 값에 따라서
			case 1: //num 값이 1이면 menu가 가리키는 객체에 대해서
				menu.setDrinkSelected("Coke"); //private 멤버 변수인 drinkSelected에 setter 메서드를 이용해 "Coke" 저장 
				menu.setMenuPrice(); //setMenuPrice메서드->객체 내의 public 멤버 변수인money에 cokePrice 값을 저장 
				menu.showResult(menu.getInputMoney());//menu가 가리키는 객체의 inputMoney 값을 getter method를 이용해 인자로 넣어서 showResult()메서드 실행
				break;
			case 2: //num 값이 2이면 인자로 "Lemonade"를
				menu.setDrinkSelected("Lemonade");
				menu.setMenuPrice();
				menu.showResult(menu.getInputMoney());
				break;
			case 3://num값이 3이면 인자로 "Coffee"를
				menu.setDrinkSelected("Coffee");
				menu.setMenuPrice();
				menu.showResult(menu.getInputMoney());
				break;
			default: //num값이 위의 값들에 해당되지 않는다면 다음과 같이 출력
				System.out.println("없는 메뉴를 선택하셨습니다");
				break;
			}
			System.out.println("계속 하시겠습니까?(y/n)");
			kbd.nextLine(); //버퍼에 남아있는 엔터값 가져가기
			anw = kbd.nextLine(); //anw에 y또는 n을 입력받아서 y이면 다시 while문 반복, 아니면 종료
		}

	}

}
