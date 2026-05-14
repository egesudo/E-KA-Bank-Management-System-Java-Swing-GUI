package EgeK;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ege1234 extends JFrame implements ActionListener {
		
	JLabel l;
	JCheckBox cb1,cb2,cb3;
	JButton b1;
	
	Ege1234()
	{
		l = new JLabel("Food Ordering System ");
		l.setBounds(50,50,300,20);
		
		cb1 = new JCheckBox("Pizza_100");
		cb1.setBounds(100,100,150,20);
		cb2 = new JCheckBox("Burger_30");
		cb2.setBounds(100,150,150,20);
		cb3 = new JCheckBox("Tea_10");
		cb3.setBounds(100,200,150,20);
		b1 = new JButton("Order");
	    b1.setBounds(100,250,80,30);
       b1.addActionListener(this);
	
		
		add(l);
		add(cb1);add(cb2);add(cb3);
		add(b1);
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
        		
	
	}

	public void actionPerformed(ActionEvent e)
	{
		String msg ="";
		float amount = 0;
		
		if(cb1.isSelected())
		{
			msg+="Pizza:100TL\n";
			amount += 100 ;
		}
		if( cb2.isSelected( ))
		{
			msg+="Burger:30TL\n";
			amount+=30;
					
		}
		if(cb3.isSelected())
		{
			msg+="Tea:10TL\n";
			amount+=10;
		}
		msg+="-------------------\n";
		JOptionPane.showMessageDialog(this,msg+"Total : " + amount + " TL");
		
	}
	
	

	public static void main(String[] args) {
		
	new Ege1234();	
		
	}


	
}
