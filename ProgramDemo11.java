
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class ProgramDemo11{

	JFrame f;
	JPanel p;
	JLabel lblUserName, lblPassword;
	JTextField txtUserName, txtPassword;
	JButton btnSubmit, btnCancel;

	JLabel lblGender, lblDoc, lblItem, lblListItem;
	JRadioButton rbMale, rbFemale, rbOther;
	ButtonGroup bg;
	JCheckBox chkAadhar, chkPan, chkLc, chkTc;
	JComboBox cmbItem;
	JList lstItem;
		
	String[] item = {"Pen","Pencil","Book"};
	
	public ProgramDemo11(){

		f = new JFrame();
		p = new JPanel();
		lblUserName = new JLabel();
		lblPassword = new JLabel();
		txtUserName = new JTextField();
		txtPassword = new JTextField();
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");

		lblGender = new JLabel();
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOther = new JRadioButton("Other");			
		bg = new ButtonGroup();
		lblDoc = new JLabel();
		chkAadhar = new JCheckBox("Aadhar");
		chkPan = new JCheckBox("Pan");
		chkLc = new JCheckBox("L.C");
		chkTc = new JCheckBox("T.C");
		lblItem = new JLabel();
		cmbItem = new JComboBox();
		lblListItem = new JLabel();
		lstItem = new JList(item);


		p.setLayout(null);

		lblUserName.setText("Enter the UserName :");
		lblUserName.setBounds(50,50,160,30);
		p.add(lblUserName);
		
		txtUserName.setBounds(50,100,160,30);
		p.add(txtUserName);
	
		lblPassword.setText("Enter the Password :");
		lblPassword.setBounds(50,150,160,30);
		p.add(lblPassword);
	
		txtPassword.setBounds(50,200,160,30);
		p.add(txtPassword);

		btnSubmit.setBounds(50,250,80,30);	
		p.add(btnSubmit);	

		btnCancel.setBounds(130,250,80,30);
		p.add(btnCancel);

		lblGender.setText("Select the Gender :");
		lblGender.setBounds(50,300,150,30);
		p.add(lblGender);
		
		rbMale.setBounds(50,340,100,30);
		p.add(rbMale);

        rbMale.addItemListener(new ItemListener(){

            public void itemStateChanged(ItemEvent ie1 ){
                if(rbMale.isSelected() == true){
                    System.out.println(" Male is Selected ! ");
                }
            }

        }); 

		rbFemale.setBounds(160,340,100,30);
		p.add(rbFemale);

         rbFemale.addItemListener(new ItemListener(){

            public void itemStateChanged(ItemEvent ie1 ){
                if(rbFemale.isSelected() == true){
                    System.out.println(" Female is Selected ! ");
                }
            }

        }); 

		rbOther.setBounds(260,340,100,30);
		p.add(rbOther);

         rbOther.addItemListener(new ItemListener(){

            public void itemStateChanged(ItemEvent ie1 ){
                if(rbOther.isSelected() == true){
                    System.out.println(" Other is Selected ! ");
                }
            }

        }); 

		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOther);

		lblDoc.setText("Select the Document :");
		lblDoc.setBounds(50,380,150,30);
		p.add(lblDoc);
		
		chkAadhar.setBounds(50,420,100,30);
		p.add(chkAadhar);

		chkPan.setBounds(160,420,100,30);
		p.add(chkPan);
	
		chkLc.setBounds(50,460,100,30);
		p.add(chkLc);
	
		chkTc.setBounds(160,460,100,30);
		p.add(chkTc);

		lblItem.setText("Select the Item");
		lblItem.setBounds(50,500,100,30);
		p.add(lblItem);

		cmbItem.setBounds(150,500,100,30);
		cmbItem.addItem("Pen");	
		cmbItem.addItem("Pencil");
		cmbItem.addItem("Book");
		cmbItem.addItem("NoteBook");	
		p.add(cmbItem);

		lblListItem.setText("Select the Item :");
		lblListItem.setBounds(50,550,100,30);
		p.add(lblListItem);

		lstItem.setBounds(160,550,100,100);
		p.add(lstItem);		

		f.add(p);
		f.setSize(500,650);
		f.setLocation(400,50);
		f.setTitle("My Frame");
		f.setVisible(true);
	}

	public static void main(String args[]){

		new ProgramDemo11();
	}

}