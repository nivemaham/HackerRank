package sorting;

import java.util.Scanner;

public class InsertionSort1 {
	
	 public static void insertIntoSorted(int[] arr)
		{
			for (int i = 1; i <arr.length; i++) {
				if(arr[i-1]>arr[i])
				{
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
				printArray(arr);
			}
		}

	/* Tail starts here */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
        for(int i=0;i<s;i++){
           ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
        
   }
   
   
   private static void printArray(int[] ar) {
     for(int n: ar){
        System.out.print(n+" ");
     }
       System.out.println("");
  }
   
}
