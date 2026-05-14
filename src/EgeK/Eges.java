package EgeK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Eges {

	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4;
	
	Eges()
	{
		
		JFrame f = new JFrame("Taş-Kağıt-Makas Oyunu");
		f.setSize(400,400);
		
	    l1 = new JLabel("Seçiminizi yapın :");
		l1.setBounds(130,60,130,30);
	    
		b1 = new JButton("Taş");
		b1.setBounds(120,100,130,30);
		b1.addActionListener(new ActionListener()
			{		
				
			public void actionPerformed(ActionEvent e)
			{
				play("Taş");
			}
				
			});
		b2 = new JButton("Kağıt");
		b2.setBounds(120,140,130,30);
		b2.addActionListener(new ActionListener()
		 {			
				
		 public void actionPerformed(ActionEvent e)
		 {
			 play("Kağıt");
		 }
					
	     });
		
		b3 = new JButton("Makas");
		b3.setBounds(120,180,130,30);
		b3.addActionListener(new ActionListener()
		 {			
				
		 public void actionPerformed(ActionEvent e)
		 {
			 play("Makas");
		 }
					
	     });
		
		
		l2 = new JLabel("Kullanıcı seçimi : ?");
		l2.setBounds(100,220,220,30);
		
		l3 = new JLabel("Bilgisayar seçimi: ?");
		l3.setBounds(100,240,220,30);
		
		l4 = new JLabel("Sonuç :");
		l4.setBounds(100,260,220,30);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);
	
	   
	
	
	
	}
	
	public void play(String userchoice)
	{
		
		String[] choices = {"Taş","Kağıt","Makas"};
		Random random  =new Random();
		String randomchoice = choices[random.nextInt(3)];
	
		l3.setText("Computer's choice :" + randomchoice);
		l2.setText("User's choice : " + userchoice);
		
		String result;
		
		if( userchoice.equals(randomchoice))
		{
			result = "İt's Draw !";
		}
		
		else if( userchoice.equals("Taş") && randomchoice.equals("Makas") ||
		         userchoice.equals("Kağıt") && randomchoice.equals("Taş") ||	
	             userchoice.equals("Makas") && randomchoice.equals("Kağıt") )
		{
			result = "You won !!";
			
		}
		else
		 {
			result = "Computer System won !!";
		 }
		
		l4.setText("Oyun sonucu :" + result);
		
	}
	
	public static void main(String[] args) {
		
	new Eges();	
		
	}

}
