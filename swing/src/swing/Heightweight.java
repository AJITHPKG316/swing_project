package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Heightweight {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=51,9
	 */
	private final JTextField textField = new JTextField();
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Heightweight window = new Heightweight();
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
	public Heightweight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 55, 105, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 132, 104, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOk.setBounds(99, 203, 89, 20);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(262, 202, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(277, 30, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblM = new JLabel("1.75 m");
		lblM.setBounds(277, 58, 46, 14);
		frame.getContentPane().add(lblM);
		
		JLabel lblkg = new JLabel("79kg");
		lblkg.setBounds(277, 135, 46, 14);
		frame.getContentPane().add(lblkg);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(49, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblUsMeasurment = new JLabel("Us Measurment");
		lblUsMeasurment.setBounds(99, 30, 89, 14);
		frame.getContentPane().add(lblUsMeasurment);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(28, 58, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(28, 138, 46, 14);
		frame.getContentPane().add(lblWeight);
	}
}
