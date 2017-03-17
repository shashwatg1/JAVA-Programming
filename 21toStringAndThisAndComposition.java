class toStringThisComposition
{
	private int month,day,year;
	public toStringThisComposition(int m, int d, int y)
	{
		month = m;
		day = d;
		year = y;

		System.out.printf("The Constructor for this is %s\n", this);
		// this refers to the object we build when we call this class
		// Since the format is String in the print statement, it will go to the toString function
	}
	// toString is built in by default but it is overwritten if we define it separately
	public String toString()
	{ // The name toString is important
		return String.format("%d/%d/%d", month, day, year); // this format is sent to the printf call
	}
}

class callClassComposition
{
	private String name;
	private toStringThisComposition birthday; // reference to object

	public callClassComposition(String n, toStringThisComposition b)
	{
		name = n;
		birthday = b;
	}
	// Here, the birthday object is again refered as a string so it goes to its mother class and checks for toString over there
	public String toString()
	{
		return String.format("My name is %s, my birthday is %s",name,birthday);
	}
}

class callClass
{
	public static void main(String[] args)
	{
		toStringThisComposition t = new toStringThisComposition(4,5,6);
		callClassComposition c = new callClassComposition("SG",t);
		System.out.println(c); // Here is where the object wants to print itself and hence refers to the toString of its parent class
	}
}
