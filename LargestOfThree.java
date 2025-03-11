import java.util.Scanner;
public class LargestOfThree {
	public static void main(String [] args) {
		Scanner mad = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first num : ");
		a= mad.nextInt();
		System.out.println("Enter the sencond num : ");
		b = mad.nextInt();
		System.out.println("Enter the third num : ");
		c = mad.nextInt();
		
		if (a > b && a>c) {
			System.out.println("The largest num is"+a);
		}else if (b > c && b > a) {
			System.out.println("The largest num is "+b);
		}else if (c>a && c>b) {
			System.out.println("The largest num is"+c);
			
		}else {
			System.out.println("***INVALID***");
		}
	}

}
