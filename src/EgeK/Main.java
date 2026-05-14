package EgeK;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int guess;
		int score =  0;
		
		String [] questions = { "What is the answer of 2 + 2 ?", 
				"what is the best philosophier of the world ? ",
				"What is the programming language that I use ? "
		};
		
		
		String [][] options = { { "1. 1","2. 2","3. 5","4.4"},
				                { "1. Platon","2. Arthur Shopenhaur","3. Nietzche","4. Socrates"} ,
			                 	{ "1. Python","2. C++","3. Java","4. Php"} }; 
		

		int [] answers = {4,1,3};
		
		System.out.println("*******************");
		System.out.println("Velcome to Quiz");
		System.out.println("*******************");
		
		for ( int i = 0  ; i<questions.length ; i++ )
		{
			System.out.println(questions[i]);
			
		
			
		for (String option : options[i] )
		{
			System.out.println(option);
			
		}
		
		System.out.println("Enter your answer : ");
		guess = scanner.nextInt();
	    scanner.nextLine();
	
		if ( guess ==answers[i])
		{
			System.out.println("Perfect! That is correct !!");
          score++;		
		}
		else
		{
			System.out.println("Unfortunately, That is false !");
		}
		
	System.out.println("********************");
	
	
		
		}
		   
		System.out.println("Your total score is = "+ score + " out of " + questions.length);
		System.out.println("********************");
		System.out.println("Quiz finished !");
		
	scanner.close();	   
		
}
}