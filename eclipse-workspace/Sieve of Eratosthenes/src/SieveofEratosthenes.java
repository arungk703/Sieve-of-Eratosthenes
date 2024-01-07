import java.util.Scanner;

public class SieveofEratosthenes {

	static boolean prime[];

	public static void primeNumber(int n) {

		prime = new boolean[n]; // by default every value will be false.

		for(int i=2; i<n;i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i < n; i++) {
			if (prime[i]) {
				for (int j = i * i; j < n; j += i) {
					prime[j] = false;
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int primeOrNot = sc.nextInt();

		primeNumber(n);

		System.out.println(prime[primeOrNot]);
	}

}
