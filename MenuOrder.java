
public class MenuOrder {
	//System.out.println("===============");
	//System.out.println("����: ���̹�����");
	//System.out.println("�й�: 1971090");
	//System.out.println("����: �ѱٿ�");
	//System.out.println("===============");

	private int cokePrice; //private�� ��� ���� cokePrice, lemonadePrice, coffeePrice�� �Ѳ����� setPrice��� �޼��带 setter method�� ���
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney; //private�� ��� ������ getter, setter �޼��� �ʿ�, main class���� �Է��ڰ� ������ ���� ����
	private String drinkSelected; //private�� ��� ������ getter,setter �޼��� �ʿ�, main class���� ������ �Է��ڰ� ������ ���� �̸��� ����
	public int money; //setMenuPrice(),showResult()�޼��忡�� �ʿ��� ����
	
	public void setInputMoney(int realmoney) { //inputMoney�� ���� setter �޼���
		inputMoney= realmoney;
	}
	public int getInputMoney() { //inputMoney�� ���� getter �޼���
		return inputMoney;
	}
	public void setDrinkSelected(String drink) { //drinkSelected�� ���� setter �޼���
		drinkSelected= drink;
	}
	public String getDrinkSelected() { //drinkSelected�� ���� getter �޼���
		return drinkSelected;
	}
	public void setPrice(String menu,int price) { //�� ���� �޴��� ���� ���� �����ϴ� �޼���
		switch(menu) {
		case "coke": //�޴� �̸��� "coke"��� ���ڷ� ���� price���� cokePrice�� ����
			cokePrice=price;
			break;
		case "lemonade": //�޴� �̸��� "lemonade"��� ���ڷ� ���� price���� lemonadePrice�� ����
			lemonadePrice=price;
			break;
		case "coffee": //�޴� �̸��� "coffee"��� ���ڷ� ���� price���� coffeePrice�� ����
			coffeePrice=price;
			break;
		}
	}
	public void setMenuPrice() { //�Է��ڰ� ���Ḧ ����� �� public ��� ������ money�� ������ ���ῡ �����Ǿ� �ִ� ���� �����ϴ� �޼���
		switch(drinkSelected) { //main class���� ��ü ���� drinkSelected�� ����� ���ڿ��� ����
		case "Coke": //drinkSelected�� "Coke"��� ���� money�� cokePrice���� ����
			money=cokePrice;
			break;
		case "Lemonade": //"Lemonade"��� money�� lemonadePrice���� ����
			money=lemonadePrice;
			break;
		case "Coffee": //"Coffee"�� �������� money�� coffeePrice���� ����
			money=coffeePrice;
			break;
			
		}
	}
	public void showMenu() { //���� �޴��� ������ ������ ������ִ� �޼���
		System.out.println("--- ���Ḧ �����ϼ��� ---");
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	public void showResult(int price) { //����� �����ִ� �޼���
		System.out.println(drinkSelected+"�� �����ϼ̽��ϴ�.");
		int diff=0;
		//money�� �Է��ڰ� ������ ������ ����, price�� main class���� ���� ��ü���� �Է��ڰ� ������ ���� inputMoney�� ��
		if(money>price) { //�Է��ڰ� ������ ������ ������ ������ ������ Ŭ ���
			diff=money-price; //money�� price�� ���̸� ����
			System.out.println(diff+"�� �� �־��ּ���."); //���̸�ŭ�� ���� �� �־�޶�� ���
		}
		else if(money<price) { //�Է��ڰ� ������ ������ ������ ������ ������ ���� ���
			diff=price-money; //price�� money �� ���̸� ����
			System.out.println("�ܵ��� "+diff+"���Դϴ�."); //���̸�ŭ�� ���� �ܵ����� ���
		}
		
	}

}
