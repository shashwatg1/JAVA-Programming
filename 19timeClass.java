// Time class. It has a bunch of time functions
class timeClass
{
	private int hour,minute,second;

	public void setTime(int h,int m,int s)
	{
		hour = ((h>=0 && h<24)?h:0);
		minute = ((m>=0 && m<60)?m:0);
		second = ((s>=0 && s<60)?s:0);
	}

	public String toMilitary() 
	{	// Like in a Digital watch
		return String.format("%02d:%02d:%02d", hour, minute, second); // each is displayed in two decimal places
	}

	public String toString()
	{	// AM / PM format
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, ((hour<12)?"AM":"PM"));
	}
}

class callTime
{
	public static void main(String[] args)
	{
		timeClass t = new timeClass();
		System.out.println(t.toMilitary());
		System.out.println(t.toString());
		t.setTime(13,27,6);
		System.out.println(t.toMilitary());
		System.out.println(t.toString());
	}
}
