import java.awt.event.*;
import javax.swing.*;

class ItemEventDemo1{
	
	JFrame f;
	JPanel p;
	
	JLabel lblGender;
	JRadioButton rbMale , rbFemale , rbOthers;
	ButtonGroup bg;

	JLabel lblDoc;

	JCheckBox chkAadhar,chkPAN , chkLc, chkTc;

	JLabel lblClass;
	JComboBox cmbClass;
	String[] Item={"FY Bca","SY Bca","TY Bca"};

	JLabel lblrbMessage;
	JLabel lblchkMessage , lblpanMessage , lbllcMessage , lbltcMessage;
	JLabel lblcmbMessage ;
	
	public ItemEventDemo1(){
		
		f=new JFrame();
		p=new JPanel();
		

		lblGender = new JLabel("Select the Gender: ");
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOthers = new JRadioButton("Others");

		lblDoc = new JLabel("Select the Doc:");
		chkAadhar = new JCheckBox("Aadhar");
		chkPAN = new JCheckBox("PAN");
		chkLc = new JCheckBox("L.C");
		chkTc = new JCheckBox("T.C");

		lblClass = new JLabel("Select The Class:");
		cmbClass = new JComboBox();

		lblrbMessage = new JLabel("Label RB Message:");
		lblchkMessage = new JLabel("Label chk Message:");
		lblpanMessage = new JLabel("");
		lbllcMessage = new JLabel("");
		lbltcMessage = new JLabel("");
		
		lblcmbMessage = new JLabel("Label cmb Message:");



		bg = new ButtonGroup();
		
		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOthers);

		p.setLayout(null);
		f.add(p);

		lblGender.setBounds(50,50,150,30);
		p.add(lblGender);

		rbMale.setBounds(50,90,100,30);
		p.add(rbMale);
		
		lblrbMessage.setBounds(50,140,150,30);
		p.add(lblrbMessage);

		rbMale.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie ){
				
				if(rbMale.isSelected()== true )
				{
					lblrbMessage.setText("You Selected: Male");
					System.out.println("You selected: male");
				}
				
			}
		});
	
		rbFemale.setBounds(150,90,100,30);
		p.add(rbFemale);

		rbFemale.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie ){
				
				if(rbFemale.isSelected()== true )
				{
					lblrbMessage.setText("You Selected: Female");
					System.out.println("You selected: Female");
				}
				
			}
		});

		rbOthers.setBounds(250,90,100,30);
		p.add(rbOthers);

		rbOthers.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(rbOthers.isSelected()==true)
				{		
					lblrbMessage.setText("You Selected: Others");
					System.out.println("You Selected : Others");
				}	
			}
		});

		lblDoc.setBounds(50,180,150,30);
		p.add(lblDoc);

		chkAadhar.setBounds(50,210,100,30);
		p.add(chkAadhar);

		chkAadhar.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkAadhar.isSelected()==true){

					lblchkMessage.setText("You Selected : Aadhar");
					System.out.println("you Selected : Aadhar");
				}	
			}
		});

		chkPAN.setBounds(150,210,100,30);
		p.add(chkPAN);
		
		chkPAN.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkPAN.isSelected()==true){

					lblpanMessage.setText(", PAN");
					System.out.println("you Selected : PAN");
				}	
			}
		});

		chkLc.setBounds(50,250,100,30);
		p.add(chkLc);

		chkLc.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkLc.isSelected()==true){

					lbllcMessage.setText(", L.C");
					System.out.println("you Selected : L.C");
				}	
			}
		});


		chkTc.setBounds(150,250,100,30);
		p.add(chkTc);
	
		chkTc.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkTc.isSelected()==true){

					lbltcMessage.setText(", T.C");
					System.out.println("you Selected :T.C");
				}	
			}
		});


		lblchkMessage.setBounds(50,300,130,30);
		p.add(lblchkMessage);
		
		lblpanMessage.setBounds(180,300,70,30);
		p.add(lblpanMessage);

		lbllcMessage.setBounds(250,300,70,30);
		p.add(lbllcMessage);

		lbltcMessage.setBounds(320,300,70,30);
		p.add(lbltcMessage);
		
		lblClass.setBounds(50,340,150,30);
		p.add(lblClass);
	
		cmbClass.setBounds(210,340,100,30);
		p.add(cmbClass);

		cmbClass.addItem("FY BCA");
		cmbClass.addItem("SY BCA");
		cmbClass.addItem("TY BCA");

		cmbClass.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{

				System.out.println("Selected Item:"+cmbClass.getSelectedItem().toString());
				lblcmbMessage.setText("You Selected: "+cmbClass.getSelectedItem().toString());
				
			}
		});

			
		
		lblcmbMessage.setBounds(50,400,150,30);
		p.add(lblcmbMessage);
	
		
		f.setSize(500,500);
		f.setLocation(100,100);
		f.setTitle("Item Event Demo1");
		f.setVisible(true);

	}

	public static void main(String args[]){
		
		new ItemEventDemo1();
	}
}