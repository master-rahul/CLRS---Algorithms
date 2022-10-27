package Chapter1_RoleOfAlgorithmInComputing;
import java.util.Scanner;

public class Q1_1 {
	
	static long Log10n(long n){
        return (n > 1) ? 1 + Log10n(n / 10) : 0;
    }
	
	static long factorial(long n) {
		long ans = 1;
		for(long i = 1; i <=n; i++) ans *= i;
		return ans;
	}
	
	static void printValues(long n) {
		System.out.println(Log10n(n));
		System.out.println((int)Math.sqrt(n));
		System.out.println(n);
		System.out.println(n * Log10n(n));
		System.out.println(n*n);
		System.out.println(n*n*n);
		System.out.println(Math.pow(2, n));
		System.out.println(factorial(n));
		
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		printValues(n*365);
	}
}
