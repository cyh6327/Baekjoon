package baekjoon;

import java.util.Scanner;

public class Baekjoon2475 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += Math.pow(scan.nextInt(), 2);
		}
		
		System.out.println(sum%10);
		
		scan.close();
	}
}
