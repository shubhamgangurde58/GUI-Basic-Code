
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

class ProgramDemo10 extends WindowAdapter{

    JFrame f ;
    
    public ProgramDemo10(){

        f = new JFrame();

        f.addWindowListener(this);

        f.setSize(400,500);
        f.setTitle("My Frame");
        f.setLocation(400,50);
        f.setVisible(true);
    }

    public static void main(String args[]){

        new ProgramDemo10();

    }

    public void windowActivated(WindowEvent we5){
            System.out.println("Window Activated ! ");
    }

    public void windowDeactivated(WindowEvent we6){
            System.out.println("Window Deactivated ! ");
    }


}