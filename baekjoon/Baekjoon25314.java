package baekjoon;

import java.util.Scanner;

public class Baekjoon25314 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i<n; i+=4) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
