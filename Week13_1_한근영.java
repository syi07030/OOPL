import java.util.Scanner; //Scanner class 끌어오기

class SharedArea{ //SimulThread와 PrintThread간에 공동구역으로 사용하기 위한 클래스(밑에서 public class 이미 정의했으므로 여기서는 default)
	public double ratio; //앞면 비율을 저장할 변수
	public boolean isReady; //PrintThread가 비율을 출력해도 괜찮은지에 대한 여부를 알려주는 변수	
}

class SimulThread extends Thread{ //Thread를 상속받는 클래스(밑에서 public class 이미 정의했으므로 여기서는 default)
	SharedArea sh;//공동구역에 데이터를 저장하기 위한 객체 생성
	public int re; //던지는 횟수를 저장하기 위한 변수
	public SimulThread() {} //default 생성자
	public SimulThread(int n) { //main에서 던지는 횟수를 인자로 받아서 re에 저장하는 생성자
		re=n;
	}
	public void run() {
		double front=0; //앞면이 나오는 횟수를 저장하는 변수
		for(int i=0;i<re;i++) { //던지는 횟수만큼 반복
			int cCase=(int)Math.round(Math.random()); //0 또는 1의 값을 랜덤으로 정해서 저장
			if(cCase==1) front++; //만약 cCase의 값이 1이면 앞면이 나오는 횟수 1씩 증가
		}

		sh.ratio=front/re*100; //앞면이 나오는 비율 계산해서 공동구역 변수에 저장
		sh.isReady=true; //비율 계산해서 저장했으므로 PrintThread에서 공동구역에 접근해도 된다는 여부를 true로 바꿈
		synchronized(sh) { //동기화함으로써
			sh.notify(); //sh에서 기다리고 있는 다른 thread에게 신호를 줌
		}
	}
}

class PrintThread extends Thread{//Thread를 상속받는 클래스(밑에서 public class 이미 정의했으므로 여기서는 default)
	SharedArea sh;//공동구역의 데이터 값을 출력하기 위한 객체 생성
	public void run() {
		if(sh.isReady!=true) {//공동구역의 sh가 false라면
			try {
				synchronized(sh) {//동기화
					sh.wait();//신호가 올 때까지 기다림
				}
			}catch(InterruptedException e) {//wait()가 있으므로 예외처리
				System.out.println("예외 발생");
			}
		}
		System.out.println("Front Ratio: "+sh.ratio+"%");//신호가 올 경우 앞면 비율 값 출력
	}
	
}

public class Week13_1_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//Scanner 객체 생성
		System.out.println("Input the number of coin toss:");
		int N=kbd.nextInt(); //던질 횟수 입력 받음
		SimulThread thread1 = new SimulThread(N);//던질 횟수를 인자로 하는 생성자로 SimulThread 클래스타입의 쓰레드 생성
		PrintThread thread2 = new PrintThread();//PrintThread타입의 쓰레드 생성
		SharedArea sharea = new SharedArea();//데이터를 같이 공유할 공동구역인 SharedArea 객체 생성
		
		thread1.sh=sharea;//thread1의 sh가 sharea를 가리킬 수 있도록(주소값을 대입함으로써 같은 객체를 가리킨다)
		thread2.sh=sharea;//thread2의 sh가 sharea를 가리킬 수 있도록(주소값을 대입함으로써 같은 객체를 가리킨다)
		
		thread1.start();//thread1 시작시키기
		thread2.start(); //thread2 시작시키기

	}

}
