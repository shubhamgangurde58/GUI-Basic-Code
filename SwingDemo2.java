import javax.swing.*;
class SwingDemo1{

	JFrame f;
	JPanel p;
	
	JLabel lblUsername,lblPassword;
	JTextField txtUsername,txtPassword;
	JButton btnLogin,btnCencel;

	public SwingDemo1(){
	
		f = new JFrame();
		p = new JPanel();
		lblUsername = new JLabel();
		lblPassword = new JLabel();

		txtUsername = new JTextField();
		txtPassword = new JTextField();

		btnLogin = new JButton("Login");
		btnCencel = new JButton("Cencel");

		p.setLayout(null);
		
		lblUsername.setText("Enter the UserName:");
		lblUsername.setBounds(150,50,170,30);
		p.add(lblUsername);
	
		txtUsername.setBounds(150,90,170,30);
		p.add(txtUsername);
		
		lblPassword.setText("Enter the Password:");
		lblPassword.setBounds(150,150,170,30);
		p.add(lblPassword);

		txtPassword.setBounds(150,200,170,30);
		p.add(txtPassword);

		btnLogin.setBounds(150,240,80,30);
		p.add(btnLogin);

		btnCencel.setBounds(240,240,80,30);
		p.add(btnCencel);

		f.setSize(500,500);
		f.setLocation(50,50);
		f.setTitle("Swing Demo1");
		f.setVisible(true);
		
		f.add(p);
	}
	
	public static void main(String args[]){
	
		 new SwingDemo1();
	}
}