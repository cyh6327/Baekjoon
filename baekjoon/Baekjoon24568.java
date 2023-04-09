package baekjoon;

import java.util.Scanner;

public class Baekjoon24568 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int s = scan.nextInt();
		int result = (r*8)+(s*3)-28;
		
		System.out.println(result);
		
		scan.close();
	}
}
