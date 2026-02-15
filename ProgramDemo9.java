
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class ProgramDemo9{

    JFrame f;
    JPanel p;
    JLabel lblStatus;
    JTextField txtMessage , txtMessage2;


    public ProgramDemo9(){

        f = new JFrame();
        p = new JPanel();

        txtMessage = new JTextField();
        txtMessage2 = new JTextField();
        lblStatus = new JLabel("Status : Demo Message ");

        txtMessage.setBounds(50,50,150,30);
        p.add(txtMessage);

        txtMessage.addKeyListener(new KeyListener(){

            public void keyPressed(KeyEvent ke1){

            }

            public void keyReleased(KeyEvent ke2){

                lblStatus.setText("Status : Online ");

            }

            public void keyTyped(KeyEvent ke3){

                lblStatus.setText("Status : Typing...");
            }

        });

        txtMessage.addFocusListener(new FocusListener(){

            public void focusGained(FocusEvent fe1){
                txtMessage.setBackground(Color.LIGHT_GRAY);
            }

            public void focusLost(FocusEvent fe2){
                txtMessage.setBackground(Color.WHITE);
            }

        });

        lblStatus.setBounds(50,100,150,30);
        p.add(lblStatus);

        lblStatus.setOpaque(true);

        lblStatus.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent me1){
                lblStatus.setBackground(Color.GRAY);
            }
            public void mouseReleased(MouseEvent me2){
                lblStatus.setBackground(Color.YELLOW);
            }
            public void mouseEntered(MouseEvent me3){
                lblStatus.setBackground(Color.RED);
            }
            public void mouseExited(MouseEvent me4){
                lblStatus.setBackground(Color.YELLOW);
            }
            public void mouseClicked(MouseEvent me5){
                lblStatus.setBackground(Color.GREEN);
            }
        }); 

        txtMessage2.setBounds(50,150,150,30);
        p.add(txtMessage2);

        txtMessage2.addFocusListener(new FocusListener(){

            public void focusGained(FocusEvent fe1){
                txtMessage2.setBackground(Color.LIGHT_GRAY);
            }

            public void focusLost(FocusEvent fe2){
                txtMessage2.setBackground(Color.WHITE);
            }

        });


        p.setLayout(null);
        f.setSize(400,500);
        f.setTitle("My Frame");
        f.setLocation(400,50);
        f.add(p);
        f.setVisible(true);
    }

    public static void main(String args[]){

        new ProgramDemo9();

    }

}