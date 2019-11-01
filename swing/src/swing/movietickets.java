package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import javax.swing.JRadioButton;

public class movietickets {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movietickets window = new movietickets();
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
	public movietickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setBounds(150, 11, 204, 26);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 39, 99, 14);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 91, 219, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(172, 91, 1, 200);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(228, 91, 1, 296);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(228, 91, 1, 332);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(228, 91, 1, 325);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(228, 91, 1, 345);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 204, 219, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(228, 91, 1, 345);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(228, 91, 1, 332);
		frame.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(243, 91, 1, 345);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(10, 330, 219, 2);
		frame.getContentPane().add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(232, 91, -3, 311);
		frame.getContentPane().add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(239, 91, 1, 362);
		frame.getContentPane().add(separator_12);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(239, 88, 1, 348);
		frame.getContentPane().add(verticalStrut);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setBounds(239, 91, 1, 337);
		frame.getContentPane().add(verticalStrut_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(0, 114, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBounds(121, 114, 204, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnFristClass = new JRadioButton("Frist Class");
		rdbtnFristClass.setBounds(0, 156, 109, 23);
		frame.getContentPane().add(rdbtnFristClass);
		
		JRadioButton rdbtnAc = new JRadioButton("Ac");
		rdbtnAc.setBounds(135, 156, 109, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(286, 156, 121, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(10, 91, 466, 2);
		frame.getContentPane().add(separator_13);
		
		JRadioButton rdbtnSleeper_1 = new JRadioButton("Sleeper");
		rdbtnSleeper_1.setBounds(179, 156, 109, 23);
		frame.getContentPane().add(rdbtnSleeper_1);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setBounds(10, 204, 310, 2);
		frame.getContentPane().add(separator_14);
		
		JRadioButton rdbtnSleeper_2 = new JRadioButton("Sleeper");
		rdbtnSleeper_2.setBounds(179, 156, 109, 23);
		frame.getContentPane().add(rdbtnSleeper_2);
		
		JRadioButton rdbtnSleeper_3 = new JRadioButton("Sleeper");
		rdbtnSleeper_3.setBounds(228, 156, 109, 23);
		frame.getContentPane().add(rdbtnSleeper_3);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(193, 156, 109, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton rdbtnSleeper_4 = new JRadioButton("Sleeper");
		rdbtnSleeper_4.setBounds(228, 114, 109, 23);
		frame.getContentPane().add(rdbtnSleeper_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(220, 114, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSleeper_6 = new JRadioButton("Sleeper");
		rdbtnSleeper_6.setBounds(245, 156, 109, 23);
		frame.getContentPane().add(rdbtnSleeper_6);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(432, 156, 204, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JRadioButton rdbtnTicket = new JRadioButton("Ticket");
		rdbtnTicket.setBounds(346, 111, 61, 26);
		frame.getContentPane().add(rdbtnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(428, 114, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setBounds(308, 91, -79, 2);
		frame.getContentPane().add(separator_15);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setBounds(10, 204, 466, 2);
		frame.getContentPane().add(separator_16);
	}
}
