import java.util.Random;
class arrays
{
	public static void main(String args[])
	{
		Random rn = new Random(); // Random object
		int b[] = {1,2,3,4,5}; // option 1
		int a[] = new int[b.length]; // option 2
		for (int c=0;c<a.length;c++)
		{
			a[c] = 1 + rn.nextInt(10); // Integers from 1 to 10
			System.out.println(b[c]+ " " + a[c]);
		}
	}
}
