package baekjoon;

import java.util.Scanner;

public class Backjoon2438 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int a=1; a<=i ; a++)
				System.out.print("*");
			System.out.println();
		}
	}

}
