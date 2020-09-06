//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

//Week6_1과 관련된 클래스
public class Product { //부모 클래스, Tv, Computer, Video, Audio, Notebook을 자식 클래스로 가짐
	public int price; //가격 저장할 변수
	public int bonusPoint; //bonusPoint 값 저장할 변수
	public Product(){}//default 생성자
	public Product(int price){ //Product 생성자, 인자로 int형을 하나 받음
		this.price=price; //인자로 받은 price 값을 현재 실행되고 있는 객체의 price값에 저장
		bonusPoint=(int)(price/10.0); //bonusPoint에 계산을 해서 int형으로 형변환한 다음에 저장
	}
}
