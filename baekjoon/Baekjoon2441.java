package baekjoon;

import java.util.Scanner;

public class Baekjoon2441 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = n;
		
		for(int i=0; i<n; i++, m--) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
