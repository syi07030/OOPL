import javax.swing.*; //javax.swing�� �ִ� ��� Ŭ���� �������
import java.awt.event.*; //java.awt.event�� �ִ� ��� Ŭ���� �������
import java.util.StringTokenizer; //java.util.StringTokenizer Ŭ���� �������
import java.awt.*; //java.awt�� �ִ� ��� Ŭ���� �������

class Calculator extends JFrame{ //JFrame�� ��ӹ޴� Ŭ����(�Ʒ����� public class�� �̹� ���������Ƿ� ���⼭�� �׳� default)
	JButton zero = new JButton("0"); //��ư 0~9���� ����
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	
	JButton plus = new JButton("+"); //��ư + ����
	JButton minus = new JButton("-"); //��ư - ����
	JButton multiple = new JButton("*"); //��ư * ����
	JButton divide = new JButton("/"); //��ư / ����
	JButton equal = new JButton("="); //��ư = ����
	JButton setNew = new JButton("New"); //��ư New ����
	
	JTextField space; //textfield space �������� ����
	JPanel centerPanel; // panel �������� ����
	
	public Calculator() { //������
		setTitle("Calculator"); //���� ����
		setSize(300,200); //ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box������ ���α׷��� ����� �� �ֵ���
		setResizable(false); //size ����
		
		JPanel northPanel = new JPanel(); //Frame�� BorderLayout���� ���ʿ� ��ġ�� �г� ����
		northPanel.setLayout(new GridLayout(0,1)); //�� panel�� ���̾ƿ��� GridLayout���� ����
		space = new JTextField(30); //TextField ����
		space.setHorizontalAlignment(JTextField.RIGHT); //TextField�� ������ �Է� �� ������ ����
		space.setEditable(true); //TextField ���� �����ϵ���
		northPanel.add(space); //panel�� ������ TextField �߰�
		add(northPanel,BorderLayout.NORTH); //�� panel ��ü�� frame�� borderLayout ���ʿ� �߰�
		
		centerPanel = new JPanel(); //Frame�� BorderLayout���� ����� ��ġ�� �г� ����
		centerPanel.setLayout(new GridLayout(0,4)); //�� panel�� ���̾ƿ��� GridLayout���� ����
		//makeButton()ȣ���Ͽ� ��ư �����ϰ� centerPanel�� �߰�
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
		
		add(centerPanel,BorderLayout.CENTER); //�� centerPanel ��ü�� frame�� BorderLayout ��� ��ġ�� �߰� 
		
		setVisible(true); //�� ��� �͵��� ���̵���
	}
	
	public void putButton(JButton button) { //��ư ���� �� panel�� �߰��ϴ� �޼���
		button.addActionListener(new eventHandle());
		centerPanel.add(button); //������ button�� ���ڷ� ���� panel, �� �� �ּҰ��� ����Ű�� panel�� �߰�
	}
	
	class eventHandle implements ActionListener{
	public void actionPerformed(ActionEvent e) { //��ư�� ������ event �߻��� ��� event ó��
		char[] cal = new char[3]; //���� 3�� ���� �迭 ����
		
		//event�� � ��ư���� �߻��ߴ��Ŀ� ���� space�� �ٸ��� ���
		if(e.getSource()==zero) space.setText(space.getText()+zero.getText()); //space�� ���� �ִ� ���ڿ��� �������� ��µǵ���
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
		else if(e.getSource()==equal) { //���� equal ��ư���� event�� �߻��ߴٸ�
			cal= space.getText().toCharArray(); //space�� �ִ� ���ڿ� �����ͼ� ���� �迭�� ��ȯ
			int anw=0; //+,-,* ���� �� ������ ������� ������ ����
			double anw_d=0; //������ ���� �� ������ ������� ������ ����
			int num1= cal[0]-'0'; //���� �迭�� ù��°�� �����̹Ƿ� �̸� ���������� ��ȯ�Ͽ� ����
			int num2=cal[2]-'0'; //���� �迭�� �������� �ִ� �͵� �����̹Ƿ� �̸� ���������� ��ȯ�Ͽ� ����
			switch(cal[1]) { //cal[1]�� �ִ� ���� �������̹Ƿ� �� �����ڰ� �����̳Ŀ� ����
			case '+': anw=num1+num2; space.setText(Integer.toString(anw));break; //+�̸� ���ڵ��� ���� ���� ���ڿ��� ��ȯ�Ͽ� space�� setText
			case '-': anw=num1-num2; space.setText(Integer.toString(anw));break; //-�̸� ���ڵ��� �� ���� ���ڿ��� ��ȯ�Ͽ� space�� setText
			case '*': anw=num1*num2; space.setText(Integer.toString(anw));break;//*�̸� ���ڵ��� ���� ���� ���ڿ��� ��ȯ�Ͽ� space�� setText
			case '/': anw_d=(double)(num1)/num2; space.setText(Double.toString(anw_d));break;// /�̸� ���ڵ��� ���� ���� ���ڿ��� ��ȯ�Ͽ� space�� setText
			}
			
		}
		else if(e.getSource()==setNew) space.setText(""); //���� setNew ��ư���� event�� �߻��ߴٸ� space�� ��ĭ���� �ʱ�ȭ
		
		}
	}
	}


public class HW2_3_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		new Calculator(); //Calculator Ŭ������ ��ü ����(���������� �ʿ� ��� ���� �� ��)

	}

}
