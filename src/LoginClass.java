import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginClass extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String title = "Log In window";
	Border border = BorderFactory.createTitledBorder(title);
	private static JTextField txt_pass;
	private static JTextField txt_user;
	private static JTextField txtID;
	private String username1 = null;
	private String password1 = null;
	private String idnumber1 = null;
	public Dimension dm;
	JFrame myframe = new JFrame();
	XSSFRow newrow;
	String ex = ".\\datafile\\users.xlsx";
	FileInputStream inputstream = new FileInputStream(ex);
	
	XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	int rows = sheet.getLastRowNum();
	int cols = sheet.getRow(1).getLastCellNum();

	
	public LoginClass(JFrame myframe) throws IOException{
		setBorder(border);
		this.myframe = myframe;
		SignUp signup = new SignUp(this);
		JLabel lbl1 = new JLabel("Welcome Back:");
		lbl1.setBounds(10, 27, 186, 31);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl1.setMaximumSize(new Dimension(150, 13));
		
		JLabel lbl2 = new JLabel("User Name:");
		lbl2.setBounds(40, 68, 79, 19);
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txt_user = new JTextField();
		txt_user.setBounds(40, 97, 96, 19);
		txt_user.setColumns(10);
		
		JLabel lbl3 = new JLabel("Password:");
		lbl3.setBounds(40, 124, 68, 19);
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txt_pass = new JTextField();
		txt_pass.setBounds(40, 151, 96, 19);
		txt_pass.setColumns(10);
		
		JLabel lbl4 = new JLabel("ID Number:");
		lbl4.setBounds(40, 180, 81, 19);
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtID = new JTextField();
		txtID.setBounds(40, 209, 96, 19);
		txtID.setColumns(10);
		
		JButton btn_login = new JButton("Log in");
		btn_login.setBounds(40, 246, 96, 21);
		
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = 0;
				//XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
				//workbook.setForceFormulaRecalculation(true);
				for(int r = 0; r <= rows; r++){
					XSSFRow row = sheet.getRow(r);
					XSSFCell cell = row.getCell(c);
					
					try {
						if(cell != null) {
							if(txt_user.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Error: Please insert user name");
								return;
							}
							else{
								if(cell.getStringCellValue().equals( txt_user.getText()))
								{
									if(txt_pass.getText().isEmpty()) {
										JOptionPane.showMessageDialog(null, "Error: Please insert password");
										return;
									}else {
										cell = row.getCell(1);
										if(cell.getStringCellValue().equals(txt_pass.getText())) {
											if(txtID.getText().isEmpty()) {
												JOptionPane.showMessageDialog(null, "Error: Please insert ID number");
												return;
											}
											cell = row.getCell(2);
											int id = (int) cell.getNumericCellValue();
											int txtid = Integer.parseInt(txtID.getText());
											if(id == txtid) {
												JOptionPane.showMessageDialog(null, "Succeeded, welcome back");
												DrPanel drpanel = new DrPanel(txt_user.getText());
												drpanel.setBounds(0, 0, 1000, 700);
												//pq.setBounds(0, 480, 1000, 200);
												myframe.getContentPane().removeAll();
												myframe.setSize(1000,700);
												//myframe.getContentPane().add(pq);
												myframe.getContentPane().add(drpanel);
												inputstream.close();
												return;
											}
											else {
												JOptionPane.showMessageDialog(null, "Error: Worng ID, try agian");
												return;
											}
										}else {
											JOptionPane.showMessageDialog(null, "Error: Worng password, try agian");
											return;
										}
									}
								}
								else if (r == rows){
									JOptionPane.showMessageDialog(null, "Error: The user is not registered in the system, please try again  ");
									return;
								}
							}
						}
					}catch (NullPointerException ex) {
						System.out.print("NullPointerException caught");
					} catch (IOException e1) {
						e1.printStackTrace();
						}catch (java.lang.IllegalStateException e2) {
							System.out.print("NullPointerException caught");
						}
					finally {
						try {
							inputstream.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					
					}
				}
			}
		});
		
		setLayout(null);
		//add(lbl1);
		add(lbl2);
		add(lbl3);
		add(txt_pass);
		add(txt_user);
		add(lbl4);
		add(txtID);
		add(btn_login);
		
		JButton btn_login_1 = new JButton("Sign up");
		btn_login_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					signup.setSize(400, 350);
					signup.setVisible(true);
					
					
			}
		});
		btn_login_1.setBounds(495, 431, 96, 21);
		add(btn_login_1);
	}
	public void setSignUp(String s1, String s2, String s3) throws IOException {
		this.username1 = s1;
		this.password1 = s2;
		this.idnumber1 = s3;
		
		newrow = sheet.createRow(rows+1);
		XSSFCell cell0 = newrow.createCell(0);
		XSSFCell cell1 = newrow.createCell(1);
		XSSFCell cell2 = newrow.createCell(2);
		cell0.setCellValue(username1);
		cell1.setCellValue(password1);
		cell2.setCellValue(idnumber1);
		
		FileOutputStream out = new FileOutputStream(ex);
		workbook.write(out);
		out.flush();
		out.close();
		JOptionPane.showMessageDialog(null, "Registration was successful");
		XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
		workbook.setForceFormulaRecalculation(true);
		System.exit(0);
	}
	
	public void paintComponent(Graphics g)  {
		super.paintComponent(g);
		
		dm = getSize();
		int hi = dm.height;
		int wd = dm.width;

			final ImageIcon icon = new ImageIcon("src//loginBackgruond.png");
			Image img = icon.getImage();
			g.drawImage(img, 0, 0, wd, hi, this);
		}
}
