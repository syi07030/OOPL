import java.util.*; //java.util안에 있는 클래스들 다 끌어오기

public class Week10_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//참조변수 kbd->Scanner 클래스에 대한 객체 생성
		Map<String,String> student = new HashMap<String,String>(); //key와 value모두 String타입인 HashMap 생성, 참조변수 student가 가리킴
		System.out.println("학생의 ID와 이름을 차례로 입력하세요.(종료시 0 0 입력)");
		String name, id; //이름과 id를 저장할 String 타입 변수
		while(true) {
			id=kbd.next();//id입력받아서 저장
			name=kbd.next();//이름 입력받아서 저장
			if((name.equals("0"))&&(id.equals("0"))) break; //id와 이름 모두 0이면 while문 빠져나감
			student.put(id,name); //key값인 id와 value값인 name을 Hashmap에 저장
		}
		
		System.out.println("<학생명단>");
		System.out.println("[ID]\t[NAME]");
		
		Set k = student.keySet(); //key값의 set k를 만듦
		Iterator<String> it = k.iterator(); //Iterator 인스턴스 생성->Hashmap에 있는 각각의 element들에 접근하기 위해 필요
		while(it.hasNext()) { //더 이상 가져올 게 없을 때까지
			String key=it.next(); //변수 key에 set k에 있는 key값들을 iterator()를 이용해서 하나씩 가져옴
			System.out.println(key+"\t"+student.get(key)); //Hashmap에 있는 key값인 id와 value값인 이름 출력
		}
		
		System.out.println("\n전체 학생 수: "+student.size()); //Hashmap에 저장된 요소의 개수를 반환해서 전체 학생 수 출력
		
		Iterator<String> initial = k.iterator();//Iterator 또 다른 인스턴스 생성->maxLength,minLength,maxID,minID초기화 시키기 위해
		String init_key = initial.next(); //iterator이용해서 key값 하나 읽어와서 init_key에 저장
		int maxLength=student.get(init_key).length(); //init_key의 value값 길이를 일단 저장해서 초기화
		int minLength=student.get(init_key).length(); //init_key의 value값 길이를 일단 저장해서 초기화
		String maxID=init_key; //init_key값을 저장해서 초기화
		String minID=init_key; //init_key값을 저장해서 초기화
		
		Iterator<String> check = k.iterator();//Iterator 또 다른 인스턴스 생성->가장 긴 이름과 짧은 이름 찾기 위해
		while(check.hasNext()) { //더 가져올 값이 없을 때까지 반복
			String ch_key=check.next(); //변수 ch_key에 set k에 있는 key값들을 iterator이용해서 하나씩 가져오기
			if(student.get(ch_key).length()>maxLength) {//만약 현재 key가 가리키는 value의 길이가 maxLength보다 길다면
				maxLength=student.get(ch_key).length(); //maxLength값을 그 길이로 업데이트
				maxID=ch_key;//현재 key값으로 maxID 업데이트
			}
			
			if(student.get(ch_key).length()<minLength) { //만약 현재 key가 가리키는 value의 길이가 minLenght보다 짧다면
				minLength=student.get(ch_key).length(); //minLength값을 그 길이로 업데이트
				minID=ch_key; //현재 key값으로 minID 업데이트
			}
		}
		System.out.println("<가장 긴 이름을 가진 학생>");
		System.out.println("ID:"+maxID+" Name:"+student.get(maxID)+" 길이:"+maxLength); //가장 긴 이름 가진 학생의 id와 이름,길이 출력
		System.out.println("<가장 짧은 이름을 가진 학생>");
		System.out.println("ID:"+minID+" Name:"+student.get(minID)+" 길이:"+minLength); //가장 짧은 이름 가진 학생의 id와 이름,길이 출력

	}

}
