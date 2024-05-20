
import java.awt.*;
class FrameLayoutDemo{

	Frame f;
	Panel p;
	BorderLayout BL;
	Button btnNorth, btnEast, btnSouth, btnWest;
	
	public void showFrame(){
	
		f= new Frame();
		p= new Panel();
		BL = new BorderLayout();

		btnNorth = new Button("NORTH");
		btnEast = new Button("EAST");
		btnSouth = new Button("SOUTH");
		btnWest = new Button("WEST");
		p.setLayout(BL);

		
		p.add(btnNorth,BorderLayout.NORTH);
		p.add(btnEast,BorderLayout.EAST);
		p.add(btnSouth,BorderLayout.SOUTH);
		p.add(btnWest,BorderLayout.WEST);
		f.add(p);
		
	
		f.setSize(400,400);
		f.setLocation(50,50);
		f.setTitle("My Frame");
		f.setVisible(true);
		
	}

	public static void main(String args[])
	{
		FrameLayoutDemo fl = new FrameLayoutDemo();
		fl.showFrame();
	}
}