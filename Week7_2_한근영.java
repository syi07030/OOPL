import java.util.Scanner; //Scanner Ŭ���� import�ϱ�
public class Week7_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in); //�������� kbd -> Scanner Ŭ������ ���� ��ü ����
		System.out.println("Input radius for a circle");
		double radius=kbd.nextDouble(); //���� �������� ���������� ���� �Է¹��� ���� �����ϴ� double�� ����
		Circle circle = new Circle(radius); //Circle Ŭ���� Ÿ���� ��ü ����, radius ���� ���ڷ� �޴� ������
		
		System.out.println("Input a length for a square");
		double side=kbd.nextDouble(); //�簢���� �� ���� ���̿� ���� �Է¹��� ���� �����ϴ� double�� ����
		Square square = new Square(side); //Square Ŭ���� Ÿ���� ��ü ����, side���� ���ڷ� �޴� ������
		
		System.out.println("Input a for a triangle");
		double a = kbd.nextDouble(); //�ﰢ���� �� �� a ���̿� ���� �Է¹��� ���� �����Ѵ� double�� ����
		System.out.println("Input b for a triangle");
		double b=kbd.nextDouble(); //�ﰢ���� �� �� b ���̿� ���� �Է¹��� ���� �����Ѵ� double�� ����
		System.out.println("Input c for a triangle");
		double c=kbd.nextDouble(); //�ﰢ���� �� �� c ���̿� ���� �Է¹��� ���� �����Ѵ� double�� ����
		Triangle triangle = new Triangle(a,b,c); //Triangle Ŭ���� Ÿ���� ��ü ����, a,b,c ������ ���ڷ� �޴� ������
		
		System.out.println("<Circle>");
		System.out.println("Area: "+circle.area()+"\nCircumference: "+circle.perimeter());//circle�� ����Ű�� ��ü�� ���� area(), perimeter()�޼���, ���� ���̿� �ѷ��� ���� ���
		System.out.println("<Square>");
		System.out.println("Area: "+square.area()+"\nCircumference: "+square.perimeter());//square�� ����Ű�� ��ü�� ���� area(), perimeter()�޼���, �簢���� ���̿� �ѷ��� ���� ���
		System.out.println("<Triangle>");
		System.out.println("Area: "+triangle.area()+"\nCircumference: "+triangle.perimeter());//triangle�� ����Ű�� ��ü�� ���� area(), perimeter()�޼���, �ﰢ���� ���̿� �ѷ��� ���� ���
		kbd.close();
	}
}
