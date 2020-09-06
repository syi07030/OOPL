import java.util.*; //java.util�ȿ� �ִ� Ŭ������ �� �������

public class Week10_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//�������� kbd->Scanner Ŭ������ ���� ��ü ����
		Map<String,String> student = new HashMap<String,String>(); //key�� value��� StringŸ���� HashMap ����, �������� student�� ����Ŵ
		System.out.println("�л��� ID�� �̸��� ���ʷ� �Է��ϼ���.(����� 0 0 �Է�)");
		String name, id; //�̸��� id�� ������ String Ÿ�� ����
		while(true) {
			id=kbd.next();//id�Է¹޾Ƽ� ����
			name=kbd.next();//�̸� �Է¹޾Ƽ� ����
			if((name.equals("0"))&&(id.equals("0"))) break; //id�� �̸� ��� 0�̸� while�� ��������
			student.put(id,name); //key���� id�� value���� name�� Hashmap�� ����
		}
		
		System.out.println("<�л����>");
		System.out.println("[ID]\t[NAME]");
		
		Set k = student.keySet(); //key���� set k�� ����
		Iterator<String> it = k.iterator(); //Iterator �ν��Ͻ� ����->Hashmap�� �ִ� ������ element�鿡 �����ϱ� ���� �ʿ�
		while(it.hasNext()) { //�� �̻� ������ �� ���� ������
			String key=it.next(); //���� key�� set k�� �ִ� key������ iterator()�� �̿��ؼ� �ϳ��� ������
			System.out.println(key+"\t"+student.get(key)); //Hashmap�� �ִ� key���� id�� value���� �̸� ���
		}
		
		System.out.println("\n��ü �л� ��: "+student.size()); //Hashmap�� ����� ����� ������ ��ȯ�ؼ� ��ü �л� �� ���
		
		Iterator<String> initial = k.iterator();//Iterator �� �ٸ� �ν��Ͻ� ����->maxLength,minLength,maxID,minID�ʱ�ȭ ��Ű�� ����
		String init_key = initial.next(); //iterator�̿��ؼ� key�� �ϳ� �о�ͼ� init_key�� ����
		int maxLength=student.get(init_key).length(); //init_key�� value�� ���̸� �ϴ� �����ؼ� �ʱ�ȭ
		int minLength=student.get(init_key).length(); //init_key�� value�� ���̸� �ϴ� �����ؼ� �ʱ�ȭ
		String maxID=init_key; //init_key���� �����ؼ� �ʱ�ȭ
		String minID=init_key; //init_key���� �����ؼ� �ʱ�ȭ
		
		Iterator<String> check = k.iterator();//Iterator �� �ٸ� �ν��Ͻ� ����->���� �� �̸��� ª�� �̸� ã�� ����
		while(check.hasNext()) { //�� ������ ���� ���� ������ �ݺ�
			String ch_key=check.next(); //���� ch_key�� set k�� �ִ� key������ iterator�̿��ؼ� �ϳ��� ��������
			if(student.get(ch_key).length()>maxLength) {//���� ���� key�� ����Ű�� value�� ���̰� maxLength���� ��ٸ�
				maxLength=student.get(ch_key).length(); //maxLength���� �� ���̷� ������Ʈ
				maxID=ch_key;//���� key������ maxID ������Ʈ
			}
			
			if(student.get(ch_key).length()<minLength) { //���� ���� key�� ����Ű�� value�� ���̰� minLenght���� ª�ٸ�
				minLength=student.get(ch_key).length(); //minLength���� �� ���̷� ������Ʈ
				minID=ch_key; //���� key������ minID ������Ʈ
			}
		}
		System.out.println("<���� �� �̸��� ���� �л�>");
		System.out.println("ID:"+maxID+" Name:"+student.get(maxID)+" ����:"+maxLength); //���� �� �̸� ���� �л��� id�� �̸�,���� ���
		System.out.println("<���� ª�� �̸��� ���� �л�>");
		System.out.println("ID:"+minID+" Name:"+student.get(minID)+" ����:"+minLength); //���� ª�� �̸� ���� �л��� id�� �̸�,���� ���

	}

}
