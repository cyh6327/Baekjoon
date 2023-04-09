package baekjoon;

import java.util.Scanner;

public class Baekjoon25238 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		double result = a - (a*b/100.0);
		
		if(result < 100)
			System.out.println(1);
		else 
			System.out.println(0);
		
		scan.close();
	}

}
