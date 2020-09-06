import javax.swing.JOptionPane;//간단한 popup dialog window를 사용하기 위해 JOptionPane class 끌어오기

class SA{//thread들이 공동구역으로 사용하기 위한 클래스(아래에서 public class를 이미 정의했으므로 여기서는 default)
	public String[] words = new String[] {"spring","summer","fall","winter","happy","love","dog","cat",
			"bird","hot","cold","apple","cake","tea","java"};//문자열 15개를 저장해 놓은 문자열 배열
	String testWord=null;//콘솔 창에 임의로 뜨는 문자열을 저장하기 위한 문자열 변수
	public int check=0;//thread가 종료되었음을 알려주기 위한 변수
}

class MyThread extends Thread{//Thread 클래스를 상속받은 클래스(아래에서 public class 이미 정의했으므로 여기서는 그냥 default로)
	SA sh;//공동구역에 데이터를 저장하고 사용하기 위한 객체 생성
	public boolean stop;//프로그램을 간접적으로 종료시키기 위해 필요한 변수
	public int i=0;//문자열 배열의 인덱스로 사용되는 변수
	
	public void setStop(boolean stop) {//프로그램을 간접적으로 종료시기기 위해 필요한 메서드
		this.stop=stop;
	}
	public void run() {
		for(int j=0;j<20;j++) {//20번 반복
			if(stop==true) break;//만약 stop이 true이면 반복문을 나감, 즉 thread 종료
			i=(int)(Math.random()*15); //0~14까지의 숫자 중 랜덤으로 정해서 저장
			System.out.printf("%s\n",sh.words[i]);//콘솔 창에 sh에 있는 문자열 배열에서 임의의 문자열을 출력
			sh.testWord=sh.words[i];//임의로 출력된 문자열을 공동구역 sh에 있는 testWord에 저장
		try {
			sleep(1000);//1초 동안 thread의 동작을 멈춤

		}catch(InterruptedException e) {//sleep()가 있으므로 예외처리
			System.out.println("InterruptedException");
		}
	}
		if(stop==false) {//20번 반복했는데도 stop이 여전히 false라면
			sh.check=1;//공동구역의 sh에 있는 변수 check의 값을 1로 바꾸고
			System.out.println("실패!");//실패 출력
		}
	}
	
}

public class Week13_2_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		MyThread th = new MyThread(); //thread 생성
		SA sa = new SA(); //공동구역으로 사용할 객체 sa 생성
		th.sh=sa;//th의 sh가 sharea를 가리킬 수 있도록(주소값을 대입함으로써 같은 객체를 가리킨다)
		th.start(); //th thread 시작
		
		while(true) {//계속 반복
			String st = JOptionPane.showInputDialog("문자열 입력");//window창에서 사용자가 입력하는 문자열 저장
			if(sa.check==1) break;//공동으로 사용하는 객체의 check값이 1이면 반복문 빠져나감, 즉 종료
			System.out.println("<"+st+">을 입력하셨습니다.");//콘솔창에서 사용자가 입력한 문자열 출력
			if(st.equals(sa.testWord)) {//만약 사용자가 입력한 문자열이 sa에 저장되어 있는 testWord와 내용이 똑같다면
				System.out.println("성공!\nTimer is stopped.");
				th.setStop(true);//stop의 값을 true로 바꿔주고
				break;//반복문 빠져나감,종료
			}
			
		}
	}
}