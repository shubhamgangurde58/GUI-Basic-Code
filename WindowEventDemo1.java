
import javax.swing.*;
import java.awt.event.*;

class WindowEventDemo1{
	
	JFrame f;

	public WindowEventDemo1(){
		
		f = new JFrame("Window Event");
	
		f.addWindowListener(new WindowListener()
		{
				 public void windowDeactivated(WindowEvent ex1)		
				{
					System.out.println("Window Deactivated");
				}
				public void windowActivated(WindowEvent ex2)		
				{
					System.out.println("Window Activated");
				}
				public void windowClosed(WindowEvent ex3)		
				{
					System.out.println("Window Closed ");
				}
				public void windowClosing(WindowEvent ex4)		
				{
					System.out.println("Window :Closing");
				}
				public void windowIconified(WindowEvent ex5)		
				{
					System.out.println("Window Iconified");
				}
				public void windowDeiconified(WindowEvent ex6)		
				{
					System.out.println(" Window :DeIconified");
				}
				public void windowOpened(WindowEvent ex7)		
				{
					System.out.println(" Window :Opened");
				}
		});


		f.setSize(500,500);
		f.setLocation(150,150);
		f.setVisible(true);
		
	}
	public static void main(String args[])
	{
		new WindowEventDemo1();
	}
}