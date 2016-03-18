package dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int numOfTestCases = scr.nextInt();
		for (int i = 0; i < numOfTestCases; i++) {
			int size = scr.nextInt();
			int[] arr = new int[size];
			for (int j = 0; j < size; j++) {
				arr[j] = scr.nextInt();
			}
			System.out.println(findMaxSubArray(arr) + " "
					+ findNonContiguosMaxSubArray(arr));
		}
		scr.close();
	}

	private static int findMaxSubArray(int[] arr) {
		int maxEndingHere = arr[0];
		int maxSoFar = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			maxEndingHere = Math.max(x, maxEndingHere + x);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	private static int findNonContiguosMaxSubArray(int[] arr) {
		Arrays.sort(arr);
		int maxSoFar = 0;
		if (arr[arr.length - 1] <= 0)
			maxSoFar = arr[arr.length - 1];
		else {
			for (int i = 0; i < arr.length; i++) {
				int x = arr[i];
				if (x >= 0) {
					maxSoFar += x;
				}
			}
		}
		return maxSoFar;
	}

}
