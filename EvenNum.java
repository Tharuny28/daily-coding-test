import java.util.Scanner;
public class EvenNum {
	public static void main(String [] args) {
		Scanner mad = new Scanner(System.in);
		System.out.println("Enter the Starting value : ");
		int i = mad.nextInt();
		System.out.println("Enter the Ending Limit : ");
		int n = mad.nextInt();
		
		for (int a = i ; a<=n;a++) {
			if (a % 2== 0) {
				System.out.println(a);
			}
		}
	}
 
}
