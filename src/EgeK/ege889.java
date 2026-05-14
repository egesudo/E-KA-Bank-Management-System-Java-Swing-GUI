package EgeK;
import java.util.Scanner;
public class ege889 {

	
	public static int sumofarray(int array[])
	{
		int sum = 0;
		
		for( int i = 0;i<array.length;i++)
		{
			sum+=array[i];
		}
		
		return sum;
	}
	
	public static int averageofarray(int array[])
	{

		int sum = 0;
		
		for( int i = 0;i<array.length;i++)
		{
			sum+=array[i];
		}
		int average = sum/array.length;
	
		return average;	
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] numbers = new int[5];
		
		for(int i = 0; i<numbers.length;i++)
		{
			System.out.println("What is your " + i + ". " +"number :" );
           numbers[i]=scanner.nextInt();	
		}
		int choice;
		
		System.out.println("What is your choice :");
		 choice = scanner.nextInt();
		
		 switch(choice)
		 {
		 case 1:
			 
		 System.out.println("Sum of array :" + sumofarray(numbers));
		 break;
		 
		 case 2:
		System.out.println("Average of array :" + averageofarray(numbers));	 
		 break;
	
		 default:
		System.out.println("You didn't choose an option !!");	 
		 
		 
		 }
			
	}

}
