package FibonacciPackage;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0, b=1;
		int c=0;
		int sum=0;
		final int MAX = 100;
		
		while(c<=MAX){
			// Calculating Fibonacci numbers
			if (c%2==0) sum=sum+c;
			c = a+b;
			a=b;
			b=c;
			//System.out.println(c);
		}
		System.out.println(sum);

	}

}
