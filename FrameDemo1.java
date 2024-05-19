
import java.awt.*;

class FrameDemo1 extends Component{

	public static void main(String args[]){

		Frame f = new Frame();
		f.setSize(500,500);
		f.setLocation(50,50);
		f.setTitle("MyFrame");
		f.add(new FrameDemo1());
		f.setVisible(true);

	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(100,100,200,200);
		g.setColor(Color.YELLOW);
		g.fillOval(100,100,200,150);
		g.setColor(Color.BLACK);
		g.drawLine(100,100,300,300);
	}
}