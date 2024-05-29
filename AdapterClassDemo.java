
import javax.swing.*;
import java.awt.event.*;

class AdapterClassDemo extends WindowAdapter{
	
	JFrame f;

	public AdapterClassDemo (){
		
		f = new JFrame("Window Event");

		f.addWindowListener(this);
		f.setSize(500,500);
		f.setLocation(150,150);
		f.setVisible(true);
		
	}
	public void windowActivated(WindowEvent ex1)		
	{		
		System.out.println("Online");
	}
				
	public void windowIconified(WindowEvent ex2)		
	{
		System.out.println("Offline");
	}

	public static void main(String args[])
	{
		new AdapterClassDemo();
	}
}