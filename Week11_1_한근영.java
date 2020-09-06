import javax.swing.*; //java.swing ��Ű���� �ִ� ��� Ŭ���� �������
import java.awt.*; //java.awt ��Ű���� �ִ� ��� Ŭ���� �������

class Calculator extends JFrame{ //JFrame ��ӹ��� Ŭ����(�ؿ� public Ŭ���� �ֱ� ������ ���⼭�� default��)
	public Calculator() { //������
		setTitle("Calculator"); //ȭ�� â�� ������ Calculator
		setSize(300,200); //ȭ�� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box������ ���α׷��� ����� �� �ֵ���
		
		JPanel northPanel = new JPanel(); //Frame�� BorderLayout���� ���� ���ʿ� ��ġ�� �г� ����
		northPanel.setLayout(new GridLayout(0,1)); //�� panel�� ���̾ƿ��� GridLayout���� ����
		JTextField space = new JTextField(30); //TextField ����
		space.setHorizontalAlignment(JTextField.RIGHT); //TextField�� ������ �Է� �� ������ ����
		space.setEditable(true); //TextField ���� �����ϵ���
		northPanel.add(space); //panel�� ������ TextField �߰�
		add(northPanel,BorderLayout.NORTH); //�� panel ��ü�� frame�� borderLayout ���ʿ� �߰�
		
		JPanel centerPanel = new JPanel(); //Frame�� BorderLayout���� ����� ��ġ�� �г� ����
		centerPanel.setLayout(new GridLayout(0,4,2,0)); //�� panel�� ���̾ƿ��� GridLayout���� ����
		//makeButton()ȣ���Ͽ� ��ư �����ϰ� centerPanel�� �߰�
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
		add(centerPanel,BorderLayout.CENTER); //�� centerPanel ��ü�� frame�� BorderLayout ��� ��ġ�� �߰� 
		
		setVisible(true); //�̷��� �͵��� ��� ���̵���
	}
	
	public void makeButton(String text, JPanel panel) { //��ư ���� �� panel�� �߰��ϴ� �޼���
		JButton button = new JButton(text); //���ڷ� ���� StringŸ���� ������ button ����
		panel.add(button); //������ button�� ���ڷ� ���� panel, �� �� �ּҰ��� ����Ű�� panel�� �߰�
	}
}

public class Week11_1_�ѱٿ� {
	public static void main(String[] args) { //���� �޼���
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		new Calculator(); //Calculator �ν��Ͻ� ����(�� �ν��Ͻ��� ����Ű�� ���������� ���� �ʿ��� �������� ���� �� ��)

	}

}
