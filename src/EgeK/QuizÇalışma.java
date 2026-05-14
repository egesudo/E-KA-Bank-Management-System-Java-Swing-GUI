package EgeK;
import java.util.Scanner;
import java.util.Random;

public class QuizÇalışma {
	
	public static void main(String[] args) {
	
		
	Scanner scanner = new Scanner(System.in);
	
	String kullanıcıadı = null;
	int password = 0 ;
	int bakiye = 0;
	
	
	do
	{
		
	System.out.println("What is your username:");
	kullanıcıadı = scanner.nextLine();
	System.out.println("What is your password:");	
	password = scanner.nextInt();
	scanner.nextLine();
			
	}
	while( !kullanıcıadı.equals("EgeKaya") || password!=1234 );
	
	System.out.println("-----------");
	System.out.println("Welcome to System");
	System.out.println("-----------");
	
	System.out.println(" 1- Bakiye gösterim"
			+ " 2- Para Yatırma İşlemi" 
			+ " 3- Para Çekme İşlemi"
			);
	
	System.out.println("----------------");
	System.out.println("What is your choice :");
	int choice = scanner.nextInt();
	
	switch(choice) {
	
	case 1 :
		System.out.println("Güncel Bakiyen : " + bakiye + " TL");
        break;	
	
	case 2:
		System.out.println("Yatırılmak istenen tutar :");
		double tutar = scanner.nextDouble();
		bakiye+=tutar;
		System.out.println("Hesabınıza " + tutar + " TL eklendi.");
		System.out.println("Güncel Bakiyen : " + bakiye + " TL");
	break;
	
	case 3:
		System.out.println("Çekilmek istenen tutar :");
		double tutar2 = scanner.nextDouble();
	
		if( tutar2 > bakiye )
		{
			System.out.println("Yetersiz Bakiye !!!");
		}
		else  
		{
			bakiye-=tutar2;
			System.out.println("Hesabınızdan " + tutar2 + " TL çekildi.");
			System.out.println("Güncel Bakiyen : " + bakiye  + " TL");
		}
		break;
		
		default :
			System.out.println("Geçersiz Seçim !");
	
	
	}
	
	
	
	
	
	}
}
