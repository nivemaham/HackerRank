import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pCount =0;
		int nCount =0;
		int zCount =0;
		
		for (int arr_i = 0; arr_i < n; arr_i++) {
			int num = in.nextInt();
			if(num<0){
				nCount++;
			}
			else if(num>0)
			{
				pCount++;
			}
			else {zCount++;}
		}
		in.close();
		System.out.printf("%.6f\n",(float)pCount/n);
		System.out.printf("%.6f\n",(float)nCount/n);
		System.out.printf("%.6f\n",(float)zCount/n);
	}
}
