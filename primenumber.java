import java.util.Scanner;
public class PrimeNum {
	public static void main(String [] args) {
		Scanner mad = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = mad.nextInt();
		
		if (num < 2) {
			System.out.println(num+" is not Prime Number");
		}else if(num == 2 || num == 3) {
			System.out.println(num+" is Prime Number");
		}else if (num % 2 == 0 || num % 3==0) {
			System.out.println(num+" is not Prime Number");
		}else {
			boolean isPrime=true;
			for (int i = 5 ; i * i <=num ; i+=6) {
				if (num % i ==0 || num % (i+2)==0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(num+" is Prime Number");
			}else {
				System.out.println(num+" is not Prime Number");

			}
		}
	}

}
