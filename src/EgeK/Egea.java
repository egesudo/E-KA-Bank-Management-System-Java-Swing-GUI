package EgeK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Egea {
    JButton b,b2,bf;
    JLabel l,l2,lf;
    int sayı1 = 0,sayı2 = 0;
    
    Egea()
    {
    	JFrame frame = new JFrame("Sayı Oluşturma Oyunu");
    	frame.setSize(350,300);
      	
    b = new JButton("Generate Number 1");
    b.setBounds(20,50,150,20);
    	
    l = new JLabel("-> Click the 1.Button");	
    l.setBounds(180,50,140,20);	
    	
    b2 = new JButton("Generate Number 2");	
    b2.setBounds(20,80,150,20);
    	
    l2 = new JLabel("-> Click the 2.Button");
    l2.setBounds(180,80,140,20);
    	
    bf = new JButton("Compare !");
    bf.setBounds(120,120,100,20);
    
    lf = new JLabel("Result Part of Generate Numbers : ");
    lf.setBounds(40,160,280,20);
    
    b.addActionListener(new ActionListener()
    {
    	
 	
	public void actionPerformed(ActionEvent e) {
		
    Random random = new Random();
     sayı1 = random.nextInt(10) + 1;
	l.setText("Number -> 1 = " + sayı1);	
			
	}	
   
    });
    
    b2.addActionListener(new ActionListener()
   {		
    		
   public void actionPerformed(ActionEvent e )
   {
	   Random random2 = new Random();
	    sayı2 = random2.nextInt(10) + 1;
	  l2.setText("Number -> 2 = " + sayı2);
   }
   
   });
    
    
    bf.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (sayı1 == 0 || sayı2 == 0) {
                lf.setText("Lütfen ilk önce sayıları oluşturun !");
            } else if (sayı1 > sayı2) {
                lf.setText("First Number is bigger than Second Number !");
            } else if (sayı1 < sayı2) {
                lf.setText("First Number is smaller than Second Number !");
            } else {
                lf.setText("Both are equal! ");
            }
        } 
     
    });
    	frame.add(b);
    	frame.add(l);
    	frame.add(l2);
    	frame.add(b2);
    	frame.add(bf);
    	frame.add(lf);
    	frame.setLayout(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
   
	public static void main(String[] args) {
		new Egea();
		
		
		
		

	}

}
