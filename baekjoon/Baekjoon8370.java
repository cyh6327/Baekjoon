package baekjoon;

import java.util.Scanner;

public class Baekjoon8370 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n, k, sum = 0;
		for(int i=0; i<2; i++) {
			n = scan.nextInt();
			k = scan.nextInt();
			sum += n*k;
		}
		
		System.out.println(sum);
		
		scan.close();
	}

}
