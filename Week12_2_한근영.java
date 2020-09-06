import java.awt.*; //java.awt 패키지에 있는 모든 클래스 끌어오기
import java.awt.event.*; //java.awt.event에 있는 모든 클래스 끌어오기
import javax.swing.*; //java.swing 패키지에 있는 모든 클래스 끌어오기

class MyCar extends JFrame implements ActionListener{ //JFrame을 상속받고 ActionListener를 구현한 클래스(아래의 Week12_2_한근영 class가 public이므로 여기서는 그냥 default로)
	JRadioButton red;
	JRadioButton green;
	JRadioButton blue;
	
	public MyCar() { //생성자
		setTitle("MyCar-한근영"); //frame title
		Toolkit tk = getToolkit(); //toolkit 가져오기
		Dimension d = tk.getScreenSize(); // screen의 가로 세로 크기 얻어오기
		int screenHeight = d.height;
		int screenWidth = d.width;
		setSize(500,350); //frame size 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box누르면 프로그램이 종료될 수 있도록
		setResizable(false); //frame size 고정
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame이 화면의 정중앙에 위치하도록
		
		drawP centerP = new drawP(); //drawP class 객체 생성(참조변수 centerP)
		add(centerP, BorderLayout.CENTER); //centerP를 frame의 center에 붙이기
		
		JPanel southP = new JPanel(); //southP라는 panel 생성
		red = new JRadioButton("RED",true); //빨강을 나타내는 radioButton 생성, 빨강으로 초기화
		green = new JRadioButton("GREEN"); //초록을 나타내는 radioButton 생성
		blue = new JRadioButton("BLUE"); //파랑을 나타내는 radioButton 생성
		ButtonGroup bg = new ButtonGroup(); //buttonGroup 생성(red,green,blue 셋 중 하나만 선택가능하도록 하기 위해)
		bg.add(red); //버튼그룹에 red radioButton 추가
		bg.add(green); //버튼그룹에 green radioButton 추가
		bg.add(blue); //버튼 그룹에 blue radioButton 추가
		southP.add(red); //southP panel에 red 추가
		southP.add(green); //southP panel에 green 추가
		southP.add(blue); //southP panel에 blue 추가
		JButton paintB = new JButton("Paint"); //버튼 생성
		paintB.addActionListener(this); //paintB button에 event listener register
		southP.add(paintB); //paintB 버튼을 southP panel에 붙이기
		add(southP, BorderLayout.SOUTH); //southP panel을 frame의 south에 붙이기
		setVisible(true); //이러한 것들이 모두 보이도록
	}
	
	class drawP extends JPanel{ //JPanel을 상속받은 클래스(여기도 그냥 default로), drawP가 종이 역할
	public void paint(Graphics g) { //g가 펜 역할
		if(red.isSelected()) g.setColor(Color.red); //만약 red radioButton이 선택되면 g의 색깔을 빨강으로 지정
		else if(green.isSelected()) g.setColor(Color.green); //만약 green radioButton이 선택되면 g의 색깔을 초록으로 지정
		else if(blue.isSelected()) g.setColor(Color.blue); //만약 blue radioButton이 선택되면 g의 색깔을 파랑으로 지정
		
		g.fillRect(170, 50, 140, 60); //위에서 지정된 색깔로 채워진 사각형 그리기
		g.fillRect(100, 110, 280, 100); //위체서 지정된 색깔로 채워진 사각형 그리기
		g.setColor(Color.black); //g의 색깔을 검정으로 지정
		g.drawArc(260, 80, 60, 240, 60, 60); //자동차의 눈 그리기
		g.setColor(Color.lightGray); //g의 색깔을 lightGray로 지정
		g.fillOval(140, 175, 70, 70); //바퀴 그리기
		g.fillOval(270, 175, 70, 70); //바퀴 그리기
	}
	}
	
	public void actionPerformed(ActionEvent e) { //버튼을 눌러서 event 발생할 경우 event 처리
		repaint(); //paint()메서드 호출하기 위해
	}
}

public class Week12_2_한근영 {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		new MyCar(); //MyCar로 객체 생성(참조변수는 딱히 필요없으므로 참조변수 선언은 하지 않음)

	}

}
