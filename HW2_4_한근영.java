import java.awt.*; //java.awt�� ��� Ŭ����  �������
import java.awt.event.*; //java.awt.event�� ��� Ŭ���� �������
import javax.swing.*; //java.swing�� ��� Ŭ���� �������

class Score extends JFrame implements ActionListener{ //JFrame�� ��ӹް� ActionListener�� ������ Ŭ����(�ؿ��� public class�� �����Ƿ� ���⼭�� �׳� default)
	JTextField korT; //���� ���� �Է��� textfield
	JTextField engT; //���� ���� �Է��� textfield
	JTextField mathT; //���� ���� �Է��� textfield
	
	Score(){ //������
		setTitle("Score Graph"); //frame title
		Toolkit tk = getToolkit(); //toolkit ��������
		Dimension d = tk.getScreenSize(); // screen�� ���� ���� ũ�� ������
		int screenHeight = d.height;
		int screenWidth = d.width;
		setSize(500,400); //frame size ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box������ ���α׷��� ����� �� �ֵ���
		setResizable(false); //frame size ����
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame�� ȭ���� ���߾ӿ� ��ġ�ϵ���
		
		drawGraph graph = new drawGraph(); //drawGraph inner Ŭ������ �̿��ؼ� ��ü ����(paint() ����)
		add(graph,BorderLayout.CENTER); //graph�� frame�� ����� ���̱�
		
		JPanel southP = new JPanel(); //frame�� ���ʿ� ���� panel ����
		JLabel kor = new JLabel("Kor"); //���� label
		korT = new JTextField(5); //textField ���� ����
		korT.setEditable(true); //TextField ���� �����ϵ���
		JLabel eng = new JLabel("Eng"); //���� label
		engT = new JTextField(5); //textfield ���� ����
		engT.setEditable(true); //TextField ���� �����ϵ���
		JLabel math = new JLabel("Math"); //���� label
		mathT = new JTextField(5); //textfield ���� ����
		mathT.setEditable(true); //TextField ���� �����ϵ���
		JButton show = new JButton("Show Graph"); //��ư ����
		show.addActionListener(this); //show ��ư�� actionListener ���
		//�гο� �󺧰� ��ư, textField ���̱�
		southP.add(kor); 
		southP.add(korT);
		southP.add(eng);
		southP.add(engT);
		southP.add(math);
		southP.add(mathT);
		southP.add(show);
		add(southP,BorderLayout.SOUTH); //�г��� frame�� ���ʿ� ���̱�
		
		setVisible(true); //�� ��� �͵��� ���̵���
	}
	
	public void actionPerformed(ActionEvent e) { //��ư ������ �߻��ϴ� �̺�Ʈ ó�� �޼���
		repaint(); //paint()�޼��� ȣ��
	}
	
	 class drawGraph extends JPanel{ //JPanel�� ��ӹ޴� inner Ŭ����
		 public void paint(Graphics g) {//paint()�޼���, g�� �� ����
			 
			 g.setColor(Color.white); //g�� ���� ������� ����
			 g.fillRect(0, 0, 500, 400); //ä���� �簢�� �׸���(�� ��� ����)
			 g.setColor(Color.black); //g�� ���� ���������� ����
			 
			 g.drawLine(110, 70, 110, 280); //�׷����� y�� �׸���
			 g.drawLine(110, 280, 390, 280); //�׷����� x�� �׸���
			 for(int i=0;i<10;i++) {
			 g.drawLine(110, 260-i*20, 390, 260-i*20); //�׷����� ���� ǥ�ü� 10�� �׸���
			 }
			 //10~100 ǥ�� ���ڿ� kor,eng, math �۾� �׸���
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
			 
			 int ch=0;//�Է� �� ���� üũ�ϱ� ���� ����
			 try { //try-catch��
			 int numK=Integer.parseInt(korT.getText()); //korT�κ��� ������ ���ڿ��� ���������� ��ȯ�ؼ� ����
			 int numE=Integer.parseInt(engT.getText()); //engT�κ��� ������ ���ڿ��� ���������� ��ȯ�ؼ� ����
			 int numM=Integer.parseInt(mathT.getText());//mathT�κ��� ������ ���ڿ��� ���������� ��ȯ�ؼ� ����
			 if(numK>=0 && numK<=100 && numE>=0 && numE<=100 && numM>=0 && numM<=100) { //���� ���ڵ��� ��� 0�̻� 100���ϸ� �����Ѵٸ�
			 g.setColor(Color.red);//g�� ������ �������� ����
			 //����,����,���� ���� �˸´� ������ �׷��� �׸���
			 g.fillRect(168, 280-2*numK, 10, 2*numK);
			 g.fillRect(248, 280-2*numE, 10, 2*numE);
			 g.fillRect(335, 280-2*numM, 10, 2*numM);
			 }
			 else {
				 ch=1;//ch�� 1�� �ٲٰ�
				 throw new Exception(); //���� ������
				
			 }
			 }catch(Exception e) { //exception handling-�ᱹ ���ڰ� �ƴ� �ٸ� ���ڸ� �Է����� ���, ���� �� ���� ����� ����
				 if(korT.getText().length()!=0 || engT.getText().length()!=0 || mathT.getText().length()!=0)//textfield �� �ϳ��� �Է��� �Ǿ��ִٸ� 
					 g.drawString("Wrong Input", 220, 40); //wrong input ���
				 if(ch==1)  g.drawString("Wrong Input", 220, 40); //���� �� �ϳ��� ������ ����ٸ� wrong input �׸���
			 }
			 
		 }
	 }
}

public class HW2_4_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		new Score(); //Score Ŭ������ ��ü ����(���������� �ʿ����� �ʾƼ� ���� ���� ����)

	}

}
