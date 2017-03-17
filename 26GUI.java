// All GUIs have there own components and methods. All have to be added individually
// java has an inbuilt class which stores all the components we need.
// we just need to mention where to put it and what to do with it. This is JOptionPane

import javax.swing.JOptionPane;

class additionGui
{
	public static void main(String[] args)
	{
		// We want to boxes for user to enter two numbers
		String fn = JOptionPane.showInputDialog("Enter First Number"); // for strings only
		String sn = JOptionPane.showInputDialog("Enter Second Number");
		// Now we convert the strings to integers
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		// Now we display this in a box
		JOptionPane.showMessageDialog(null, "The answer is "+sum, "the title", JOptionPane.PLAIN_MESSAGE);
		// 4 parameters:
		// 1st->null->middle of screen
		// 2nd->message
		// 3rd->title bar
		// 4th->message that pops up. Also used to add icons, etc
	}
}
