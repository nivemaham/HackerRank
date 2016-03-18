import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BearAndWorkBook {
	
	public static void main(String[] args)
	{
		
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int k = scr.nextInt();
		if(n>100 || n<-1 || k>100 || n<-1) System.exit(-1);
		int pages =1;
		int spatial =0;
		for(int i=0; i<n;i++)
		{
			int prob = scr.nextInt();
			if(prob>100 || prob<-1) System.exit(-1);
			int locPages = prob/k;
			int remainder = prob%k;
			if(remainder>0) locPages++;
			for(int j=1; j<=locPages; j++ )
			{
				List<Integer> range =null;
				int currentProb =j*k;
				if(currentProb<prob){
					range=makeSequence(((j-1)*k)+1, currentProb); 
				}
				else
				{
					 range =makeSequence(((j-1)*k)+1, prob); 
				}
				if(range.contains(pages))
				{
					spatial++;
				}
				pages++;
			}
			
		}
		scr.close();
		System.out.println(spatial);
		
		
	}
	private static List<Integer> makeSequence(int begin, int end) {
		  List<Integer> ret = new ArrayList(end - begin + 1);

		  for(int i = begin; i <= end; i++)
		  {
			  ret.add(i);
		  }

		  return ret;  
		}
	

}
