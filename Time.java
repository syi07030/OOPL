//System.out.println("===============");
//System.out.println("전공: 사이버보안");
//System.out.println("학번: 1971090");
//System.out.println("성명: 한근영");
//System.out.println("===============");
//HW1_1_한근영

public class Time { //public class
	private int hour; //몇 시인지를 저장할 private 변수
	private int minute; //몇 분인지를 저장할 private 변수
	
	public void setHour(int h) { //private 변수 hour에 대한 setter 메서드
		hour=h;
	} 
	public void setMinute(int m) { //private 변수 minute에 대한 setter 메서드
		minute=m;
	}
	public int getHour() { //private 변수 hour에 대한 getter 메서드
		return hour;
	}
	public int getMinute() { //private 변수 minute에 대한 getter 메서드
		return minute;
	}
	private boolean isValid(int hour,int minute) { //private 메서드 
		if(((hour>=0)&&(hour<=23))&&((minute>=0)&&(minute<=59))) { //입력된 시와 분이 범위 내에 있으면 true 반환
			return true;
		}
		else { //입력된 시와 분이 범위 내에 없으면 false 반환
			return false;
		}
	}
	public void setTime(int hour,int minute) { //public 메서드
		if(isValid(hour,minute)) { //isValid()메서드의 반환값이 true이면 hour와 minute값을 각각 setter메서드를 이용해서 저장
			setHour(hour);
			setMinute(minute);
		}
		else { //반환값이 false이면 Wrong Input으로 출력, hour와 minute에는 아무런 값이 저장되지 않으므로 원래 초기화 값인 0 유지
			System.out.println("Wrong Input");
		}
	}
	public int getTime(char ch) { //public 메서드
		String c=""+ch; //입력받은 char타입의 ch를 String형으로 바꾸기(equalsIgnoreCase()를 사용하기 위해)
		if(c.equalsIgnoreCase("h")) return getHour(); //입력받은 ch값이 H또는 h이면 getter메서드를 이용해서 hour 반환
		else if(c.equalsIgnoreCase("m")) return getMinute(); //입력받은 ch값이 M 또는 m이면 getter 메서드를 이용해서 minute 반환 
		else return 0;// H,h,M,m이 아닌 다른 값이라면 그냥 0반환
	}
}
