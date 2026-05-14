package EgeK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Egeo extends JFrame implements ActionListener {

	
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	
	Egeo()
	{
	
	setSize(350,300);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
		
	b1 = new JButton("Generate Number 1 ");
	l1 = new JLabel("Click The Button -> 1");
	
	b2 = new JButton("Generate Number 2 ");
	l2 = new JLabel("Click The Button -> 2");
	
	b3 = new JButton("Compare !");
	l3 = new JLabel("Result Part -->");
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
		
	add(b1);
	add(l1);
	add(b2);
	add(l2);
	add(b3);
	add(l3);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	
		Random random = new Random();
		int sayı1 = random.nextInt(10) + 1;
		l1.setText("Number 1 :" + sayı1);

		int sayı2 = random.nextInt(10) + 1;
		l2.setText("Number 2 :" + sayı2);

		if( sayı1 ==0 || sayı2==0 )
		{
			l3.setText("Lütfen sayıları oluşturun ilk ! ");
		}
		
		else if( sayı1 > sayı2  )
		{
			l3.setText("1.Number bigger than 2.Number !");
		}
		else if(sayı1 < sayı2 )
		{
			l3.setText("1.Number smaller than 2.Number !");
		}
		else 
		{
			l3.setText("Both are equal");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	new	Egeo();
	
	}

}
