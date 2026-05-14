package EgeK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BankManagementSystem_V02 extends JFrame {

	public static void main(String[] args) {
		

		new LoginPage1();
		
	}
}

class LoginPage1 extends JFrame
{
	
	JLabel usernamelbl,passwordlbl,forgetpasslbl,do_nothavelbl;
	JTextField usernametxt;
	JPasswordField passwordtxt;
	JButton loginbtn;

	
	LoginPage1()
	{
		
		usernamelbl = new JLabel("Username :");
		usernametxt = new JTextField(15);
		passwordlbl = new JLabel("Password :");
		passwordtxt = new JPasswordField(15);
		passwordtxt.setEchoChar('*');
		loginbtn = new JButton("Login");
		loginbtn.setBackground(Color.BLUE);
		loginbtn.setForeground(Color.WHITE);
		forgetpasslbl = new JLabel("Forget Password ?");
		forgetpasslbl.setForeground(Color.blue);
		forgetpasslbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		do_nothavelbl = new JLabel("Do not have an account !");
		do_nothavelbl.setForeground(Color.blue);
		do_nothavelbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		loginbtn.addActionListener(e->
		
		{	
				
		String entered_username = usernametxt.getText();		
		String entered_password = new String(passwordtxt.getPassword());
		
		if (entered_username.isEmpty() || entered_password.isEmpty()) {
		    JOptionPane.showMessageDialog(LoginPage1.this,
		            "Username or password cannot be empty!",
		            "Empty Inputs",
		            JOptionPane.WARNING_MESSAGE);
		    return;
		}

		
		if (entered_username.equals(Specific_given_informations.specific_username) &&
		    entered_password.equals(Specific_given_informations.specific_password)) {

		    JOptionPane.showMessageDialog(LoginPage1.this,
		            "Login Successful!","Success",
		            JOptionPane.INFORMATION_MESSAGE);

		    new Function_Systems(entered_username);
		    dispose();
		}
		else
		{
			    JOptionPane.showMessageDialog(LoginPage1.this,
		            "Wrong username or password!",
		            "Login Failed",
		            JOptionPane.ERROR_MESSAGE);
		}
		
		});
		
		do_nothavelbl.addMouseListener(new MouseAdapter()
				
	  {			
				
	    public void mouseClicked(MouseEvent e)
	     {
             new CreateAccountPage();
             dispose();
	     }
	
				
	 });
		
	
		add(usernamelbl);add(usernametxt);
		add(passwordlbl);add(passwordtxt);
		add(loginbtn);add(forgetpasslbl);
		add(do_nothavelbl);
		
		
		setTitle("E-KA Bank Management | Login Page");
		setSize(400,200);
		setLayout(new GridLayout(4,2,10,10));
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}


class CreateAccountPage extends JFrame
{
	JLabel namelbl,surnamelbl,email_lbl,password_lbl;
	JTextField name_txt,surname_txt,email_txt;
	JPasswordField password_txt;
	JButton createaccount_btn;
	
	
	CreateAccountPage()
	{
		
		
		namelbl = new JLabel("Name :");
		name_txt = new JTextField();
		surnamelbl = new JLabel("Surname :");
		surname_txt = new JTextField();
		email_lbl = new JLabel("E-mail :");
		email_txt = new JTextField();
		password_lbl = new JLabel("Password :");
		password_txt = new JPasswordField();
		password_txt.setEchoChar('*');
		createaccount_btn = new JButton("Create Account");
		createaccount_btn.setBackground(Color.BLUE);
		createaccount_btn.setForeground(Color.WHITE);
		
		
		createaccount_btn.addActionListener(e->
		
	  {		
		 
		  String name = name_txt.getText();
		  String surname = surname_txt.getText();
		  String email = email_txt.getText();
		  String password = new String(password_txt.getPassword());
		 
		  
		  
	if ( name.isEmpty() || surname.isEmpty() || email.isEmpty() || password.isEmpty())
	{
		
		JOptionPane.showMessageDialog(CreateAccountPage.this,"Please fill all of the gaps !","Missing Information",JOptionPane.WARNING_MESSAGE);
        return;
	}
	else
	{
		dispose();
		new Specific_given_informations();	
	}
		
	
	
	  });
	
	
		add(namelbl);add(name_txt);
		add(surnamelbl);add(surname_txt);
		add(email_lbl);add(email_txt);
		add(password_lbl);add(password_txt);
		add(createaccount_btn);
		
		
		setTitle("E-KA Bank Management | Create Account Page");
		setSize(450,270);		
        setLayout(new GridLayout(5,2));	
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
}


class Specific_given_informations extends JFrame
{
	JLabel specificusername,specificpassword;
	JTextField specificusername_txt,specificpassword_txt;
	JButton okaybtn;
    
	int basamak = 5;
	int randompassword;
	public static String specific_username;
	public static String specific_password;

	Specific_given_informations()
	{
		Random random = new Random();
		
		specificusername = new JLabel("Create Username :");
		specificusername_txt = new JTextField(15);
		specificpassword = new JLabel("Specific Password :");
		
		int min = (int) Math.pow(10, basamak - 1);
		int max = (int) Math.pow(10, basamak) - 1 ;
		
		 randompassword = min + (int)(Math.random() * (max - min + 1 ) );
		
		 specificpassword_txt = new JTextField(15);
		 specificpassword_txt.setText(String.valueOf(randompassword));
		 
		 okaybtn = new JButton("Okay, Back to Login");
		 okaybtn.setBackground(Color.RED);
		 okaybtn.setForeground(Color.WHITE);
		 
		 okaybtn.addActionListener(e->
		
		 {	 
			 
			 specific_username = specificusername_txt.getText(); 
			 specific_password = specificpassword_txt.getText();
			 
			if (specific_password.isEmpty() || specific_username.isEmpty())	 
			{	
				JOptionPane.showMessageDialog(Specific_given_informations.this,"Please fill all of the gaps !" , "Missing Informations",JOptionPane.WARNING_MESSAGE);	
			return;
			}
			else
			{
				 JOptionPane.showMessageDialog(Specific_given_informations.this,
				       "Account created!\nUsername: " + specific_username +
				       "\nPassword: " + specific_password,
				       "Success",
				       JOptionPane.INFORMATION_MESSAGE);
		
			dispose();
			new LoginPage1();
				
			}
				 
	     });
		 
		 
		add(specificusername);add(specificusername_txt);
		add(specificpassword);add(specificpassword_txt);
		add(okaybtn);
		
		
		
		setTitle("E-KA Bank Management | Specific Given Information Page");
		setSize(500,200);
		setLayout(new GridLayout(3,2));
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}


class Function_Systems extends JFrame
{
    JButton check_balance, deposit, withdraw, logout;
    JLabel welcome_user;

    Function_Systems(String username)
    {
        setTitle("E-KA Bank Management | Function System");
        setSize(550,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE);

        welcome_user = new JLabel("Welcome, " + username, SwingConstants.CENTER);
        welcome_user.setFont(new Font("Arial", Font.BOLD, 22));
        welcome_user.setBorder(BorderFactory.createEmptyBorder(20,0,10,0));

        JPanel buttonPanel = new JPanel(new GridLayout(2,2,20,20));

        buttonPanel.setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(30,30,30,30),
                BorderFactory.createLineBorder(new Color(230,230,230))
            )
        );

        buttonPanel.setBackground(Color.WHITE);

        check_balance = new JButton("Check Balance");
        deposit = new JButton("Deposit Money");
        withdraw = new JButton("Withdraw Money");
        logout = new JButton("Log out");

        JButton[] button = {check_balance, deposit, withdraw, logout};

        for (JButton b : button)
        {
            b.setBackground(new Color(0,102,204));
            b.setForeground(Color.WHITE);
            b.setFont(new Font("Arial", Font.BOLD, 14));
            b.setFocusPainted(false);
            b.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            buttonPanel.add(b);
        }

        check_balance.addActionListener(e -> { new CheckBalance(username); dispose(); });
        deposit.addActionListener(e -> { new DepositPanel(username); dispose(); });
        withdraw.addActionListener(e -> { new WithdrawPanel(username); dispose(); });
        logout.addActionListener(e -> { new LoginPage1(); dispose(); });

        add(welcome_user, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}


class BankDatabase
{
	public static double balance=0;
}

class CheckBalance extends JFrame
{
	JLabel welcome_to_Function,empty2;
	JLabel balancelbl;
	JTextField balance_txt;
	public static JButton backto_functionpage;
	
	
	CheckBalance(String username)
	{
		
		welcome_to_Function = new JLabel("Welcome, " + username);
		empty2 = new JLabel(" ");
		
		balancelbl = new JLabel("Current Balance :");
		balance_txt = new JTextField(15);
		backto_functionpage = new JButton("Okay, Back to Function System Page");
		backto_functionpage.setBackground(Color.RED);
		backto_functionpage.setForeground(Color.WHITE);
		
		balance_txt.setText(String.valueOf(EgeK.BankDatabase.balance));
		balance_txt.setEditable(false);
	
		
		backto_functionpage.addActionListener(e->
	    {	
			new Function_Systems(username);
			dispose();
	    });
		
		
		
		add(welcome_to_Function);add(empty2);
		add(balancelbl);add(balance_txt);
		add(backto_functionpage);
	
		
		setTitle("E-KA Bank Managemnt | Check Balance Page");
		setSize(450,200);
		setLayout(new GridLayout(3,2));
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class DepositPanel extends JFrame
{
     static double amount_of_money=0;
	JLabel depositmoney;
	JTextField depositmoney_txt;
	JButton deposit_btn, backto_functionpage;
	
	
	DepositPanel(String username)
	{
		depositmoney = new JLabel("Enter the amount of investment :");
		depositmoney_txt = new JTextField(15);
		deposit_btn = new JButton("Deposit the Money !");
		deposit_btn.setBackground(Color.BLUE);
		deposit_btn.setForeground(Color.WHITE);
		
		
		deposit_btn.addActionListener(e->
		
	{			
				
		try
		{
			
			amount_of_money = Double.valueOf(depositmoney_txt.getText());
			
			if(amount_of_money>0)
			{
				EgeK.BankDatabase.balance+=amount_of_money;
				
				JOptionPane.showMessageDialog(DepositPanel.this, "Deposit Successful!\n" +
				        "Added: " + amount_of_money + " ₺\n" +
				        "Current Balance: " +EgeK.BankDatabase.balance + " ₺",
				        "Success",
				        JOptionPane.INFORMATION_MESSAGE);	
			}
			else
			{
				JOptionPane.showMessageDialog(DepositPanel.this, " Amount must be positive ! ","Positive&Negative Situation",JOptionPane.WARNING_MESSAGE);	
			}
			
		}
		
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(DepositPanel.this," Amount must be numbers not specific characters or alphabets ! ","Invalid Input",JOptionPane.ERROR_MESSAGE);
		}
		
			
	});
		
		backto_functionpage = new JButton("Okay, Back to Function System Page");
		backto_functionpage.setBackground(Color.RED);
		backto_functionpage.setForeground(Color.WHITE);
		
		
		backto_functionpage.addActionListener(e->
		
	{			
	    new Function_Systems(username);			
	    dispose();			
	});
		
		
		add(depositmoney);add(depositmoney_txt);
		add(deposit_btn);add(backto_functionpage);
		
		setTitle("Deposit Money Panel");
		setSize(450,200);
		setLayout(new GridLayout(3,2));
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

class WithdrawPanel extends JFrame
{
	
	JLabel withdrawlbl;
	JTextField withdraw_txt;
	JButton withdraw_btn;
	static double amount_of_money=0;
	public static JButton backto_functionpage;
	
	WithdrawPanel(String username)
	{

	withdrawlbl = new JLabel("Enter the amount to be withdrawn :");
	withdraw_txt = new JTextField(15);
	withdraw_btn = new JButton("Withdraw the Money !");
	withdraw_btn.setBackground(Color.BLUE);
	withdraw_btn.setForeground(Color.WHITE);
	
	
	withdraw_btn.addActionListener(e->
	
	{		
	
	
	try
	{
	
		amount_of_money = Double.valueOf(withdraw_txt.getText());	
		
		if(amount_of_money>0 && amount_of_money<=EgeK.BankDatabase.balance)
		{
			EgeK.BankDatabase.balance-=amount_of_money;
			
			JOptionPane.showMessageDialog(WithdrawPanel.this,  "Withdraw Successful!\n" +
			        "Withdrawn: " + amount_of_money + " ₺\n" +
			        "Current Balance: " + BankDatabase.balance + " ₺",
			        "Success",
			        JOptionPane.INFORMATION_MESSAGE);	
		}
		else if(amount_of_money > EgeK.BankDatabase.balance)
		{
			JOptionPane.showMessageDialog(WithdrawPanel.this, "Insufficient Balance!\n" +
			        "Current Balance: " + BankDatabase.balance + " ₺",
			        "Error",
			        JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	catch(Exception ex)
	
	 {
			JOptionPane.showMessageDialog(WithdrawPanel.this, "The monetary value must be numbers not specific characters or alphabets !","Invalid Input",JOptionPane.ERROR_MESSAGE);	
	 }
			
			
	});
	
	
	backto_functionpage = new JButton("Okay, Back to Function System Page ");
	backto_functionpage.setBackground(Color.RED);
	backto_functionpage.setForeground(Color.WHITE);
	 
	backto_functionpage.addActionListener(e->
	
	{		
		
		new Function_Systems(username);
		dispose();
	});
	
	
		add(withdrawlbl);add(withdraw_txt);
		add(withdraw_btn);add(backto_functionpage);
		
		
		
	setTitle("Withdraw Money Panel");
	setSize(400,200);
	setLayout(new GridLayout(3,2));
	getContentPane().setBackground(Color.WHITE);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	}
	
}



















