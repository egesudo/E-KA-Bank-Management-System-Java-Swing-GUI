package EgeK;

public class Egezx {

	
	private String isim;
	private String soyadı;
	private String eposta;
	private String şifre;
	private double bakiye = 5000;
	
	 Egezx ( String isim , String soyadı , String eposta , String şifre   )
	{
		this.isim = isim;
		this.soyadı = soyadı;
		this.eposta = eposta;
		this.şifre = şifre;
		
	}
	
	
	public boolean bilgileridoğrula(String isim , String soyadı , String eposta , String şifre)
	{
		return 
				this.isim.equals(isim)&&
				this.soyadı.equals(soyadı)&&
				this.eposta.equals(eposta)&&
				this.şifre.equals(şifre);
		
	}

	public String getadsoyad()
	{
		
		return isim + " "+ soyadı;
		
	}
    
	public double getbakiye()
	{
		
	return 	bakiye;
		
	}

 	public boolean paraçekme ( double miktar)
 	{
 		if( miktar <= bakiye )
 		{
 			bakiye-=miktar;
 			return true;
 		}
 	return false;

 	}
	 
 	public double parayatır (double miktar)
 	{
 		return bakiye +=miktar;
 	}


}




