package baekjoon;

import java.util.Scanner;

public class Baekjoon2444 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i=0; i<n; i++) {
			//System.out.println("i="+i);
			for(; a<n-1; a++) {
				System.out.print(" ");
			}
			a = 0;
			a += i+1;
			
			for(; b>=i; b--) {
				System.out.print("*");
			}
			b = 0;
			b += i*3;
			
			System.out.println(" ");
		}
		
		scan.close();
	}

}
