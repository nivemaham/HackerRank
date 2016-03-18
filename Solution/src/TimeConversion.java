import java.util.Scanner;


public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		String[] data = n.split(":");
		int len = data[2].length();
		String suffix = data[2].substring(len-2, len);
		String hr = data[0];
		StringBuffer str = new StringBuffer();
		if( suffix.equals("PM") && !hr.equals("12")){
				str.append((Integer.parseInt(data[0])+12));
		}
		else if (suffix.equals("AM") && hr.equals("12"))
			str.append("00");
		else
			str.append(data[0]);
		str.append(":");
		str.append(data[1]);
		str.append(":");
		str.append(data[2].substring(0,2));
		 System.out.println(str.toString());
	}
}
