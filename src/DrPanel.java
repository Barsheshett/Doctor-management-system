import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.Color;

public class DrPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String drName = null;
	public Dimension dm1;
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
	private JTextField txtMoshe;
	private JTextField txtDavidian;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table;
	
	public DrPanel(String drName) throws IOException {
		
		
		String ex1 = ".\\datafile\\Output.xlsx";
		
		FileInputStream inputstream = new FileInputStream(ex1);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AP");
		lblNewLabel.setBounds(45, 280, 45, 13);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(45, 300, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblHdl = new JLabel("HDL");
		lblHdl.setBounds(45, 330, 45, 13);
		add(lblHdl);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 350, 96, 19);
		add(textField_1);
		
		JLabel lblIron = new JLabel("IRON");
		lblIron.setBounds(45, 380, 45, 13);
		add(lblIron);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 400, 96, 19);
		add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("CRTN");
		lblNewLabel_1_1.setBounds(45, 430, 45, 13);
		add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(45, 450, 96, 19);
		add(textField_3);
		
		JLabel lblHb = new JLabel("HB");
		lblHb.setBounds(200, 280, 45, 13);
		add(lblHb);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(200, 300, 96, 19);
		add(textField_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("UREA");
		lblNewLabel_1_2.setBounds(200, 330, 45, 13);
		add(lblNewLabel_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(200, 350, 96, 19);
		add(textField_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("HCT");
		lblNewLabel_2_1.setBounds(200, 380, 45, 13);
		add(lblNewLabel_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(200, 400, 96, 19);
		add(textField_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("RBC");
		lblNewLabel_1_1_1.setBounds(200, 430, 45, 13);
		add(lblNewLabel_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(200, 450, 96, 19);
		add(textField_7);
		
		JLabel lblLymph = new JLabel("LYMPH");
		lblLymph.setBounds(355, 280, 45, 13);
		add(lblLymph);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(355, 300, 96, 19);
		add(textField_8);
		
		JLabel lblNewLabel_1_3 = new JLabel("NEUT");
		lblNewLabel_1_3.setBounds(355, 330, 45, 13);
		add(lblNewLabel_1_3);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(355, 350, 96, 19);
		add(textField_9);
		
		JLabel lblNewLabel_2_2 = new JLabel("WBC");
		lblNewLabel_2_2.setBounds(355, 380, 45, 13);
		add(lblNewLabel_2_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(355, 400, 96, 19);
		add(textField_10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("MCH");
		lblNewLabel_1_1_2.setBounds(355, 430, 45, 13);
		add(lblNewLabel_1_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(355, 450, 96, 19);
		add(textField_11);
		
		JLabel lblNewLabel_3_1 = new JLabel("EOS");
		lblNewLabel_3_1.setBounds(510, 280, 45, 13);
		add(lblNewLabel_3_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(510, 300, 96, 19);
		add(textField_12);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("TSH");
		lblNewLabel_1_2_1.setBounds(510, 330, 45, 13);
		add(lblNewLabel_1_2_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(510, 350, 96, 19);
		add(textField_13);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("GLUCOSE");
		lblNewLabel_2_1_1.setBounds(510, 380, 96, 13);
		add(lblNewLabel_2_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(510, 400, 96, 19);
		add(textField_14);
		
		JLabel lblNewLabel_1 = new JLabel("Medical indices:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(45, 239, 138, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Patient details:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(45, 40, 138, 13);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setBounds(45, 118, 96, 13);
		add(lblNewLabel_2);
		
		txtMoshe = new JTextField();
		txtMoshe.setText("Moshe");
		txtMoshe.setBounds(45, 141, 96, 19);
		add(txtMoshe);
		txtMoshe.setColumns(10);
		
		JLabel lblNewLabel_2_3 = new JLabel("Last Name");
		lblNewLabel_2_3.setBounds(167, 118, 96, 13);
		add(lblNewLabel_2_3);
		
		txtDavidian = new JTextField();
		txtDavidian.setText("Davidian");
		txtDavidian.setColumns(10);
		txtDavidian.setBounds(167, 141, 96, 19);
		add(txtDavidian);
		
		JLabel lblNewLabel_2_4 = new JLabel("ID");
		lblNewLabel_2_4.setBounds(289, 118, 45, 13);
		add(lblNewLabel_2_4);
		
		textField_17 = new JTextField();
		textField_17.setText("123456789");
		textField_17.setColumns(10);
		textField_17.setBounds(289, 141, 96, 19);
		add(textField_17);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Age");
		lblNewLabel_2_3_1.setBounds(411, 118, 45, 13);
		add(lblNewLabel_2_3_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(411, 141, 96, 19);
		add(textField_18);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome Dr: ");
		lblNewLabel_3.setBounds(45, 10, 74, 13);
		add(lblNewLabel_3);
		
		
		
		JLabel lblNewLabel_4 = new JLabel(drName);
		lblNewLabel_4.setBounds(122, 10, 87, 13);
		add(lblNewLabel_4);
		ArrayList<JTextField> JTF = new ArrayList<>();
		JTF.add(textField);
		JTF.add(textField_1);
		JTF.add(textField_2);
		JTF.add(textField_3);
		JTF.add(textField_4);
		JTF.add(textField_5);
		JTF.add(textField_6);
		JTF.add(textField_7);
		JTF.add(textField_8);
		JTF.add(textField_9);
		JTF.add(textField_10);
		JTF.add(textField_11);
		JTF.add(textField_12);
		JTF.add(textField_13);
		JTF.add(textField_14);
		JTF.add(textField_18);
		JButton btnNewButton = new JButton("display");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int c = 0;
				for(int r = 1; r <= rows; r++){
					XSSFRow row = sheet.getRow(r);
					XSSFCell cell = row.getCell(c);
					XSSFCell firstname = row.getCell(0);
					XSSFCell lastname = row.getCell(1);
					XSSFCell idnum = row.getCell(2);
					
					
					try {
						if(cell != null) {
							cell = row.getCell(0);
							if(txtMoshe.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Error: First name required");
								return;
							}
							else if(txtDavidian.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Error: Last name required");
								return;
							}
							else if(textField_17.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Error: ID required");
								return;
							}
							int id = (int) idnum.getNumericCellValue();
							int txtid = Integer.parseInt(textField_17.getText());
							if(firstname.getStringCellValue().equals(txtMoshe.getText()) &&  
									lastname.getStringCellValue().equals(txtDavidian.getText()) &&
									(id == txtid)) {
								int s = 18;
								System.out.println(JTF.size());
								for (JTextField jTextField : JTF) {
									cell = row.getCell(s);
									switch(cell.getCellType()) 
									{
									case STRING: 
										String string =cell.getStringCellValue(); 
										jTextField.setText(string);
										break;
									case NUMERIC: 
										cell.getNumericCellValue(); 
										String string1 =String.valueOf(cell);
										jTextField.setText(string1);
										break;
									default:
										break;
									}
									s--;
								}
							}else {
								//JOptionPane.showMessageDialog(null, "Error: Wrong details555, Try again");
								//return;
							}
						}
					}catch (NullPointerException e1) {
						JOptionPane.showMessageDialog(null, "Error: Wrong details, Try again");
						System.out.print("NullPointerException caught");
						}
					catch(NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error: Wrong details, Try again");
						System.out.print("NumberFormatException caught");
					}
				}
			}
		});
		btnNewButton.setBounds(45, 184, 85, 21);
		add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Diagnosis:");
		lblNewLabel_5.setBounds(635, 40, 85, 13);
		add(lblNewLabel_5);
		
		
		JList<String> textField_19 = new JList<String>();
		textField_19.setBounds(635, 63, 338, 204);
		//add(textField_19);
		
		JLabel lblNewLabel_5_1 = new JLabel("Recommendation:");
		lblNewLabel_5_1.setBounds(635, 277, 103, 13);
		add(lblNewLabel_5_1);
		
		JLabel q0 = new JLabel("Are you an Eastern ethnic race?");
		q0.setBounds(325+45, 500+10, 205, 13);
		add(q0);
		
		JRadioButton[] radioButtons0 = new JRadioButton[2];
		final ButtonGroup group0 = new ButtonGroup();
		
		radioButtons0[0]  = new JRadioButton("yes");
		radioButtons0[0].setBounds(325+45, 500+29, 45, 21);
		add(radioButtons0[0]);
		
		radioButtons0[1] = new JRadioButton("no");
		radioButtons0[1].setBounds(325+95, 500+29, 45, 21);
		add(radioButtons0[1]);
		
		group0.add(radioButtons0[0]);
		group0.add(radioButtons0[1]);
		
		JLabel q1 = new JLabel("Do you smoke?");
		q1.setBounds(45, 500+10, 105, 13);
		add(q1);
		
		JRadioButton[] radioButtons = new JRadioButton[2];
		final ButtonGroup group = new ButtonGroup();
		
		radioButtons[0]  = new JRadioButton("yes");
		radioButtons[0].setBounds(45, 500+29, 45, 21);
		add(radioButtons[0]);
		
		radioButtons[1] = new JRadioButton("no");
		radioButtons[1].setBounds(95, 500+29, 45, 21);
		add(radioButtons[1]);
		
		group.add(radioButtons[0]);
		group.add(radioButtons[1]);
		
		JLabel q2 = new JLabel("Do you exercise?");
		q2.setBounds(45, 500+75, 105, 13);
		add(q2);
		
		JRadioButton[] radioButtons1 = new JRadioButton[2];
		final ButtonGroup group1 = new ButtonGroup();
		
		radioButtons1[0]  = new JRadioButton("yes");
		radioButtons1[0].setBounds(45, 500+94, 45, 21);
		add(radioButtons1[0]);
		
		radioButtons1[1] = new JRadioButton("no");
		radioButtons1[1].setBounds(95, 500+94, 45, 21);
		add(radioButtons1[1]);
		
		group1.add(radioButtons1[0]);
		group1.add(radioButtons1[1]);
		
		JLabel q3 = new JLabel("Do you feel tired or weakness?");
		q3.setBounds(165, 500+10, 170, 13);
		add(q3);
		
		JRadioButton[] radioButtons2 = new JRadioButton[2];
		final ButtonGroup group2 = new ButtonGroup();
		
		radioButtons2[0]  = new JRadioButton("yes");
		radioButtons2[0].setBounds(165, 500+29, 45, 21);
		add(radioButtons2[0]);
		
		radioButtons2[1] = new JRadioButton("no");
		radioButtons2[1].setBounds(215, 500+29, 45, 21);
		add(radioButtons2[1]);
		
		group2.add(radioButtons2[0]);
		group2.add(radioButtons2[1]);
		
		JRadioButton[] radioButtons3 = new JRadioButton[2];
		final ButtonGroup group3 = new ButtonGroup();
		
		radioButtons3[0]  = new JRadioButton("yes");
		radioButtons3[0].setBounds(165, 500+94, 45, 21);
		add(radioButtons3[0]);
		
		radioButtons3[1] = new JRadioButton("no");
		radioButtons3[1].setBounds(215, 500+94, 103, 21);
		add(radioButtons3[1]);
		
		group3.add(radioButtons3[0]);
		group3.add(radioButtons3[1]);
		
		JLabel q5 = new JLabel("Are you taking medication?");
		q5.setBounds(165, 500+75, 150, 13);
		add(q5);
		
		JRadioButton[] radioButtons4 = new JRadioButton[2];
		final ButtonGroup group4 = new ButtonGroup();
		
		radioButtons4[0]  = new JRadioButton("Male");
		radioButtons4[0].setBounds(525, 50+70, 75, 21);
		add(radioButtons4[0]); 
		
		radioButtons4[1] = new JRadioButton("Female");
		radioButtons4[1].setBounds(525, 50+101, 75, 21);
		add(radioButtons4[1]);
		
		group4.add(radioButtons4[0]);
		group4.add(radioButtons4[1]);
		
		
		
		JList<String> listRec = new JList<String>();
		
		DefaultListModel<String> DML = new DefaultListModel<>();
		DefaultListModel<String> DML2 = new DefaultListModel<>();
		
		
		JScrollPane myscrollpane = new JScrollPane(listRec);
		myscrollpane.setBounds(635, 297, 338, 318);;
		listRec.setLayoutOrientation(JList.VERTICAL);
		
		JScrollPane myscrollpane2 = new JScrollPane(textField_19);
		myscrollpane2.setBounds(635, 63, 338, 204);
		textField_19.setLayoutOrientation(JList.VERTICAL);
		
		textField_19.setModel(DML);
		listRec.setModel(DML2);

		add(myscrollpane);
		add(myscrollpane2);
		
		JButton btnNewButton_1 = new JButton("Start");
		
		btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				if(group.isSelected(null) || group0.isSelected(null) || group1.isSelected(null) || group2.isSelected(null) || group3.isSelected(null) || group3.isSelected(null)) {
					JOptionPane.showMessageDialog(null, "Error: All details are required.");
					return;
				}
				try {	
				/********Calculate Diagnosis*********/
				double age = Double.parseDouble(textField_18.getText()); 
				double AP = Double.parseDouble(textField.getText());
				double HDL = Double.parseDouble(textField_1.getText());
				double Iron = Double.parseDouble(textField_2.getText());
				double Crtn = Double.parseDouble(textField_3.getText());
				double Hb = Double.parseDouble(textField_4.getText());
				double Urea = Double.parseDouble(textField_5.getText());
				double HCT = Double.parseDouble(textField_6.getText());
				double RBC = Double.parseDouble(textField_7.getText());
				double Lymph = Double.parseDouble(textField_8.getText());
				double Neut = Double.parseDouble(textField_9.getText());
				double WBC = Double.parseDouble(textField_10.getText());
				double MCH = Double.parseDouble(textField_11.getText());
				double EOS = Double.parseDouble(textField_12.getText());
				double TSH = Double.parseDouble(textField_13.getText());
				double Glucose = Double.parseDouble(textField_14.getText());
				
				
				int infectionFlag = 0; // זיהום
				int HighFeverFlag = 0; // גבוהה חום
				int cncerFlag = 0; // סרטן
				int ViralDiseaseFlag = 0; // ויראלית מחלה
				int ImmuneFail = 0; // החיסונית במערכת כשל
				int BacterialInfFlag = 0; // חיידקי זיהום
				int UnCreatBloodCellFlag =0; // הדם תאי ביצירת בעיה
				int AnemiaFlag = 0; // אנמיה
				int InternalBleedingFlag = 0; // פנימיים דימומים
				int KidneydiseasesFlag = 0; // כליה מחלות
				int DehydrationFlag = 0; // התייבשות
				int HighProteinDietFlag = 0; // חלבונים עתירת דיאטה
				int Undernourishment = 0; // תזונה תת
				int LowProteinDietFlag = 0; // חלבון דלת דיאטה
				int IronPoisoningFlag = 0; // ברזל הרעלת
				int HeartDiseases = 0; // לב מחלות
				int Hyperlipidemia = 0; // גבוה כולסטרול
				int Diabetes = 0; // סוכרת
				int Liverdiseases = 0; // כבד מחלות
				int DiseasesBiliaryTract = 0; // המרה בדרכי מחלות
				int PoorNutrition = 0; // לקויה תזונה
				int VitaminDeficiency = 1; //  וויטמינים חוסר
				int bleedingFalg = 0; // דימום
				
				
				
				
				/* WBC */
				if(age >= 18) {
					if(WBC > 11000) {
						DML.addElement("High white Blood Cells\n");
						infectionFlag++;
						HighFeverFlag++;
						cncerFlag++;
					}
					else if(WBC < 4500){
						DML.addElement("Low white Blood Cells\n");
						ViralDiseaseFlag++;
						ImmuneFail++;
					}
				}else if(age >= 4 || age <= 17) {
					if(WBC > 15500) {
						DML.addElement("High white Blood Cells\n");
						infectionFlag++;
						HighFeverFlag++;
						cncerFlag++;
					}
					else if(WBC < 5500){
						DML.addElement("Low white Blood Cells\n");
						ViralDiseaseFlag++;
						ImmuneFail++;
					}
				}else if(age >= 0 || age <= 3) {
					if(WBC > 17500) {
						DML.addElement("High white Blood Cells\n");
						infectionFlag++;
						HighFeverFlag++;
						cncerFlag++;
					}
					else if(WBC < 6000){
						DML.addElement("Low white Blood Cells\n");
						ViralDiseaseFlag++;
						ImmuneFail++;
					}
				}
				
				/* Neut */
				if(Neut > 54){
					DML.addElement("High Neutrophil\n");
					BacterialInfFlag++;
				}else if(Neut < 28) {
					DML.addElement("Low Neutrophil\n");
					BacterialInfFlag++;
					BacterialInfFlag++;
				}
				
				/* Lymph */
				if(Lymph > 52) {
					DML.addElement("High Lymphocytes\n");
					BacterialInfFlag++;
					BacterialInfFlag++;
				}else if(Lymph < 36) {
					DML.addElement("Low Lymphocytes\n");
					UnCreatBloodCellFlag++;
				}
				
				/* RBC */
				if(RBC > 6) {
					DML.addElement("High Lymphocytes\n");
					UnCreatBloodCellFlag++;
				}
				else if(RBC < 4.5) {
					DML.addElement("Low Lymphocytes\n");
					AnemiaFlag++;
					InternalBleedingFlag++;
				}
				
				/* HCT */
				if(radioButtons4[0].isSelected()) {
					if(HCT > 54) {
						DML.addElement("High HEMATOCRIT\n");				
					}
					else if(HCT < 37) {
						DML.addElement("Low HEMATOCRIT\n");
						AnemiaFlag++;
					}
				}else if(radioButtons4[1].isSelected()) {
					if(HCT > 47) {
						DML.addElement("High HEMATOCRIT\n");				
					}
					else if(HCT < 33) {
						DML.addElement("Low HEMATOCRIT\n");
						AnemiaFlag++;
					}
				}
				
				/* Urea */
				if(Urea > 43) {
					DML.addElement("High blood Urea nitrogen\n");
					KidneydiseasesFlag++;
					DehydrationFlag++;
					HighProteinDietFlag++;
					
				}else if(Urea < 17) {
					DML.addElement("Low blood Urea nitrogen\n");
					Undernourishment++;
					LowProteinDietFlag++;
				}
				
				/* Hb */
				if(radioButtons4[0].isSelected() && age > 17) {
					if(Hb < 12){
						DML.addElement("Low Hemoglobin\n");
						AnemiaFlag++;
					}
				}else if(radioButtons4[1].isSelected() && age > 17) {
					if(Hb < 12){
						DML.addElement("Low Hemoglobin\n");
						AnemiaFlag++;
					}
				}else if(age < 17) {
					if(Hb < 11){
						DML.addElement("Low Hemoglobin\n");
						AnemiaFlag++;
					}
				}
				
				/* Crtn */ 
				if(age <= 2 ) {
					if(Crtn > 0.5) {
						DML.addElement("High Creatine\n");
						KidneydiseasesFlag++;
					}
				}else if(age <= 17 && age >=3) {
					if(Crtn > 1) {
						DML.addElement("High Creatine\n");
						KidneydiseasesFlag++;
					}
				}else if(age <= 59 && age >=18) {
					if(Crtn > 1) {
						DML.addElement("High Creatine\n");
						KidneydiseasesFlag++;
					}
				}else if(age >= 60) {
					if(Crtn > 1.2) {
						DML.addElement("High Creatine\n");
						KidneydiseasesFlag++;
					}
				}
				
				/*Iron*/
				if(radioButtons4[0].isSelected()) {
					if(Iron > 160){
						DML.addElement("High Iron\n");
						IronPoisoningFlag++;
					}
				}else if(radioButtons4[1].isSelected()){
					if(Iron > 128){ // 20% less than males
						DML.addElement("High Iron\n");
						IronPoisoningFlag++;
					}
				}
				
				/* HDL */
				if(radioButtons4[0].isSelected()) {
					if(HDL < 29) {
						DML.addElement("Low High Density Lipoprotein\n");
						HeartDiseases++;
						Hyperlipidemia++;
						Diabetes++;
					}
				}else if(radioButtons4[1].isSelected()) {
					if(HDL > 34) {
						DML.addElement("Low High Density Lipoprotein\n");
						HeartDiseases++;
						Hyperlipidemia++;
						Diabetes++;
					}
				}
				
				/* AP */
				if(radioButtons0[0].isSelected()) {
					if(AP > 120) {
						DML.addElement("High Alkaline Phosphatase\n");
						Liverdiseases++;
						DiseasesBiliaryTract++;
						
					}else if(AP < 60) {
						DML.addElement("Low Alkaline Phosphatase\n");
						PoorNutrition++;
						VitaminDeficiency++;
					}
				}else if(radioButtons0[1].isSelected()) {
					if(AP > 90) {
						DML.addElement("High Alkaline Phosphatase\n");
						Liverdiseases++;
						DiseasesBiliaryTract++;
					}else if(AP < 30) {
						DML.addElement("Low Alkaline Phosphatase\n");
						
					}
				}
				
				
				if(AnemiaFlag!= 0) {
					DML2.addElement("Two 10 mg B12 pills a day for a month.");
				}
				
				if(HighProteinDietFlag!=0) {
					DML2.addElement("Schedule an appointment with a nutritionist.");
				}
				
				if(bleedingFalg!=0) {
					DML2.addElement("To be rushed to the hospital urgently.");
				}
				
				if(Hyperlipidemia!=0) {
					DML2.addElement("Schedule an appointment with a nutritionist");
					DML2.addElement("5 mg pill of Simobil daily for a week.");
				}
			
				if(UnCreatBloodCellFlag!= 0) {
					DML2.addElement("10 mg pill of B12 a day for a month.");
					DML2.addElement("5 mg pill of folic acid a day for a month.");
				}
				
				if(IronPoisoningFlag!= 0) {
					DML2.addElement("Iron Poisoning\r\n"
							+ "To be evacuated to the hospital!");
				}
				
				if(DehydrationFlag!=0) {
					DML2.addElement("Dehydration, complete rest when lying down.");
					DML2.addElement("returning fluids to drinking.");
				}
				
				if(infectionFlag!=0) {
					DML2.addElement("Dedicated antibiotics.");
				}
				
				if(VitaminDeficiency!=0) {
					DML2.addElement("Vitamin deficiency referral for a blood ");
					DML2.addElement("test to identify the missing vitamins.");
				}
				
				if(ViralDiseaseFlag!=0) {
					DML2.addElement("Viral illness, rest at home.");
				}
				
				if(DiseasesBiliaryTract!=0) {
					DML2.addElement("Referral to surgical treatment for biliary tract disease.");
				}
				
				if(HeartDiseases!=0) {
					DML2.addElement("Schedule an appointment with a nutritionist due to heart disease.");
				}
				
				if(bleedingFalg!=0) {
					DML2.addElement("A combination of cyclophosphamide and corticosteroids.");
				}
				
				if(Liverdiseases!=0) {
					DML2.addElement("Referral to a specific diagnosis for the purpose of determining liver treatment.");
				}
				
				if(KidneydiseasesFlag!=0) {
					DML2.addElement("Balance blood sugar levels.");
				}
				
				if(radioButtons[0].isSelected()) {
					DML2.addElement("Stop Smoking.");
				}
				
				if(age > 18 && Diabetes!=0) {
					DML2.addElement("Insulin adjustment for the patient");
				}
				
				if(cncerFlag!=0) {
					DML2.addElement("Entrectinib.");
				}
				
				if(PoorNutrition!=0) {
					DML2.addElement("Schedule an appointment with a nutritionist.");
				}

				}catch (NumberFormatException o) {
					JOptionPane.showMessageDialog(null, "Error: Medical indices are required");
				}
			
				String dig = null;
				String rec = null;
				
				for(int i =0; i < DML.getSize(); i++) {
					dig = dig + DML.getElementAt(i);
				}
				for(int i =0; i < DML2.getSize(); i++) {
					rec = rec + DML2.getElementAt(i);
				}
				
				
				int c = 0;
				for(int r = 1; r <= rows; r++){
					XSSFRow row = sheet.getRow(r);
					XSSFCell cell = row.getCell(c);
					XSSFCell firstname = row.getCell(0);
					XSSFCell lastname = row.getCell(1);
					XSSFCell idnum = row.getCell(2);
					
					
					try {
						if(cell != null) {
							cell = row.getCell(0);
							if(txtMoshe.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Error: First name required");
								return;
							}
							else if(txtDavidian.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Error: Last name required");
								return;
							}
							else if(textField_17.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Error: ID required");
								return;
							}
							int id = (int) idnum.getNumericCellValue();
							int txtid = Integer.parseInt(textField_17.getText());
							if(firstname.getStringCellValue().equals(txtMoshe.getText()) &&  
									lastname.getStringCellValue().equals(txtDavidian.getText()) &&
									(id == txtid)) {
								XSSFCell cell0 = null;
								cell0 = row.createCell(20);
								cell0.setCellValue(dig);
								cell0 = row.createCell(21);
								cell0.setCellValue(rec);
							}else {
								//JOptionPane.showMessageDialog(null, "Error: Wrong details555, Try again");
								//return;
							}
						}
					}catch (NullPointerException e1) {
						JOptionPane.showMessageDialog(null, "Error: Wrong details, Try again");
						System.out.print("NullPointerException caught");
						}
					catch(NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error: Wrong details, Try again");
						System.out.print("NumberFormatException caught");
					}
				}
				
				try {
				FileOutputStream out;
				
				out = new FileOutputStream(ex1);
				workbook.write(out);
				out.flush();
				out.close();
				} catch (java.io.FileNotFoundException e1) {
					System.out.println("FileNotFoundException raised");
				}catch (IOException e1) {
					e1.printStackTrace();
				}
		}	
		});
		
		
		btnNewButton_1.setBounds(744, 625, 85, 21);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("List of patients");
		btnNewButton_2.setBounds(45, 75, 116, 21);
		add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ButtonListener(this,btnNewButton_2));
		
		JButton btnNewButton_3 = new JButton("Add new patient ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnteringMedicalIndices EMI = null;
				try {
					EMI = new EnteringMedicalIndices();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EMI.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(168, 75, 128, 21);
		add(btnNewButton_3);

	}
}

class ButtonListener implements ActionListener{
	
	private DrPanel panel;
	
	public ButtonListener(DrPanel p, JButton b){  
		   panel = p;
	   }
	
	public void actionPerformed(ActionEvent e){
		ListOfPatients list = null;
		try {
			list = new ListOfPatients(panel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		list.setVisible(true);
	}
}