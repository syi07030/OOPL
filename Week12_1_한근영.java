import javax.swing.*;//java.swing 패키지에 있는 모든 클래스 끌어오기
import java.awt.*; //java.awt 패키지에 있는 모든 클래스 끌어오기
import java.awt.event.*; //java.awt.event에 있는 모든 클래스 끌어오기

class CatchMe extends JFrame{ //JFrame 상속받은 클래스(Week12_1_한근영 class를 public으로 정의해두었기 때문에 여기서는 default로)
	public JButton click; //버튼 참조변수
	public CatchMe() { //생성자
		setTitle("나 잡아봐~라!-한근영"); //frame title 지정
		setSize(300,300); //frame size 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box누르면 프로그램이 종료될 수 있도록
		setResizable(false); //size 고정
		
		JPanel p = new JPanel(); //panel 생성
		click = new JButton("Click!"); //button 생성
		click.addMouseListener(new mouseEventHandle()); //click button에 event listener register
		p.add(click); //panel에 click button 붙이기
		add(p,BorderLayout.CENTER); //panel을 frame 가운데에 붙이기(frame은 현재 default layout인 BorderLayout)
		setVisible(true); //이러한 것들이 모두 보이도록
	}
	
	private class mouseEventHandle extends MouseAdapter{ //MouseAdapter를 상속받은 mouseEventHandle이라는 inner class
		public void mouseEntered(MouseEvent e) { //mouse가 button 영역 내에 들어와서 발생하는 이벤트 처리 메서드
			int x=(int)(Math.random()*231); //x에 0~230 사이의 랜덤 수로 초기화
			int y=(int)(Math.random()*231); //y에 0~230 사이의 랜덤 수로 초기화
			click.setLocation(x,y); //버튼의 위치를 랜덤하게 지정한 (x,y)로 이동
			System.out.println("x="+x+",\ty="+y); //이동한 랜덤 위치를 콘솔에 출력
		}
		public void mouseClicked(MouseEvent e) { //mouse가 button을 click할 때 발생하는 이벤트 처리 메서드
			System.out.println("윽,,,잡혔다ㅠㅠ"); //콘솔에 출력
		}
	}
	
	
}

public class Week12_1_한근영 {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		new CatchMe(); //CatchMe로 객체 생성(참조변수는 딱히 필요없으므로 참조변수 선언은 하지 않음)
	}

}
