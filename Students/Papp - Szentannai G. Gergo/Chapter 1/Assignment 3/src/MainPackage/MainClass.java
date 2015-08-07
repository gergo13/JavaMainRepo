package MainPackage;


import java.util.Scanner;
public class MainClass {
	
	public static boolean isPalindrome(int x){
		// Returns true is number is palindrome
		boolean b = false;
		int y = 0;
		int old = x;
		
		while (x!=0){
			y = y*10 +x%10;
			x = x/10;
		}
		if (old == y)
			b = true;	
		
		return b;
	}

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int DIGIT; // number of digits
		System.out.println("Enter number of digits:");
		
		if (userInput.hasNextInt()) // Enter upper bound {
			DIGIT = userInput.nextInt();
		}
		else {
			System.out.println("No integer entered!");
			DIGIT = 0;
		}
		
		int max = 0;
		
		for(int a = (int) Math.pow(10,DIGIT-1); a < Math.pow(10,DIGIT); a++){
			for(int b = a; b < Math.pow(10,DIGIT); b++ ){
				
				if ((a*b > max)&&(isPalindrome(a*b)))
					max = a*b;
			}
		}
		
		System.out.println(max);
	}
}
