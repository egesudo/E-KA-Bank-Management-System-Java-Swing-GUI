package EgeK;
import java.util.Scanner;
public class ege88 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the number 1 :");
		int x = scanner.nextInt();
		System.out.println("What is the number 2 :");
		int y = scanner.nextInt();
		
		System.out.println("1- Add"
				+  " 2- Substraction "
				+  " 3- Multiplication"
				+  " 4- Division"
				+  " 5- Exponential"
				+  " 6- Square Root"
				);
		System.out.println("---------------------");
		System.out.println("What is your choice :");
		int choice = scanner.nextInt();
		
		double result;
		
		switch(choice)
		{
		
		case 1:
			System.out.println("Sum:" + add(x,y));
		break;
		
		case 2:
			System.out.println("Substract:" + substraction(x,y));
		break;
		
		case 3:
			System.out.println("Multiple:" + multiplication(x,y));
		break;
		
		case 4:
		System.out.println("Divison:" + divison(x,y));	
		break;
		
		case 5:
			System.out.println("Exponential:" + exponential(x,y));
		break;	
		
		case 6:
			System.out.println("Square:" + square(x));
		break;
		
		default:
			System.out.println("You didn't choose !!!");
		
		}
		
		

	}

	public static double add(int x,int y)
	{
		
		return x+y;
		
	}
	
	public static double substraction(int x,int y)
	{
		return x-y;	
	}
	
	public static double multiplication(int x,int y)
	{
		return x*y;
	}
	
	public static double divison(int x,int y)
	{
		if(y==0)
		{
			System.out.println("Can not be divided by 0");
             return Double.NaN;		
		}
		else
		{
			return (double) x/y;	
		}
		
	}
   
	public static double exponential(int x,int y)
	{
		return Math.pow(x, y);	
	}

	public static double square(int x)
	{
		return Math.sqrt(x); 
	}



}








