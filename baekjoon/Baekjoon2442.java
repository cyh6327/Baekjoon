package baekjoon;

import java.util.Scanner;

public class Baekjoon2442 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int j = 0;
		for(int i=0; i<n; i++) {
			j = (n-1)-i;
			for(; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<1+(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
