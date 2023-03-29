package baekjoon;

import java.util.Scanner;

public class Baekjoon3733 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		int s = 0;
		
		while(scan.hasNextInt()) {
			n = scan.nextInt();
			s = scan.nextInt();
			System.out.println(s/(n+1));
		}
		
		scan.close();
	}

}
