
import java.awt.*;
class AWTDemo1{
	
	Frame F;
	Panel P;
	Label lblUsername,lblPassword;
	TextField txtUsername,txtPassword;
	Button btnLogin,btnCancel;
	public AWTDemo1(){
	
		F = new Frame();
		P = new Panel();
		lblUsername = new Label();
		txtUsername = new TextField();
		lblPassword = new Label();
		txtPassword = new TextField();
		btnLogin = new Button("Login");
		btnCancel = new Button("Cancel");
		
		P.setLayout(null);
		
		lblUsername.setText("Enter The Username:");
		lblUsername.setBounds(150,50,150,25);
		P.add(lblUsername);
		
		txtUsername.setBounds(150,80,150,25);
		P.add(txtUsername);
		
		lblPassword.setText("Enter The Password:");
		lblPassword.setBounds(150,150,150,25);
		P.add(lblPassword);

		txtPassword.setBounds(150,180,150,25);
		P.add(txtPassword);

		btnLogin.setBounds(150,220,70,25);
		P.add(btnLogin);

		btnCancel.setBounds(230,220,80,25);
		P.add(btnCancel);

		F.add(P);
		F.setSize(500,500);
		F.setLocation(50,50);
		F.setTitle("AWT Demo1");
		F.setVisible(true);

	}
	public static void main(String args[]){

		new AWTDemo1();

	}
}