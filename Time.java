//System.out.println("===============");
//System.out.println("����: ���̹�����");
//System.out.println("�й�: 1971090");
//System.out.println("����: �ѱٿ�");
//System.out.println("===============");
//HW1_1_�ѱٿ�

public class Time { //public class
	private int hour; //�� �������� ������ private ����
	private int minute; //�� �������� ������ private ����
	
	public void setHour(int h) { //private ���� hour�� ���� setter �޼���
		hour=h;
	} 
	public void setMinute(int m) { //private ���� minute�� ���� setter �޼���
		minute=m;
	}
	public int getHour() { //private ���� hour�� ���� getter �޼���
		return hour;
	}
	public int getMinute() { //private ���� minute�� ���� getter �޼���
		return minute;
	}
	private boolean isValid(int hour,int minute) { //private �޼��� 
		if(((hour>=0)&&(hour<=23))&&((minute>=0)&&(minute<=59))) { //�Էµ� �ÿ� ���� ���� ���� ������ true ��ȯ
			return true;
		}
		else { //�Էµ� �ÿ� ���� ���� ���� ������ false ��ȯ
			return false;
		}
	}
	public void setTime(int hour,int minute) { //public �޼���
		if(isValid(hour,minute)) { //isValid()�޼����� ��ȯ���� true�̸� hour�� minute���� ���� setter�޼��带 �̿��ؼ� ����
			setHour(hour);
			setMinute(minute);
		}
		else { //��ȯ���� false�̸� Wrong Input���� ���, hour�� minute���� �ƹ��� ���� ������� �����Ƿ� ���� �ʱ�ȭ ���� 0 ����
			System.out.println("Wrong Input");
		}
	}
	public int getTime(char ch) { //public �޼���
		String c=""+ch; //�Է¹��� charŸ���� ch�� String������ �ٲٱ�(equalsIgnoreCase()�� ����ϱ� ����)
		if(c.equalsIgnoreCase("h")) return getHour(); //�Է¹��� ch���� H�Ǵ� h�̸� getter�޼��带 �̿��ؼ� hour ��ȯ
		else if(c.equalsIgnoreCase("m")) return getMinute(); //�Է¹��� ch���� M �Ǵ� m�̸� getter �޼��带 �̿��ؼ� minute ��ȯ 
		else return 0;// H,h,M,m�� �ƴ� �ٸ� ���̶�� �׳� 0��ȯ
	}
}
