package baekjoon;

import java.util.Scanner;

public class Baekjoon26209 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		for(int i=0; i<8; i++) {
			n = scan.nextInt();
			if(n == 9) {
				System.out.println("F");
				break;
			}
			if(i == 7)
				System.out.println("S");
		}
		
		scan.close();
	}

}
