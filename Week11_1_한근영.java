import javax.swing.*; //java.swing 패키지에 있는 모든 클래스 끌어오기
import java.awt.*; //java.awt 패키지에 있는 모든 클래스 끌어오기

class Calculator extends JFrame{ //JFrame 상속받은 클래스(밑에 public 클래스 있기 때문에 여기서는 default로)
	public Calculator() { //생성자
		setTitle("Calculator"); //화면 창의 제목은 Calculator
		setSize(300,200); //화면 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box누르면 프로그램이 종료될 수 있도록
		
		JPanel northPanel = new JPanel(); //Frame의 BorderLayout에서 가장 위쪽에 위치할 패널 생성
		northPanel.setLayout(new GridLayout(0,1)); //이 panel의 레이아웃을 GridLayout으로 설정
		JTextField space = new JTextField(30); //TextField 생성
		space.setHorizontalAlignment(JTextField.RIGHT); //TextField에 데이터 입력 시 오른쪽 정렬
		space.setEditable(true); //TextField 편집 가능하도록
		northPanel.add(space); //panel에 생성한 TextField 추가
		add(northPanel,BorderLayout.NORTH); //이 panel 자체를 frame의 borderLayout 위쪽에 추가
		
		JPanel centerPanel = new JPanel(); //Frame의 BorderLayout에서 가운데에 위치할 패널 생성
		centerPanel.setLayout(new GridLayout(0,4,2,0)); //이 panel의 레이아웃을 GridLayout으로 설정
		//makeButton()호출하여 버튼 생성하고 centerPanel에 추가
		makeButton("ON",centerPanel);
		makeButton("AC",centerPanel);
		makeButton("C",centerPanel);
		makeButton("OFF",centerPanel);
		makeButton("7",centerPanel);
		makeButton("8",centerPanel);
		makeButton("9",centerPanel);
		makeButton("/",centerPanel);
		makeButton("4",centerPanel);
		makeButton("5",centerPanel);
		makeButton("6",centerPanel);
		makeButton("X",centerPanel);
		makeButton("1",centerPanel);
		makeButton("2",centerPanel);
		makeButton("3",centerPanel);
		makeButton("-",centerPanel);
		makeButton("0",centerPanel);
		makeButton(".",centerPanel);
		makeButton("=",centerPanel);
		makeButton("+",centerPanel);
		add(centerPanel,BorderLayout.CENTER); //이 centerPanel 자체를 frame의 BorderLayout 가운데 위치에 추가 
		
		setVisible(true); //이러한 것들이 모두 보이도록
	}
	
	public void makeButton(String text, JPanel panel) { //버튼 생성 및 panel에 추가하는 메서드
		JButton button = new JButton(text); //인자로 받은 String타입의 값으로 button 생성
		panel.add(button); //생성한 button을 인자로 받은 panel, 즉 그 주소값이 가리키는 panel에 추가
	}
}

public class Week11_1_한근영 {
	public static void main(String[] args) { //메인 메서드
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		new Calculator(); //Calculator 인스턴스 생성(이 인스턴스를 가리키는 참조변수는 딱히 필요없어서 참조변수 선언 안 함)

	}

}
