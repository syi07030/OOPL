import java.util.*;//java.util안에 있는 클래스들 다 끌어오기
public class Week10_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//참조변수 kbd->Scanner 클래스에 대한 객체 생성
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		List<Student> s = new ArrayList<Student>(); //참조변수 s-> Student타입만을 받는 ArrayList 생성
		while(true) {
			String name = kbd.next(); //학생의 이름을 입력받음
			if(name.equals("0")) break; //만약 학생의 이름이 0이면 while문 빠져나감
			String ID= kbd.next(); //학생의 id 입력받음
			int age=kbd.nextInt(); //학생의 나이 입력받음
			s.add(new Student(name,ID,age)); //입력받은 이름,id,나이를 인자로 Student타입의 객체를 생성, 이를 ArrayList에 추가
		}

		System.out.println("NUMBER\tNAME\tID\tAGE");
		printResult(s); //printResult()메서드 호출해서 ArraryList에 들어있는 전체 내용 출력
		
		for(;;) { // 아래 내용 반복
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
			int num=kbd.nextInt(); //사용자로부터 숫자 입력받음
			switch(num) { //num의 값에 따라
			case 1: //num값이 1이면
				System.out.println("Input new Student Name, ID, and age, and the location");
				addStudent(s); //addStudent()호출해서 element 추가
				printResult(s); //printResult() 호출해서 ArraryList에 들어있는 전체 내용 출력
				break;
			case 2: //num값이 2이면
				System.out.println("Input Student Number to delete");
				deleteStudent(s);//deleteStudent() 호출해서 element 제거
				printResult(s);//printResult() 호출해서 ArraryList에 들어있는 전체 내용 출력
				break;
			case 3: //num값이 3이면
				printResult(s);//printResult() 호출해서 ArraryList에 들어있는 전체 내용 출력
				break;
			case 4: break; //num값이 4이면 그냥 switch문 빠져나가기
			default: //num값이 1,2,3,4 외의 숫자면
				System.out.println("Wrong Input"); //출력
				break;
			}
			if(num==4) break; //num값이 4이면 for문 빠져나가기
		}
		System.out.println("End");
	}
	
	public static void printResult(List<Student> student) { //모든 학생정보 출력하는 메서드
		                                                    //인자로 Student 타입만을 받는 List를 구현한 클래스 타입의 참조변수
		for(int i=0;i<student.size();i++) { //List에 있는 element의 개수만큼 for문을 돌리면서
			System.out.println(i+1+"\t"+student.get(i)); //get()이용해 출력
		}
	}

	public static void deleteStudent(List<Student> student) { //특정 위치의 학생정보를 삭제하는 메서드, 메서드가 받는 인자는 위 메서드와 동일
		Scanner kbd = new Scanner(System.in); //참조변수 kbd->Scanner 클래스에 대한 객체 생성
		student.remove(kbd.nextInt()-1); //입력받은 숫자에서 1을 뺀 위치의 element 삭제
	}
	
	public static void addStudent(List<Student> student) { //사용자로부터 정보를 입력받아 특정 위치에 추가하는 메서드, 메서드가 받는 인자는 위 메서드와 동일
		Scanner kbd = new Scanner(System.in); //참조변수 kbd->Scanner 클래스에 대한 객체 생성
		Student ss=new Student(kbd.next(),kbd.next(),kbd.nextInt()); //입력받은 이름,id,나이로 Student타입의 객체 생성
		student.add(kbd.nextInt()-1,ss); //입력받은 숫자에서 1을 뺀 위치에 새로 생성한 객체 추가
	}
}
