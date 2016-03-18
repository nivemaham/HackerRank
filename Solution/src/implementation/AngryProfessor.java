package implementation;
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int j = 0; j < t; j++) {
			int numofStud = in.nextInt();
			int cancelThresh = in.nextInt();
			int numofpres =0;
			for (int i = 0; i < numofStud; i++) {
				int time = in.nextInt();
//				System.out.println("time "+time);
				if ( time<= 0) {
					numofpres++;
//					System.out.println(" i "+i +" num "+numofpres);
				}
			}
//			System.out.println(" num "+numofpres + " cancel "+cancelThresh);
			if (numofpres < cancelThresh) 
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}
