// do while executes atleast once. Even if the condition is false in the first go itself.
class doWhile
{
	public static void main(String args[])
	{
		int c = 0;
		do
		{
			System.out.println("Counter = "+c);
			c++;
		}
		while(c<10);
	}
}
