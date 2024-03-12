// declare library
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// main class
public class Frm_login extends JFrame implements ActionListener{
	
	// declare of object
	// -----------------
	
	// username
	JLabel lbl_username = new JLabel();
	JTextField txt_username = new JTextField();
	
	// password 
	JLabel lbl_password = new JLabel();
	JPasswordField txt_password = new JPasswordField();
	
	// main constructor
	public Frm_login(){
		
		// set layout
		this.getContentPane().setLayout(null);
        this.setTitle("Java GUI");
	}

	// main action
	public void actionPerformed(ActionEvent ae) {
        
    }
	
	// main method
	public static void main(String[]args){
		Frm_login b = new Frm_login();
        b.setSize(280,300);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
	}
}