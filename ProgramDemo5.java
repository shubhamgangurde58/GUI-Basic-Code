import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramDemo5 {

    JFrame f;
    JPanel p;
    JLabel lblNo1 , lblNo2 , lblAdd;
    JTextField txtNo1 , txtNo2 , txtAdd;
    JButton btnAdd , btnCancel;

    public ProgramDemo5(){

        f = new JFrame();
        p = new JPanel();

        lblNo1 = new JLabel("Enter the first No : ");
        txtNo1 = new JTextField();

        lblNo2 = new JLabel("Enter the second No : ");
        txtNo2 = new JTextField();

        lblAdd = new JLabel("The Addition : ");
        txtAdd = new JTextField();

        btnAdd = new JButton("Addition");
        btnCancel = new JButton("Cancel");

        lblNo1.setBounds(50,50,150,30);
        p.add(lblNo1);

        txtNo1.setBounds(50,90,150,30);
        p.add(txtNo1);

        lblNo2.setBounds(50,140,150,30);
        p.add(lblNo2);

        txtNo2.setBounds(50,180,150,30);
        p.add(txtNo2);

        lblAdd.setBounds(50,230,150,30);
        p.add(lblAdd);

        txtAdd.setBounds(50,270,150,30);
        p.add(txtAdd);

        btnAdd.setBounds(50,320,80,30);
        p.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt( txtNo1.getText().toString());
                int b = Integer.parseInt( txtNo2.getText().toString());

                int c = a + b ;

                txtAdd.setText(String.valueOf(c));
                txtNo1.setText(" ");
                txtNo2.setText(" ");
                txtNo1.requestFocus();

            }
        });

        btnCancel.setBounds(140,320,80,30);
        p.add(btnCancel);

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });


        p.setLayout(null);
        f.setSize(400,500);
        f.setTitle("My Frame");
        f.setLocation(400,50);
        f.add(p);
        f.setVisible(true);

    }

    public static void main(String[] args) {

        new ProgramDemo5();

    }

}
