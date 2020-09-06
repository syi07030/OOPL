import java.util.*; //java.util에 있는 모든 클래스 끌어오기

public class HW2_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); // Scanner 클래스 객체 생성 -> 참조변수 kbd

		char[] open = { '{', '[', '(' }; // 열리는 문자에 대한 배열
		char[] close = { '}', ']', ')' }; // 닫히는 문자에 대한 배열
		
		while (true) { // 반복
			LinkedList<Character> myStack = new LinkedList<Character>(); // 참조변수 myStack->Character 타입만을 저장하는 LickedList 생성
			int num = 0; // correct 또는 incorrect를 구별하기 위한 변수(짝이 안 맞는지 확인)
			int check = 0; // correct 또는 incorrect를 구별하기 위한 변수(6개 이외의 문자를 입력했는지 확인하기 위해)
			System.out.print("Input: ");
			String input = kbd.next(); // 사용자로부터 입력받아서 저장
			if (input.equals("0"))
				break; // 만약 사용자로부터 입력받은 것이 "0"이면 반복문 나가기
			else { // "0"이 아니라면
				char[] ch = input.toCharArray(); // 입력된 문자열을 문자배열로 변환

				for (int i = 0; i < ch.length; i++) { // 0부터 문자배열의 길이만큼 반복
					for (int j = 0; j < 3; j++) { // 0부터 2까지 반복
						if (ch[i] == open[j] || ch[i] == close[j])
							check++; // 만약 입력한 문자들이 6개 문자 중 하나라면 check값 증가
					}
				}
				if (check == 0)
					break; // 다 확인했는데도 check값이 0이라면 반복문 빠져나가기
				AA: // label표시
				for (int i = 0; i < ch.length; i++) {
					for (int j = 0; j < 3; j++) {// 0부터 2까지 반복
						if (ch[i] == open[j])
							myStack.addLast(new Character(ch[i])); // 만약 open에 있는 문자 중 하나와 같다면 myStack에 push하기
						else if (ch[i] == close[j]) { // 만약 close에 있는 문자 중 하나와 같다면
							if (!myStack.isEmpty()) {// 만약 myStack이 비어있지 않다면
								char c = myStack.removeLast(); // myStack에서 pop한 문자를 c에 저장
								if (c != open[j]) { // 만약 c가 open에 있는 j번째 인덱스의 문자와 다르다면
									num = 1; // num의 값을 1로 바꾸고
									break AA; // AA label로 표시한 for 반복문 빠져나가기
								}
							} else { // 만약 myStack이 비어있다면
								num = 1; // num의 값을 1로 바꾸고
								break AA; // AA label로 표시한 for문 빠져나가기
							}
						}
					}
				}
				if (num == 1 || !myStack.isEmpty())
					System.out.println("Incorrect\n"); // 만약 num값이 1이거나 myStack이 비어있지 않다면 incorrect 출력
				else if (check == 0)
					System.out.println("Wrong Input"); // 만약 check값이 0이라면 wrong input 출력
				else if (myStack.isEmpty())
					System.out.println("Correct\n"); // 만약 myStack이 비어있다면 correct 출력
			}
		}
		System.out.println("Program finished");

	}

}
