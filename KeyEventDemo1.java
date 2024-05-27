import javax.swing.*;
import java.awt.event.*;

class KeyEventDemo1{

	JFrame f;
	JPanel p;
	JLabel lblNo1 ,lblNo2, lblAdd;
	JTextField txtNo1, txtNo2, txtAdd;
	JButton btnAddition , btnCancel;
	
	JLabel lblStatus ;

	public KeyEventDemo1(){

		f = new JFrame();
		p = new JPanel();
		lblNo1 = new JLabel("Enter the First No:");
		lblNo2 = new JLabel("Enter the Second No:");
		lblAdd = new JLabel("The Addition is:");
		txtNo1 = new JTextField();
		txtNo2 = new JTextField();
		txtAdd = new JTextField();
		btnAddition = new JButton("Addition");
		btnCancel = new JButton("Cancel");
		
		lblStatus = new JLabel("Status Message:");

		p.setLayout(null);
		f.add(p);

		lblStatus.setBounds(150,10,150,30);
		p.add(lblStatus);

		lblNo1.setBounds(150,50,150,30);
		p.add(lblNo1);

		txtNo1.setBounds(150,90,150,30);
		p.add(txtNo1);
	
		txtNo1.addKeyListener(new KeyListener(){
		
			public void keyPressed(KeyEvent ke1){
				
				lblStatus.setText("Status : Typing....");
			}
			public void keyReleased(KeyEvent ke2){

				lblStatus.setText("Status : Online");
			}
			public void keyTyped(KeyEvent ke3){
			
				lblStatus.setText("Status : Typing....");
			}
			
		});
		
		
		
		lblNo2.setBounds(150,150,150,30);
		p.add(lblNo2);
	
		txtNo2.setBounds(150,190,150,30);
		p.add(txtNo2);

		txtNo2.addKeyListener(new KeyListener(){
		
			public void keyPressed(KeyEvent ke1){
				
				lblStatus.setText("Status : Typing....");
			}
			public void keyReleased(KeyEvent ke2){

				lblStatus.setText("Status : Online");
			}
			public void keyTyped(KeyEvent ke3){
			
				lblStatus.setText("Status : Typing....");
			}
			
		});

		lblAdd.setBounds(150,240,150,30);
		p.add(lblAdd);
	
		txtAdd.setBounds(150,280,150,30);
		p.add(txtAdd);

		btnAddition.setBounds(140,330,80,30);
		p.add(btnAddition);
		
		btnAddition.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae){

				int a = Integer.parseInt(txtNo1.getText().toString());	
				int b = Integer.parseInt(txtNo2.getText().toString());	

				int c=a+b;
				txtAdd.setText(String.valueOf(c));
	
				txtNo1.setText("");
				txtNo2.setText("");
					
				txtNo1.requestFocus();		
			}
		});

		btnCancel.setBounds(230,330,80,30);
		p.add(btnCancel);

		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae){

				System.exit(0);
			}
		});

		f.setSize(500,500);
		f.setLocation(100,100);
		f.setTitle("Event Handling Demo1");
		f.setVisible(true);
	
	}
	public static void main (String args[]){
	
		new KeyEventDemo1();
	}
}