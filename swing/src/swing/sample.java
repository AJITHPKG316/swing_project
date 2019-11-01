package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;

public class sample {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
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
	public sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 45));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCheapThrils = new JButton(new ImageIcon("C:\\Users\\USER\\Downloads\\iconfinder_Java_program_programming_file_extension_3044874.png"));
		btnCheapThrils.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(new MigLayout("", "[217px][97px,grow][]", "[1px][44px][26px][14px][8px][20px][7px][23px][7px][34px][23px]"));
		btnCheapThrils.setFont(new Font("Verdana", Font.BOLD, 18));
		btnCheapThrils.setBackground(Color.RED);
		frame.getContentPane().add(btnCheapThrils, "flowy,cell 0 1 1 8,grow");
		
		txtUsername = new  JTextField();
		txtUsername.setText("username");
		frame.getContentPane().add(txtUsername, "cell 1 1,alignx right,aligny bottom");
		txtUsername.setColumns(10);
		
		JLabel lblUserNamel = new JLabel("user Namel");
		frame.getContentPane().add(lblUserNamel, "cell 2 1,alignx center,aligny top");
		
		txtPassword = new JPasswordField();
		txtPassword.setText("password");
		frame.getContentPane().add(txtPassword, "cell 1 5,alignx right,aligny top");
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		frame.getContentPane().add(lblNewLabel, "cell 0 0,alignx left,growy");
		
		JLabel lblPassword = new JLabel("password");
		frame.getContentPane().add(lblPassword, "cell 1 3,alignx left,aligny top");
		
		JButton btnSignUp = new JButton("sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JComboBox comboBox = new JComboBox();
		frame.getContentPane().add(comboBox, "cell 1 8,growx");
		frame.getContentPane().add(btnSignUp, "cell 1 10,growx,aligny top");
		
		JButton btnSignIn = new JButton("sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnSignIn, "cell 1 9,growx,aligny top");
		
		JCheckBox chckbxRemember = new JCheckBox("remember");
		frame.getContentPane().add(chckbxRemember, "cell 1 7,growx,aligny top");
		
		JButton btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton, "cell 0 8");
	}
}
