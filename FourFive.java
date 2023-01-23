package FourFive;

import java.util.Scanner;

public class FourFive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit ;
		System.out.println("Limit degerini giriniz :");
		limit=scan.nextInt();
		for (int i=1 ; i<=limit ; i*=4) {
			
		System.out.println("4' un kuvveti "  + i);
		}
	
	for (int i=1 ; i<=limit ; i*=5) {
		
	System.out.println("5' in kuvveti "  + i);
	}
}
}
