// Pass Arrays in Methods
class arrayMethod
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};

		for (int i:a)
			System.out.print(i + " ");
		System.out.println();

		change(a);

		for (int i:a)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void change(int a[])
	{
		for (int i=0;i<a.length;i++)
			a[i]++;
	}
}
