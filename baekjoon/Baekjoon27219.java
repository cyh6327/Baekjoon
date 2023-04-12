package baekjoon;

import java.util.Scanner;

public class Baekjoon27219 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n/5; i++) {
			System.out.print("V");
		}
		
		for(int j=0; j<n%5; j++) {
			System.out.print("I");
		}
		
		scan.close();
	}

}
