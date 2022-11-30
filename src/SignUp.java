import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.Color;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;


public class SignUp extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	LoginClass panel;
	
	public SignUp(LoginClass panel) throws IOException {
		this.panel = panel;
		setTitle("Sign Up");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 7));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setBounds(80, 75, 78, 13);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(168, 75, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Password:");
		lblLastName.setBounds(80, 114, 64, 13);
		getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 114, 96, 19);
		getContentPane().add(textField_1);
		
		JLabel lblPassword = new JLabel("ID number:");
		lblPassword.setBounds(80, 150, 64, 13);
		getContentPane().add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(168, 150, 96, 19);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Password must contain at least one letter, one number and one special character");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_1.setBounds(80, 173, 346, 37);
		lblNewLabel_1.setForeground(Color.red);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Registration:");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewJgoodiesLabel.setBounds(80, 33, 88, 13);
		getContentPane().add(lblNewJgoodiesLabel);
		
		JButton btnNewButton = new JButton("Applay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					panel.setSignUp(textField.getText(),textField_1.getText() ,textField_2.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		btnNewButton.setBounds(138, 205, 96, 21);
		getContentPane().add(btnNewButton);
		}
}
