import java.util.Scanner;


public class CurrentBuffer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		for(int i=0; i <n; i++)
		{
			int k=n-i;
			StringBuffer str = new StringBuffer();
			for(int j=0; j<k-1; j++){
				str.append(" ");
			}
			for(int j=0; j<=i; j++){
				str.append("#");
			}
			System.out.println(str.toString());
		}
	}
}
