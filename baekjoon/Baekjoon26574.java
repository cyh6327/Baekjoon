package baekjoon;

import java.util.Scanner;

public class Baekjoon26574 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num = 0;
		
		for(int i=0; i<n; i++) {
			num = scan.nextInt();
			System.out.println(num + " " + num);
		}
		
		scan.close();
	}

}
