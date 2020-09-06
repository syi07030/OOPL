
public class MenuOrder {
	//System.out.println("===============");
	//System.out.println("전공: 사이버보안");
	//System.out.println("학번: 1971090");
	//System.out.println("성명: 한근영");
	//System.out.println("===============");

	private int cokePrice; //private한 멤버 변수 cokePrice, lemonadePrice, coffeePrice는 한꺼번에 setPrice라는 메서드를 setter method로 사용
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney; //private한 멤버 변수로 getter, setter 메서드 필요, main class에서 입력자가 지불한 값이 저장
	private String drinkSelected; //private한 멤버 변수로 getter,setter 메서드 필요, main class에서 실제로 입력자가 선택한 음료 이름이 저장
	public int money; //setMenuPrice(),showResult()메서드에서 필요한 변수
	
	public void setInputMoney(int realmoney) { //inputMoney에 대한 setter 메서드
		inputMoney= realmoney;
	}
	public int getInputMoney() { //inputMoney에 대한 getter 메서드
		return inputMoney;
	}
	public void setDrinkSelected(String drink) { //drinkSelected에 대한 setter 메서드
		drinkSelected= drink;
	}
	public String getDrinkSelected() { //drinkSelected에 대한 getter 메서드
		return drinkSelected;
	}
	public void setPrice(String menu,int price) { //각 음료 메뉴에 따른 가격 지정하는 메서드
		switch(menu) {
		case "coke": //메뉴 이름이 "coke"라면 인자로 받은 price값을 cokePrice에 저장
			cokePrice=price;
			break;
		case "lemonade": //메뉴 이름이 "lemonade"라면 인자로 받은 price값을 lemonadePrice에 저장
			lemonadePrice=price;
			break;
		case "coffee": //메뉴 이름이 "coffee"라면 인자로 받은 price값을 coffeePrice에 저장
			coffeePrice=price;
			break;
		}
	}
	public void setMenuPrice() { //입력자가 음료를 골랐을 때 public 멤버 변수인 money에 선택한 음료에 지정되어 있던 값을 저장하는 메서드
		switch(drinkSelected) { //main class에서 객체 내의 drinkSelected에 저장된 문자열에 따라
		case "Coke": //drinkSelected가 "Coke"라면 변수 money에 cokePrice값을 저장
			money=cokePrice;
			break;
		case "Lemonade": //"Lemonade"라면 money에 lemonadePrice값을 저장
			money=lemonadePrice;
			break;
		case "Coffee": //"Coffee"도 마찬가지 money에 coffeePrice값을 저장
			money=coffeePrice;
			break;
			
		}
	}
	public void showMenu() { //음료 메뉴와 각각의 가격을 출력해주는 메서드
		System.out.println("--- 음료를 선택하세요 ---");
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	public void showResult(int price) { //결과를 보여주는 메서드
		System.out.println(drinkSelected+"를 선택하셨습니다.");
		int diff=0;
		//money는 입력자가 선택한 음료의 가격, price는 main class에서 보면 객체에서 입력자가 지불한 값인 inputMoney의 값
		if(money>price) { //입력자가 선택한 음료의 가격이 지불한 값보다 클 경우
			diff=money-price; //money와 price값 차이를 저장
			System.out.println(diff+"원 더 넣어주세요."); //차이만큼의 돈을 더 넣어달라고 출력
		}
		else if(money<price) { //입력자가 선택한 음료의 가격이 지불한 값보다 작을 경우
			diff=price-money; //price와 money 값 차이를 저장
			System.out.println("잔돈은 "+diff+"원입니다."); //차이만큼의 돈을 잔돈으로 출력
		}
		
	}

}
