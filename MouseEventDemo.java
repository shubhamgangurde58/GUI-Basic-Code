
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MouseEventDemo{

		JFrame f;
		JPanel p;

		JTextField txtMessage1 , txtMessage2;
		JLabel lblStatus ;
		
		public MouseEventDemo(){
			
			f = new JFrame();
			p = new JPanel();

			txtMessage1 = new JTextField();
			lblStatus = new JLabel("Status : Message");
			txtMessage2 = new JTextField();

			p.setLayout(null);
			f.add(p);

			txtMessage1.setBounds(150,50,150,30);
			p.add(txtMessage1);

			txtMessage1.addKeyListener(new KeyListener()
			{
				public void keyPressed(KeyEvent ke1){
					
					lblStatus.setText("Status : Typing...");
				}
				public void keyReleased(KeyEvent ke2){
					
					lblStatus.setText("Status : Online");
				}
				public void keyTyped(KeyEvent ke3){
					
					lblStatus.setText("Status : Typing...");
				}
			});
			
			txtMessage1.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent fe1){
					
					txtMessage1.setBackground(Color.LIGHT_GRAY);
				}
				public void focusLost(FocusEvent fe2){
					
					txtMessage1.setBackground(Color.WHITE);
				}
			});
			
			lblStatus.setBounds(150,100,150,30);
			p.add(lblStatus);

			lblStatus.setOpaque(true);
			lblStatus.addMouseListener(new MouseListener(){

				public void mouseClicked(MouseEvent me1){

					lblStatus.setBackground(Color.RED);
				}
				public void mouseEntered(MouseEvent me2){

					lblStatus.setBackground(Color.BLUE);
				}
				public void mouseExited(MouseEvent me3){

					lblStatus.setBackground(Color.YELLOW);
				}
				public void mousePressed(MouseEvent me3){

					lblStatus.setBackground(Color.GREEN);
				}
				public void mouseReleased(MouseEvent me3){

					lblStatus.setBackground(Color.YELLOW);
				}
		
			});

			txtMessage2.setBounds(150,150,150,30);
			p.add(txtMessage2);

			txtMessage2.addKeyListener(new KeyListener()
			{
				public void keyPressed(KeyEvent ke1){
					
					lblStatus.setText("Status : Typing...");
				}
				public void keyReleased(KeyEvent ke2){
					
					lblStatus.setText("Status : Online");
				}
				public void keyTyped(KeyEvent ke3){
					
					lblStatus.setText("Status : Typing...");
				}
			});
			
			txtMessage2.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent fe1){
					
					txtMessage2.setBackground(Color.LIGHT_GRAY);
				}
				public void focusLost(FocusEvent fe2){
					
					txtMessage2.setBackground(Color.WHITE);
				}
			});

			f.setSize(500,500);
			f.setLocation(200,200);
			f.setTitle("My Frame");
			f.setVisible(true);
		}
	
		public static void main(String args[]){
		
			new MouseEventDemo();
		
		}
}