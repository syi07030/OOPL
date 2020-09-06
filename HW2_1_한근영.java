import java.io.*; //java.io의 모든 클래스 끌어오기
import java.util.Scanner; //java.util.Scanner 클래스 끌어오기
import java.util.*; //java.utill의 모든 클래스 끌어오기

public class HW2_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); //Scanner 클래스로 객체 생성->참조변수 kbd
		System.out.println("Input the filename to read.");
		String readFile = kbd.next(); //읽어올 파일 이름(입력 파일) 저장
		System.out.println("Input the filename to write.");
		String writeFile = kbd.next(); //출력 파일 이름 저장

		Scanner inputStream=null;//텍스트 파일로부터 읽어올 입력 스트림 생성
		PrintWriter outputStream=null; //텍스트 파일로 내보낼 출력 스트림 생성

		try {//예외처리 위해 try-catch문 사용
			inputStream = new Scanner(new File(readFile)); //readFile에 저장한 파일에 대한 입력 스트림
			outputStream = new PrintWriter(new File(writeFile)); //writeFile에 저장한 파일에 대한 출력 스트림
		
				while (inputStream.hasNextLine()) {//읽어올 데이터가 아직 존재한다면
					String line = inputStream.nextLine(); //입력파일로부터 줄별로 읽어와서 line에 저장
					StringTokenizer tk = new StringTokenizer(line, ", \n"); //, \n을 분리자로 하여 token을 분리해서 저장
					while (tk.hasMoreTokens()) { //token이 더 있다면
						String word = tk.nextToken(); //word에 다음 token을 반환
						if (word.length()>4) //만약 word의 길이가 4보다 크다면
							outputStream.println(word); //출력 스트림을 이용해서 word를 출력 파일에 쓰기(정확히 말하면 버퍼에)
					}
				}			
		} catch (FileNotFoundException e) { //파일을 찾지 못함에 대한 exception handling
			System.exit(1);
		} catch (IOException e) { //input,output에 대한 exception handling
			System.exit(1);
		} catch (Exception e) { //그 외의 exception handling
			System.exit(1);
		}
		outputStream.close(); //출력 스트림 닫기
		System.out.println(writeFile + " is generated.");
		inputStream.close(); //입력 스트림 닫기
		kbd.close(); //kbd 스트림 닫기
		System.exit(0); //종료
	}
}
