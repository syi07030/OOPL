import java.awt.*; //java.awt�� ��� Ŭ���� �������
import java.awt.event.*; //java.awt.event�� ��� Ŭ���� �������
import javax.swing.*; //javax.swing�� ��� Ŭ���� �������


class PieChart extends JFrame implements ActionListener{ //JFrame�� ��ӹް� ActionListener�� ������ Ŭ����(�ؿ��� public class �ֱ� ������ ���⼭�� �׳� default)
	JTextField kimT; //�达 textField
	JTextField leeT; //�̾� textField
	JTextField parkT; //�ھ� textField
	JTextField etcT; //�� �� ���� textField
	
	public PieChart(){ //������
		setTitle("Pie Chart of Student names - �ѱٿ�"); //frame title
		Toolkit tk = getToolkit(); //toolkit ��������
		Dimension d = tk.getScreenSize(); // screen�� ���� ���� ũ�� ������
		int screenHeight = d.height;
		int screenWidth = d.width;
		setSize(500,400); //frame size ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box������ ���α׷��� ����� �� �ֵ���
		setResizable(false); //frame size ����
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame�� ȭ���� ���߾ӿ� ��ġ�ϵ���
		
		drawGraph graph = new drawGraph(); //drawGraph Ŭ������ ��ü ����->paint() ����
		add(graph,BorderLayout.CENTER); //graph�� frame�� ����� ���̱�
		
		JPanel southP = new JPanel(); //frame�� ���ʿ� ���� panel ����
		JLabel kim = new JLabel("Kim"); //�� �� �� ����
		kimT = new JTextField(5); //textField ���� ����
		kimT.setEditable(true); //TextField ���� �����ϵ���
		JLabel lee = new JLabel("Lee"); //�� �� �� ����
		leeT = new JTextField(5); //textField ���� ����
		leeT.setEditable(true); //TextField ���� �����ϵ���
		JLabel park = new JLabel("Park"); //�� �� �� ����
		parkT = new JTextField(5); //textField ���� ����
		parkT.setEditable(true); //TextField ���� �����ϵ���
		JLabel etc = new JLabel("Etc"); //�� �� ���� �� ����
		etcT = new JTextField(5); //textField ���� ����
		etcT.setEditable(true); //TextField ���� �����ϵ���
		JButton button = new JButton("Graph"); //��ư ����
		button.addActionListener(this); //��ư�� actionListener ���
		//�гο� �󺧰� ��ư, textField �߰�
		southP.add(kim);
		southP.add(kimT);
		southP.add(lee);
		southP.add(leeT);
		southP.add(park);
		southP.add(parkT);
		southP.add(etc);
		southP.add(etcT);
		southP.add(button);
		add(southP,BorderLayout.SOUTH);//�� �г��� frame�� ���ʿ� ���̱�
		
		setVisible(true); //�� ��� �͵��� ���̵���
	}
	
	public void actionPerformed(ActionEvent e) { //��ư Ŭ������ �� �߻��ϴ� �̺�Ʈ ó�� �޼���
		repaint(); //paint() ȣ��
	}
	
	class drawGraph extends JPanel{ //JPanel�� ��ӹ޴� inner class
		 public void paint(Graphics g) {//paint(), g�� �� ����
			 
			 g.setColor(Color.white); //g ���� �Ͼ������ ����
			 g.fillRect(0, 0, 500, 400); //ä���� �簢�� �׸���(�� ����)
			 g.setColor(Color.black);//g ���� �������� ����
			 int ch=0; //���� 100�� �Ǵ��� �� �Ǵ����� ���� ���� Ȯ�� ����
			 try {
				 int numK=Integer.parseInt(kimT.getText()); //�� �� textField�κ��� ������ ���ڿ��� ���������� ��ȯ�Ͽ� ����
				 int numL=Integer.parseInt(leeT.getText()); //�� �� textField�κ��� ������ ���ڿ��� ���������� ��ȯ�Ͽ� ����
				 int numP=Integer.parseInt(parkT.getText()); //�� �� textField�κ��� ������ ���ڿ��� ���������� ��ȯ�Ͽ� ����
				 int numE=0; //�� �� ���� ���� ������ ����
				
				 if(etcT.getText().length()==0) { //���� etcT�� �ƹ��͵� �������� �ʴٸ�
					 if(numK+numL+numP<=100 && numK+numL+numP>=0) { //���� numK+numL+numP���� 0�̻� 100���ϸ�
					 numE = 100-numK-numL-numP; //�� ����ؼ�
					 etcT.setText(Integer.toString(numE)); //���ڸ� ���ڿ��� ��ȯ�ؼ� ��Ÿ����
				 }
					 else{ //numK+numL+numP���� 0�̸�, 100�ʰ���
						 ch=1;//ch �� �ٲٰ�
						 throw new Exception(); //exception ������
					 }
				 }
				 else 
					 numE=Integer.parseInt(etcT.getText()); //etcT�κ��� ������ ���ڿ� ���������� ��ȯ�ؼ� �����ϱ�
				 if(numK+numL+numP+numE!=100) { //���� ���� 100�� �ƴϸ�
					 ch=1; //ch �� �ٲٰ�
					 throw new Exception(); //exception ������
				 }
				 else { //��ģ ���� 100�̶��
					 g.setColor(Color.yellow); //g ���� ��������� ����
					 g.drawString("YELLOW: KIMs", 350, 130); //�� ���� ���� ���ڿ� �׸���
					 int angleK = Math.round((float)(numK*3.6)); //angle ����ϱ�
					 g.fillArc(100, 70, 200, 200, 0, angleK); //ä���� ȣ �׸���
					 g.setColor(Color.red); //g ���� �������� ����
					 g.drawString("RED: LEEs", 350, 150); //�� ���� ���� ���ڿ� �׸���
					 int angleL = Math.round((float)(numL*3.6)); //angle ���
					 g.fillArc(100, 70, 200, 200, 0+angleK, angleL); //ä���� ȣ �׸���
					 g.setColor(Color.blue); //g ���� �Ķ����� ����
					 g.drawString("BLUE: PARKs", 350, 170); //�� ���� ���� ���ڿ� �׸���
					 int angleP = Math.round((float)(numP*3.6)); //angle ���
					 g.fillArc(100, 70, 200, 200, 0+angleK+angleL, angleP); //ä���� ȣ �׸���
					 g.setColor(Color.green); //g ������ �ʷ����� ����
					 g.drawString("GREEN: Etc", 350, 190); //�� �� ������ ���� ���ڿ� �׸���
					 int angleE = Math.round((float)(numE*3.6)); //angle ���
					 g.fillArc(100, 70, 200, 200, 0+angleK+angleL+angleP, angleE); //ä���� ȣ �׸���
					 
				 }
				 }catch(Exception e) { //exception handling-textField�� ���ڰ� �ƴ� �ٸ� ���ڰ� ���� ���, ��ģ ���� 100�� ���� ���
					 if(ch==1) {
						 g.drawString("Number of students is 100", 170, 300); //���� ��ģ ���� 100�� ������ ���� ���ڿ� �׸���
						 kimT.setText("0"); //textField �� 0���� �ʱ�ȭ��Ű��
						 leeT.setText("0");
						 parkT.setText("0");
						 etcT.setText("0");
					 }
					 else if(kimT.getText().length()!=0 || leeT.getText().length()!=0 || parkT.getText().length()!=0) { //���� textField �� �ϳ��� �����ִٸ� 
						 g.drawString("Input numbers of student names", 170, 300);//���� ���ڿ� ���
						 kimT.setText("0"); //textField �� 0���� �ʱ�ȭ��Ű��
						 leeT.setText("0");
						 parkT.setText("0");
						 etcT.setText("0");
					 }
				 }
		 }
	 }
}

public class HW2_5_�ѱٿ� {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		new PieChart(); //PieChart Ŭ������ ��ü ����(���������� �ʿ����� �ʾƼ� ���� �� ��)

	}

}
