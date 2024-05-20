
import java.awt.*;
class FrameLayoutDemo2{
	
	Frame f;
	Panel p;
	Button btn1,btn2,btn3,btn4,btn5;

	public FrameLayoutDemo2(){

		f = new Frame();
		p = new Panel();	
		
		btn1= new Button("NORTH");
		btn2= new Button("EAST");
		btn3= new Button("SOUTH");
		btn4= new Button("WEST");
		btn5= new Button("CENTER");
		p.setLayout(new BorderLayout());
		
		p.add(btn1,BorderLayout.NORTH);
		p.add(btn2,BorderLayout.EAST);
		p.add(btn3,BorderLayout.SOUTH);
		p.add(btn4,BorderLayout.WEST);
		p.add(btn5,BorderLayout.CENTER);

		f.setSize(500,500);
		f.setLocation(75,75);
		f.setTitle("My Frame Component");
		f.setVisible(true);
		f.add(p);
	}
	public static void main(String args[]){
		
		 new FrameLayoutDemo2();
	
	}
}