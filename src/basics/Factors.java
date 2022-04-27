package basics;

public class Factors {

	public static void main(String[] args) {
		//Factors of 1 are 1 * 1
		//Factors of 2 are 2 * 1
		//Factors of 3 are 3 * 2 * 1
		//Factors of 4 are 4 * 3 * 2 * 1
		
		System.out.println(sum(4));
		
		//Write a function that computes factorial **hint: use recursion, n = n * (n-1)!
		System.out.println("Factorial: " + fact(5));
		
		//Write three functions that return the min, avg, and max of an array
		int[] numbers = {5, 34, 33, 24, -222, 45};
		System.out.println("Min: " + findMin(numbers));
		
		//run findmax
		System.out.println("Max: " + findMax(numbers));
		
		//run findavg
		System.out.println("Avg: " + findAvg(numbers));
		
	}
	
	public static int findAvg(int[] arr) {
		//take sum, divide by num of elements
		int sum = 0;
		for(int n = 0; n < arr.length; n++) {
			sum += arr[n];
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length;
		
	}
	
	public static int findMin(int[] arr ) {
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr ) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum += i;
			System.out.println(" = " + sum);
		}
		
		return sum;
	}
	
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		} 
		return fact(n - 1) * n;
	}
}
