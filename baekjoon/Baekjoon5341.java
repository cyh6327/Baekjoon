package baekjoon;

import java.util.Scanner;

public class Baekjoon5341 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		
		while(true) {
			sum = 0;
			n = scan.nextInt();
			if(n == 0) {
				break;
			}
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		
		scan.close();
	}

}
