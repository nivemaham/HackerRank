import java.util.Scanner;


public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int primaryDiagonal =0;
		int secondaryDiagonal =0;
		for(int j = 0; j < n; j++){
		    for(int k = 0; k < n; k++){
		        int cin = in.nextInt();
		        if(j == k){
		        	primaryDiagonal += cin;
		        }
		        if(j+k == (n-1)){
		        	secondaryDiagonal += cin;
		        }
		    }
		}
		System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));
		in.close();
	}
}
