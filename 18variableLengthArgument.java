// we calculate average of all arguments sent to a function
class variableLengthArg
{
	public static void main(String args[])
	{
		System.out.println(average(30,31,32,33,43,4,5,6,23));
	}
	public static int average(int...numbers)
	{ // we do not know how many arguments we will send
		int total = 0;
		for (int x:numbers)
			total+=x; 
		return total/numbers.length;
	}
}
