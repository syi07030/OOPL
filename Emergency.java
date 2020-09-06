//	System.out.println("===============");
//	System.out.println("전공: 사이버보안");
//	System.out.println("학번: 1971090");
//	System.out.println("성명: 한근영");
//	System.out.println("===============");

//Week6_2와 관련된 클래스
public class Emergency {
	public int i; //emgList 배열의 인덱스를 나타내기 위한 변수
	public Car[] emgList = new Car[10]; //Car 타입의 참조변수 배열(크기는 10)
	public void EM_Call(Car c) { //인자로 Car 타입을 받음 -> Car의 자손 타입도 모두 가능
		if(c instanceof PoliceCar) { //c의 실제 타입이 PoliceCar 타입 또는 그것의 자손 클래스로 만든 객체면 
			System.out.println("call 112"); //112 출력
		}
		else if (c instanceof Car) { //c의 실제 타입이 Car 타입 또는 그것의 자손 클래스 타입이면(위에서 if문으로 PoliceCar 타입을 한 번 확인했기 때문에
			                         //여기서는 FireEngine 또는 Ambulance 타입이면)
			System.out.println("call 119");//119 출력
		}
		emgList[i]=c;//객체 배열의 인스턴스에 c 저장 -> c가 결국 메인 메서드에서 어떤 객체를 가리키는 참조변수이므로 이 주소를 배열에 저장함으로써 객체를 연결시켜 줌
		i++; //인덱스 값 증가
	}
	
	public void EM_record() {//배열의 모든 인스턴스들을 출력하는 메서드
		System.out.println("Emergency\tNumber\t\tCar_Type\tRequird");
		for(int j=0;j<i;j++) { //반복문 이용해서 emgList를 getStr()로 다 출력
			System.out.println(emgList[j].getStr());
		}
	}

}
