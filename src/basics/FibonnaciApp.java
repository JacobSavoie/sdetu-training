package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		//Fibonnaci number is defined by the sum of the previous two Fibonnaci numbers
		//Fib of 0 equals 0 and fib 1 equals 1
		//Fib(2) is fib(1) + fib(0) which is 1 + 0 = 1 
		//Fib(3) is fib(2) + fib(1) which is 1 + 1 = 2
		//Fib(4) is fib(3) + fib(2) which is 2 + 1 = 3
		//Fib(5) is fib(4) + fib(3) whcih is 3 + 2 = 5
		
		System.out.println(fib(5));
	}
	
	public static int fib(int n) {
		if(n == 0) {
			return 0;
			
		} else if (n == 1) {
			return 1;
		}
		
		return (fib(n-1) + fib(n-2));
	}

}
