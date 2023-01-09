package baekjoon;

import java.util.Scanner;

public class Baekjoon2439 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int a=n; a>i; a--) {
				System.out.print(" ");
			}
			for(int b=0; b<i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
