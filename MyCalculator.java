package klu_GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class MyCalculator extends JFrame implements ActionListener{
	
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5,b6;
	
	MyCalculator(){
		this.setVisible(true);
		this.setTitle("Mini-Calci");
		Container con=getContentPane();
		con.setLayout(new GridLayout(5,2));
		con.setBackground(Color.CYAN);
		
		l1=new JLabel("Enter a value : ");
		l2=new JLabel("Enter b value : ");
		
		t1=new JTextField(50);
		t2=new JTextField(50);
		
		b1=new JButton("Add");
		b2=new JButton("Subtract");
		b3=new JButton("Multiply");
		b4=new JButton("Division");
		b5=new JButton("Modulo(%)");
		b6=new JButton("Power");
		
		con.add(l1);
		con.add(t1);
		con.add(l2);
		con.add(t2);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
		con.add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			int a=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
			  System.out.println("Sum : "+a);
			  JOptionPane.showMessageDialog(this,"Sum : "+a);
		}
		if(e.getSource()==b2) {
			int b=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
			  System.out.println("Difference : "+b);
			  JOptionPane.showMessageDialog(this,"Difference : "+b);
		}
		if(e.getSource()==b3) {
			int c=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
			  System.out.println("Product : "+c);
			  JOptionPane.showMessageDialog(this,"Product : "+c);
		}
		if(e.getSource()==b4) {
			int d=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
			  System.out.println("Division : "+d);
			  JOptionPane.showMessageDialog(this,"Division : "+d);
		}
		if(e.getSource()==b5) {
			int m=Integer.parseInt(t1.getText())%Integer.parseInt(t2.getText());
			  System.out.println("Modulo : "+m);
			  JOptionPane.showMessageDialog(this,"Modulo : "+m);
		}
		if(e.getSource()==b6) {
			int f=(int) Math.pow(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()));
			  System.out.println("Power : "+f);
			  JOptionPane.showMessageDialog(this,"Power : "+f);
		}
	}
	public static void main(String[] args) {
		MyCalculator c=new MyCalculator();
		c.setSize(600,500);
	}

}
