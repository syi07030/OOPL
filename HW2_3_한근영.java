import javax.swing.*; //javax.swing에 있는 모든 클래스 끌어오기
import java.awt.event.*; //java.awt.event에 있는 모든 클래스 끌어오기
import java.util.StringTokenizer; //java.util.StringTokenizer 클래스 끌어오기
import java.awt.*; //java.awt에 있는 모든 클래스 끌어오기

class Calculator extends JFrame{ //JFrame을 상속받는 클래스(아래에서 public class를 이미 선언했으므로 여기서는 그냥 default)
	JButton zero = new JButton("0"); //버튼 0~9까지 생성
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	
	JButton plus = new JButton("+"); //버튼 + 생성
	JButton minus = new JButton("-"); //버튼 - 생성
	JButton multiple = new JButton("*"); //버튼 * 생성
	JButton divide = new JButton("/"); //버튼 / 생성
	JButton equal = new JButton("="); //버튼 = 생성
	JButton setNew = new JButton("New"); //버튼 New 생성
	
	JTextField space; //textfield space 참조변수 선언
	JPanel centerPanel; // panel 참조변수 선언
	
	public Calculator() { //생성자
		setTitle("Calculator"); //제목 설정
		setSize(300,200); //크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box누르면 프로그램이 종료될 수 있도록
		setResizable(false); //size 고정
		
		JPanel northPanel = new JPanel(); //Frame의 BorderLayout에서 위쪽에 위치할 패널 생성
		northPanel.setLayout(new GridLayout(0,1)); //이 panel의 레이아웃을 GridLayout으로 설정
		space = new JTextField(30); //TextField 생성
		space.setHorizontalAlignment(JTextField.RIGHT); //TextField에 데이터 입력 시 오른쪽 정렬
		space.setEditable(true); //TextField 편집 가능하도록
		northPanel.add(space); //panel에 생성한 TextField 추가
		add(northPanel,BorderLayout.NORTH); //이 panel 자체를 frame의 borderLayout 위쪽에 추가
		
		centerPanel = new JPanel(); //Frame의 BorderLayout에서 가운데에 위치할 패널 생성
		centerPanel.setLayout(new GridLayout(0,4)); //이 panel의 레이아웃을 GridLayout으로 설정
		//makeButton()호출하여 버튼 생성하고 centerPanel에 추가
		putButton(seven);
		putButton(eight);
		putButton(nine);
		putButton(divide);
		putButton(four);
		putButton(five);
		putButton(six);
		putButton(multiple);
		putButton(one);
		putButton(two);
		putButton(three);
		putButton(minus);
		putButton(setNew);
		putButton(zero);
		putButton(equal);
		putButton(plus);
		
		add(centerPanel,BorderLayout.CENTER); //이 centerPanel 자체를 frame의 BorderLayout 가운데 위치에 추가 
		
		setVisible(true); //이 모든 것들이 보이도록
	}
	
	public void putButton(JButton button) { //버튼 생성 및 panel에 추가하는 메서드
		button.addActionListener(new eventHandle());
		centerPanel.add(button); //생성한 button을 인자로 받은 panel, 즉 그 주소값이 가리키는 panel에 추가
	}
	
	class eventHandle implements ActionListener{
	public void actionPerformed(ActionEvent e) { //버튼을 눌러서 event 발생할 경우 event 처리
		char[] cal = new char[3]; //길이 3의 문자 배열 생성
		
		//event가 어떤 버튼에서 발생했느냐에 따라 space에 다르게 출력
		if(e.getSource()==zero) space.setText(space.getText()+zero.getText()); //space에 원래 있던 문자열과 합쳐져서 출력되도록
		else if(e.getSource()==one) space.setText(space.getText()+one.getText());
		else if(e.getSource()==two) space.setText(space.getText()+two.getText());
		else if(e.getSource()==three) space.setText(space.getText()+three.getText());
		else if(e.getSource()==four) space.setText(space.getText()+four.getText());
		else if(e.getSource()==five) space.setText(space.getText()+five.getText());
		else if(e.getSource()==six) space.setText(space.getText()+six.getText());
		else if(e.getSource()==seven) space.setText(space.getText()+seven.getText());
		else if(e.getSource()==eight) space.setText(space.getText()+eight.getText());
		else if(e.getSource()==nine) space.setText(space.getText()+nine.getText());
		else if(e.getSource()==plus) space.setText(space.getText()+plus.getText());
		else if(e.getSource()==minus) space.setText(space.getText()+minus.getText());
		else if(e.getSource()==multiple) space.setText(space.getText()+multiple.getText());
		else if(e.getSource()==divide) space.setText(space.getText()+divide.getText());
		else if(e.getSource()==equal) { //만약 equal 버튼에서 event가 발생했다면
			cal= space.getText().toCharArray(); //space에 있는 문자열 가져와서 문자 배열로 변환
			int anw=0; //+,-,* 연산 후 나오는 결과값을 저장할 변수
			double anw_d=0; //나누기 연산 후 나오는 결과값을 저장할 변수
			int num1= cal[0]-'0'; //문자 배열의 첫번째는 숫자이므로 이를 정수형으로 변환하여 저장
			int num2=cal[2]-'0'; //문자 배열의 마지막에 있는 것도 숫자이므로 이를 정수형으로 변환하여 저장
			switch(cal[1]) { //cal[1]에 있는 것은 연산자이므로 그 연산자가 무엇이냐에 따라
			case '+': anw=num1+num2; space.setText(Integer.toString(anw));break; //+이면 숫자들을 더한 값을 문자열로 변환하여 space에 setText
			case '-': anw=num1-num2; space.setText(Integer.toString(anw));break; //-이면 숫자들을 뺀 값을 문자열로 변환하여 space에 setText
			case '*': anw=num1*num2; space.setText(Integer.toString(anw));break;//*이면 숫자들을 곱한 값을 문자열로 변환하여 space에 setText
			case '/': anw_d=(double)(num1)/num2; space.setText(Double.toString(anw_d));break;// /이면 숫자들을 나눈 값을 문자열로 변환하여 space에 setText
			}
			
		}
		else if(e.getSource()==setNew) space.setText(""); //만약 setNew 버튼에서 event가 발생했다면 space를 빈칸으로 초기화
		
		}
	}
	}


public class HW2_3_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		new Calculator(); //Calculator 클래스로 객체 생성(참조변수는 필요 없어서 선언 안 함)

	}

}
