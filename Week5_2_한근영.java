import java.util.Scanner;//Scanner 클래스 끌어오기

public class Week5_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); // 참조형 변수 kbd -> Scanner클래스에 대한 객체 생성
		Dog[] d = new Dog[3]; // Dog 타입의 참조변수 배열 생성
		for (int i = 0; i <= 2; i++) { // 정보 입력 받기 위한 반복문
			System.out.println("<<Dog " + (i+1) + ">>");
			System.out.print("Name: ");
			String name = kbd.nextLine(); // 이름 입력받아서 저장
			System.out.print("Age: ");
			int age = kbd.nextInt(); // 나이 입력받아서 저장
			System.out.print("Weight: ");
			double weight = kbd.nextDouble(); // 몸무게 입력받아서 저장
			System.out.print("BoosterShot(y/n): ");
			String boosterShot = kbd.next(); // 일단 String형으로 저장, next()를 이용해서 처음에 만나는 버퍼에 남은 엔터값은 다 버리고 문자열만 가져오기
			kbd.nextLine(); // 위의 next()로 받고 나서 버퍼에 남은 엔터값 가져감으로써 다시 반복문을 통해 입력할 때 엔터로 인한 이상한 값 안 가져갈 수 있도록
			System.out.print("\n");
			if (boosterShot.equalsIgnoreCase("y")) { // boosterShot이 y이면
				d[i] = new Dog(name, age, weight, true); // d[i]가 가리키는 인스턴스 생성 -> 인자 4개로 받는 생성자, boolean값을 true로 받음
			} else { // boosterShot이 n이면
				d[i] = new Dog(name, age, weight, false); // 객체 생성할 때 생성자가 받는 맨 마지막 인자를 false로
			}
		}

		Cat[] c = new Cat[3]; // Cat 타입의 참조변수 배열 생성
		for (int i = 0; i <= 2; i++) { // 정보 입력 받기 위한 반복문
			System.out.println("<<Cat " + (i+1) + ">>");
			System.out.print("Name: ");
			String name = kbd.nextLine(); // 이름 입력받아서 저장
			System.out.print("Age: ");
			int age = kbd.nextInt(); // 나이 입력받아서 저장
			System.out.print("Weight: ");
			double weight = kbd.nextDouble(); // 몸무게 입력받아서 저장
			kbd.nextLine(); // 버퍼에 남아있는 엔터값 가져가기
			System.out.print("Color: ");
			String color = kbd.nextLine(); // 색깔 입력받아서 저장, 색깔 이름 중간에 space가 있을수도 있으니 next()를 이용하지 않음
			System.out.print("\n");
			c[i] = new Cat(name, age, weight, color); // c[i]가 가리키는 인스턴스 생성 -> 인자 4개로 받는 생성자
		}
		
		System.out.println("\n<<Dog List>>");
		for(int i=0;i<=2;i++) { //dog들의 정보 출력 위한 반복문
			d[i].writeOutput();
			d[i].move();
			System.out.print("\n");
		}
		System.out.println("\n<<Cat List>>");
		for(int i=0;i<=2;i++) { //cat들의 정보 출력 위한 반복문
			c[i].writeOutput();
			c[i].move();
			System.out.print("\n");
		}
		
		System.out.println("\n*Dogs older than 2 years and no boostershot are...");
		for(int i=0;i<=2;i++) { //모든 index i에 대해 확인해야되므로 반복
			if((d[i].getAge()>2)&&(d[i].getBoosterShot()==false)) { //나이가 두 살보다 많고 boosterShot값이 false이면
				System.out.print(d[i].getName()+" "); //이름 출력
			}
		}
		System.out.println("\n*Black cates weighs more than or equls to 3kg are...");
		for(int i=0;i<=2;i++) { //모든 index i에 대해 확인해야되므로 반복문
			if((c[i].getWeight()>=3)&&(c[i].getColor().equalsIgnoreCase("black"))) { //무게가 3이상이고 색깔이 블랙이면
				System.out.print(c[i].getName()+" "); //이름 출력
			}
		}
		kbd.close();
	}

}
