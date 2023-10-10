package baseclass;

import java.util.Scanner;

public class OddEvenCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start number");
		int start = scan.nextInt();
		System.out.println("Enter the end number");
		int end = scan.nextInt();
		
		//System.out.println();
		
		for(int i = start; i<= end ; i++) {
			if(i % 2 == 0) {
				System.out.print(i + ",");
			}
			
			scan.close();
		}
	}
}
