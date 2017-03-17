import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		double f1,f2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		f1 = sc.nextDouble(); // to wait for a double input
		System.out.println("Enter second number");
		f2 = sc.nextDouble(); // to wait for a double input
		System.out.println("Sum = "+(f1+f2));
	}
}
