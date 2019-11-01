package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTree;
import javax.swing.JTextArea;

public class studentrecords {

	private static final Object Student = null;
	private static final Object Course = null;
	private static final Object Maths = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_9;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentrecords window = new studentrecords();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentrecords() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 965, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 2, 0, 507);
		frame.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 0, 949, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(396, 303, 22, -88);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(948, 0, -40, 24);
		frame.getContentPane().add(separator_6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "student Deatils", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 359, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentId = new JLabel("Student_ ID");
		lblStudentId.setBounds(10, 41, 58, 14);
		panel.add(lblStudentId);
		
		JLabel lblFristName = new JLabel("Frist Name");
		lblFristName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFristName.setBounds(10, 79, 98, 14);
		panel.add(lblFristName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSurname.setBounds(10, 104, 85, 14);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCourseCode.setBounds(10, 132, 124, 14);
		panel.add(lblCourseCode);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTotalScore.setBounds(10, 204, 98, 14);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAverage.setBounds(21, 232, 98, 14);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRanking.setBounds(21, 260, 42, 14);
		panel.add(lblRanking);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			
		});
		textField.setBounds(73, 38, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		
		textField_1.setColumns(10);
		textField_1.setBounds(73, 72, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(73, 101, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(73, 201, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(73, 229, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(73, 257, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(193, 14, 46, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(193, 41, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(193, 75, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(193, 104, 74, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setBounds(193, 132, 50, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setBounds(193, 179, 46, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(193, 232, 46, 14);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(193, 260, 74, 14);
		panel.add(lblMalayalam);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
				
			}
		});
		textField_7.setBounds(263, 11, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
                char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                    e.consume();

                }
		});
		textField_8.setBounds(263, 38, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
                char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                    e.consume();

			
			
			
			
			
			}
		});
		textField_10.setBounds(263, 101, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
                char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                    e.consume();


			}
		});
		textField_11.setBounds(263, 129, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {                 char num=e.getKeyChar();
            if(!(Character.isDigit(num))
                    ||(num==KeyEvent.VK_BACK_SPACE)
                    ||(num==KeyEvent.VK_DELETE)) 
                e.consume();


			}
		});
		textField_12.setBounds(263, 176, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
                char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                    e.consume();


			}
		});
		textField_13.setBounds(263, 229, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
                char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                    e.consume();


			}
		});
		textField_14.setBounds(263, 257, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
                char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) 
                    e.consume();

			}
		});
		textField_9.setBounds(263, 72, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(94, 132, 1, 2);
		panel.add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 154, 164, 2);
		panel.add(separator_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"123764", "456085", "324589", "231045", "345638", "569067"}));
		comboBox.setBounds(73, 129, 86, 20);
		panel.add(comboBox);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student ID","Course_name","maths","English","Biology","Computer", "Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 391, 929, 52);
		frame.getContentPane().add(table);
		
		JButton btnAddReport = new JButton("Add report");
		btnAddReport.setForeground(new Color(154, 205, 50));
		btnAddReport.setBackground(new Color(240, 240, 240));
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int maths=Integer.parseInt(textField_7.getText());
				int English=Integer.parseInt(textField_8.getText());
				int Biology=Integer.parseInt(textField_9.getText());
				int Computer=Integer.parseInt(textField_10.getText());
				int Chemistry=Integer.parseInt(textField_11.getText());
				int Physics=Integer.parseInt(textField_12.getText());
				int Tamil=Integer.parseInt(textField_13.getText());
				int Malayalam=Integer.parseInt(textField_14.getText());
				int Total;
                Total=maths+English+Biology+Computer+Chemistry+Physics+Tamil+Malayalam;
				int avg=Total/8;
                String st=String.format("%d",Total);
                textField_4.setText(st);
                String aveg=String.format("%d",avg);
                textField_5.setText(aveg);
                 if(Total>700) {
                 
                	 textField_6.setText("1");
                 }
                	else if(Total<700&&Total>600)
                	{
                    
                     
                	 textField_6.setText("2");
                	}
                    	 else if(Total<600&&Total>500)
                    	 {
                     
                     
                    	 textField_6.setText("3");
                    	 }
                    	 else if(Total<500&&Total>400)
                    	 {
                         
                         
                    	 textField_6.setText("4");
                    	 }
                        	 else if(Total<400&&Total>300)
                        	 {
                        
                         
                        	 textField_6.setText("5");
                        	 }
                        	 else if(Total<300&&Total>200)
                        	 {
                             
                          
                        	 textField_6.setText("6");
                        	 }
                            	 else if(Total<200&&Total>100)
                            	 {
                             
                             
                            	 textField_6.setText("7");
                            	 }
                            	 else if(Total<100)
                            	 {
                             
                             
                            	 textField_6.setText("Fail");
                            	 }
                                 DefaultTableModel Model=(DefaultTableModel) table.getModel();
                            Model.addRow(new String[]{
                            		textField.getText(),
                            		(String)comboBox.getSelectedItem(),
                                	textField_7.getText(),
                                	textField_8.getText(),
                                	textField_9.getText(),
                                	textField_10.getText(),
                                	textField_11.getText(),
                                	textField_12.getText(),
                                	textField_13.getText(),
                                	textField_14.getText(),
                                	textField_4.getText(),
                                	textField_5.getText(),
                                	textField_6.getText(),

                            });
			}
                                            
		});
		btnAddReport.setBounds(154, 463, 89, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row =table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(row);
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setBounds(273, 463, 89, 23);
		frame.getContentPane().add(btnDelete);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Student Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(363, 13, 575, 353);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 22, 543, 275);
		panel_1.add(textArea);
		JButton btnShowReport = new JButton("Show report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Report\n"
						+"Student Name:\t\t"+textField_1.getText()+" "+textField_2.getText()
						+"\n"+"==========="+"\n math:\t\t"+textField_7.getText()
						+"\n  English:\t\t"+textField_8.getText()
						+"\n Biology:\t\t"+textField_9.getText()
						+"\n Computer:\t\t"+textField_10.getText()
						+"\n Chemistry:\t\t"+textField_11.getText()
						+"\n Physics:\t\t"+textField_12.getText()
						+"\n Tamil:\t\t"+textField_13.getText()
						+"\n Malayalam:\t\t"+textField_14.getText()
						+"\n"+"==========="+"\n "
						+"\n  Total Score:\t\t"+textField_4.getText()
						+"\n  Average:\t\t"+textField_5.getText()
						+"\n  Ranking:\t\t"+textField_6.getText()

						);


						
			}
		});
		btnShowReport.setForeground(Color.BLUE);
		btnShowReport.setBounds(396, 454, 112, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 69, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(537, 463, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField .setText(null);
				textField_1 .setText(null);
				textField_2 .setText(null);
				textField_4 .setText(null);
				textField_5 .setText(null);
				textField_6 .setText(null);
				textField_7 .setText(null);
				textField_8 .setText(null);
				textField_9 .setText(null);
				textField_10 .setText(null);
				textField_11.setText(null);
				textField_12 .setText(null);
				textField_13 .setText(null);
				textField_14 .setText(null);

				comboBox.setSelectedItem(null);

			}

			private void setText(Object object) {
				// TODO Auto-generated method stub
				
			}
		});
		btnReset.setForeground(new Color(30, 144, 255));
		btnReset.setBounds(661, 463, 89, 23);
		frame.getContentPane().add(btnReset);
		
		
		
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
			
		});
		btnClear.setBounds(237, 308, 89, 23);
		panel_1.add(btnClear);
	}
}
