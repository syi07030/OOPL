import java.io.*;//java.io에 있는 모든 클래스 끌어오기
import java.net.*;//java.net에 있는 모든 클래스 끌어오기
import java.util.*;//java.util에 있는 모든 클래스 끌어오기

public class Week14_client_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Socket socket=null;
		
		try {
			socket = new Socket("192.168.0.8",9000); //server의 ip와 port를 사용하여 socket을 생성하고 connection을 request
			Scanner in=new Scanner(socket.getInputStream()); //데이터를 받기 위한 inputstream 생성
			PrintWriter out = new PrintWriter(socket.getOutputStream()); //데이터를 보내기 위한 outputstream 생성
			Scanner kbd = new Scanner(System.in); //사용자가 입력하는 값들을 받기 위한 입력 스트림 생성
			
			out.println("Hello?"); //문자열 버퍼에 보내기
			out.flush(); //버퍼에 있는 데이터 server에게 보내기
			
			String que=in.nextLine(); //server로부터 받은 문자열 저장
			System.out.println(que);//받은 문자열 출력
			int numR=kbd.nextInt();//숫자 사용자로부터 입력받기
			
			out.println(Integer.toString(numR)); //사용자로부터 받은 숫자 문자열로 변환 후 outputstream의 버퍼에 보내기
			out.flush();// 버퍼에 있는 데이터 server에게 보내기
			
			que=in.nextLine(); //server로부터 받은 문자열 저장
			System.out.println(que);//받은 문자열 출력
			for(int i=0;i<numR;i++) { //numR만큼 반복
				int num=kbd.nextInt(); //사용자로부터 숫자 입력받기
				out.println(Integer.toString(num)); //사용자로부터 입력받은 숫자 문자열로 변환 후 버퍼에 보내기
				out.flush(); //버퍼에 있는 데이터 server에게 보내기
			}
			
			String anw = in.nextLine(); //server로부터 문자열 받기
			System.out.println(anw); //출력
			anw=in.nextLine(); //server로부터 문자열 받기
			System.out.println(anw); //출력
			in.close(); //in 스트림 닫기
			out.close(); //out 스트림 닫기
			kbd.close(); //kbd 스트림 닫기
			
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}

		try {
			socket.close(); //socket 닫기
			
		}catch(Exception e) { //exception handling
			System.out.println(e.getMessage());
		}
	}

}
