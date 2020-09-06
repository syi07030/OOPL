//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

//Week6_1과 관련된 클래스
public class Buyer {
	public int i; //item 배열에서의 인덱스 값으로 사용되는 변수
	public int money; //현재 가지고 있는 돈의 값이 저장되는 변수
	public int bonusPoint=0; //현재 가지고 있는 bonusPoint의 값이 저장되는 변수
	public int check=0; //메인 메서드에서 금액부족시 반복문을 빠져나오기 위해 필요한 변수
	public Product item[]=new Product[10]; //참조변수 item -> Product 클래스 타입의 배열 생성, 크기는 10
	public void buy(Product pd) { //Product 타입의 참조변수를 인자로 받는 메서드(메인 메서드에서 인자로 Product클래스의 자손 클래스 타입의 객체를 가리키는 참조변수가)
		if(pd.price>money) { //현재 가지고 있는 돈의 액수보다 인자로 받은 참조변수가 가리키는 객체의 price값이 더 크면
			System.out.println("\nMoney is not enough.\n");
			check=1; //check 값을 1로 바꿈
		}
		else { //현재 가지고 있는 돈의 액수가 price값보다 크거나 같으면
		System.out.println("You bought "+pd+"("+pd.price+")."); //여기서 pd는 pd가 가리키는 객체의 타입에 맞는 각각의 클래스에서 toString에서 정의한대로 출력 
		money=money-pd.price; //money 값 변화
		bonusPoint=bonusPoint+pd.bonusPoint; //bonusPoint 값 변화
		
		item[i++]=pd; //현재 인덱스 값의 item 배열에  pd(메인 메서드에서 객체를 가리키는 주소값)를 저장하고, 인덱스 값 증가
		}
	}
	public void summary() { //Shopping list, 남은 돈, 현재 bonus point 값 출력하는 메서드
		System.out.print("\nShopping List: ");
		for(int j=0;j<i;j++) { //item 배열에 저장되어 있는 모든 제품(산 제품) 이름들을 출력하는 반복문
			System.out.print(item[j]+" ");
		}
		System.out.println("\nMoney left: "+money);
		System.out.println("Current bonus point: "+bonusPoint);
	}
}
