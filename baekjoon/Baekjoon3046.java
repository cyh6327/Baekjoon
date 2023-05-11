package baekjoon;

import java.util.Scanner;

public class Baekjoon3046 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r1 = scan.nextInt();
		int s = scan.nextInt();
		
		int answer = s*2-r1;
		
		System.out.println(answer);
		
		scan.close();
	}

}
