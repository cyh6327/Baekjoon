package baekjoon;

import java.util.Scanner;

public class Baekjoon5522 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			a = scan.nextInt();
			sum += a;
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}
