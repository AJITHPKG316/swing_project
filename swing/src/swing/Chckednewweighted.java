package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Chckednewweighted {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chckednewweighted window = new Chckednewweighted();
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
	public Chckednewweighted() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 289, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 264, 253, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.GREEN);
		panel_3.setBounds(0, 0, 253, 82);
		panel.add(panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(10, 87, 253, 166);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m)");
		lblHeightm.setBounds(23, 27, 47, 14);
		panel_1.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg)");
		lblWeightkg.setBounds(23, 66, 58, 14);
		panel_1.add(lblWeightkg);
		
		textField = new JTextField();
		textField.setBounds(97, 24, 131, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 63, 131, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(24, 115, 46, 14);
		panel_1.add(lblBmi);
		
		JLabel label = new JLabel("");
		label.setBounds(70, 115, 46, 14);
		panel_1.add(label);
		

		JLabel label_1 = new JLabel("");
		label_1.setBounds(167, 115, 46, 14);
		panel_1.add(label_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  double num1 = Double.parseDouble(textField.getText());
				  double num2 = Double.parseDouble(textField.getText());
				double res = (num1/num2/num2)*10000;
				String ans=String.format("2f", res);
				
				label.setText(ans);
				if(res<18.5)
				{
					
					label_1.setText("Under Weight");

				}
			}
		});
		btnOk.setBounds(10, 140, 89, 23);
		panel_1.add(btnOk);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(124, 140, 89, 23);
		panel_1.add(btnC);
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setForeground(Color.GREEN);
		panel_2.setBounds(10, 11, 253, 65);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("BODY MASS INDEX");
		lblBodyMassIndex.setBounds(73, 21, 170, 20);
		panel_2.add(lblBodyMassIndex);
	}
}
