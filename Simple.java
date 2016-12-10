import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Simple extends JFrame implements ActionListener{
	private JButton button1;
	private JButton button2;
	private JTextField text1;
	private JTextField text2;
	private JLabel label1;
	private JLabel label2;
	
	Simple(){
	this.setTitle("SimpleGUI");
	this.setSize(400,300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel(new GridLayout(3,2));
	this.getContentPane().add(panel);
	
	button1 = new JButton("Compute");
	button1.addActionListener(this);
	button2 = new JButton("Canel");
	button2.addActionListener(this);
	text1 = new JTextField("5");
	text2 = new JTextField(10);
	label1 = new JLabel("Radius");
	label2 = new JLabel("Area");
	
	panel.add(label1);
	panel.add(text1);
	panel.add(label2);
	panel.add(text2);
	panel.add(button1);
	panel.add(button2);
	
	this.pack();
	this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1){
		text2.setText("78.5398");
		}
		if(e.getSource() == button2){
		text1.setText(" ");
		}
	}
	public static void main(String[] args){
		Simple s =new Simple();
	}
}