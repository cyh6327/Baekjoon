package baekjoon;

import java.util.Scanner;

public class Baekjoon7891 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int x, y = 0;
		
		for(int i=0; i<t; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println(x+y);
		}
		
		scan.close();
	}

}
