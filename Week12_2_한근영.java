import java.awt.*; //java.awt ��Ű���� �ִ� ��� Ŭ���� �������
import java.awt.event.*; //java.awt.event�� �ִ� ��� Ŭ���� �������
import javax.swing.*; //java.swing ��Ű���� �ִ� ��� Ŭ���� �������

class MyCar extends JFrame implements ActionListener{ //JFrame�� ��ӹް� ActionListener�� ������ Ŭ����(�Ʒ��� Week12_2_�ѱٿ� class�� public�̹Ƿ� ���⼭�� �׳� default��)
	JRadioButton red;
	JRadioButton green;
	JRadioButton blue;
	
	public MyCar() { //������
		setTitle("MyCar-�ѱٿ�"); //frame title
		Toolkit tk = getToolkit(); //toolkit ��������
		Dimension d = tk.getScreenSize(); // screen�� ���� ���� ũ�� ������
		int screenHeight = d.height;
		int screenWidth = d.width;
		setSize(500,350); //frame size ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box������ ���α׷��� ����� �� �ֵ���
		setResizable(false); //frame size ����
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame�� ȭ���� ���߾ӿ� ��ġ�ϵ���
		
		drawP centerP = new drawP(); //drawP class ��ü ����(�������� centerP)
		add(centerP, BorderLayout.CENTER); //centerP�� frame�� center�� ���̱�
		
		JPanel southP = new JPanel(); //southP��� panel ����
		red = new JRadioButton("RED",true); //������ ��Ÿ���� radioButton ����, �������� �ʱ�ȭ
		green = new JRadioButton("GREEN"); //�ʷ��� ��Ÿ���� radioButton ����
		blue = new JRadioButton("BLUE"); //�Ķ��� ��Ÿ���� radioButton ����
		ButtonGroup bg = new ButtonGroup(); //buttonGroup ����(red,green,blue �� �� �ϳ��� ���ð����ϵ��� �ϱ� ����)
		bg.add(red); //��ư�׷쿡 red radioButton �߰�
		bg.add(green); //��ư�׷쿡 green radioButton �߰�
		bg.add(blue); //��ư �׷쿡 blue radioButton �߰�
		southP.add(red); //southP panel�� red �߰�
		southP.add(green); //southP panel�� green �߰�
		southP.add(blue); //southP panel�� blue �߰�
		JButton paintB = new JButton("Paint"); //��ư ����
		paintB.addActionListener(this); //paintB button�� event listener register
		southP.add(paintB); //paintB ��ư�� southP panel�� ���̱�
		add(southP, BorderLayout.SOUTH); //southP panel�� frame�� south�� ���̱�
		setVisible(true); //�̷��� �͵��� ��� ���̵���
	}
	
	class drawP extends JPanel{ //JPanel�� ��ӹ��� Ŭ����(���⵵ �׳� default��), drawP�� ���� ����
	public void paint(Graphics g) { //g�� �� ����
		if(red.isSelected()) g.setColor(Color.red); //���� red radioButton�� ���õǸ� g�� ������ �������� ����
		else if(green.isSelected()) g.setColor(Color.green); //���� green radioButton�� ���õǸ� g�� ������ �ʷ����� ����
		else if(blue.isSelected()) g.setColor(Color.blue); //���� blue radioButton�� ���õǸ� g�� ������ �Ķ����� ����
		
		g.fillRect(170, 50, 140, 60); //������ ������ ����� ä���� �簢�� �׸���
		g.fillRect(100, 110, 280, 100); //��ü�� ������ ����� ä���� �簢�� �׸���
		g.setColor(Color.black); //g�� ������ �������� ����
		g.drawArc(260, 80, 60, 240, 60, 60); //�ڵ����� �� �׸���
		g.setColor(Color.lightGray); //g�� ������ lightGray�� ����
		g.fillOval(140, 175, 70, 70); //���� �׸���
		g.fillOval(270, 175, 70, 70); //���� �׸���
	}
	}
	
	public void actionPerformed(ActionEvent e) { //��ư�� ������ event �߻��� ��� event ó��
		repaint(); //paint()�޼��� ȣ���ϱ� ����
	}
}

public class Week12_2_�ѱٿ� {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		new MyCar(); //MyCar�� ��ü ����(���������� ���� �ʿ�����Ƿ� �������� ������ ���� ����)

	}

}
