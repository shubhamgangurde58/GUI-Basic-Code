import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgramDemo4 {


    JFrame f;
    JPanel p;

    JMenuBar mb;
    JMenu file , edit , help;

    JMenuItem newItem , openItem , editItem;

    public  ProgramDemo4(){

        f = new JFrame();
        p = new JPanel();

        mb = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        editItem = new JMenuItem("Edit");

        file.setOpaque(true);
        edit.setOpaque(true);
        help.setOpaque(true);

        file.setBackground(Color.RED);
        edit.setBackground(Color.GREEN);
        help.setBackground(Color.CYAN);

        file.add(newItem);
        file.add(openItem);
        file.add(editItem);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        f.setJMenuBar(mb);

        p.setLayout(null);
        f.setSize(400,500);
        f.setTitle("My Frame");
        f.setLocation(400,50);
        f.add(p);
        f.setVisible(true);

    }

    public static void main(String args[]){

        new ProgramDemo4();

    }

}
