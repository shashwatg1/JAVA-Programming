class arrayMultiDim
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3,4,5},{6,7,8,9,10}}; // 2 X 5
		int b[][] = {{30,31,32,33},{43},{4,5,6}}; // weird shaped 4,1,3
		display(a);
		System.out.println();
		display(b);
		System.out.println();
	}
	public static void display(int a[][])
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
	}
}
