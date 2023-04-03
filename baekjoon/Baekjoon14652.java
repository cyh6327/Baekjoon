package baekjoon;

import java.util.Scanner;

public class Baekjoon14652 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		
		System.out.print(k/m + " " + k%m);
		
		scan.close();
	}

}
