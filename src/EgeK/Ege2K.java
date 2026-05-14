package EgeK;

public class Ege2K {
	
	int sayı1;
	int sayı2;
	String ad;
	
	
	Ege2K ( int sayı_1 , int sayı_2 , String ad_ )
	{
		this.sayı1 = sayı_1;
		this.sayı2= sayı_2;
		this.ad=ad_;
	
	}
	
	public void Bilgiler( )
	{
		System.out.println("1.sayı :"+sayı1);
		System.out.println("2.sayı :"+sayı2);	
		System.out.println( "Karakter uzunluğu :" + ad.length());
	}
	
	
	
	public int Toplama ()
	{
		return (sayı1 + sayı2) ;

	}

	public int Bölme()
	{
		if( sayı1!=0 || sayı2==0)
		{
			System.out.println("Bu sayı tanımsızdır !");
	
		}
		
		else {
	
			return (int) sayı1 / sayı2 ;
			
		}
		return (int) 0.0;
	}
	
	
	

}
