import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
	//Simple calculator with switch-case
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("******************************");
	    String transactions = "1. Addition Process\n"
	    		            + "2. Extraction Process\n"
	    		            + "3. Multiplication Process\n"
	    		            + "4. Division Process";
	    System.out.println(transactions);
		System.out.println("******************************");
		
		System.out.println("Please select Process");
		String process = scanner.nextLine();
		
		int number1;
		int number2;
		
		switch(process) {
		
		case "1":
			 System.out.println("Please enter first number");	
			 number1 = scanner.nextInt();
			 System.out.println("Please enter second number");
			 number2 = scanner.nextInt();
			 
			 int addition = number1 + number2;
			 System.out.println("Addition number is : " + addition );
			 break;
		   
		
		case  "2":
		 	
			 System.out.println("Please enter first number");	
			 number1 = scanner.nextInt();
			 System.out.println("Please enter second number");
			 number2 = scanner.nextInt();
			 
			 int extraction = number1 - number2;
			 System.out.println("Extraction number is : " + extraction );
			 break;
		
		case "3":
			
			 System.out.println("Please enter first number");	
			 number1 = scanner.nextInt();
			 System.out.println("Please enter second number");
			 number2 = scanner.nextInt();
			 
			 int multiplication = number1 * number2;
			 System.out.println("Multiplication number is : " + multiplication );
			 break;
			 
		case "4":
			
			 System.out.println("Please enter first number");	
			 number1 = scanner.nextInt();
			 System.out.println("Please enter second number");
			 number2 = scanner.nextInt();
			
			 double division = number1 / number2;
			 System.out.println("Division number is : " + division );
			 break;
		 
		default: 
		         System.out.println("You entered an invalid transaction");
		
		
		
		
		
		
		}
		

		
	}

}
