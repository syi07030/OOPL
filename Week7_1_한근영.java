import java.util.Scanner; //Scanner class import �ϱ�
public class Week7_1_�ѱٿ� {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("==============="); 
		
		Scanner kbd = new Scanner(System.in); //�������� kbd -> Scanner class�� ���� ��ü ����
		Pet[] p = new Pet[10]; //Pet Ŭ���� Ÿ���� �������� �迭 ����, �ִ� ũ�� 10
		int i=0; //Pet Ÿ���� �������� �迭�� �ε����� ����ϱ� ���� ���� i
		int num=0; //���ϴ� �۾��� ������ �� 1,2,3�� �� ���ڸ� �����ϱ� ���� ���� num,�ϴ� 0���� �ʱ�ȭ
		while(num!=3) {//num�� 3�� �ƴϸ� while�� ����
		System.out.println("\n���ϴ� �۾��� �����Դϱ�?");
		System.out.println("1. New input   2. Output   3.Exit");
		num=kbd.nextInt(); //���ϴ� �۾��� ���ڸ� �����ؼ� num�� ���� ����
		if(num==1) { //num ���� 1�̸�
			while(true){ //while �ݺ��� ����
			System.out.println("���� �����Դϱ�?");
			System.out.println("1.Dog   2.Cat   3.Snake   4.Bird");
			int num2=kbd.nextInt(); //���� ������ �� 1,2,3,4�� �� ���ڸ� �����ϱ� ���� ���� num2
			if((num2!=1)&&(num2!=2)&&(num2!=3)&&(num2!=4)) { //num2 ���� 1,2,3,4 �� �ƴ� �ٸ� ���̶��
				System.out.println("�߸��� �Է�");
				continue; //�߸��� �Է� ����ϰ� �ٽ� while�ݺ��� ó������ ���� ���� -> �ٽ� ���� �����Դϱ���� ����
			}
			else { //num2 ���� 1,2,3,4 �߿��� �ϳ����
			System.out.print("Name: ");
			String name = kbd.next(); //�̸� �����ϴ� String Ÿ�� ���� name -> ������ ���ڸ� �Է¹ް� ���ۿ� ���� ���͵� �ذ��ع����� ���� next()�̿�
			System.out.print("Age: ");
			int age= kbd.nextInt(); //���� �����ϴ� int�� ���� age
			switch(num2){//num2 ���� ���� switch��
			case 1: p[i++]=new Dog("Dog",name, age);break; //num2 ���� 1�̸� �������� �迭 p[i]�� Dog Ÿ���� ��ü �����ؼ� �����Ű��, �� �� i�� ����
			case 2: p[i++]=new Cat("Cat",name, age);break; //num2 ���� 2�̸� Cat Ÿ���� ��ü �����ؼ� �����Ű��, �� �� ����
			case 3: p[i++]=new Snake("Snake",name, age);break; //num2���� 3�̸� Snake Ÿ���� ��ü �����ؼ� ����, �� �� ����
			case 4: p[i++]=new Bird("Bird",name, age);break; //num2 ���� 4�̸� Bird Ÿ���� ��ü �����ؼ� ����, �� �� ����
			}
			break; //Switch�� ���������� ���� ����� while�� ����������->num ���� ���� 1�̹Ƿ� �� ó���� while������ �ö� �ٽ� ���ϴ� �۾��� �����Դϱ�� ����
			}
			}
		}
		else if(num==2) { //num���� 2�̸�
			System.out.println("\nSpecies\tName\tAge\tMovement");
			for(int j=0;j<i;j++) { //�ε��� ���� 0���� i���� ������Ű�鼭
				System.out.print(p[j].species +"\t"+ p[j].name+"\t"+p[j].age+"\t");//��,�̸�,���� ���
				p[j].move(); //move�� ���
			}
		}
		else if(num==3) break;//3�̸� �� ���� while�� ����������
		else { //num���� 1,2,3 �� �ش���� �ʴ� ���ڶ��
			System.out.println("�߸��� �Է�");
			continue; //�߸��� �Է� ����ϰ� while�� �ٽ� ���� -> ���ϴ� �۾��� �����Դϱ�� �ٽ� ����
		}

	}
		System.out.println("����");//num���� 3���� while�� ���������� ���� ���
		kbd.close();
	}
}
