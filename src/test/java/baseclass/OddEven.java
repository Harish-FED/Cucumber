package baseclass;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find odd or even");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println(num + " is a even number");
			
		} else {
			
			System.out.println(num + " is a odd number");
		}
		
		scan.close();
	}
}
