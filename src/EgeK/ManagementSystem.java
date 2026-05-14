package EgeK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ManagementSystem extends JFrame {

	public static void main(String[] args) {
	
	new LoginPage();
		
	}	
}

class LoginPage extends JFrame
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3;
	JButton b1;
	JCheckBox cb1;

	LoginPage()
	{

		l1 = new JLabel("Username : ");
       	t1 = new JTextField();
       	l2 = new JLabel("Password : ");
		t2 = new JTextField();
		l3 = new JLabel("Account ID : ");
		t3 = new JTextField();
		
		b1 = new JButton("Login");
		l4 = new JLabel("Şifremi unuttum !");
		l4.setForeground(Color.BLUE);
		l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cb1 = new JCheckBox(" Remember Me ! ");
		l5 = new JLabel("Hesabın yoksa, buradan oLuştur !");
		l5.setForeground(Color.BLUE);
		l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		b1.addActionListener(e->
		{
			
			String entereduser = t1.getText();
			String enteredpassword = t2.getText();
			String enteredaccountID = t3.getText();			
			
		
		if( entereduser.equals(EgeK.Randomİnformation.UserDatabase.username) && 
			enteredpassword.equals(EgeK.Randomİnformation.UserDatabase.password) &&
			enteredaccountID.equals(EgeK.Randomİnformation.UserDatabase.accountID))
		{
			
			JOptionPane.showMessageDialog(LoginPage.this, "Giriş Başarılı ! ");
			dispose();
			new FunctionSystem();
		}
		else
		{
			JOptionPane.showMessageDialog(LoginPage.this,"Please, Check your informations again !");
		}
		
		});
		
		l4.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e) {
               
                new NewGeneratedPassword();
                dispose();            
            }
        });
		
       
		l5.addMouseListener(new MouseAdapter()
				
	{			
	
			public void mouseClicked(MouseEvent e)
			{
				new CreateAccount();
				dispose();
				
			}
				
	});
		

		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(l4);
		add(l5);
		add(cb1);
		
		setTitle("Login Page");
		setSize(400,300);
		setLayout(new GridLayout(5,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}

class FunctionSystem extends JFrame
{
	JLabel userinfo;
	JButton Deposit,Withdraw,CheckBalance,Logout;
	static double balance = 0.0;
	
	FunctionSystem()
	{
		
	userinfo = new JLabel("Welcome," + EgeK.Randomİnformation.UserDatabase.username);
	
     Deposit = new JButton("Deposit");
     Withdraw = new JButton("Withdraw");
     CheckBalance = new JButton("Check Balance");
     Logout = new JButton("Logout");
		
	Deposit.addActionListener(e->
	
	{	
			new DepositPage();
			dispose();
	});
	
	Withdraw.addActionListener(e->
	
	{		
	        new WithdrawPage();
	        dispose();
	});
	
	CheckBalance.addActionListener(e->
	
	{		
			new CheckBalancePage();
			dispose();
	});
	
	Logout.addActionListener(e->
	
	{
		new LogoutPage();
		dispose();
	});
	
	
	add(userinfo);add(Deposit);add(Withdraw);add(CheckBalance);add(Logout);	
		
		
	setTitle("Functions");	
	setSize(300,300);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	}
	
	
}

class CreateAccount extends JFrame
{	
	JLabel name,surname,email,password;
	String name1,surname1,email1,password1;
	JTextField t1,t2,t3;
	JPasswordField ps1;
	JButton b1;

	CreateAccount()
	{
		
		name = new JLabel("Name : ");
		t1 = new JTextField();
		surname = new JLabel("Surname : ");
		t2 = new JTextField();
		email = new JLabel("Email : ");
		t3 = new JTextField();
		password = new JLabel("Password : ");
		ps1 = new JPasswordField();
		b1 = new JButton("Generate !");
		
		b1.addActionListener(e->
		{
		
		String name1=t1.getText();
		String surname1=t2.getText();
		String email1=t3.getText();
		String password1= ps1.getText();
			
		if (name1.isEmpty() || surname1.isEmpty() || email1.isEmpty() || password1.isEmpty() )
		{
			JOptionPane.showMessageDialog(CreateAccount.this, "Please fill in the information correctly !");
		}
		else
		{
			dispose();
			new Randomİnformation();
		}
			
			
			
					
	   });
		

		add(name);add(t1);
		add(surname);add(t2);
		add(email);add(t3);
		add(password);add(ps1);
		add(b1);
		
	
		setTitle("Create Account");
		setSize(400,300);
		setLayout(new GridLayout(5,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	
}

class NewGeneratedPassword extends JFrame
{
	JLabel l1;
	JTextField t1;
	JButton b1;
	
	int basamak = 5;
	int randompass;
	
	NewGeneratedPassword()
	{
		
	Random random  = new Random();	
	
	l1 = new JLabel(" New Password : ");
	
	int min = (int) Math.pow(10, basamak - 1);
	int max = (int) Math.pow(10, basamak) - 1 ;
     randompass = min + (int)(Math.random() * (max - min + 1 ));

	t1 = new JTextField();
    t1.setText(String.valueOf(randompass));
	
    b1 = new JButton(" Back to Login Page !");
		
	b1.addActionListener(e->
	
	{		
		dispose();
		new LoginPage();				
	});
	
		add(l1);add(t1);
		add(b1);
		
		setTitle("Generated Password");
		setSize(350,180);
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	
	
}

class Randomİnformation extends JFrame
{
	
	JLabel user,pass,accountid;
	JTextField usert1,passt2,accountidt3;
	JButton b1;
	
	int basamak = 5;
	long basamakS = 10;
	int randompassword;
	long randomID;
	
	Randomİnformation()
	{
		
		Random random = new Random();
		
	    user = new JLabel("Username : ");
		usert1 = new JTextField();
		pass = new JLabel("Password : ");
		
		int min = (int) Math.pow(10, basamak - 1);
		int max = (int) Math.pow(10, basamak) - 1 ;
		
		 randompassword = min + (int)(Math.random() * (max - min + 1 ) );
		
		passt2 = new JTextField();
		passt2.setText(String.valueOf(randompassword));
		
		accountid = new JLabel("Account ID : ");
		
		long minimum = (long) Math.pow(10, basamakS - 1);
		long maximum = (long) Math.pow(10, basamakS) - 1 ;
		
		 randomID = minimum + (long)(Math.random() * (maximum - minimum + 1) );
		
		accountidt3 = new JTextField();
		accountidt3.setText(String.valueOf(randomID));
		
		b1 = new JButton(" Sign Up ! ");
		b1.addActionListener(e->
		
	{	
		UserDatabase.username = usert1.getText();
		UserDatabase.password = passt2.getText();
		UserDatabase.accountID = accountidt3.getText();
		
		dispose();
		new LoginPage();
	
	});
		
		add(user);add(usert1);
		add(pass);add(passt2);
		add(accountid);add(accountidt3);
		add(b1);
		
		setTitle("Randomly Generated İnformations");
		setSize(300,300);
		setLayout(new GridLayout(4,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
    }
 
	class UserDatabase
	{
	static String username;
	static String password;
	static String accountID;
	
	}
}

class DepositPage extends JFrame
{
	JLabel invested;
	JTextField investedfield;
	JButton investedbtn,backtoFunctions;
	static double amountofdeposit;
	
	DepositPage()
	{
		
		invested = new JLabel("amount to be invested :");
		investedfield = new JTextField();
		investedbtn = new JButton("Deposit");
		
		investedbtn.addActionListener(e->
		{	
			try
			{
			double amountofdeposit = Double.valueOf(investedfield.getText());
			
			if(amountofdeposit>0)
			{
				EgeK.FunctionSystem.balance+=amountofdeposit;
				JOptionPane.showMessageDialog(DepositPage.this, " Hesabınıza "+ amountofdeposit + " TL eklendi. ");
			}
			else
			{
			JOptionPane.showMessageDialog(DepositPage.this, " Amount must be positive ! ");	
			}
			
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(DepositPage.this," Invalid Input ! ");
			}
				
				
	   });
		
      backtoFunctions = new JButton("Back to Function Screen !");
      backtoFunctions.addActionListener(e->
      
      {		  
    		  new FunctionSystem();
    		  dispose();
      });
		
		
		
		
		add(invested);add(investedfield);
		add(investedbtn);add(backtoFunctions);
		
		setTitle("Deposit Page");
		setSize(350,160);
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
}

class WithdrawPage extends JFrame
{
	JLabel withdrawn;
	JTextField withdrawnfield;
	JButton withdrawnbtn,backtoFunctionsPage;
	static double amountofwithdraw;
	
	WithdrawPage ()
	
	{
		
		withdrawn = new JLabel(" amount to be withdrawn : ");
		withdrawnfield = new JTextField();
		withdrawnbtn = new JButton("Withdraw");
		
		amountofwithdraw = Double.valueOf(withdrawnfield.getText());
		
		withdrawnbtn.addActionListener(e->
		
	   {			
				
		try
		{
			
		if( amountofwithdraw > 0 && amountofwithdraw < EgeK.FunctionSystem.balance )
		{
			EgeK.FunctionSystem.balance-=amountofwithdraw;
				
			JOptionPane.showMessageDialog(WithdrawPage.this," Hesabınızdan " + amountofwithdraw + " TL çekilmiştir. " );
				
		}
		else
		{
			JOptionPane.showMessageDialog(WithdrawPage.this, "Your Balance is not enough to withdraw, unfortunately !");
		}
			
		}
		   catch(Exception ex)
		{
			   
			  JOptionPane.showMessageDialog(WithdrawPage.this, "Invalıd Input !");
		}
		   
		   		
	   });
		
		backtoFunctionsPage = new JButton("Back to Function Screen !");
		backtoFunctionsPage.addActionListener(e->
		
		{			
		      new FunctionSystem();
		      dispose();
	   });
		
	
		add(withdrawn);add(withdrawnfield);
		add(withdrawnbtn);add(backtoFunctionsPage);
		
		setTitle("Withdraw Page");
		setSize(350,160);
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
}

class CheckBalancePage extends JFrame
{
	JLabel lblbalance,lblbalancecheck;
	JButton balancebtn;
	
	CheckBalancePage()
	{
		
	lblbalance = new JLabel(" Your current balance : ");
	lblbalancecheck = new JLabel("");
	balancebtn = new JButton("Back to Login Page !");
		
	lblbalancecheck.setText("Your Balance :" + String.valueOf(EgeK.FunctionSystem.balance + "TL"));	
		
	balancebtn.addActionListener(e->
	
	{		dispose();
			new FunctionSystem();		
	});
	
		add(lblbalance);add(lblbalancecheck);
		add(balancebtn);
		
		
		setTitle("CheckBalance Page");
		setSize(350,160);
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}

}

class LogoutPage 
{
	LogoutPage()
	{
		System.exit(0);
	}
}

