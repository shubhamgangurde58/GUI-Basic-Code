import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramDemo2 {

    JFrame f;
    JPanel p;

    JButton btnOk , btnReset , btnCancel;


    public  ProgramDemo2(){

        f = new JFrame();
        p = new JPanel();

        btnOk = new JButton("OK");
        btnReset = new JButton("RESET");
        btnCancel = new JButton("CANCEL");

        p.setLayout(null);
        f.setSize(400,500);
        f.setTitle("My Frame ");
        f.setLocation(400,50);

        btnOk.setBounds(30 ,200,100,30);
        p.add(btnOk);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "This is ok Button ");
                System.out.println("This is Ok Button");

            }
        });

        btnReset.setBounds(140, 200,100,30);
        p.add(btnReset);

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is Reset Button ");
                System.out.println("This is Reset Button ");
            }
        });

        btnCancel.setBounds(250 ,200, 100, 30);
        p.add(btnCancel);

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null , "This is Cancel Button ");
                System.out.println("This is Cancel Button ");
            }
        });


        f.add(p);
        f.setVisible(true);


    }

    public static void main(String args[]){

        new ProgramDemo2();

    }

}
