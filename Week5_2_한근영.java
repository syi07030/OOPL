import java.util.Scanner;//Scanner Ŭ���� �������

public class Week5_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); // ������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		Dog[] d = new Dog[3]; // Dog Ÿ���� �������� �迭 ����
		for (int i = 0; i <= 2; i++) { // ���� �Է� �ޱ� ���� �ݺ���
			System.out.println("<<Dog " + (i+1) + ">>");
			System.out.print("Name: ");
			String name = kbd.nextLine(); // �̸� �Է¹޾Ƽ� ����
			System.out.print("Age: ");
			int age = kbd.nextInt(); // ���� �Է¹޾Ƽ� ����
			System.out.print("Weight: ");
			double weight = kbd.nextDouble(); // ������ �Է¹޾Ƽ� ����
			System.out.print("BoosterShot(y/n): ");
			String boosterShot = kbd.next(); // �ϴ� String������ ����, next()�� �̿��ؼ� ó���� ������ ���ۿ� ���� ���Ͱ��� �� ������ ���ڿ��� ��������
			kbd.nextLine(); // ���� next()�� �ް� ���� ���ۿ� ���� ���Ͱ� ���������ν� �ٽ� �ݺ����� ���� �Է��� �� ���ͷ� ���� �̻��� �� �� ������ �� �ֵ���
			System.out.print("\n");
			if (boosterShot.equalsIgnoreCase("y")) { // boosterShot�� y�̸�
				d[i] = new Dog(name, age, weight, true); // d[i]�� ����Ű�� �ν��Ͻ� ���� -> ���� 4���� �޴� ������, boolean���� true�� ����
			} else { // boosterShot�� n�̸�
				d[i] = new Dog(name, age, weight, false); // ��ü ������ �� �����ڰ� �޴� �� ������ ���ڸ� false��
			}
		}

		Cat[] c = new Cat[3]; // Cat Ÿ���� �������� �迭 ����
		for (int i = 0; i <= 2; i++) { // ���� �Է� �ޱ� ���� �ݺ���
			System.out.println("<<Cat " + (i+1) + ">>");
			System.out.print("Name: ");
			String name = kbd.nextLine(); // �̸� �Է¹޾Ƽ� ����
			System.out.print("Age: ");
			int age = kbd.nextInt(); // ���� �Է¹޾Ƽ� ����
			System.out.print("Weight: ");
			double weight = kbd.nextDouble(); // ������ �Է¹޾Ƽ� ����
			kbd.nextLine(); // ���ۿ� �����ִ� ���Ͱ� ��������
			System.out.print("Color: ");
			String color = kbd.nextLine(); // ���� �Է¹޾Ƽ� ����, ���� �̸� �߰��� space�� �������� ������ next()�� �̿����� ����
			System.out.print("\n");
			c[i] = new Cat(name, age, weight, color); // c[i]�� ����Ű�� �ν��Ͻ� ���� -> ���� 4���� �޴� ������
		}
		
		System.out.println("\n<<Dog List>>");
		for(int i=0;i<=2;i++) { //dog���� ���� ��� ���� �ݺ���
			d[i].writeOutput();
			d[i].move();
			System.out.print("\n");
		}
		System.out.println("\n<<Cat List>>");
		for(int i=0;i<=2;i++) { //cat���� ���� ��� ���� �ݺ���
			c[i].writeOutput();
			c[i].move();
			System.out.print("\n");
		}
		
		System.out.println("\n*Dogs older than 2 years and no boostershot are...");
		for(int i=0;i<=2;i++) { //��� index i�� ���� Ȯ���ؾߵǹǷ� �ݺ�
			if((d[i].getAge()>2)&&(d[i].getBoosterShot()==false)) { //���̰� �� �캸�� ���� boosterShot���� false�̸�
				System.out.print(d[i].getName()+" "); //�̸� ���
			}
		}
		System.out.println("\n*Black cates weighs more than or equls to 3kg are...");
		for(int i=0;i<=2;i++) { //��� index i�� ���� Ȯ���ؾߵǹǷ� �ݺ���
			if((c[i].getWeight()>=3)&&(c[i].getColor().equalsIgnoreCase("black"))) { //���԰� 3�̻��̰� ������ ���̸�
				System.out.print(c[i].getName()+" "); //�̸� ���
			}
		}
		kbd.close();
	}

}
