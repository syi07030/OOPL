import java.awt.*; //java.awt의 모든 클래스  끌어오기
import java.awt.event.*; //java.awt.event의 모든 클래스 끌어오기
import javax.swing.*; //java.swing의 모든 클래스 끌어오기

class Score extends JFrame implements ActionListener{ //JFrame을 상속받고 ActionListener를 구현한 클래스(밑에서 public class가 있으므로 여기서는 그냥 default)
	JTextField korT; //국어 점수 입력할 textfield
	JTextField engT; //영어 점수 입력할 textfield
	JTextField mathT; //수학 점수 입력할 textfield
	
	Score(){ //생성자
		setTitle("Score Graph"); //frame title
		Toolkit tk = getToolkit(); //toolkit 가져오기
		Dimension d = tk.getScreenSize(); // screen의 가로 세로 크기 얻어오기
		int screenHeight = d.height;
		int screenWidth = d.width;
		setSize(500,400); //frame size 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box누르면 프로그램이 종료될 수 있도록
		setResizable(false); //frame size 고정
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame이 화면의 정중앙에 위치하도록
		
		drawGraph graph = new drawGraph(); //drawGraph inner 클래스를 이용해서 객체 생성(paint() 실행)
		add(graph,BorderLayout.CENTER); //graph를 frame의 가운데에 붙이기
		
		JPanel southP = new JPanel(); //frame의 남쪽에 붙일 panel 생성
		JLabel kor = new JLabel("Kor"); //국어 label
		korT = new JTextField(5); //textField 길이 지정
		korT.setEditable(true); //TextField 편집 가능하도록
		JLabel eng = new JLabel("Eng"); //영어 label
		engT = new JTextField(5); //textfield 길이 지정
		engT.setEditable(true); //TextField 편집 가능하도록
		JLabel math = new JLabel("Math"); //수학 label
		mathT = new JTextField(5); //textfield 길이 지정
		mathT.setEditable(true); //TextField 편집 가능하도록
		JButton show = new JButton("Show Graph"); //버튼 생성
		show.addActionListener(this); //show 버튼에 actionListener 등록
		//패널에 라벨과 버튼, textField 붙이기
		southP.add(kor); 
		southP.add(korT);
		southP.add(eng);
		southP.add(engT);
		southP.add(math);
		southP.add(mathT);
		southP.add(show);
		add(southP,BorderLayout.SOUTH); //패널을 frame의 남쪽에 붙이기
		
		setVisible(true); //이 모든 것들이 보이도록
	}
	
	public void actionPerformed(ActionEvent e) { //버튼 눌러서 발생하는 이벤트 처리 메서드
		repaint(); //paint()메서드 호출
	}
	
	 class drawGraph extends JPanel{ //JPanel을 상속받는 inner 클래스
		 public void paint(Graphics g) {//paint()메서드, g가 펜 역할
			 
			 g.setColor(Color.white); //g의 색깔 흰색으로 지정
			 g.fillRect(0, 0, 500, 400); //채워진 사각형 그리기(흰 배경 역할)
			 g.setColor(Color.black); //g의 색깔 검정색으로 지정
			 
			 g.drawLine(110, 70, 110, 280); //그래프의 y축 그리기
			 g.drawLine(110, 280, 390, 280); //그래프의 x축 그리기
			 for(int i=0;i<10;i++) {
			 g.drawLine(110, 260-i*20, 390, 260-i*20); //그래프의 숫자 표시선 10개 그리기
			 }
			 //10~100 표시 숫자와 kor,eng, math 글씨 그리기
			 g.drawString("100", 86, 82); 
			 g.drawString("90", 89, 102);
			 g.drawString("80", 89, 122);
			 g.drawString("70", 89, 142);
			 g.drawString("60", 89, 162);
			 g.drawString("50", 89, 182);
			 g.drawString("40", 89, 202);
			 g.drawString("30", 89, 222);
			 g.drawString("20", 89, 242);
			 g.drawString("10", 89, 262);
			 
			 g.drawString("KOR", 160, 300);
			 g.drawString("ENG", 240, 300);
			 g.drawString("MATH",320, 300);
			 
			 int ch=0;//입력 값 범위 체크하기 위한 변수
			 try { //try-catch문
			 int numK=Integer.parseInt(korT.getText()); //korT로부터 가져온 문자열을 정수형으로 변환해서 저장
			 int numE=Integer.parseInt(engT.getText()); //engT로부터 가져온 문자열을 정수형으로 변환해서 저장
			 int numM=Integer.parseInt(mathT.getText());//mathT로부터 가져온 문자열을 정수형으로 변환해서 저장
			 if(numK>=0 && numK<=100 && numE>=0 && numE<=100 && numM>=0 && numM<=100) { //만약 숫자들이 모두 0이상 100이하를 만족한다면
			 g.setColor(Color.red);//g의 색깔을 빨강으로 지정
			 //국어,영어,수학 각각 알맞는 길이의 그래프 그리기
			 g.fillRect(168, 280-2*numK, 10, 2*numK);
			 g.fillRect(248, 280-2*numE, 10, 2*numE);
			 g.fillRect(335, 280-2*numM, 10, 2*numM);
			 }
			 else {
				 ch=1;//ch값 1로 바꾸고
				 throw new Exception(); //예외 던지기
				
			 }
			 }catch(Exception e) { //exception handling-결국 숫자가 아닌 다른 문자를 입력했을 경우, 숫자 중 범위 벗어나면 실행
				 if(korT.getText().length()!=0 || engT.getText().length()!=0 || mathT.getText().length()!=0)//textfield 중 하나라도 입력이 되어있다면 
					 g.drawString("Wrong Input", 220, 40); //wrong input 출력
				 if(ch==1)  g.drawString("Wrong Input", 220, 40); //숫자 중 하나라도 범위에 벗어난다면 wrong input 그리기
			 }
			 
		 }
	 }
}

public class HW2_4_한근영 {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		new Score(); //Score 클래스로 객체 생성(참조변수는 필요하지 않아서 선언 하지 않음)

	}

}
