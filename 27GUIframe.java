// Previous code was simple to look same on all OS's
// Now we want OS specific features

import java.awt.FlowLayout; // imports default layout manager
import javax.swing.JFrame; // windows OS features
import javax.swing.JLabel; // output texts and images on screen

class itemclass extends JFrame
{ // window has been created to put stuff in it
	private JLabel item1;
	public itemclass()
	{
		// Add title bar
		super("The title bar");
		// Set a default Layout
		setLayout(new FlowLayout());
		// build item and add functionalities to it
		item1 = new JLabel("This is a sentence");
		// add scroll box to it
		item1.setToolTipText("This pops up on hovering");
		add(item1); // add item to window
	}
}

class mainClass 
{
	public static void main(String[] args)
	{
		itemclass i = new itemclass();
		// how do we want the program to close?
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this will close program on hitting X button on the window
		i.setSize(275,180);
		i.setVisible(true);
	}
}
