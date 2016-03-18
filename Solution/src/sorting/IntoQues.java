package sorting;

import java.util.Scanner;

public class IntoQues {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int v = scr.nextInt();
		if(v<-1000 || v>1000) System.exit(-1);
		int n = scr.nextInt();
		if(n<1 || n>1000) System.exit(-1);
		for(int i=0; i<n;i++)
		{
			if (v==scr.nextInt())
			{
				System.out.println(i++);
				System.exit(0);
			}
		}
		scr.close();
	}

}
