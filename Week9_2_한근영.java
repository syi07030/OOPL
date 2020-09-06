import java.io.*; //java.io에 있는 모든 클래스 import하기
import java.util.Scanner; //Scanner 클래스 import하기

public class Week9_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in); //참조변수 kbd -> Scanner 클래스에 대한 객체 생성
		Dog[] myDog = new Dog[10]; //Dog 타입의 참조변수 배열 생성
		//배열의 각 참조변수가 가리키는 객체 생성
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
		
		Dog[] dog = null; //비어있는 Dog 타입의 배열 선언
		System.out.println("Input File name to write Dog data");
		String fileName=kbd.next(); //파일 이름 사용자로부터 입력받기(파일 이름은 space가 없기 때문에 next()로 입력받음)
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName)); //입력받은 파일 이름의 binary file 생성하고 객체 자체를 보낼 출력 스트림 생성
			outputStream.writeObject(myDog); //myDog 객체 덩어리 자체를 byte sequence로 만들어 파일에 쓰기 
			outputStream.close(); //출력 스트림 종료
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)); //입력 스트림 생성(데이터 읽어오기 위해)
			dog=(Dog[])inputStream.readObject(); //객체에 대한 데이터 읽어와서 비어있는 배열 dog에 저장(Dog[]타입으로 down-casting 필요)
			System.out.println("Name\tAge\tWeight\tBreed\t\tBoosterShot");
			for(int i=0;i<dog.length;i++) { //index값을 0부터 dog 배열의 길이 미만까지 증가시키면서 for문 돌리기
				System.out.println(dog[i]); //각각의 객체 데이터 출력
			}
			System.out.println("\nDogs older than 2 years and did not get the boosterShot.");
			for(int j=0;j<dog.length;j++) { //모든 인덱스 값에 대하여 반복
				if((dog[j].getAge()>2)&&(dog[j].getBoosterShot()==false)) //2세 초과이면서 예방접종 안 한 강아지 이름과 종 출력
					System.out.println(dog[j].getName()+"\t\t"+dog[j].getBreed()); //getter 메서드 사용
			}
			inputStream.close(); //입력 스트림 종료
			kbd.close(); //kbd 스트림 종료
			System.out.println("\nProgram finished");
		}catch(EOFException e) { //파일의 데이터를 다 읽어서 더 이상 가져올 것이 없을 때 나타나는 예외에 대한 처리
			System.out.println("EOFException");
			System.exit(1); //종료
		}catch(FileNotFoundException e) { //파일을 찾을 수 없을 때 나타나는 예외에 대한 처리
			System.out.println("FileNotFoundException");
			System.exit(1); //종료
		}catch(IOException e) { //Input, Output에 대해 나타나는 예외에 대한 처리
			System.out.println("IOException");
			System.exit(1); //종료
		}catch(Exception e) { //그 외의 예외에 대한 처리
			System.out.println("Exception");
			System.exit(1); //종료
		}
	}
}
