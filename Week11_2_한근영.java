import javax.swing.*;//java.swing ��Ű���� �ִ� ��� Ŭ���� �������
import java.awt.*;//java.awt ��Ű���� �ִ� ��� Ŭ���� �������

class StudentInformation extends JFrame{//JFrame ��ӹ��� Ŭ����(�ؿ� public Ŭ���� �ֱ� ������ ���⼭�� default��)
	public StudentInformation() {//������
		setTitle("Student Information");//ȭ�� â�� ������ Calculator
		setSize(350,200);//ȭ�� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box������ ���α׷��� ����� �� �ֵ���
		
		JLabel title = new JLabel("STUDENT INFORMATION"); //label ����
		title.setHorizontalAlignment(JLabel.CENTER); //label ��� ����
		add(title,BorderLayout.NORTH); //�� label�� Frame�� borderLayout ���ʿ� �߰�
		
		JPanel centerPanel = new JPanel(); //Frame�� BorderLayout���� ����� ��ġ�� panel ����
		centerPanel.setLayout(new GridLayout(0,2));//�� panel�� ���̾ƿ��� GridLayout���� ����
		
		JLabel nameL = new JLabel("NAME"); //�̸��� ��Ÿ���� label ����
		JTextField nameT = new JTextField(10); //�̸� label ���� ��ġ�� textField ����
		nameT.setEditable(true); //textField ���� �����ϵ���
		centerPanel.add(nameL); //centerPanel�� ������ label �߰�
		centerPanel.add(nameT); //centerPanel�� ������ TextField �߰�
		
		JLabel genderL = new JLabel("GENDER"); //���� ��Ÿ���� label ����
		centerPanel.add(genderL); //centerPanel�� ������ label �߰�
		
		JPanel buttonP = new JPanel(); //radiobutton���� �߰��� �� �ٸ� panel ����
		buttonP.setLayout(new GridLayout(0,2)); //�� panel�� GridLayout���� ����
		JRadioButton male = new JRadioButton("Male"); //������ ��Ÿ���� radioButton ����
		JRadioButton female = new JRadioButton("Female",true); //������ ��Ÿ���� radioButton ����(�������� �ʱ�ȭ)
		ButtonGroup bg = new ButtonGroup(); //buttonGroup ����(����, ���� �� �� �ϳ��� ���ð����ϵ��� �ϱ� ����)
		bg.add(male); //��ư�׷쿡 male radioButton �߰�
		bg.add(female); //��ư�׷쿡 female radioButton �߰�
		buttonP.add(male); //buttonP panel�� male �߰�
		buttonP.add(female); //buttonP panel�� female �߰�
		centerPanel.add(buttonP); //�� buttonP panel ��ü�� centerPanel panel�� �߰� 
		
		JLabel idL = new JLabel("ID"); //id ��Ÿ���� label ����
		JTextField idT = new JTextField(10); //TextField ����
		nameT.setEditable(true); //TextField ���� �����ϵ���
		centerPanel.add(idL); //centerPanel�� label �߰�
		centerPanel.add(idT); //centerPanel�� textField �߰�
		
		JLabel departmentL = new JLabel("DEPARTMENT"); //department ��Ÿ���� label ����
		JTextField departmentT = new JTextField(10); //department ��Ÿ���� textField ����
		nameT.setEditable(true); //������ textField�� ���� �����ϵ���
		centerPanel.add(departmentL); //label�� centerPanel�� �߰�
		centerPanel.add(departmentT); //textField�� centerPanel�� �߰�
		
		add(centerPanel,BorderLayout.CENTER); //�� centerPanel�� frame�� BorderLayout�� �߾ӿ� �߰�
		
		JPanel southPanel = new JPanel(); //borderLayout �Ʒ��� �߰��� panel ����
		JButton save = new JButton("Save"); //save ��ư ����
		JButton cancel = new JButton("Cancel"); //cancel ��ư ����
		southPanel.add(save); //save ��ư southPanel�� �߰�
		southPanel.add(cancel); //cancel ��ư southPanel�� �߰�
		
		add(southPanel,BorderLayout.SOUTH); //southPanel�� frame�� BorderLayout�� �Ʒ��ʿ� �߰�
		
		setVisible(true); //���� ������ �͵��� ��� ���̵���
	}
	
}
	
public class Week11_2_�ѱٿ� {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		new StudentInformation(); //StudentInformation ��ü ����(�� �ν��Ͻ��� ����Ű�� ���������� ���� �ʿ��� �������� ���� �� ��)

	}
}
