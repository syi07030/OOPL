import java.util.Scanner; //Scanner 클래스 import하기
public class Week7_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in); //참조변수 kbd -> Scanner 클래스에 대한 객체 생성
		System.out.println("Input radius for a circle");
		double radius=kbd.nextDouble(); //원의 반지름이 무엇인지에 대한 입력받은 값을 저장하는 double형 변수
		Circle circle = new Circle(radius); //Circle 클래스 타입의 객체 생성, radius 값을 인자로 받는 생성자
		
		System.out.println("Input a length for a square");
		double side=kbd.nextDouble(); //사각형의 한 변의 길이에 대해 입력받은 값을 저장하는 double형 변수
		Square square = new Square(side); //Square 클래스 타입의 객체 생성, side값을 인자로 받는 생성자
		
		System.out.println("Input a for a triangle");
		double a = kbd.nextDouble(); //삼각형의 한 변 a 길이에 대해 입력받은 값을 저장한는 double형 변수
		System.out.println("Input b for a triangle");
		double b=kbd.nextDouble(); //삼각형의 한 변 b 길이에 대해 입력받은 값을 저장한는 double형 변수
		System.out.println("Input c for a triangle");
		double c=kbd.nextDouble(); //삼각형의 한 변 c 길이에 대해 입력받은 값을 저장한는 double형 변수
		Triangle triangle = new Triangle(a,b,c); //Triangle 클래스 타입의 객체 생성, a,b,c 값들을 인자로 받는 생성자
		
		System.out.println("<Circle>");
		System.out.println("Area: "+circle.area()+"\nCircumference: "+circle.perimeter());//circle이 가리키는 객체에 대한 area(), perimeter()메서드, 원의 넓이와 둘레에 대해 출력
		System.out.println("<Square>");
		System.out.println("Area: "+square.area()+"\nCircumference: "+square.perimeter());//square가 가리키는 객체에 대한 area(), perimeter()메서드, 사각형의 넓이와 둘레에 대해 출력
		System.out.println("<Triangle>");
		System.out.println("Area: "+triangle.area()+"\nCircumference: "+triangle.perimeter());//triangle이 가리키는 객체에 대한 area(), perimeter()메서드, 삼각형의 넓이와 둘레에 대해 출력
		kbd.close();
	}
}
