import java.awt.Font;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.Color;


public class ListOfPatients extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel;
	
	String ex1 = ".\\datafile\\Output.xlsx";
	
	FileInputStream inputstream = new FileInputStream(ex1);
	
	XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	int rows = sheet.getLastRowNum();
	int cols = sheet.getRow(1).getLastCellNum();
	
	public ListOfPatients(JPanel p) throws IOException {
		setTitle(" List of patients");
		panel = p;
		getContentPane().setLayout(null);
		setSize(381, 600);
		JTable table;
		
		JLabel lblNewLabel_1_5 = new JLabel("List of patients:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(1182, 40, 138, 13);
		getContentPane().add(lblNewLabel_1_5);
		
		DefaultTableModel DTM = new DefaultTableModel();
		Object[] column = {"First Name", "Last Name", "ID"};
		DTM.setColumnIdentifiers(column);
		
		for(int r = 1; r <= rows; r++){
			
			XSSFRow row = sheet.getRow(r);
			XSSFCell firstname = row.getCell(0);
			XSSFCell lastname = row.getCell(1);
			XSSFCell idnum = row.getCell(2);
			
			int id = (int) idnum.getNumericCellValue();

			Object[] new_row = {firstname, lastname, id};
			DTM.addRow(new_row);
			
			}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 10, 350, 551);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(DTM);
	}
}
