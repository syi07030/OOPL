import java.io.*; //java.io에 있는 모든 클래스 끌어오기
import java.net.*; //java.net에 있는 모든 클래스 끌어오기
import java.util.*; //java.util에 있는 모든 클래스 끌어오기

public class Week14_server_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		ServerSocket serverSocket = null; 
		Socket socket = null; 
		
		try { //예외처리 위한 try-catch문
			serverSocket = new ServerSocket(9000); //ServerSocket 만들기(9000포트 open)
			socket=serverSocket.accept(); //Server가 request를 받아들여 socket을 생성하고 client와 연결
			
			Scanner in = new Scanner(socket.getInputStream()); //데이터를 받기 위한 inputstream 생성
			PrintWriter out = new PrintWriter(socket.getOutputStream());  //데이터를 보내기 위한 outputstream 생성
			
			String greet = in.nextLine(); //client로부터 "Hello?" 받기
			System.out.println(greet); //받은 문자열 출력
			
			out.println("How many numbers?"); //문자열 버퍼에 보내기
			out.flush();//버퍼에 있는 데이터 client에게 내보내기
			
			String num_s = in.nextLine(); //client로부터 받은 문자열 저장
			int numR=Integer.parseInt(num_s);//받은 문자열 정수형으로 변환
			System.out.println(num_s);
			out.println("Input "+numR+" numbers"); //문자열 버퍼에 보내기
			out.flush();//버퍼에 있는 데이터 client에게 내보내기
			
			int num=0; //client로부터 받을 숫자 저장
			int sum=0; //client로부터 받은 숫자들의 총합 저장
			double avr=0; //client로부터 받은 숫자들의 평균 저장
			for(int i=0;i<numR;i++) { //numR만큼 반복
				num=Integer.parseInt(in.nextLine()); //client로부터 받은 문자열을 정수형으로 변환하여 num에 저장
				sum+=num; //sum 계산
			}
			avr=(double)sum/numR; //평균 계산
			
			out.println("Sum: "+sum); //문자열 outputstream의 버퍼에 보내기
			out.flush(); //버퍼에 있는 데이터 client에게 보내기
			out.println("Avg: "+avr); //문자열 outputstream의 버퍼에 보내기
			out.flush(); //버퍼에 있는 데이터 client에게 보내기
			
			System.out.println("Service finished.");
			in.close(); //inputStream 닫기
			out.close(); //outputStream 닫기
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}
		
		try {
			socket.close(); //socket 닫기
			serverSocket.close(); //serverSocket 닫기
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}

	}

}
