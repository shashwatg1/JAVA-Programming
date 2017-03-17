// final keyword
class finalClass
{
	private int sum;
	private final int number; // this will be a constant. We cannot modify it.
	// We can assign it to something only once. Right here or in the constructor.

	public finalClass(int x)
	{
		number = x; // done once and for all
	}
	public void add()
	{
		sum+=number;
	}
	public String toString()
	{
		return String.format("sum = %d\n",sum);
	}
}

class callClass
{
	public static void main(String[] args)
	{
		finalClass f = new finalClass(10); // for this object, number = 10 for ever
		for(int i=0;i<5;i++)
		{
			f.add();
			System.out.printf("%s",f); // toString is called for this object
		}
	}
}
