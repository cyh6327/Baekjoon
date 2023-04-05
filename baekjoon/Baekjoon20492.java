package baekjoon;

import java.util.Scanner;

public class Baekjoon20492 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double n1 = n - (n*0.22);
		double n2 = n - ((n*0.2)*0.22);
		
		if(n1 % 2 == 0) {
			System.out.printf("%d ", (int)n1);
		} else 
			System.out.println(n1 + " ");
		
		if(n2 % 2 == 0) {
			System.out.printf("%d", (int)n2);
		} else
			System.out.println(n2);
		
		scan.close();
	}

}
