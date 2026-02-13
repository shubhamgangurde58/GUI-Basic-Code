import java.awt.*;
import java.awt.event.*;

public class ProgramDemo8 {

    Frame f;
    List l;
    public ProgramDemo8(){

        f = new Frame("City List");

        l = new List(10);

        l.add("Pune");
        l.add("Mumbai");
        l.add("Nashik");
        l.add("Nagpur");
        l.add("Aurangabad");
        l.add("Kolhapur");
        l.add("Solapur");
        l.add("Satara");
        l.add("Jalgaon");
        l.add("Ahmednagar");

        f.add(l);
        f.setSize(400, 500);
        f.setLocation(400,50);
        f.setVisible(true);

    }


    public static void main(String args[]) {

            new ProgramDemo8();

    }
}
