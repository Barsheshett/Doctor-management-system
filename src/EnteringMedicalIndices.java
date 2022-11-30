import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class EnteringMedicalIndices extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	
	XSSFRow newrow;
	String ex = ".\\datafile\\Output.xlsx";
	FileInputStream inputstream = new FileInputStream(ex);
	
	XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	int rows = sheet.getLastRowNum();
	int cols = sheet.getRow(1).getLastCellNum();
	
	public EnteringMedicalIndices() throws IOException{
		
		setTitle(" Entering Medical Indices");
		//getContentPane().setLayout(null);
		setSize(550, 571);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AP");
		lblNewLabel.setBounds(236, 77, 45, 13);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(236, 97, 96, 19);
		getContentPane().add(textField);
		
		JLabel lblHdl = new JLabel("HDL");
		lblHdl.setBounds(236, 127, 45, 13);
		getContentPane().add(lblHdl);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(236, 147, 96, 19);
		getContentPane().add(textField_1);
		
		JLabel lblIron = new JLabel("IRON");
		lblIron.setBounds(236, 177, 45, 13);
		getContentPane().add(lblIron);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(236, 197, 96, 19);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("CRTN");
		lblNewLabel_1_1.setBounds(236, 227, 45, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(236, 247, 96, 19);
		getContentPane().add(textField_3);
		
		JLabel lblHb = new JLabel("HB");
		lblHb.setBounds(236, 276, 45, 13);
		getContentPane().add(lblHb);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(236, 296, 96, 19);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("UREA");
		lblNewLabel_1_2.setBounds(236, 326, 45, 13);
		getContentPane().add(lblNewLabel_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(236, 346, 96, 19);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("HCT");
		lblNewLabel_2_1.setBounds(236, 376, 45, 13);
		getContentPane().add(lblNewLabel_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(236, 396, 96, 19);
		getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("RBC");
		lblNewLabel_1_1_1.setBounds(236, 426, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(236, 446, 96, 19);
		getContentPane().add(textField_7);
		
		JLabel lblLymph = new JLabel("LYMPH");
		lblLymph.setBounds(415, 77, 45, 13);
		getContentPane().add(lblLymph);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(415, 97, 96, 19);
		getContentPane().add(textField_8);
		
		JLabel lblNewLabel_1_3 = new JLabel("NEUT");
		lblNewLabel_1_3.setBounds(415, 127, 45, 13);
		getContentPane().add(lblNewLabel_1_3);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(415, 147, 96, 19);
		getContentPane().add(textField_9);
		
		JLabel lblNewLabel_2_2 = new JLabel("WBC");
		lblNewLabel_2_2.setBounds(415, 177, 45, 13);
		getContentPane().add(lblNewLabel_2_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(415, 197, 96, 19);
		getContentPane().add(textField_10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("MCH");
		lblNewLabel_1_1_2.setBounds(415, 227, 45, 13);
		getContentPane().add(lblNewLabel_1_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(415, 247, 96, 19);
		getContentPane().add(textField_11);
		
		JLabel lblNewLabel_3_1 = new JLabel("EOS");
		lblNewLabel_3_1.setBounds(415, 280, 45, 13);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(415, 300, 96, 19);
		getContentPane().add(textField_12);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("TSH");
		lblNewLabel_1_2_1.setBounds(415, 330, 45, 13);
		getContentPane().add(lblNewLabel_1_2_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(415, 350, 96, 19);
		getContentPane().add(textField_13);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("GLUCOSE");
		lblNewLabel_2_1_1.setBounds(415, 380, 96, 13);
		getContentPane().add(lblNewLabel_2_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(415, 400, 96, 19);
		getContentPane().add(textField_14);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(180, 39, 25, 456);
		getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setBounds(35, 77, 96, 13);
		getContentPane().add(lblNewLabel_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(35, 100, 96, 19);
		getContentPane().add(textField_15);
		
		JLabel lblNewLabel_2_3 = new JLabel("Last Name");
		lblNewLabel_2_3.setBounds(35, 127, 96, 13);
		getContentPane().add(lblNewLabel_2_3);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(35, 150, 96, 19);
		getContentPane().add(textField_16);
		
		JLabel lblNewLabel_2_4 = new JLabel("ID");
		lblNewLabel_2_4.setBounds(35, 177, 45, 13);
		getContentPane().add(lblNewLabel_2_4);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(35, 200, 96, 19);
		getContentPane().add(textField_17);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Age");
		lblNewLabel_2_3_1.setBounds(35, 227, 45, 13);
		getContentPane().add(lblNewLabel_2_3_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(35, 250, 96, 19);
		getContentPane().add(textField_18);
		
		JRadioButton[] radioButtons4 = new JRadioButton[2];
		final ButtonGroup group4 = new ButtonGroup();
		
		radioButtons4[0]  = new JRadioButton("Male");
		radioButtons4[0].setBounds(35, 275, 75, 21);
		getContentPane().add(radioButtons4[0]); 
		
		radioButtons4[1] = new JRadioButton("Female");
		radioButtons4[1].setBounds(35, 29+275, 75, 21);
		getContentPane().add(radioButtons4[1]);
		
		ArrayList<JTextField> JTF = new ArrayList<>();
		JTF.add(textField_15);
		JTF.add(textField_16);
		JTF.add(textField_17);
		JTF.add(textField_18);
		JTF.add(textField_14);
		JTF.add(textField_13);
		JTF.add(textField_12);
		JTF.add(textField_11);
		JTF.add(textField_10);
		JTF.add(textField_9);
		JTF.add(textField_8);
		JTF.add(textField_7);
		JTF.add(textField_6);
		JTF.add(textField_5);
		JTF.add(textField_4);
		JTF.add(textField_3);
		JTF.add(textField_2);
		JTF.add(textField_1);
		JTF.add(textField);

		
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				try {
				newrow = sheet.createRow(rows+1);
				XSSFCell cell0 = null;
				int i = 0;
				
				if(radioButtons4[0].isSelected()) {
					cell0 = newrow.createCell(19);
					cell0.setCellValue("M");
				}else if(radioButtons4[1].isSelected()) {
					cell0 = newrow.createCell(19);
					cell0.setCellValue("F");
				}
				
				for (JTextField jTextField : JTF) {
					cell0 = newrow.createCell(i);
					cell0.setCellValue(jTextField.getText());
					i++;
				}
				
				
				FileOutputStream out;
				
					out = new FileOutputStream(ex);
					workbook.write(out);
					out.flush();
					out.close();
				} catch (java.io.FileNotFoundException e1) {
					System.out.println("FileNotFoundException raised");
				}catch (IOException e1) {
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Data entry completed");
				dispose();
			}
		});
		btnNewButton.setBounds(348, 503, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBounds(444, 503, 85, 21);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Add Patient: ");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(35, 20, 138, 13);
		getContentPane().add(lblNewLabel_1_4);
		
		group4.add(radioButtons4[0]);
		group4.add(radioButtons4[1]);
		
		
	}
}
