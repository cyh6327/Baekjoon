package baekjoon;

import java.util.Scanner;

public class Baekjoon2845 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int p = scan.nextInt();
		int cnt = l*p;
		
		for(int i=0; i<5; i++) {
			System.out.print(scan.nextInt()-cnt + " ");
		}
		
		scan.close();
	}

}
