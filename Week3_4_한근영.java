import java.util.Scanner; //Scanner class �������

public class Week3_4_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in);//������ ���� kbd -> ScannerŬ������ ���� ��ü ����
		MenuOrder menu = new MenuOrder();//������ ���� menu -> MenuOrder Ŭ������ ���� ��ü ����
		System.out.println("--- ���ᰡ�� ���� ---");
		System.out.printf("Coke����:");
		menu.setPrice("coke", kbd.nextInt()); //"coke" ���ڿ���  kbd�� �̿��� ������ �Է¹��� �������� ���ڷ� �޾� menu�� ����Ű�� ��ü���� setPrice �޼��� ����
		System.out.printf("Lemonade����:");
		menu.setPrice("lemonade", kbd.nextInt()); //"lemonade"���ڿ��� ���� ���� ���ڷ� �ް� ������ ����
		System.out.printf("Coffee����:");
		menu.setPrice("coffee", kbd.nextInt());//"coffee"���ڿ��� ���� ���� ���ڷ� �ް� ������ ����

		String anw = "y"; //��� ���� ������ ������ ���ڿ� anw�� �ϴ� �Ʒ��� while���� �� ���� �����Ű�� ���� "y"�� ����

		while (anw.equalsIgnoreCase("y")) { //��ҹ��� ������� anw�� ����Ǿ� �ִ� ���ڿ��� "y"�̸� while�� ����
			System.out.println("\n--- ���� �������� ---");
			menu.setInputMoney(kbd.nextInt()); //menu�� ����Ű�� ��ü���� private�� ��� ������ inputMoney�� ���� �����ϱ� ���� setter �޼��� ����
			menu.showMenu(); //menu�� ����Ű�� ��ü���� showMenu()�޼��� ����
			int num;
			num = kbd.nextInt(); //int���� ���� num�� kbd�� �̿��� ���� �� �Է¹ޱ�
			switch (num) { //num�� ���� ����
			case 1: //num ���� 1�̸� menu�� ����Ű�� ��ü�� ���ؼ�
				menu.setDrinkSelected("Coke"); //private ��� ������ drinkSelected�� setter �޼��带 �̿��� "Coke" ���� 
				menu.setMenuPrice(); //setMenuPrice�޼���->��ü ���� public ��� ������money�� cokePrice ���� ���� 
				menu.showResult(menu.getInputMoney());//menu�� ����Ű�� ��ü�� inputMoney ���� getter method�� �̿��� ���ڷ� �־ showResult()�޼��� ����
				break;
			case 2: //num ���� 2�̸� ���ڷ� "Lemonade"��
				menu.setDrinkSelected("Lemonade");
				menu.setMenuPrice();
				menu.showResult(menu.getInputMoney());
				break;
			case 3://num���� 3�̸� ���ڷ� "Coffee"��
				menu.setDrinkSelected("Coffee");
				menu.setMenuPrice();
				menu.showResult(menu.getInputMoney());
				break;
			default: //num���� ���� ���鿡 �ش���� �ʴ´ٸ� ������ ���� ���
				System.out.println("���� �޴��� �����ϼ̽��ϴ�");
				break;
			}
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n)");
			kbd.nextLine(); //���ۿ� �����ִ� ���Ͱ� ��������
			anw = kbd.nextLine(); //anw�� y�Ǵ� n�� �Է¹޾Ƽ� y�̸� �ٽ� while�� �ݺ�, �ƴϸ� ����
		}

	}

}
