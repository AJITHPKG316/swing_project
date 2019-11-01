package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPasswordField;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class project1 {

	protected static final double USA = 0;
	private JFrame frame;
	private JTextField textField;
	double n1,n2,result;
	String op,ans;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project1 window = new project1();
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
	public project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 990, 301);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 974, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String b=null;
				if(textField.getText().length()>0)
				{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				b=str.toString();
				textField.setText(b);
				}

			}
		});
		button.setBounds(10, 96, 64, 23);
		frame.getContentPane().add(button);
		

		
		textField = new JTextField();
		textField.setBounds(10, 32, 662, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnCe.setBounds(84, 96, 64, 23);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(158, 96, 64, 23);
		frame.getContentPane().add(btnC);
		
		JButton button_1 = new JButton("+_");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Number=textField.getText()+button_1.getText();
				//textField.setText(Number);

			}
		});
		button_1.setBounds(232, 96, 64, 23);
		frame.getContentPane().add(button_1);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.sqrt(n1);
	                textField.setText(String.valueOf(n1));

			}
		});
		btnSqrt.setBounds(309, 96, 64, 23);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.log(n1);
	                textField.setText(String.valueOf(n1));


			}
		});
		btnL.setBounds(387, 96, 62, 23);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.sin(n1);
	                textField.setText(String.valueOf(n1));
			}
			
		});
		btnSin.setBounds(460, 96, 64, 23);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.sinh(n1);
	                textField.setText(String.valueOf(n1));

			}
		});
		btnSinh.setBounds(534, 96, 64, 23);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
				 textField.setText("");
				 op="mod";
			}
		});
		btnMod.setBounds(608, 96, 64, 23);
		frame.getContentPane().add(btnMod);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);

			}
		});
		button_2.setBounds(10, 124, 64, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);

			}
		});
		button_3.setBounds(84, 124, 64, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);

			}
		});
		button_4.setBounds(158, 130, 64, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("/");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";


			}
		});
		button_5.setBounds(232, 130, 64, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("%");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=n1/100;
				textField.setText(String.valueOf(n1));

			}
		});
		button_6.setBounds(309, 130, 64, 23);
		frame.getContentPane().add(button_6);
		
		JButton btnPie = new JButton("Pie");
		btnPie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnPie.getText();
				textField.setText("3.14");

			}
		});
		btnPie.setBounds(387, 130, 64, 23);
		frame.getContentPane().add(btnPie);
		
		JButton btnCos = new JButton("Cos");
		
		
			
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.cosh(n1);
	                textField.setText(String.valueOf(n1));

			
			}
		});
		btnCosh.setBounds(534, 130, 64, 23);
		frame.getContentPane().add(btnCosh);
		
		JButton btnInx = new JButton("inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.log(n1);
	                textField.setText(String.valueOf(n1));

			}
		});
		btnInx.setBounds(608, 130, 64, 23);
		frame.getContentPane().add(btnInx);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);

				
			}
		});
		button_7.setBounds(10, 153, 64, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);

			}
		});
		button_8.setBounds(84, 158, 61, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);

			}
		});
		button_9.setBounds(158, 158, 64, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";

			}
		});
		button_10.setBounds(232, 158, 64, 23);
		frame.getContentPane().add(button_10);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=1/n1;
				textField.setText(String.valueOf(n1));
			}
		});
		btnx.setBounds(309, 164, 64, 23);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
				 textField.setText("");
				 op="x^y";
			}
		});
		btnXy.setBounds(385, 164, 64, 23);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.tan(n1);
	                textField.setText(String.valueOf(n1));

			}
			
		});
		btnTan.setBounds(460, 164, 64, 23);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.tanh(n1);
	                textField.setText(String.valueOf(n1));

			}
		});
		btnTanh.setBounds(534, 164, 64, 23);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);

			}
		});
		btnC_1.setBounds(608, 164, 64, 23);
		frame.getContentPane().add(btnC_1);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			String Number=textField.getText()+button_11.getText();
			textField.setText(Number);
			}
		});
		button_11.setBounds(10, 187, 64, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);

				
			}
		});
		button_12.setBounds(84, 187, 64, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);

			}
		});
		button_13.setBounds(158, 192, 64, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";

			}
		});
		button_14.setBounds(232, 192, 64, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
				result=n1+n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="-")
				{
				result=n1-n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="*")
				{
				result=n1*n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="/")
				{
				result=n1/n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="mod")
				{
				result=n1%n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="cbr")
				{
					n1=Double.parseDouble(textField.getText());
					n1=(n1/n2)*100;
               
	                textField.setText(String.valueOf(n1));

				}
				if(op=="x^y") {
					n1=Double.parseDouble(textField.getText());
					n1=Math.pow(n1,n2);
	                textField.setText(String.valueOf(n1));

				}
			}
		});
		button_15.setBounds(309, 193, 64, 58);
		frame.getContentPane().add(button_15);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.pow(n1,2);
                textField.setText(String.valueOf(n1));

			}
		});
		btnX.setBounds(385, 192, 64, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnRund.getText();
				textField.setText(Number);

			}
		});
		btnRund.setBounds(534, 192, 64, 23);
		frame.getContentPane().add(btnRund);
		
		JButton btnpie = new JButton("2*pie");
		btnpie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            n1=2*3.14;
            textField.setText(String.valueOf(n1));
			}
		});
		btnpie.setBounds(608, 192, 64, 23);
		frame.getContentPane().add(btnpie);
		
		JButton button_16 = new JButton("0");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_16.getText();
				textField.setText(Number);

			}
		});
		button_16.setBounds(10, 227, 138, 29);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton(".");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_17.getText();
				textField.setText(Number);

			}
		});
		button_17.setBounds(158, 227, 64, 29);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("+");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_18.getText();
				textField.setText(Number);


				 n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				 op = "+";

			}
		});
		button_18.setBounds(232, 226, 64, 29);
		frame.getContentPane().add(button_18);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.pow(n1,3);
                textField.setText(String.valueOf(n1));

			}
		});
		btnX_1.setBounds(387, 222, 62, 29);
		frame.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
           int a=Integer.parseInt(textField.getText());
           textField.setText(Integer.toBinaryString(a));
				
			}
		});
		btnBin.setBounds(460, 225, 69, 23);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		           int a=Integer.parseInt(textField.getText());
		           textField.setText(Integer.toHexString(a));

			}
		});
		btnHex.setBounds(534, 225, 64, 23);
		frame.getContentPane().add(btnHex);
		
		JButton btnOct = new JButton("OCT");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		           int a=Integer.parseInt(textField.getText());
		           textField.setText(Integer.toOctalString(a));

			}
		});
		btnOct.setBounds(608, 225, 64, 23);
		frame.getContentPane().add(btnOct);
		
		JMenuItem mntmStd = new JMenuItem("Std");
		mntmStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 387, 311);
				textField.setBounds(10, 32, 336, 41);
				
			}
			
		});
		mnFile.add(mntmStd);
		
		JMenuItem mntmScintific = new JMenuItem("Scintific");
		mntmScintific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 707, 303);
				textField.setBounds(10, 32, 662, 41);
				
			}
		});
		mnFile.add(mntmScintific);
		
		JMenuItem mntmUnitConverter = new JMenuItem("unit converter");
		mntmUnitConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 990, 301);
			}
			
		});
		mnFile.add(mntmUnitConverter);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
		
		JButton btnCos_1 = new JButton("Cos");
		btnCos_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 n1=Double.parseDouble(textField.getText());
	                n1=Math.cos(n1);
	                textField.setText(String.valueOf(n1));

			}
		});
		btnCos_1.setBounds(460, 130, 64, 23);
		frame.getContentPane().add(btnCos_1);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=Double.parseDouble(textField.getText());
	                
	                textField.setText("");
                     op="cbr";
			}
		});
		btnCbr.setBounds(456, 192, 68, 23);
		frame.getContentPane().add(btnCbr);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setForeground(Color.YELLOW);
		panel.setBounds(700, 47, 262, 215);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 71, 232, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblConverter = new JLabel("Converter");
		lblConverter.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblConverter.setBounds(79, 11, 173, 30);
		panel.add(lblConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"India", "USA", "UK"}));
		comboBox.setBounds(20, 40, 226, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(30, 102, 222, 30);
		panel.add(lblNewLabel);
		double india=30.0;double USA=20.0;double UK=10;
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"));{
					String c=String.format("RS %.2f," , dp*india);
					lblNewLabel.setText(c);
					
				}
				if(comboBox.getSelectedItem().equals("USA"));{
					String c=String.format("$ %.2f," , dp*USA);
					lblNewLabel.setText(c);
					

				}
				if(comboBox.getSelectedItem().equals("UK"));{
					String c=String.format("Pound %.2f," , dp*UK);
					lblNewLabel.setText(c);
				}
			}
		});
		btnConverter.setBounds(22, 166, 89, 23);
		panel.add(btnConverter);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem(null);
				textField_1.setText(null);
				lblNewLabel.setText(null);
			}
		});
		btnClear.setBounds(132, 166, 89, 23);
		panel.add(btnClear);
		
		
	}
}
