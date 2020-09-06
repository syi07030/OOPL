//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//Week9_1_한근영

import java.io.*; //java.io에 있는 모든 클래스 import하기
import java.util.Scanner; //Scanner 클래스 import하기
public class MakeBinaryFile { //예제 4와 코드 내용 동일
	public static void main(String[] args) {
		String fileName="numbers.dat"; //filename을 numbers.dat으로 지정
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName)); //numbers.dat이라는 binary file 생성하고 이에 대한 출력 스트림 생성
			Scanner kbd=new Scanner(System.in); //참조변수 kbd -> Scanner 클래스에 대한 객체 생성
			System.out.println("Enter nonnegative integers.");
			System.out.println("Place a negative number at the end.");
			
			int i; //입력받는 정수 값 저장할 변수
			do {
				i=kbd.nextInt(); //정수 사용자로부터 입력받음
				outputStream.writeInt(i); //입력받은 정수 값을 출력 스트림을 통해 출력파일에 쓰기(정확히 말하자면 버퍼에)
			}while(i>=0); //입력받는 정수 값이 음수가 아닐 때까지 반복
			System.out.println("Numbers are sentinel value");
			System.out.println("writtem to the file "+fileName);
			outputStream.close(); //출력 스트림 종료
			kbd.close(); //kbd 스트림 종료
		}catch(IOException e) { //try에서 IOException 발생했을 때 처리
			System.out.println("Problems with output to file "+fileName);
		}
	}
}
