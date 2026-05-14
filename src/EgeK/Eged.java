package EgeK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eged {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Student Grade Calculator");
		f.setSize(400,400);
		
		JLabel l1 = new JLabel("Midterm (30%) :");
		JTextField t1 = new JTextField();
		
		JLabel l2 = new JLabel("Quiz 1 (10%) : ");
		JTextField t2 = new JTextField();
		
		JLabel l3 = new JLabel("Quiz 2 (10%) : ");
		JTextField t3 = new JTextField();
		
		JLabel l4 = new JLabel("Final Exam (40%) : ");
		JTextField t4  = new JTextField();
		
		JLabel l5  =new JLabel(" Participation (10%) : ");
		JTextField t5 = new JTextField();
		
		JButton b1 = new JButton("Calculate Grade");
		JLabel l6 = new JLabel("Result Place !");
		JLabel l7 = new JLabel("Letter Place !");
		
		
		b1.addActionListener(new ActionListener()
				
	{			
	 
		public void actionPerformed(ActionEvent e)
		{
			
			double midterm = Double.parseDouble(t1.getText());
			double quiz1 = Double.parseDouble(t2.getText());
			double quiz2 = Double.parseDouble(t3.getText());
			double finalgrade = Double.parseDouble(t4.getText());
			double part = Double.parseDouble(t5.getText());
			
			double totalgrade = (midterm * 0.3 ) + (quiz1 * 0.1) + (quiz2 * 0.1) + (finalgrade * 0.4) + (part * 0.1) ;
	        l6.setText(String.format("Final Grade : %.2f",totalgrade));		
		
	        String letter;
	        if( totalgrade >= 90 )
	        {
	        	letter = "A";
	        }
	        else if(totalgrade >=80)
	        {
	        	letter = "B";
	        }
	        else if(totalgrade >=70)
	        {
	        	letter = "C";
	        }
	        else if(totalgrade >=60)
	        {
	        	letter  ="D";
	        }
	        else
	        {
	        	letter ="F";
	        }
	        
	        l7.setText("Letter Grade :" + letter);
	        
		}
			
								
	});
		
		
		
		
		
		
		
		
		
		f.add(l1); f.add(t1);
		f.add(l2);f.add(t2);
		f.add(l3); f.add(t3);
		f.add(l4); f.add(t4);
		f.add(l5); f.add(t5);
		f.add(b1);f.add(l6);
		f.add(new JLabel("")) ; f.add(l7);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(8,2,10,10));
        f.setVisible(true);
	}

}
