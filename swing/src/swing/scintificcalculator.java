package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JPanel;

public class scintificcalculator {

private JFrame frame;
private JTextField textField;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
scintificcalculator window = new scintificcalculator();
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
public scintificcalculator() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 545, 281);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

textField = new JTextField();
textField.setBounds(10, 33, 546, 37);
frame.getContentPane().add(textField);
textField.setColumns(10);

JLabel lblEdit = new JLabel("Edit");
lblEdit.setBounds(10, 11, 46, 14);
frame.getContentPane().add(lblEdit);

JLabel lblView = new JLabel("View");
lblView.setBounds(39, 11, 46, 14);
frame.getContentPane().add(lblView);

JLabel lblHelp = new JLabel("Help");
lblHelp.setBounds(79, 11, 46, 14);
frame.getContentPane().add(lblHelp);

JLabel lblScientific = new JLabel("Scientific");
lblScientific.setBounds(10, 89, 46, 14);
frame.getContentPane().add(lblScientific);

JLabel lblStandard = new JLabel("Standard");
lblStandard.setBounds(290, 89, 46, 14);
frame.getContentPane().add(lblStandard);

JButton btnSqrt = new JButton("Sqrt");
btnSqrt.setBounds(10, 114, 67, 23);
frame.getContentPane().add(btnSqrt);

JButton btnx = new JButton("1/X");
btnx.setBounds(97, 114, 67, 23);
frame.getContentPane().add(btnx);

JButton btnSin = new JButton("Sin");
btnSin.setBounds(177, 114, 67, 23);
frame.getContentPane().add(btnSin);

JButton button = new JButton("%");
button.setBounds(10, 150, 67, 23);
frame.getContentPane().add(button);

JButton btnExp = new JButton("Exp");
btnExp.setBounds(97, 150, 67, 23);
frame.getContentPane().add(btnExp);

JButton btnCos = new JButton("Cos");
btnCos.setBounds(177, 148, 67, 23);
frame.getContentPane().add(btnCos);

JButton btnXy = new JButton("X^Y");
btnXy.setBounds(10, 184, 75, 23);
frame.getContentPane().add(btnXy);

JToggleButton tglbtnIn = new JToggleButton("in");
tglbtnIn.setBounds(97, 184, 67, 23);
frame.getContentPane().add(tglbtnIn);

JButton btnTan = new JButton("tan");
btnTan.setBounds(177, 184, 67, 23);
frame.getContentPane().add(btnTan);

JButton btnX = new JButton("X^2");
btnX.setBounds(10, 218, 75, 23);
frame.getContentPane().add(btnX);

JButton btnN = new JButton("n!");
btnN.setBounds(97, 218, 67, 23);
frame.getContentPane().add(btnN);

JButton btnSec = new JButton("Sec");
btnSec.setBounds(177, 218, 67, 23);
frame.getContentPane().add(btnSec);

JButton button_1 = new JButton("0");
button_1.setBounds(254, 218, 67, 23);
frame.getContentPane().add(button_1);

JButton button_2 = new JButton(".");
button_2.setBounds(324, 218, 66, 23);
frame.getContentPane().add(button_2);

JButton button_3 = new JButton("=");
button_3.setBounds(400, 218, 61, 23);
frame.getContentPane().add(button_3);

JButton button_4 = new JButton("+");
button_4.setBounds(477, 218, 51, 23);
frame.getContentPane().add(button_4);

JButton button_5 = new JButton("1");
button_5.setBounds(254, 184, 67, 23);
frame.getContentPane().add(button_5);

JButton button_6 = new JButton("2");
button_6.setBounds(324, 184, 61, 23);
frame.getContentPane().add(button_6);

JButton button_7 = new JButton("3");
button_7.setBounds(395, 184, 62, 23);
frame.getContentPane().add(button_7);

JButton button_8 = new JButton("-");
button_8.setBounds(467, 184, 61, 23);
frame.getContentPane().add(button_8);

JButton button_9 = new JButton("4");
button_9.setBounds(254, 150, 67, 23);
frame.getContentPane().add(button_9);

JButton button_11 = new JButton("6");
button_11.setBounds(395, 150, 61, 23);
frame.getContentPane().add(button_11);

JButton button_10 = new JButton("5");
button_10.setBounds(324, 150, 61, 23);
frame.getContentPane().add(button_10);

JButton button_12 = new JButton("7");
button_12.setBounds(254, 114, 67, 23);
frame.getContentPane().add(button_12);

JButton button_13 = new JButton("8");
button_13.setBounds(324, 114, 61, 23);
frame.getContentPane().add(button_13);

JButton button_14 = new JButton("9");
button_14.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
button_14.setBounds(395, 114, 62, 23);
frame.getContentPane().add(button_14);

JButton button_15 = new JButton("*");
button_15.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
button_15.setBounds(467, 150, 61, 23);
frame.getContentPane().add(button_15);

JButton button_16 = new JButton("/");
button_16.setBounds(467, 114, 61, 23);
frame.getContentPane().add(button_16);

JTextPane textPane = new JTextPane();
textPane.setBounds(10, 117, 46, -1);
frame.getContentPane().add(textPane);

JPanel panel = new JPanel();
panel.setBounds(10, 101, 234, 142);
frame.getContentPane().add(panel);

JPanel panel_1 = new JPanel();
panel_1.setBounds(254, 106, 67, -3);
frame.getContentPane().add(panel_1);

JPanel panel_2 = new JPanel();
panel_2.setBounds(254, 101, 275, 142);
frame.getContentPane().add(panel_2);
}

void Calc()
{
JFrame f = new JFrame("Calculator");
JTextField t = new JTextField();
JButton b1 = new JButton("1");
JButton b2 = new JButton("2");
JButton b3 = new JButton("3");
JButton b4 = new JButton("4");
JButton b5 = new JButton("5");
JButton b6 = new JButton("6");
JButton b7 = new JButton("7");
JButton b8 = new JButton("8");
JButton b9 = new JButton("9");
JButton b0 = new JButton("0");
JButton bdiv = new JButton("/");
JButton bmul = new JButton("*");
JButton bsub = new JButton("-");
JButton badd = new JButton("+");
JButton bdec = new JButton(".");
JButton beq = new JButton("=");
JButton bdel = new JButton("Delete");
JButton bclr = new JButton("Clear");
t.setBounds(30,40,280,30);
b7.setBounds(40,100,50,40);
b8.setBounds(110,100,50,40);
b9.setBounds(180,100,50,40);
bdiv.setBounds(250,100,50,40);
b4.setBounds(40,170,50,40);
b5.setBounds(110,170,50,40);
b6.setBounds(180,170,50,40);
bmul.setBounds(250,170,50,40);
b1.setBounds(40,240,50,40);
b2.setBounds(110,240,50,40);
b3.setBounds(180,240,50,40);
bsub.setBounds(250,240,50,40);
bdec.setBounds(40,310,50,40);
b0.setBounds(110,310,50,40);
beq.setBounds(180,310,50,40);
badd.setBounds(250,310,50,40);
bdel.setBounds(60,380,100,40);
bclr.setBounds(180,380,100,40);
f.add(t);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(bdiv);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(bmul);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(bsub);
f.add(bdec);
f.add(b0);
f.add(beq);
f.add(badd);
f.add(bdel);
f.add(bclr);
f.setLayout(null);
f.setVisible(true);
f.setSize(350,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bdiv.addActionListener(this);
bmul.addActionListener(this);
bsub.addActionListener(this);
bdec.addActionListener(this);
beq.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("1"));
if(e.getSource()==b2)
t.setText(t.getText().concat("2"));
if(e.getSource()==b3)
t.setText(t.getText().concat("3"));
if(e.getSource()==b4)
t.setText(t.getText().concat("4"));
if(e.getSource()==b5)
t.setText(t.getText().concat("5"));
if(e.getSource()==b6)
t.setText(t.getText().concat("6"));
if(e.getSource()==b7)
t.setText(t.getText().concat("7"));
if(e.getSource()==b8)
t.setText(t.getText().concat("8"));
if(e.getSource()==b9)
t.setText(t.getText().concat("9"));
if(e.getSource()==b0)
t.setText(t.getText().concat("0"));
if(e.getSource()==bdec)
t.setText(t.getText().concat("."));
if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
operator=1;
t.setText("");
} 
if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
operator=2;
t.setText("");
}
if(e.getSource()==bmul)
{
a=Double.parseDouble(t.getText());
operator=3;
t.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
operator=4;
t.setText("");
}
if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(operator)
{
case 1: result=a+b;
break;
case 2: result=a-b;
break;
case 3: result=a*b;
break;
case 4: result=a/b;
break;
default: result=0;
}
t.setText(""+result);
}
if(e.getSource()==bclr)
t.setText("");
if(e.getSource()==bdel)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
} 
}

{

}
}
