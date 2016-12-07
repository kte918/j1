import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.GridLayout;

class CalcAreaGUIMain extends JFrame{
	public CalcAreaGUIMain(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel(new GridLayout(3,2));
	this.getContentPane().add(panel);
	JLabel Label1 = new JLabel("Radius");
	JLabel Label2 = new JLabel("Area");
	JTextField Field1 = new JTextField(10);
	JTextField Field2 = new JTextField(10);
	JButton Button1 = new JButton("Computer");
	JButton Button2 = new JButton("Cancel");
	panel.add(Label1);
	panel.add(Field1);
	panel.add(Label2);
	panel.add(Field2);
	panel.add(Button1);
	panel.add(Button2);
	this.pack();
	this.setVisible(true); 
	}

	public static void main(String[] args)
	{
	CalcAreaGUIMain a = new CalcAreaGUIMain();
	a.show();
	}
}