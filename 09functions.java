// Using another class for printing
import java.util.Scanner;
class func
{
	public void message(String n)
	{
		System.out.println("Hello "+n);
	}
}

class mainfunc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		func f = new func();

		System.out.println("Enter name");
		String name = sc.nextLine();
		f.message(name);
	}
}
