import java.util.*;//java.util�ȿ� �ִ� Ŭ������ �� �������
public class Week10_1_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in);//�������� kbd->Scanner Ŭ������ ���� ��ü ����
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		List<Student> s = new ArrayList<Student>(); //�������� s-> StudentŸ�Ը��� �޴� ArrayList ����
		while(true) {
			String name = kbd.next(); //�л��� �̸��� �Է¹���
			if(name.equals("0")) break; //���� �л��� �̸��� 0�̸� while�� ��������
			String ID= kbd.next(); //�л��� id �Է¹���
			int age=kbd.nextInt(); //�л��� ���� �Է¹���
			s.add(new Student(name,ID,age)); //�Է¹��� �̸�,id,���̸� ���ڷ� StudentŸ���� ��ü�� ����, �̸� ArrayList�� �߰�
		}

		System.out.println("NUMBER\tNAME\tID\tAGE");
		printResult(s); //printResult()�޼��� ȣ���ؼ� ArraryList�� ����ִ� ��ü ���� ���
		
		for(;;) { // �Ʒ� ���� �ݺ�
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
			int num=kbd.nextInt(); //����ڷκ��� ���� �Է¹���
			switch(num) { //num�� ���� ����
			case 1: //num���� 1�̸�
				System.out.println("Input new Student Name, ID, and age, and the location");
				addStudent(s); //addStudent()ȣ���ؼ� element �߰�
				printResult(s); //printResult() ȣ���ؼ� ArraryList�� ����ִ� ��ü ���� ���
				break;
			case 2: //num���� 2�̸�
				System.out.println("Input Student Number to delete");
				deleteStudent(s);//deleteStudent() ȣ���ؼ� element ����
				printResult(s);//printResult() ȣ���ؼ� ArraryList�� ����ִ� ��ü ���� ���
				break;
			case 3: //num���� 3�̸�
				printResult(s);//printResult() ȣ���ؼ� ArraryList�� ����ִ� ��ü ���� ���
				break;
			case 4: break; //num���� 4�̸� �׳� switch�� ����������
			default: //num���� 1,2,3,4 ���� ���ڸ�
				System.out.println("Wrong Input"); //���
				break;
			}
			if(num==4) break; //num���� 4�̸� for�� ����������
		}
		System.out.println("End");
	}
	
	public static void printResult(List<Student> student) { //��� �л����� ����ϴ� �޼���
		                                                    //���ڷ� Student Ÿ�Ը��� �޴� List�� ������ Ŭ���� Ÿ���� ��������
		for(int i=0;i<student.size();i++) { //List�� �ִ� element�� ������ŭ for���� �����鼭
			System.out.println(i+1+"\t"+student.get(i)); //get()�̿��� ���
		}
	}

	public static void deleteStudent(List<Student> student) { //Ư�� ��ġ�� �л������� �����ϴ� �޼���, �޼��尡 �޴� ���ڴ� �� �޼���� ����
		Scanner kbd = new Scanner(System.in); //�������� kbd->Scanner Ŭ������ ���� ��ü ����
		student.remove(kbd.nextInt()-1); //�Է¹��� ���ڿ��� 1�� �� ��ġ�� element ����
	}
	
	public static void addStudent(List<Student> student) { //����ڷκ��� ������ �Է¹޾� Ư�� ��ġ�� �߰��ϴ� �޼���, �޼��尡 �޴� ���ڴ� �� �޼���� ����
		Scanner kbd = new Scanner(System.in); //�������� kbd->Scanner Ŭ������ ���� ��ü ����
		Student ss=new Student(kbd.next(),kbd.next(),kbd.nextInt()); //�Է¹��� �̸�,id,���̷� StudentŸ���� ��ü ����
		student.add(kbd.nextInt()-1,ss); //�Է¹��� ���ڿ��� 1�� �� ��ġ�� ���� ������ ��ü �߰�
	}
}
