import java.util.Scanner; //Scanner Ŭ���� �������
public class HW1_3_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");
		
		Scanner kbd = new Scanner(System.in); //�������� kbd->Scanner Ŭ������ ���� ��ü ����
		while(true) { //while �ݺ��� ����
		System.out.println("\nInput a word");
		String word = kbd.next(); //�Է¹��� �ܾ� �����ϴ� String�� ���� word(������ �ܾ� �ϳ� �Է¹޴� �Ŵϱ� next()���)
		char Arr[]=new char[100]; 
		Arr=word.toCharArray(); //����ڷκ��� �Է¹��� String�� ���ڹ迭�� ��ȯ
		if(check(Arr)==true) { //check(Arr) ���� ���̸�(�Էµ� �ܾ ��Ī�̸�)
			System.out.println("symmetry"); //symmetry ���
		}
		else { //check(Arr)���� �����̸�(�Էµ� �ܾ ���Ī�̸�)
			System.out.println("Asymmetry"); //Asymmetry ���
		}
		System.out.print("\nTry again?(y/n)\n"); //�ݺ� ���� �����
		String anw = kbd.next(); //y�Ǵ� n�Է¹ް�
		if(anw.equalsIgnoreCase("y")) continue; //y�Ǵ� Y�̸� while�� �ٽ� �ݺ�
		else break; //y�Ǵ� Y�� �ƴϸ�(n�Ǵ� N�̸�)while�� ���������� ���� 
		}
	}
	
	public static boolean check(char[] Arr) { //public static �޼��� ,main �޼��忡�� ����� �� �־�� �ϹǷ� static���� ����
		boolean check=true; //booleanŸ���� check�� true�� �ʱ�ȭ
		for(int i=0;i<(Arr.length/2);i++) { //���ڷ� ���� ���� �迭�� �ε����� 0���� �迭 ������ ���� �̸����� 1�� ������Ű�鼭 �ݺ�
			if(Arr[i]!=Arr[Arr.length-1-i]) { //Arr[i]�� Arr[Arr.length-1-i]�� ����� ���ڰ� ���� �ٸ���
				check=false; //���Ī�� �Ŵϱ� check���� false�� �ٲٰ�
				break;//for�� ��������
			}
		}
		return check; //check�� ��ȯ, ���� ���Ī�̸� false�� �ǰ� �迭 ������ Ȯ���ߴµ� ��� ��Ī�̸� check���� ���� �ʱ�ȭ ���� �����ϴϱ� true
	}

}
