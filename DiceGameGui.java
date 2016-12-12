package fin;

import fin.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.io.*;
import java.util.*;

public class DiceGameGui extends JFrame implements ActionListener {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;

	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JTextField text7;
	private JTextField text8;	
	private JTextField text9;
	private JTextField text10;
	
	private JTextArea area;
	
	private int number1 = 0;
	private int number2 = 0;
	private int sum1 = 0;	
	
	private int number3 = 0;
	private int number4 = 0;
	private int sum2 = 0;
	
	private int count1 = 0;
	private int count2 = 0;
	
	private String playername1;
	private String playername2;
	
	ArrayList<String> log = new ArrayList<String>();
	
	DiceGameGui(){
	this.setTitle("Let's play DiceGame");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel(new GridLayout(9,3));
	this.getContentPane().add(panel);
	
	button1 = new JButton("Roll");
	button1.addActionListener(this);
	button2 = new JButton("Compete");
	button2.addActionListener(this);
	button3 = new JButton("Roll");
	button3.addActionListener(this);
	button4 = new JButton("Name Input");
	button4.addActionListener(this);
	button5 = new JButton("Send Result");
	button5.addActionListener(this);
	button6 = new JButton("Save");
	button6.addActionListener(this);
	
	label0 = new JLabel("Name");
	label1 = new JLabel("First Try");
	label2 = new JLabel("Second Try");
	label3 = new JLabel("Sum");
	label4 = new JLabel("Point");
	label5 = new JLabel();
	label6 = new JLabel();
	label7 = new JLabel();

	
	text1 = new JTextField("0");
	text2 = new JTextField("0");
	text3 = new JTextField("0");
	text4 = new JTextField("0");
	text5 = new JTextField("0");
	text6 = new JTextField("0");
	text7 = new JTextField("0");
	text8 = new JTextField("0");
	text9 = new JTextField();
	text10 = new JTextField();
	
	area = new JTextArea(3, 30);
	
	panel.add(button4);
	panel.add(label5);
	panel.add(label6);
	
	panel.add(label0);
	panel.add(text9);
	panel.add(text10);
	
	panel.add(label1);
	panel.add(text1);
	panel.add(text2);

	panel.add(label2);
	panel.add(text3);
	panel.add(text4);
	
	panel.add(label3);
	panel.add(text5);
	panel.add(text6);
	
	panel.add(label4);
	panel.add(text7);
	panel.add(text8);
	
	panel.add(button2);
	panel.add(button1);
	panel.add(button3);

	panel.add(button5);
	panel.add(button6);
	panel.add(label7);
	
	panel.add(area);
	
	
	
	
	this.pack();
	this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
	if(e.getSource() == button1){
		this.number1 = (int) (Math.random() * 6 + 1);
		this.number2 = (int) (Math.random() * 6 + 1);
		this.sum1 = number1 + number2;
		
		text1.setText(String.valueOf(number1));
		text3.setText(String.valueOf(number2));
		text5.setText(String.valueOf(sum1));
	}
	
	if(e.getSource() == button3){
		this.number3 = (int) (Math.random() * 6 + 1);
		this.number4 = (int) (Math.random() * 6 + 1);
		this.sum2 = number3 + number4;
		
		text2.setText(String.valueOf(number3));
		text4.setText(String.valueOf(number4));
		text6.setText(String.valueOf(sum2));
	}
	if(e.getSource() == button2){
		if (sum1 > sum2)
		{
		count1 = count1 + 1;
		text7.setText(String.valueOf(count1));
		label7.setText(playername1+" is win!");
		}
		else if (sum1 < sum2)
		{
		count2 = count2 + 1;
		text8.setText(String.valueOf(count2));
		label7.setText(playername2+" is win!");
		}
		else if (sum1 == sum2)
		{
		label7.setText("Draw");	
		}
	}
	if(e.getSource() == button4)
		{
		playername1 = text9.getText();
		playername2 = text10.getText();
		label5.setText(playername1);
		label6.setText(playername2);
		}
	if(e.getSource() == button5)
		{
		Date now = new Date();
		area.append(now + playername1 + "'s " + "score" +":"+count1+" , "+ playername2 +  "'s " + "score" +":"+count2 +"\n");	
		String s = (String.valueOf(now + playername1 + "'s " + "score" +":"+count1+" , "+ playername2 +  "'s " + "score" +":"+count2));
		log.add(s);
		}
	if(e.getSource() == button6)
		{
			try{
				FileWriter file = new FileWriter("Result.txt");
				for(String str: log){
					file.write(str);
				}
				file.close();
				}
			catch(Exception a){
				System.out.println("I can't make file");
				}	
		 }
	}
	
	public static void main(String[] args) 
	{
	DiceGameGui g = new DiceGameGui();	
	}

}