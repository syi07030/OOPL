public class Week4_3_한근영 {
	public static void main(String[] args) { //메인 메서드
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("===============");

		int a=5, b=10;
		double da=3.4, db=5.2;
		char ca='a',cb='b';
		int iarr[]= {1,2,3}; //정수 배열 선언, 바로 초기화
		double darr[]= {1.1,2.2,3.3}; //실수 배열 선언, 바로 초기화
		char carr[]= {'a','p','p','l','e'}; //문자 배열 선언, 바로 초기화
		System.out.println("a+b="+sum(a,b)); //각각이 받는 인자와 적합한 sum()메서드를 호출
		System.out.println("da+b="+sum(da,b));
		System.out.println("a+db="+sum(a,db));
		System.out.println("da+db="+sum(da,db));
		System.out.println("ca+cb="+sum(ca,cb));
		System.out.println("sum of Int_Arr="+sum(iarr));
		System.out.println("sum of Double_Arr="+sum(darr));
		System.out.println("sum of Char_Arr="+sum(carr));
	}
	//아래는 sum()메서드 정의(오버로딩)-매개변수는 다르지만 기능이 같음
	//static 메서드인 메인 메서드에서는 인스턴스메서드는 호출할 수 없고 static 메서드는 호출할 수 있기 때문에 sum()메서드와 관련하여 모두 static 메서드로 정의, 메인 메서드에서 호출할 때 문제가 없으면 되기 때문에 타입은 그냥 default로 함
	static int sum(int a, int b) {return a+b;} //int형,int형 매개변수
	static double sum(double a, int b) {return a+b;} //double형,int형 매개변수
	static double sum(int a, double b) {return a+b;} //int형,double형 매개변수
	static double sum(double a, double b) {return a+b;} //double형,double형 매개변수
	static String sum(char a, char b) {return ""+a+b;} //char형,char형 매개변수, 리턴타입이 String형이므로 두 문자를 연결시키기 전에 빈 문자열인 ""에 두 문자를 더함으로써 반환할 때 문자열이 될 수 있도록
	static int sum(int[] arr) { //정수 배열
		int total=0;//지역변수이므로 초기화 필요
		for(int i=0;i<arr.length;i++) {//반복문을 이용해 배열의 인덱스값을 증가시키면서 배열 안의 정수들을 모두 더함 
			total+=arr[i];
		}
		return total;
	}
	static double sum(double[]arr) { //실수 배열
		double total=0.0;//여기는 double형으로
		for(int i=0;i<arr.length;i++) {//반복문을 이용해 배열의 인덱스값을 증가시키면서 배열 안의 실수들을 모두 더함 
			total+=arr[i];
		}
		return total;
	}
	static String sum(char[] arr) { //문자 배열
		String total="";//여기는 String형으로, 빈 문자열로 초기화
		for(int i=0;i<arr.length;i++) {//반복문을 이용해 배열의 인덱스값을 증가시키면서 배열 안의 문자들을 모두 연결, total이 애초에 빈 문자열로 초기화되어있으므로 문자들을 여기에 +를 이용해 연결시키면 최종적으로는 문자열이 됨 
			total+=arr[i];
		}
		return total;
	}
}
