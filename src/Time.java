
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		hour = 1;
		minute = 2;
		second = 3;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int newHour) {
		this.hour = newHour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int newMinute) {
		this.minute = newMinute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int newSecond) {
		this.second = newSecond;
	}
	
	public void setTime(int newHour, int newMinute, int newSecond) {
		this.hour = newHour;
		this.minute = newMinute;
		this.second = newSecond;
	}
	
	public String toString() {
		return String.format("Time[%d:%d:%d]", this.hour, this.minute, this.second);
	}
	
	public String nextSecond() {
		if (second == 59) {
			second = 0;
			if(minute == 59) {
				minute = 0;
				if (hour == 24) {
					System.out.println("Maximum d'heure atteint");
				}else {
					hour += 1;
				}
			}else {
				minute += 1;
			}
		}else {
			second += 1;
		}
		return toString();
	}
	
	public String previousSecond() {
		if (second == 0) {
			second = 59;
			if(minute == 0) {
				minute = 59;
				if (hour == 0) {
					System.out.println("Minimum d'heure atteint");
				}else {
					hour -= 1;
				}
			}else {
				minute -= 1;
			}
		}else {
			second -= 1;
		}
		return toString();
	}
}