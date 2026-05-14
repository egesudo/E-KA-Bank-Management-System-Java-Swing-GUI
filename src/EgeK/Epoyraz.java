package EgeK;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Epoyraz  {
	
public static void main(String[] args) {
	
	new LoginFrame();
}
}

class LoginFrame extends JFrame 
{
JLabel l1,l2,l3;
JTextField t1;
JPasswordField p1;
JButton b1;

final String user = "Ege";
final String pass = "ege1234";

 LoginFrame()
{
	 
	l1 = new JLabel("Username:");
	t1 = new JTextField();
	l2 = new JLabel("Password:");
	p1 = new JPasswordField();
	l3 = new JLabel("");
	b1  =new JButton("Login");
	
	b1.addActionListener(e->
	{		
		String username_  = t1.getText();
		String pass_ = new String(p1.getPassword());
		
	if(username_.equals(user) && pass_.equals(pass))
	{
      new OMS();
      dispose();
	}
		
	else
	{
		JOptionPane.showMessageDialog(LoginFrame.this,"İncorrect Login");
	}
			
	});
	
	add(l1);add(t1);
	add(l2);add(p1);
	add(l3);add(b1);
	
 setTitle("Login");
 setSize(300,150);
 setLayout(new GridLayout(3,2));
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);

}
}

class OMS extends JFrame
{
	JButton b1,b2,b3;
   OMS()	
   {
		
	b1 = new JButton("Add Employee");
	b1.addActionListener(e->
	{
			
	new AddE();		
			
   });
	
	b2 = new JButton("Show Employee");
	b2.addActionListener(e->	
	{		
			
	new ShowE();		
			
   });
  
	b3 = new JButton("Exit");
	b3.addActionListener(e->
	{	

	System.exit(0);						
   
	});
		
		
   add(b1);add(b2);add(b3);
	   
 setTitle("Office Management System");
 setSize(400,200);
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);

	}	
}

class AddE extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1;
	AddE()
	{
		
		l1 = new JLabel("Name:");
		t1 = new JTextField();
		l2 = new JLabel("Department:");
		t2 = new JTextField();
		l3 = new JLabel("Salary:");
		t3 = new JTextField();
		l4 = new JLabel("");
		b1 = new JButton("Add");
		
	b1.addActionListener(e->
	
	{	
		String name = t1.getName();		
		String department = t2.getText();
		double salary = Double.parseDouble(t3.getText());
		
		JOptionPane.showMessageDialog(AddE.this,"Employee added !");
				
   });
		
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(l4);add(b1);
		
		setTitle("Add Employee");
		setSize(300,200);
		setLayout(new GridLayout(4,2));	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}

class ShowE extends JFrame
{
	
	ShowE()
	{
		
		
		
		
		
		
		
		setTitle("Show Employee");
		
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
			
	}
}






