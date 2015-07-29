package MainPackage;


import java.util.Scanner;
public class MainClass {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 0;
		System.out.print("Enter upper bound: ");
		
		if (userInput.hasNextInt()) // Enter upper bound
		{
			 max = userInput.nextInt();
		}
		else
		{
			System.out.println("No integer entered!");
		}
		
		int i = 1;
		int result = 0;

		while (i < max) // Calculate sum of multiplies of 3 and/or 5
		{
			if ((i % 3 == 0) || (i % 5 == 0))
				result = result + i;
			i++;
		}
		
		System.out.println(result); // Printing Result

	}

}
