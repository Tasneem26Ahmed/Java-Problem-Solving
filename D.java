import java.util.Scanner;
public class D{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);

		//System.out.println(sumDigits(input.nextLong()));

		//System.out.println(fact(input.nextLong()));

		//System.out.println(fib(input.nextLong()));


		System.out.println(isPalindrome("BABA"));
	}

	public static long sumDigits(long n){
		if (n == 0)
			return 0;
		else{
			return (n % 10) + sumDigits(n / 10);
		}

	}

	public static long fact(long n){
		if (n == 0)
			return 1;
		else{
			return n * fact(n - 1);
		}

	}


	public static long fib(long n){
		if (n == 0)
			return 0;

		if (n == 1)
			return 1;


		else{
			return fib(n - 2) + fib(n - 1);
		}

	}

	public static boolean isPalindrome(String s){
		if (s.length() / 2 == 0 )
			return true;
		else if (s.charAt(0) != s.charAt(s.length()-1)){
			return false;
		}
		else{
			return isPalindrome(s.substring(1, s.length() - 1)) ;
		}

	}
}