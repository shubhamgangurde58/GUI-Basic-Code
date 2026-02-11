import javax.swing.*;

public class ProgramDemo6 {

    JFrame f;
    JTable tb;
    JScrollPane sp;
    public  ProgramDemo6(){

        f = new JFrame();

        String column[] = {"Home","Percentage","Grade"};

        String data[][] = {
                {"Pune","85","B+"},
                {"Nashik","90","A"},
                {"Shahada","95","A+"},
                {"Mumbai","70","B"},
                {"Jalgaon","60","C"}
        };

        tb = new JTable(data,column);

        sp = new JScrollPane(tb);

        f.add(sp);
        f.setSize(500,600);
        f.setTitle("My Frame Table ");
        f.setLocation(400,50);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new ProgramDemo6();
    }

}
