//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//Week7_2_한근영

public class Circle implements Geometry{ //interface Geometry를 구현한 public class
	public double radius; //원의 반지름을 저장할 double형 변수
	public Circle() {} //default 생성자
	public Circle(double radius) { //double타입의 인자를 받는 생성자, 인자로 받은 값을 멤버변수 radius에 저장
		this.radius = radius;
	}
	
	public double area() { //상속받은 area()의 body부분 완성시킴
		return PI*radius*radius; //원의 넓이 계산해서 반환(상속받은 상수 PI 사용)
	}
	public double perimeter() { //상속받은 perimeter()의 body부분 완성시킴
		return 2*PI*radius; //원의 둘레 계산해서 반환
	}

}

class Square implements Geometry{ //interface Geometry를 구현한 class(위에 Circle 클래스를 이미 public으로 했기 때문에 이 class는 default로 함)
	public double side; //사각형의 한 변의 길이를 저장할 double형 변수(여기서는 정사각형의 한 변의 길이)
	public Square() {} //default 생성자
	public Square(double side) { //double타입의 인자를 받는 생성자, 인자로 받은 값을 멤버변수 side에 저장
		this.side = side;
	}
	
	public double area() { //상속받은 area()의 body부분 완성시킴
		return side*side; //정사각형의 넓이 계산해서 반환
	}
	public double perimeter() { //상속받은 perimeter()의 body부분 완성시킴
		return 4*side; //정사각형의 둘레 계산해서 반환
	}

}

class Triangle implements Geometry{ //interface Geometry를 구현한 class(위에 Circle 클래스를 public으로 이미 했기 때문에 이 class는 default로 함)
	public double a,b,c; //삼각형의 세 변의 길이를 저장할 double형 변수들
	public Triangle() {} //default 생성자
	public Triangle(double a, double b, double c) { //double 타입의 인자 3개를 받는 생성자, 인자로 받은 값들을 멤버변수 a,b,c에 각각 저장
		this.a = a;
		this.b= b;
		this.c= c;
	}
	
	public double area() { //상속받은 area()의 body부분 완성시킴
		double s=(a+b+c)/2; //넓이를 계산할 때 필요한 s
		double cal=s*(s-a)*(s-b)*(s-c); //넓이를 계산할 때 루트를 씌우기 전의 값 cal
		return Math.sqrt(cal); //삼각형의 넓이 값 계산해서 반환(Math.sqrt()사용)
	}
	public double perimeter() { //상속받은 perimeter()의 body부분 완성시킴
		return a+b+c; //삼각형의 둘레 계산해서 반환
	}

}
