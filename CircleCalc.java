import java.util.Scanner;
public class CircleCalc {

	public static void main(String[] args) {
		final double PI= 3.14159;
		double radius;
		double area;
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("������:");
		radius = keyboard.nextDouble();
		area=PI*radius*radius;
		System.out.println("���� ����: "+area);

	}

}
