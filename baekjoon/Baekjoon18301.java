package baekjoon;

import java.util.Scanner;

public class Baekjoon18301 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n12 = scan.nextInt();
		int n = ((n1+1)*(n2+1))/(n12+1)-1;
		
		System.out.println(n);
		
		scan.close();
	}

}
