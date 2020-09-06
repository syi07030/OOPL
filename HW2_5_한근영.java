import java.awt.*; //java.awt의 모든 클래스 끌어오기
import java.awt.event.*; //java.awt.event의 모든 클래스 끌어오기
import javax.swing.*; //javax.swing의 모든 클래스 끌어오기


class PieChart extends JFrame implements ActionListener{ //JFrame을 상속받고 ActionListener를 구현한 클래스(밑에서 public class 있기 때문에 여기서는 그냥 default)
	JTextField kimT; //김씨 textField
	JTextField leeT; //이씨 textField
	JTextField parkT; //박씨 textField
	JTextField etcT; //그 외 성씨 textField
	
	public PieChart(){ //생성자
		setTitle("Pie Chart of Student names - 한근영"); //frame title
		Toolkit tk = getToolkit(); //toolkit 가져오기
		Dimension d = tk.getScreenSize(); // screen의 가로 세로 크기 얻어오기
		int screenHeight = d.height;
		int screenWidth = d.width;
		setSize(500,400); //frame size 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box누르면 프로그램이 종료될 수 있도록
		setResizable(false); //frame size 고정
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame이 화면의 정중앙에 위치하도록
		
		drawGraph graph = new drawGraph(); //drawGraph 클래스로 객체 생성->paint() 실행
		add(graph,BorderLayout.CENTER); //graph를 frame의 가운데에 붙이기
		
		JPanel southP = new JPanel(); //frame의 남쪽에 붙일 panel 생성
		JLabel kim = new JLabel("Kim"); //김 씨 라벨 생성
		kimT = new JTextField(5); //textField 길이 지정
		kimT.setEditable(true); //TextField 편집 가능하도록
		JLabel lee = new JLabel("Lee"); //이 씨 라벨 생성
		leeT = new JTextField(5); //textField 길이 지정
		leeT.setEditable(true); //TextField 편집 가능하도록
		JLabel park = new JLabel("Park"); //박 씨 라벨 생성
		parkT = new JTextField(5); //textField 길이 지정
		parkT.setEditable(true); //TextField 편집 가능하도록
		JLabel etc = new JLabel("Etc"); //그 외 성씨 라벨 생성
		etcT = new JTextField(5); //textField 길이 지정
		etcT.setEditable(true); //TextField 편집 가능하도록
		JButton button = new JButton("Graph"); //버튼 생성
		button.addActionListener(this); //버튼에 actionListener 등록
		//패널에 라벨과 버튼, textField 추가
		southP.add(kim);
		southP.add(kimT);
		southP.add(lee);
		southP.add(leeT);
		southP.add(park);
		southP.add(parkT);
		southP.add(etc);
		southP.add(etcT);
		southP.add(button);
		add(southP,BorderLayout.SOUTH);//이 패널을 frame의 남쪽에 붙이기
		
		setVisible(true); //이 모든 것들이 보이도록
	}
	
	public void actionPerformed(ActionEvent e) { //버튼 클릭했을 때 발생하는 이벤트 처리 메서드
		repaint(); //paint() 호출
	}
	
	class drawGraph extends JPanel{ //JPanel을 상속받는 inner class
		 public void paint(Graphics g) {//paint(), g가 펜 역할
			 
			 g.setColor(Color.white); //g 색깔 하얀색으로 지정
			 g.fillRect(0, 0, 500, 400); //채워진 사각형 그리기(흰 바탕)
			 g.setColor(Color.black);//g 색깔 검정으로 지정
			 int ch=0; //합이 100이 되는지 안 되는지에 대한 여부 확인 변수
			 try {
				 int numK=Integer.parseInt(kimT.getText()); //김 씨 textField로부터 가져온 문자열을 정수형으로 변환하여 저장
				 int numL=Integer.parseInt(leeT.getText()); //이 씨 textField로부터 가져온 문자열을 정수형으로 변환하여 저장
				 int numP=Integer.parseInt(parkT.getText()); //박 씨 textField로부터 가져온 문자열을 정수형으로 변환하여 저장
				 int numE=0; //그 외 성씨 숫자 저장할 변수
				
				 if(etcT.getText().length()==0) { //만약 etcT에 아무것도 적혀있지 않다면
					 if(numK+numL+numP<=100 && numK+numL+numP>=0) { //만약 numK+numL+numP값이 0이상 100이하면
					 numE = 100-numK-numL-numP; //값 계산해서
					 etcT.setText(Integer.toString(numE)); //숫자를 문자열로 변환해서 나타내기
				 }
					 else{ //numK+numL+numP값이 0미만, 100초과면
						 ch=1;//ch 값 바꾸고
						 throw new Exception(); //exception 던지기
					 }
				 }
				 else 
					 numE=Integer.parseInt(etcT.getText()); //etcT로부터 가져온 문자열 정수형으로 변환해서 저장하기
				 if(numK+numL+numP+numE!=100) { //만약 합이 100이 아니면
					 ch=1; //ch 값 바꾸고
					 throw new Exception(); //exception 던지기
				 }
				 else { //합친 값이 100이라면
					 g.setColor(Color.yellow); //g 색깔 노란색으로 지정
					 g.drawString("YELLOW: KIMs", 350, 130); //김 씨에 대한 문자열 그리기
					 int angleK = Math.round((float)(numK*3.6)); //angle 계산하기
					 g.fillArc(100, 70, 200, 200, 0, angleK); //채원진 호 그리기
					 g.setColor(Color.red); //g 색깔 빨강으로 지정
					 g.drawString("RED: LEEs", 350, 150); //이 씨에 대한 문자열 그리기
					 int angleL = Math.round((float)(numL*3.6)); //angle 계산
					 g.fillArc(100, 70, 200, 200, 0+angleK, angleL); //채원진 호 그리기
					 g.setColor(Color.blue); //g 색깔 파랑으로 지정
					 g.drawString("BLUE: PARKs", 350, 170); //박 씨에 대한 문자열 그리기
					 int angleP = Math.round((float)(numP*3.6)); //angle 계산
					 g.fillArc(100, 70, 200, 200, 0+angleK+angleL, angleP); //채워진 호 그리기
					 g.setColor(Color.green); //g 색깔을 초록으로 지정
					 g.drawString("GREEN: Etc", 350, 190); //그 외 성씨에 대한 문자열 그리기
					 int angleE = Math.round((float)(numE*3.6)); //angle 계산
					 g.fillArc(100, 70, 200, 200, 0+angleK+angleL+angleP, angleE); //채워진 호 그리기
					 
				 }
				 }catch(Exception e) { //exception handling-textField에 숫자가 아닌 다른 문자가 있을 경우, 합친 값이 100이 넘을 경우
					 if(ch==1) {
						 g.drawString("Number of students is 100", 170, 300); //만약 합친 값이 100이 넘으면 다음 문자열 그리기
						 kimT.setText("0"); //textField 다 0으로 초기화시키기
						 leeT.setText("0");
						 parkT.setText("0");
						 etcT.setText("0");
					 }
					 else if(kimT.getText().length()!=0 || leeT.getText().length()!=0 || parkT.getText().length()!=0) { //만약 textField 중 하나라도 적혀있다면 
						 g.drawString("Input numbers of student names", 170, 300);//다음 문자열 출력
						 kimT.setText("0"); //textField 다 0으로 초기화시키기
						 leeT.setText("0");
						 parkT.setText("0");
						 etcT.setText("0");
					 }
				 }
		 }
	 }
}

public class HW2_5_한근영 {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		new PieChart(); //PieChart 클래스로 객체 생성(참조변수는 필요하지 않아서 선언 안 함)

	}

}
