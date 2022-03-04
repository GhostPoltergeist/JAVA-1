import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		//your code goes here
	        int hpd = 24;
                int mph = 60;
		int spm = 60;

	    //Convert to hours
		int result1 = days * hpd;
		//Convert to minutes
		int result2 = result1 * mph;
		//Convert to seconds
		int result3 = result2 * spm;
		//Output
                double finalresult = result3;
		System.out.println(finalresult);
	}
}
