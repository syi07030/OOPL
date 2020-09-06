import javax.swing.*;//java.swing ��Ű���� �ִ� ��� Ŭ���� �������
import java.awt.*; //java.awt ��Ű���� �ִ� ��� Ŭ���� �������
import java.awt.event.*; //java.awt.event�� �ִ� ��� Ŭ���� �������

class CatchMe extends JFrame{ //JFrame ��ӹ��� Ŭ����(Week12_1_�ѱٿ� class�� public���� �����صξ��� ������ ���⼭�� default��)
	public JButton click; //��ư ��������
	public CatchMe() { //������
		setTitle("�� ��ƺ�~��!-�ѱٿ�"); //frame title ����
		setSize(300,300); //frame size ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x box������ ���α׷��� ����� �� �ֵ���
		setResizable(false); //size ����
		
		JPanel p = new JPanel(); //panel ����
		click = new JButton("Click!"); //button ����
		click.addMouseListener(new mouseEventHandle()); //click button�� event listener register
		p.add(click); //panel�� click button ���̱�
		add(p,BorderLayout.CENTER); //panel�� frame ����� ���̱�(frame�� ���� default layout�� BorderLayout)
		setVisible(true); //�̷��� �͵��� ��� ���̵���
	}
	
	private class mouseEventHandle extends MouseAdapter{ //MouseAdapter�� ��ӹ��� mouseEventHandle�̶�� inner class
		public void mouseEntered(MouseEvent e) { //mouse�� button ���� ���� ���ͼ� �߻��ϴ� �̺�Ʈ ó�� �޼���
			int x=(int)(Math.random()*231); //x�� 0~230 ������ ���� ���� �ʱ�ȭ
			int y=(int)(Math.random()*231); //y�� 0~230 ������ ���� ���� �ʱ�ȭ
			click.setLocation(x,y); //��ư�� ��ġ�� �����ϰ� ������ (x,y)�� �̵�
			System.out.println("x="+x+",\ty="+y); //�̵��� ���� ��ġ�� �ֿܼ� ���
		}
		public void mouseClicked(MouseEvent e) { //mouse�� button�� click�� �� �߻��ϴ� �̺�Ʈ ó�� �޼���
			System.out.println("��,,,�����٤Ф�"); //�ֿܼ� ���
		}
	}
	
	
}

public class Week12_1_�ѱٿ� {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		new CatchMe(); //CatchMe�� ��ü ����(���������� ���� �ʿ�����Ƿ� �������� ������ ���� ����)
	}

}
