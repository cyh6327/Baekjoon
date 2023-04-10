package baekjoon;

import java.util.Scanner;

public class Baekjoon26545 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num, sum = 0;
		
		for(int i=0; i<n; i++) {
			num = scan.nextInt();
			sum += num;
		}
		
		System.out.println(sum);
		
		scan.close();
	}

}
