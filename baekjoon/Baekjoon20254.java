package baekjoon;

import java.util.Scanner;

public class Baekjoon20254 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ur = scan.nextInt();
		int tr = scan.nextInt();
		int uo = scan.nextInt();
		int to = scan.nextInt();
		
		System.out.println(56*ur + 24*tr + 14*uo + 6*to);
		
		scan.close();
	}

}
