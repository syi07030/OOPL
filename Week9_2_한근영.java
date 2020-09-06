import java.io.*; //java.io�� �ִ� ��� Ŭ���� import�ϱ�
import java.util.Scanner; //Scanner Ŭ���� import�ϱ�

public class Week9_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in); //�������� kbd -> Scanner Ŭ������ ���� ��ü ����
		Dog[] myDog = new Dog[10]; //Dog Ÿ���� �������� �迭 ����
		//�迭�� �� ���������� ����Ű�� ��ü ����
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
		
		Dog[] dog = null; //����ִ� Dog Ÿ���� �迭 ����
		System.out.println("Input File name to write Dog data");
		String fileName=kbd.next(); //���� �̸� ����ڷκ��� �Է¹ޱ�(���� �̸��� space�� ���� ������ next()�� �Է¹���)
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName)); //�Է¹��� ���� �̸��� binary file �����ϰ� ��ü ��ü�� ���� ��� ��Ʈ�� ����
			outputStream.writeObject(myDog); //myDog ��ü ��� ��ü�� byte sequence�� ����� ���Ͽ� ���� 
			outputStream.close(); //��� ��Ʈ�� ����
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)); //�Է� ��Ʈ�� ����(������ �о���� ����)
			dog=(Dog[])inputStream.readObject(); //��ü�� ���� ������ �о�ͼ� ����ִ� �迭 dog�� ����(Dog[]Ÿ������ down-casting �ʿ�)
			System.out.println("Name\tAge\tWeight\tBreed\t\tBoosterShot");
			for(int i=0;i<dog.length;i++) { //index���� 0���� dog �迭�� ���� �̸����� ������Ű�鼭 for�� ������
				System.out.println(dog[i]); //������ ��ü ������ ���
			}
			System.out.println("\nDogs older than 2 years and did not get the boosterShot.");
			for(int j=0;j<dog.length;j++) { //��� �ε��� ���� ���Ͽ� �ݺ�
				if((dog[j].getAge()>2)&&(dog[j].getBoosterShot()==false)) //2�� �ʰ��̸鼭 �������� �� �� ������ �̸��� �� ���
					System.out.println(dog[j].getName()+"\t\t"+dog[j].getBreed()); //getter �޼��� ���
			}
			inputStream.close(); //�Է� ��Ʈ�� ����
			kbd.close(); //kbd ��Ʈ�� ����
			System.out.println("\nProgram finished");
		}catch(EOFException e) { //������ �����͸� �� �о �� �̻� ������ ���� ���� �� ��Ÿ���� ���ܿ� ���� ó��
			System.out.println("EOFException");
			System.exit(1); //����
		}catch(FileNotFoundException e) { //������ ã�� �� ���� �� ��Ÿ���� ���ܿ� ���� ó��
			System.out.println("FileNotFoundException");
			System.exit(1); //����
		}catch(IOException e) { //Input, Output�� ���� ��Ÿ���� ���ܿ� ���� ó��
			System.out.println("IOException");
			System.exit(1); //����
		}catch(Exception e) { //�� ���� ���ܿ� ���� ó��
			System.out.println("Exception");
			System.exit(1); //����
		}
	}
}
