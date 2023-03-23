package baekjoon;

import java.util.Scanner;

public class Baekjoon2420 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long m = scan.nextLong();
		
		System.out.println(Math.abs(n-m));
		
		scan.close();
	}

}
