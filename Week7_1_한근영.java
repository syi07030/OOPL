import java.util.Scanner; //Scanner class import 하기
public class Week7_1_한근영 {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in); //참조변수 kbd -> Scanner class에 대한 객체 생성
		Pet[] p = new Pet[10]; //Pet 클래스 타입의 참조변수 배열 생성, 최대 크기 10
		int i=0; //Pet 타입의 참조변수 배열의 인덱스로 사용하기 위한 변수 i
		int num=0; //원하는 작업을 선택할 때 1,2,3번 중 숫자를 저장하기 위한 변수 num,일단 0으로 초기화
		while(num!=3) {//num이 3이 아니면 while문 실행
		System.out.println("\n원하는 작업은 무엇입니까?");
		System.out.println("1. New input   2. Output   3.Exit");
		num=kbd.nextInt(); //원하는 작업의 숫자를 선택해서 num에 숫자 저장
		if(num==1) { //num 값이 1이면
			while(true){ //while 반복문 실행
			System.out.println("종은 무엇입니까?");
			System.out.println("1.Dog   2.Cat   3.Snake   4.Bird");
			int num2=kbd.nextInt(); //종을 선택할 때 1,2,3,4번 중 숫자를 저장하기 위한 변수 num2
			if((num2!=1)&&(num2!=2)&&(num2!=3)&&(num2!=4)) { //num2 값이 1,2,3,4 가 아닌 다른 값이라면
				System.out.println("잘못된 입력");
				continue; //잘못된 입력 출력하고 다시 while반복문 처음으로 가서 실행 -> 다시 종은 무엇입니까부터 시작
			}
			else { //num2 값이 1,2,3,4 중에서 하나라면
			System.out.print("Name: ");
			String name = kbd.next(); //이름 저장하는 String 타입 변수 name -> 위에서 숫자만 입력받고 버퍼에 남은 엔터도 해결해버리기 위해 next()이용
			System.out.print("Age: ");
			int age= kbd.nextInt(); //나이 저장하는 int형 변수 age
			switch(num2){//num2 값에 따른 switch문
			case 1: p[i++]=new Dog("Dog",name, age);break; //num2 값이 1이면 참조변수 배열 p[i]에 Dog 타입의 객체 생성해서 연결시키기, 그 후 i값 증가
			case 2: p[i++]=new Cat("Cat",name, age);break; //num2 값이 2이면 Cat 타입의 객체 생성해서 연결시키기, 그 외 동일
			case 3: p[i++]=new Snake("Snake",name, age);break; //num2값이 3이면 Snake 타입의 객체 생성해서 연결, 그 외 동일
			case 4: p[i++]=new Bird("Bird",name, age);break; //num2 값이 4이면 Bird 타입의 객체 생성해서 연결, 그 외 동일
			}
			break; //Switch문 빠져나가면 가장 가까운 while문 빠져나가기->num 값이 아직 1이므로 맨 처음의 while문으로 올라가 다시 원하는 작업은 무엇입니까로 시작
			}
			}
		}
		else if(num==2) { //num값이 2이면
			System.out.println("\nSpecies\tName\tAge\tMovement");
			for(int j=0;j<i;j++) { //인덱스 값을 0부터 i까지 증가시키면서
				System.out.print(p[j].species +"\t"+ p[j].name+"\t"+p[j].age+"\t");//종,이름,나이 출력
				p[j].move(); //move도 출력
			}
		}
		else if(num==3) break;//3이면 맨 위의 while문 빠져나가기
		else { //num값이 1,2,3 중 해당되지 않는 숫자라면
			System.out.println("잘못된 입력");
			continue; //잘못된 입력 출력하고 while문 다시 시작 -> 원하는 작업은 무엇입니까로 다시 시작
		}

	}
		System.out.println("종료");//num값이 3으로 while문 빠져나오면 종료 출력
		kbd.close();
	}
}
