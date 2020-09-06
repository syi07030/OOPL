import java.util.Scanner; //Scanner 클래스 끌어오기
public class HW1_3_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //참조변수 kbd->Scanner 클래스에 대한 객체 생성
		while(true) { //while 반복문 실행
		System.out.println("\nInput a word");
		String word = kbd.next(); //입력받은 단어 저장하는 String형 변수 word(어차피 단어 하나 입력받는 거니까 next()사용)
		char Arr[]=new char[100]; 
		Arr=word.toCharArray(); //사용자로부터 입력받은 String을 문자배열로 변환
		if(check(Arr)==true) { //check(Arr) 값이 참이면(입력된 단어가 대칭이면)
			System.out.println("symmetry"); //symmetry 출력
		}
		else { //check(Arr)값이 거짓이면(입력된 단어가 비대칭이면)
			System.out.println("Asymmetry"); //Asymmetry 출력
		}
		System.out.print("\nTry again?(y/n)\n"); //반복 여부 물어보기
		String anw = kbd.next(); //y또는 n입력받고
		if(anw.equalsIgnoreCase("y")) continue; //y또는 Y이면 while문 다시 반복
		else break; //y또는 Y가 아니면(n또는 N이면)while문 빠져나가고 종료 
		}
	}
	
	public static boolean check(char[] Arr) { //public static 메서드 ,main 메서드에서 사용할 수 있어야 하므로 static으로 정의
		boolean check=true; //boolean타입인 check를 true로 초기화
		for(int i=0;i<(Arr.length/2);i++) { //인자로 받은 문자 배열의 인덱스를 0에서 배열 길이의 절반 미만까지 1씩 증가시키면서 반복
			if(Arr[i]!=Arr[Arr.length-1-i]) { //Arr[i]와 Arr[Arr.length-1-i]에 저장된 문자가 서로 다르면
				check=false; //비대칭인 거니까 check값을 false로 바꾸고
				break;//for문 빠져나감
			}
		}
		return check; //check값 반환, 만약 비대칭이면 false가 되고 배열 끝까지 확인했는데 모두 대칭이면 check값은 원래 초기화 값을 유지하니까 true
	}

}
