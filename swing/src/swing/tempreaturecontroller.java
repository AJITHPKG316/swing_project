package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class tempreaturecontroller {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtToCelsius;
	private JTextField txtToFahrenhelt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempreaturecontroller window = new tempreaturecontroller();
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
	public tempreaturecontroller() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 323, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 143, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblDegrees);
		
		JLabel lblResult = new JLabel("Result=");
		lblResult.setBounds(21, 51, 46, 14);
		frame.getContentPane().add(lblResult);
		
		txtToCelsius = new JTextField();
		txtToCelsius.setBackground(UIManager.getColor("ToolBar.light"));
		txtToCelsius.setText("To Celsius");
		txtToCelsius.setBounds(10, 95, 86, 20);
		frame.getContentPane().add(txtToCelsius);
		txtToCelsius.setColumns(10);
		
		txtToFahrenhelt = new JTextField();
		txtToFahrenhelt.setBackground(UIManager.getColor("ToolBar.light"));
		txtToFahrenhelt.setText("To Fahrenhelt");
		txtToFahrenhelt.setBounds(123, 95, 86, 20);
		frame.getContentPane().add(txtToFahrenhelt);
		txtToFahrenhelt.setColumns(10);
	}

}
