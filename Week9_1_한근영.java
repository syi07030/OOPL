import java.io.*; //java.io에 있는 모든 클래스 import하기
import java.util.Scanner; //Scanner 클래스 import하기

public class Week9_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//참조변수 kbd -> Scanner 클래스에 대한 객체 생성
		System.out.println("File name for input:");
		String oldFile=kbd.next(); //데이터를 읽어 올 파일 이름 사용자로부터 입력받기(파일 이름에 space 없기 때문에 next()로 받음)
		System.out.println("File name for output:");
		String newFile=kbd.next(); //데이터를 binary 형태로 저장할 파일 이름 사용자로부터 입력받기
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(oldFile)); //oldFile에 대한 입력 스트림 생성(데이터 읽어오기 위해)
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(newFile)); //newFile에 저장된 이름의 binary file과 이에 대한 출력 스트림 생성
			System.out.println("The numbers in File, "+oldFile);
			try {
				while(true) { //입력 파일에 저장되어 있는 숫자를 다 읽어올 때까지 반복, 데이터 다 읽어오면 EOFException 발생
					int oldInteger=inputStream.readInt(); //입력 스트림을 통해 oldFile에 저장되어 있는 숫자 읽어오기
					outputStream.writeInt(2*oldInteger); //읽어온 숫자에 2를 곱한 값을 다시 출력 스트림을 통해 출력파일에 쓰기(정확히 말하자면 버퍼에)
					System.out.println(oldInteger); //읽어온 숫자 출력
				}
			}catch(EOFException e) { //EOFException 처리
				System.out.println("End of reading from File, "+oldFile);
				System.out.println(newFile+" is generated.");
			}
			inputStream.close(); //입력 스트림 종료
			outputStream.close(); //출력 스트림 종료(버퍼에 있는 데이터를 출력 파일로 보내기)
			
			ObjectInputStream newInputStream = new ObjectInputStream(new FileInputStream(newFile)); //새로 생성된 파일에 대해 입력 스트림 생성
			try {
				System.out.println("\nThe numbers in new File, "+newFile);
				while(true) { //입력 파일에 저장되어 있는 숫자를 다 읽어올 때까지 반복, 데이터 다 읽어오면 EOFException 발생
					int doubleInteger=newInputStream.readInt(); //입력 스트림을 통해 newFile에 저장되어 있는 숫자 읽어오기
					System.out.println(doubleInteger); //읽어온 숫자 출력
				}
			}catch(EOFException e) { //EOFException 처리
				System.out.println("End of reading from 2nd File, "+newFile);
			}
			newInputStream.close(); //newFile에 대한 입력 스트림 종료
			kbd.close(); //kbd 스트림 종료
			
		}catch(FileNotFoundException e) { //파일을 찾을 수 없을 때 발생하는 예외에 대한 처리
			System.out.println("Cannot find file "+oldFile);
			System.exit(1); //종료
		}catch(IOException e) { //Input,Output과 관련한 예외에 대한 처리
			System.out.println("IO Exception");
			System.exit(1); //종료
		}catch(Exception e) { //그 외의 예외에 대한 처리
			System.out.println("Exception");
			System.exit(1); //종료
		}
	}

}
