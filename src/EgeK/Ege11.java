package EgeK;
import java.util.Scanner;
public class Ege11 {

	public static void main(String[] args) {
		
    Ege2K a1 = new Ege2K( 3,0,"EgeK");	
    
    String işlemsçnk = " Toplama için --> 1 "
    		+"Bölme için --> 2";
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hangi işlem :");
    int seçim = scanner.nextInt();
    
    switch(seçim)
    {
    
    case 1:
    a1.Bilgiler();	
   System.out.println("Toplama işlemi sonucu :" + a1.Toplama()) ;
   break;
   
    case 2:
    a1.Bilgiler();
    System.out.println("Bölme işlemi sonucu :" + a1.Bölme()) ;
   break;
    
    }
    
    
    
    

	}

}
