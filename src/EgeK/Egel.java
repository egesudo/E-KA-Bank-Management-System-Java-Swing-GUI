package EgeK;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
public class Egel extends JFrame {
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4;
    int random1 = 0; int random2 = 0;
	
	public Egel()
	{
	
		b1 = new JButton("Generate Number-1");
		l1 = new JLabel("Click Button-1");
		b2 = new JButton("Generate Number-2");
		l2 = new JLabel("Click Button-2");
		b3 = new JButton("Compare !");
		l3 = new JLabel("");
		l4  =new JLabel("The result of Generate Number !");
		{
		

		b1.addActionListener(new ActionListener()
				
	{			
	
	public void actionPerformed(ActionEvent e)
	{
		
		Random random  = new Random();
		 random1 = random.nextInt(10) + 1;
		l1.setText("Number-1 :" + random1);
		
		
	}
			
	});
	
		b2.addActionListener(new ActionListener()
		
		{			
		
		public void actionPerformed(ActionEvent e)
		{
			
			Random random  = new Random();
			 random2 = random.nextInt(10) + 1;
			l2.setText("Number-2 :" + random2);
			
		}
				
		});
			
		b3.addActionListener(new ActionListener()
				
		{		
				
		public void actionPerformed(ActionEvent e)
		{
			
			if(random1 == 0 || random2 == 0 )
			{
				l4.setText("Lütfen sayılarınızı oluşturun !!");
			}
			else if( random1 > random2)
			{
				l4.setText("Number-1 bigger than Number-2"+" ( "+random1+" > "+random2+")");
			}
			else if (random2 > random1 )
			{
				l4.setText("Number-2 bigger than Number-1"+" ( "+random2+" > "+random1+")");
			}
			
			else
			{
				l4.setText("Both are equal !");
			}
		}
					
		});
		
		add(b1);add(l1);
		add(b2);add(l2);
		add(b3);add(l3);
		add(l4);
	
		setSize(600,400);
		setLayout(new GridLayout(4,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	}
	public static void main(String[] args) {
		
		new Egel();
		

	}

}
