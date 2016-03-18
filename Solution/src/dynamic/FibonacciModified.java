package dynamic;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n0 = scr.nextInt();
		if (n0 < 0 || n0 > 2) {
			System.exit(-1);
		}
		int n1 = scr.nextInt();
		if (n1 < 0 || n1 > 2)
			System.exit(-1);
		int n = scr.nextInt();
		if (n < 3 || n > 20)
			System.exit(-1);
		scr.close();
		BigInteger[] fibonacciContainer = new BigInteger[n];
		fibonacciContainer[0] = new BigInteger(n0 + "");
		fibonacciContainer[1] = new BigInteger(n1 + "");
		// fibonacciContainer[2] = (fibonacciContainer[1]*fibonacciContainer[1])
		// + fibonacciContainer[0];
		for (int i = 2; i < n; i++) {
			fibonacciContainer[i] = (fibonacciContainer[i - 1]
					.multiply(fibonacciContainer[i - 1]))
					.add(fibonacciContainer[i - 2]);
			// System.out.println(fibonacciContainer[i]);
		}
		System.out.println(fibonacciContainer[n - 1]);
		System.out.println(fibinacciModified(n - 1));
		System.out.println(fibinacciModifiedDP(n));
		System.out.println(fibinacciModifiedDPOptimized(n));

	}

	public static int fibinacciModified(int n) {
		if (n < 3)
			return 1;
		return fibinacciModified(n - 1) * fibinacciModified(n - 1)
				+ fibinacciModified(n - 2);
	}

	public static int fibinacciModifiedDP(int n) {
		int[] fibonacciContainer = new int[n];
		fibonacciContainer[0] = 0;
		fibonacciContainer[1] = 1;
		for (int i = 2; i < n; i++) {
			fibonacciContainer[i] = (fibonacciContainer[i - 1])
					* (fibonacciContainer[i - 1]) + fibonacciContainer[i - 2];
		}
		return fibonacciContainer[n - 1];
	}

	  public static int fibinacciModifiedDPOptimized(int n) {
	        int earliest =0;
	        int earlier =1;
	        int current =0;
	        for (int i = 2; i < n; i++) {
	            current = (earlier
	                    * earlier) + earliest;
	            earliest=earlier;
	            earlier=current;
	        }
	        return current;
	    }
}
