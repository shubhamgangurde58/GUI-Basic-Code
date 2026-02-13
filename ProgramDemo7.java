import javax.swing.*;

public class ProgramDemo7 {

    JFrame f;
    JPanel p;

    JList cityList;

    JLabel lblMsg;

    String item[] = {"Nashik","Pune","Mumbai","Nagpur","Kolhapur","Solapur","Satara","Jalgaon","Shahada","Nandurbar"};
    public ProgramDemo7(){

        f = new JFrame();
        p = new JPanel();

        cityList = new JList(item);
        lblMsg = new JLabel("This is City List : ");


        lblMsg.setBounds(50,50,200,30);
        p.add(lblMsg);

        cityList.setBounds(50,100,100,200);
        p.add(cityList);



        p.setLayout(null);
        f.setSize(400,600);
        f.setTitle("My Frame");
        f.setLocation(400,50);
        f.add(p);
        f.setVisible(true);


    }

    public static void main(String[] args) {

        new ProgramDemo7();

    }

}
