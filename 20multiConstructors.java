// Multiple Constructors
class multiConstructors
{
	private int hour,minute,second;
	
	// 4 constructors for different parameter inputs possible
	public multiConstructors()
	{
		this(0,0,0);
	}
	public multiConstructors(int h)
	{
		this(h,0,0);
	}
	public multiConstructors(int h,int m)
	{
		this(h,m,0);
	}
	public multiConstructors(int h,int m,int s)
	{
		setTime(h,m,s);
	}
	
 	// custom set time methods
	public void setTime(int h, int m, int s)
	{
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h)
	{
		hour = ((h>=0 && h<24)?h:0);
	}
	public void setMinute(int m)
	{
		minute = ((m>=0 && m<60)?m:0);
	}
	public void setSecond(int s)
	{
		second = ((s>=0 && s<60)?s:0);
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	
	public String toMilitary() 
	{	// Like in a Digital watch
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String toString()
	{	// AM / PM format
		return String.format("%d:%02d:%02d %s", ((getHour()==0||getHour()==12)?12:getHour()%12), getMinute(), getSecond(), ((getHour()<12)?"AM":"PM"));
	}
}

class callMultiConstruct
{
	public static void main(String[] args)
	{
		multiConstructors m1 = new multiConstructors(); // calls first constructor
		multiConstructors m2 = new multiConstructors(5); // calls second constructor
		multiConstructors m3 = new multiConstructors(5,13); // calls third constructor
		multiConstructors m4 = new multiConstructors(5,13,14); // calls fourth constructor
		// printf is print format
		System.out.printf("%s %s\n", m1.toMilitary(), m1.toString());
		System.out.printf("%s %s\n", m2.toMilitary(), m2.toString());
		System.out.printf("%s %s\n", m3.toMilitary(), m3.toString());
		System.out.printf("%s %s\n", m4.toMilitary(), m4.toString());
	}
}
