package baekjoon;

import java.util.Scanner;

public class Baekjoon26307 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		int time = (h-9)*60 + m;
		
		System.out.println(time);
		
		scan.close();
	}
	
}
