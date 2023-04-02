package baekjoon;

import java.util.Scanner;

public class Baekjoon10872 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int f = 1;
		
		for(int i=1; i<=n; i++) {
			f *= i;
		}
		
		System.out.println(f);
		
		scan.close();
	}

}
