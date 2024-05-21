import javax.swing.*;
class GUIDemo1{

	JFrame f;
	JPanel p;
	
	JLabel lblGender;
	JRadioButton rbMale, rbFemale, rbOthers;
	ButtonGroup bg;
	JLabel lblDoc;
	JCheckBox chkAadhar ,chkPAN ,chkLC, chkTC;
	JLabel lblClass;
	JComboBox cmbClass;
	JLabel lblList;
	JList lstClass ;
	String[] Class={"FY Bca","SY Bca","TY Bca"};

	public GUIDemo1(){
		f = new JFrame();
		p = new JPanel();
	
		lblGender = new JLabel("Select the Gender:");
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOthers = new JRadioButton("Others");
		bg = new ButtonGroup();
	
		lblDoc = new JLabel("Select the Document");
		chkAadhar = new JCheckBox("Aadhar");
		chkPAN = new JCheckBox("PAN");
		chkLC = new JCheckBox("L.C");
		chkTC = new JCheckBox("T.C");

		lblClass= new JLabel("Select the Class:");
		cmbClass = new JComboBox();
		lblList= new JLabel("Select the Class:");
		lstClass = new JList(Class);
		p.setLayout(null);
		
		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOthers);

		lblGender.setBounds(50,50,150,30);
		p.add(lblGender);

		rbMale.setBounds(50,90,80,30);
		p.add(rbMale);

		rbFemale.setBounds(150,90,80,30);
		p.add(rbFemale);

		rbOthers.setBounds(250,90,80,30);
		p.add(rbOthers);		

		lblDoc.setBounds(50,150,150,30);
		p.add(lblDoc);
	
		chkAadhar.setBounds(50,190,80,30);
		p.add(chkAadhar);
	
		chkPAN.setBounds(150,190,80,30);
		p.add(chkPAN);

		chkLC.setBounds(50,230,80,30);
		p.add(chkLC);

		chkTC.setBounds(150,230,80,30);
		p.add(chkTC);

		lblClass.setBounds(50,280,130,30);
		p.add(lblClass);

		cmbClass.setBounds(190,280,100,25);
		cmbClass.addItem("FY Bca");
		cmbClass.addItem("SY Bca");
		cmbClass.addItem("TY Bca");

		lblList.setBounds(50,340,130,30);	
		p.add(lblList);
		
		lstClass.setBounds(190,340,100,60);
		p.add(lstClass);

		p.add(cmbClass);

		
		f.add(p);

		f.setSize(500,500);
		f.setLocation(100,100);
		f.setTitle("GUI Demo1");
		f.setVisible(true);
		
	}

	public static void main(String args[]){
	
		new GUIDemo1();
	}
}