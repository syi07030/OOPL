//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//Week7_2_�ѱٿ�

public class Circle implements Geometry{ //interface Geometry�� ������ public class
	public double radius; //���� �������� ������ double�� ����
	public Circle() {} //default ������
	public Circle(double radius) { //doubleŸ���� ���ڸ� �޴� ������, ���ڷ� ���� ���� ������� radius�� ����
		this.radius = radius;
	}
	
	public double area() { //��ӹ��� area()�� body�κ� �ϼ���Ŵ
		return PI*radius*radius; //���� ���� ����ؼ� ��ȯ(��ӹ��� ��� PI ���)
	}
	public double perimeter() { //��ӹ��� perimeter()�� body�κ� �ϼ���Ŵ
		return 2*PI*radius; //���� �ѷ� ����ؼ� ��ȯ
	}

}

class Square implements Geometry{ //interface Geometry�� ������ class(���� Circle Ŭ������ �̹� public���� �߱� ������ �� class�� default�� ��)
	public double side; //�簢���� �� ���� ���̸� ������ double�� ����(���⼭�� ���簢���� �� ���� ����)
	public Square() {} //default ������
	public Square(double side) { //doubleŸ���� ���ڸ� �޴� ������, ���ڷ� ���� ���� ������� side�� ����
		this.side = side;
	}
	
	public double area() { //��ӹ��� area()�� body�κ� �ϼ���Ŵ
		return side*side; //���簢���� ���� ����ؼ� ��ȯ
	}
	public double perimeter() { //��ӹ��� perimeter()�� body�κ� �ϼ���Ŵ
		return 4*side; //���簢���� �ѷ� ����ؼ� ��ȯ
	}

}

class Triangle implements Geometry{ //interface Geometry�� ������ class(���� Circle Ŭ������ public���� �̹� �߱� ������ �� class�� default�� ��)
	public double a,b,c; //�ﰢ���� �� ���� ���̸� ������ double�� ������
	public Triangle() {} //default ������
	public Triangle(double a, double b, double c) { //double Ÿ���� ���� 3���� �޴� ������, ���ڷ� ���� ������ ������� a,b,c�� ���� ����
		this.a = a;
		this.b= b;
		this.c= c;
	}
	
	public double area() { //��ӹ��� area()�� body�κ� �ϼ���Ŵ
		double s=(a+b+c)/2; //���̸� ����� �� �ʿ��� s
		double cal=s*(s-a)*(s-b)*(s-c); //���̸� ����� �� ��Ʈ�� ����� ���� �� cal
		return Math.sqrt(cal); //�ﰢ���� ���� �� ����ؼ� ��ȯ(Math.sqrt()���)
	}
	public double perimeter() { //��ӹ��� perimeter()�� body�κ� �ϼ���Ŵ
		return a+b+c; //�ﰢ���� �ѷ� ����ؼ� ��ȯ
	}

}
