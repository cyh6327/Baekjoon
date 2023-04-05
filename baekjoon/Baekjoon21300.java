package baekjoon;

import java.util.Scanner;

public class Baekjoon21300 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, count = 0;
		
		for(int i=0; i<6; i++) {
			n = scan.nextInt();
			count += n*5;
		}
		
		System.out.println(count);
		
		scan.close();
	}

}
