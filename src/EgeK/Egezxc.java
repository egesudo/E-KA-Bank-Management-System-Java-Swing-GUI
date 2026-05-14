package EgeK;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Egezxc extends JFrame  {

	public static void main(String[] args) {

	new LoginScreen();
}
}

class LoginScreen extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JPasswordField pf1;
	JCheckBox ch1;
	JButton b1;
	
	public LoginScreen()
	{
	
		l1 = new JLabel("Ad:");
		t1 = new JTextField();
		l2 = new JLabel("Soyadı:");
		t2 = new JTextField();
		l3 = new JLabel("E-Posta:");
		t3 = new JTextField();
		l4 = new JLabel("Şifre:");
		pf1 = new JPasswordField();
		b1 = new JButton("Giriş");
		b1.addActionListener(e->
		
	{			
				
		String isim = t1.getText();
		String soyadı= t2.getText();
		String eposta = t3.getText();
		String şifre = new String(pf1.getPassword());
		
		Egezx elemanbilgi = new Egezx("Ege","Kaya","egekaya825@gmail.com","3467");		
		
		
		if( elemanbilgi.bilgileridoğrula(isim, soyadı, eposta, şifre)  )
		{
			JOptionPane.showMessageDialog(LoginScreen.this,"Giriş Başarılı !");
			new BankFunctions(elemanbilgi);
			dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(LoginScreen.this,"Giriş Bilgilerinizi Kontrol Ediniz !");
		}
					
	});
		
		ch1 = new JCheckBox("Beni Hatırla !");
		
	
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(l4);add(pf1);
		add(b1);add(ch1);
		
		
		setTitle("Login Screen");
		setSize(400,300);
		setLayout(new GridLayout(5,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}


class BankFunctions extends JFrame
{
	JLabel l1;
	JButton b1,b2,b3,b4;
	
	public BankFunctions(Egezx elemanbilgi)
	{
		
		l1 = new JLabel("Hoşgeldiniz " + elemanbilgi.getadsoyad());
		
		
		
		b1 = new JButton("Para Çekme");
		b1.addActionListener(e->
		{
		
			new ParaÇekme(elemanbilgi);					
	        dispose();
		});
		
		b2 = new JButton("Para Yatırma");
		b2.addActionListener(e->
		
		{	
				
		  new ParaYatır(elemanbilgi);		
		  dispose();	
     	});
		
		b3 = new JButton("Para Transferi");
		b4 = new JButton("Exit");
		b4.addActionListener(e->
		{
			
		System.exit(0);	
			
	   });
		
		add(l1);
		add(b1);add(b2);add(b3);add(b4);
		
		
		setTitle("BankFunctions");
		setSize(300,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
}	
}

  class ParaÇekme extends JFrame
  {
	 JLabel l1,l2;
	 JTextField t2;
	 JButton b1;
	 
	 
	 public ParaÇekme(Egezx elemanbilgi)
	 {
		 
		 l1 = new JLabel("Bakiyeniz: " + elemanbilgi.getbakiye() + " TL");
		 l1.setBounds(50,100,140,40);
		  
		l2 = new JLabel("Çekmek İstediğiniz Tutar :");
		l2.setBounds(50,150,200,30); 
		
		t2 = new JTextField();
		t2.setBounds(200,150,100,30);
		
		b1 = new JButton("Para Çek");
		b1.setBounds(50,200,110,30);
		
		
		b1.addActionListener(e->
		{		
		
		try {		
		
		double paraçek = Double.parseDouble(t2.getText());		
		boolean başarılı = elemanbilgi.paraçekme(paraçek);		
				
		if(başarılı)
			
		{
			JOptionPane.showMessageDialog(ParaÇekme.this, paraçek + "TL"+ " Hesabınızdan Çekilmiştir !");
			l1.setText(String.valueOf(elemanbilgi.getbakiye()));		
		}
		
		else
	
		{
			JOptionPane.showMessageDialog(ParaÇekme.this, "Girdiğiniz Tutarı Kontrol Ediniz,Yetersiz Bakiye !");
		}
			
		}
		catch( NumberFormatException ex )
		{
			
		JOptionPane.showMessageDialog(ParaÇekme.this,"Geçerli bir sayı giriniz !");	
			
		}
	   
		});
		
		
		add(l1);add(l2);
	    add(t2);
		add(b1);
		
		 setTitle("Paraçekme Ekran");
		 setSize(300,300);
 		 setLayout(null);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setVisible(true);
	 }
	  
  }
 
  class ParaYatır extends JFrame
  {
	   JLabel l1,l2;
	   JTextField t1,t2;
	   JButton b1;
		  
	  public ParaYatır(Egezx elemanbilgi)
	  {
		  		   
		  l1 = new JLabel("Bakiyeniz: " + elemanbilgi.getbakiye() + " TL");
		  l1.setBounds(50,100,140,40);
		  
		  l2 = new JLabel("Yatıracağınız Tutarı Giriniz :");
		  l2.setBounds(50,150,200,30);
	
		  t2 = new JTextField();
		  t2.setBounds(200,150,100,30);
		  
		  b1 = new JButton("Para Yatır");
		  b1.setBounds(50,200,110,30);
		  
		  b1.addActionListener(e->
		  
	   {	
		   try 
		   {
			 
			double parayatır = Double.parseDouble(t2.getText());	  
			elemanbilgi.parayatır(parayatır);
		   
			JOptionPane.showMessageDialog(ParaYatır.this, parayatır + " TL" + " Hesabınıza Yatırılmıştır !");
			l1.setText("Bakiyeniz :" + elemanbilgi.getbakiye() + " TL");
		   }
		   catch(NumberFormatException ex) 
		   {
			   JOptionPane.showMessageDialog(ParaYatır.this,"Geçerli bir sayı giriniz !");
		   }
			
	  });
		  
		 
		  add(l1);add(l2);
		  add(t2);
		  add(b1);
		  
		 setTitle("ParaYatırma - Ekran"); 
		 setSize(300,300);
		 setLayout(null);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 setVisible(true);
		  
}
}
 
 
 
 
 
 
 
