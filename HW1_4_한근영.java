import java.util.Scanner; //Scanner 클래스 끌어오기
public class HW1_4_한근영 {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조변수 kbd -> Scanner 클래스에 대한 객체 생성
		System.out.println("How many students are there?");
		int num=kbd.nextInt(); //학생이 몇 명 있는지를 입력받아서 저장하는 변수
		kbd.nextLine(); //버퍼에 남아있는 엔터값 제거
		StudentScore[] s = new StudentScore[num]; //StudentScore 클래스 타입의 참조변수 배열 생성, 크기는 num의 값만큼
		System.out.println("Input the information.");
		//반복적으로 학생정보와 점수를 입력받아 배열의 인스턴스 생성
		for(int i=0;i<num;i++) { //배열의 인덱스 값을 증가시키면서
			System.out.print("\nID:");
			String id=kbd.nextLine(); //id 입력받기
			System.out.print("Name:");
			String name=kbd.nextLine(); //이름 입력받기
			System.out.print("Korean:");
			int korean=kbd.nextInt(); //국어 점수 입력받기
			System.out.print("Math:");
			int math=kbd.nextInt(); //수학 점수 입력받기
			System.out.print("English:");
			int english=kbd.nextInt(); //영어 점수 입력받기
			kbd.nextLine(); //버퍼에 남아있는 엔터값 제거
			
			s[i]=new StudentScore(name,id,korean,math,english); //입력받은 id,이름,국어,수학,영어 점수를 인자로 받는 생성자 이용해서 StudenScore 타입의 객체 생성
		}
		System.out.println("\nNAME\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG");
		//이름,id,국어,수학,영어 점수,총점,평균 반복적으로 출력
		for(int i=0;i<num;i++) {
			s[i].display(); //s[i]가 가리키는 객체에 대해 display()메서드 실행, 이름,id,국어,수학,영어 점수 출력
			int sum=s[i].getKorean()+s[i].getMath()+s[i].getEnglish(); //각 학생별 getter 메서드 이용해서 총점 계산한 값 sum에 저장
			System.out.print(sum+"\t"); //각 학생별 국어,수학,영어 점수의 총점 출력
			double avg= (double)(sum)/3; //평균 계산해서 avg에 저장(double로 형변환)
			System.out.printf("%.2f\n",avg); //학생 한 명의 국어,수학,영어 점수의 평균 소수점 둘째자리까지 출력
		}
		
		double sumK=0,sumM=0,sumE=0; //국어,수학,영어 각 과목의 총점을 저장할 변수
		System.out.print("Subject Avg\t\t");
		for(int i=0;i<num;i++) { //배열의 인덱스 값을 0부터 num미만까지 증가시키면서 각 학생들의 과목별 점수를 반복적으로 더함
			sumK+=s[i].getKorean(); //국어 점수를 다 더함
			sumM+=s[i].getMath(); //수학 점수를 다 더함
			sumE+=s[i].getEnglish(); //영어 점수를 다 더함
		}
		//국어,수학,영어 점수의 평균을 소수점 둘째자리까지 출력
		System.out.printf("%.2f\t",(sumK/num));
		System.out.printf("%.2f\t",(sumM/num));
		System.out.printf("%.2f\n",(sumE/num));
		
		//국어,수학,영어 각 과목별 평균보다 높은 점수를 갖는 학생들 이름 출력
		System.out.println("\n<Students over the average>");
		System.out.println("Korean:"); //국어 과목에서
		for(int i=0;i<num;i++) { //인덱스를 증가시키면서 반복적으로 찾기
			if(s[i].getKorean()>(sumK/num)) { //국어 점수 평균보다 높은 국어 점수를 갖는 학생이 있으면
				System.out.print(s[i].getName()+"\t"); //getter메서드 이용해서 이름 출력
			}
		}
		//수학과목에서도 반복
		System.out.println("\nMath:");
		for(int i=0;i<num;i++) {
			if(s[i].getMath()>(sumM/num)) {
				System.out.print(s[i].getName()+"\t");
			}
		}
		//영어과목에서도 반복
		System.out.println("\nEnglish:");
		for(int i=0;i<num;i++) {
			if(s[i].getEnglish()>(sumE/num)) {
				System.out.print(s[i].getName()+"\t");
			}
		}

	}

}
