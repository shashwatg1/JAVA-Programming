import java.util.Random;
class randomNo
{
	public static void main(String args[])
	{
		Random rn = new Random(); // Random object
		for (int c=1;c<=10;c++)
		{
			int number = 1 + rn.nextInt(10); // Integers from 1 to 10
			System.out.print(number+ " ");
		}
		System.out.println();
	}
}
