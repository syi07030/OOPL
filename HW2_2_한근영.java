import java.util.*; //java.util�� �ִ� ��� Ŭ���� �������

public class HW2_2_�ѱٿ� {

	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971090");
		System.out.println("����: �ѱٿ�");
		System.out.println("===============");

		Scanner kbd = new Scanner(System.in); // Scanner Ŭ���� ��ü ���� -> �������� kbd

		char[] open = { '{', '[', '(' }; // ������ ���ڿ� ���� �迭
		char[] close = { '}', ']', ')' }; // ������ ���ڿ� ���� �迭
		
		while (true) { // �ݺ�
			LinkedList<Character> myStack = new LinkedList<Character>(); // �������� myStack->Character Ÿ�Ը��� �����ϴ� LickedList ����
			int num = 0; // correct �Ǵ� incorrect�� �����ϱ� ���� ����(¦�� �� �´��� Ȯ��)
			int check = 0; // correct �Ǵ� incorrect�� �����ϱ� ���� ����(6�� �̿��� ���ڸ� �Է��ߴ��� Ȯ���ϱ� ����)
			System.out.print("Input: ");
			String input = kbd.next(); // ����ڷκ��� �Է¹޾Ƽ� ����
			if (input.equals("0"))
				break; // ���� ����ڷκ��� �Է¹��� ���� "0"�̸� �ݺ��� ������
			else { // "0"�� �ƴ϶��
				char[] ch = input.toCharArray(); // �Էµ� ���ڿ��� ���ڹ迭�� ��ȯ

				for (int i = 0; i < ch.length; i++) { // 0���� ���ڹ迭�� ���̸�ŭ �ݺ�
					for (int j = 0; j < 3; j++) { // 0���� 2���� �ݺ�
						if (ch[i] == open[j] || ch[i] == close[j])
							check++; // ���� �Է��� ���ڵ��� 6�� ���� �� �ϳ���� check�� ����
					}
				}
				if (check == 0)
					break; // �� Ȯ���ߴµ��� check���� 0�̶�� �ݺ��� ����������
				AA: // labelǥ��
				for (int i = 0; i < ch.length; i++) {
					for (int j = 0; j < 3; j++) {// 0���� 2���� �ݺ�
						if (ch[i] == open[j])
							myStack.addLast(new Character(ch[i])); // ���� open�� �ִ� ���� �� �ϳ��� ���ٸ� myStack�� push�ϱ�
						else if (ch[i] == close[j]) { // ���� close�� �ִ� ���� �� �ϳ��� ���ٸ�
							if (!myStack.isEmpty()) {// ���� myStack�� ������� �ʴٸ�
								char c = myStack.removeLast(); // myStack���� pop�� ���ڸ� c�� ����
								if (c != open[j]) { // ���� c�� open�� �ִ� j��° �ε����� ���ڿ� �ٸ��ٸ�
									num = 1; // num�� ���� 1�� �ٲٰ�
									break AA; // AA label�� ǥ���� for �ݺ��� ����������
								}
							} else { // ���� myStack�� ����ִٸ�
								num = 1; // num�� ���� 1�� �ٲٰ�
								break AA; // AA label�� ǥ���� for�� ����������
							}
						}
					}
				}
				if (num == 1 || !myStack.isEmpty())
					System.out.println("Incorrect\n"); // ���� num���� 1�̰ų� myStack�� ������� �ʴٸ� incorrect ���
				else if (check == 0)
					System.out.println("Wrong Input"); // ���� check���� 0�̶�� wrong input ���
				else if (myStack.isEmpty())
					System.out.println("Correct\n"); // ���� myStack�� ����ִٸ� correct ���
			}
		}
		System.out.println("Program finished");

	}

}
