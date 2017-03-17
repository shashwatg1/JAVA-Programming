// When the user does something, it is an Event.
// We need event handlers to allow such user interaction

import java.awt.FlowLayout; // imports default layout manager
import java.awt.event.ActionListener; // waits for user to do something
import java.awt.event.ActionEvent; // events
import javax.swing.JFrame; // windows OS features
import javax.swing.JTextField;
import javax.swing.JPasswordField; // asterisks to hide 
import javax.swing.JOptionPane;

class itemclass extends JFrame
{// create the window using Jframe
	private JTextField item1,item2,item3;
	private JPasswordField passField;
	public itemclass()
	{ 
		super("The title bar");
		setLayout(new FlowLayout());
		item1 = new JTextField(10);
		add(item1);
		item2 = new JTextField("Enter text here");
		add(item2);
		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false);
		add(item3);
		passField = new JPasswordField("My Pass");
		add(passField);
		// As of now we have four dumb text fields waiting on the screen
		// We want them to wait and listen for an event to happen
		// Then a bunch of code should be executed.
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passField.addActionListener(handler);
	}
	// Now we will define a class here within itemClass class. Thus this class will automatically inherit itemClass
	private class thehandler implements ActionListener
	{ // class handling the events. Here event is pressing enter button
		public void actionPerformed(ActionEvent event)
		{ // whatever happens inside this method will handle the event
			String string = ""; // final output string
			if(event.getSource()==item1) // source means where it happened
				string = String.format("field 1: %s", event.getActionCommand()); // get text from the location
			else if(event.getSource()==item2)
				string = String.format("field 2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				string = String.format("field 3: %s", event.getActionCommand());
			else if(event.getSource()==passField)
				string = String.format("password field: %s", event.getActionCommand());
			// Output it on screen
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
class mainClass 
{
	public static void main(String[] args)
	{
		itemclass i = new itemclass();
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this will close program on hitting X button on the window
		i.setSize(350,100); // of window
		i.setVisible(true);
	}
}
