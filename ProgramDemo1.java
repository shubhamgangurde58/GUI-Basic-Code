import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ProgramDemo1 {

    JFrame f;
    JPanel p;
    JLabel lblUserName , lblPasssword;
    JTextField txtUserName , txtPassword;


    public  ProgramDemo1(){

        f = new JFrame();
        p = new JPanel();

        lblUserName = new JLabel("Enter the UserName : ");
        lblPasssword = new JLabel("Enter the Password : ");
        txtUserName = new JTextField();
        txtPassword = new JTextField();

        p.setLayout(null);
        f.setSize(500,600);
        f.setTitle("My Frame");
        f.setLocation(400,50);

        lblUserName.setBounds(50,50,150,30);
        p.add(lblUserName);

        txtUserName.setBounds(50,90,150, 30);
        p.add(txtUserName);

        txtUserName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("This is a key Press Event ");
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        lblPasssword.setBounds(50,150,150,30);
        p.add(lblPasssword);

        txtPassword.setBounds(50,190,150,30);
        p.add(txtPassword);

        txtPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("This is key Press Event ");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        f.add(p);
        f.setVisible(true);

    }

    public static void main(String args[]){

        new ProgramDemo1();

    }

}
