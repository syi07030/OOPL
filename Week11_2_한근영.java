import javax.swing.*;//java.swing 패키지에 있는 모든 클래스 끌어오기
import java.awt.*;//java.awt 패키지에 있는 모든 클래스 끌어오기

class StudentInformation extends JFrame{//JFrame 상속받은 클래스(밑에 public 클래스 있기 때문에 여기서는 default로)
	public StudentInformation() {//생성자
		setTitle("Student Information");//화면 창의 제목은 Calculator
		setSize(350,200);//화면 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box누르면 프로그램이 종료될 수 있도록
		
		JLabel title = new JLabel("STUDENT INFORMATION"); //label 생성
		title.setHorizontalAlignment(JLabel.CENTER); //label 가운데 정렬
		add(title,BorderLayout.NORTH); //이 label을 Frame의 borderLayout 위쪽에 추가
		
		JPanel centerPanel = new JPanel(); //Frame의 BorderLayout에서 가운데에 위치할 panel 생성
		centerPanel.setLayout(new GridLayout(0,2));//이 panel의 레이아웃을 GridLayout으로 설정
		
		JLabel nameL = new JLabel("NAME"); //이름을 나타내는 label 생성
		JTextField nameT = new JTextField(10); //이름 label 옆에 위치할 textField 생성
		nameT.setEditable(true); //textField 수정 가능하도록
		centerPanel.add(nameL); //centerPanel에 생성한 label 추가
		centerPanel.add(nameT); //centerPanel에 생성한 TextField 추가
		
		JLabel genderL = new JLabel("GENDER"); //성을 나타내는 label 생성
		centerPanel.add(genderL); //centerPanel에 생성한 label 추가
		
		JPanel buttonP = new JPanel(); //radiobutton들을 추가할 또 다른 panel 생성
		buttonP.setLayout(new GridLayout(0,2)); //이 panel도 GridLayout으로 설정
		JRadioButton male = new JRadioButton("Male"); //남성을 나타내는 radioButton 생성
		JRadioButton female = new JRadioButton("Female",true); //여성을 나타내는 radioButton 생성(여성으로 초기화)
		ButtonGroup bg = new ButtonGroup(); //buttonGroup 생성(남성, 여성 둘 중 하나만 선택가능하도록 하기 위해)
		bg.add(male); //버튼그룹에 male radioButton 추가
		bg.add(female); //버튼그룹에 female radioButton 추가
		buttonP.add(male); //buttonP panel에 male 추가
		buttonP.add(female); //buttonP panel에 female 추가
		centerPanel.add(buttonP); //이 buttonP panel 자체를 centerPanel panel에 추가 
		
		JLabel idL = new JLabel("ID"); //id 나타내는 label 생성
		JTextField idT = new JTextField(10); //TextField 생성
		nameT.setEditable(true); //TextField 편집 가능하도록
		centerPanel.add(idL); //centerPanel에 label 추가
		centerPanel.add(idT); //centerPanel에 textField 추가
		
		JLabel departmentL = new JLabel("DEPARTMENT"); //department 나타내는 label 생성
		JTextField departmentT = new JTextField(10); //department 나타내는 textField 생성
		nameT.setEditable(true); //생성한 textField가 편집 가능하도록
		centerPanel.add(departmentL); //label을 centerPanel에 추가
		centerPanel.add(departmentT); //textField를 centerPanel에 추가
		
		add(centerPanel,BorderLayout.CENTER); //이 centerPanel을 frame의 BorderLayout의 중앙에 추가
		
		JPanel southPanel = new JPanel(); //borderLayout 아래에 추가할 panel 생성
		JButton save = new JButton("Save"); //save 버튼 생성
		JButton cancel = new JButton("Cancel"); //cancel 버튼 생성
		southPanel.add(save); //save 버튼 southPanel에 추가
		southPanel.add(cancel); //cancel 버튼 southPanel에 추가
		
		add(southPanel,BorderLayout.SOUTH); //southPanel을 frame의 BorderLayout의 아래쪽에 추가
		
		setVisible(true); //위에 설정한 것들이 모두 보이도록
	}
	
}
	
public class Week11_2_한근영 {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971090");
		System.out.println("성명: 한근영");
		System.out.println("==============="); 
		
		new StudentInformation(); //StudentInformation 객체 생성(이 인스턴스를 가리키는 참조변수는 딱히 필요없어서 참조변수 선언 안 함)

	}
}
