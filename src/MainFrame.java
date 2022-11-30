

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;

 


public class MainFrame extends JFrame{
	public MainFrame() {
		setTitle("Medical systems");
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Dimension dm;
	public static boolean logflag = true;
	
	
	public static void main(String[] args) throws IOException{
		JFrame myframe = new JFrame();
		myframe.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(700, 500);
		myframe.getContentPane().setLayout(null);
		LoginClass log = new LoginClass(myframe);
		dm = myframe.getSize();
		log.setBounds(0, 0, dm.width, dm.height);
		myframe.getContentPane().add(log);
		myframe.setVisible(true);
	}
}
