package baekjoon;

import java.util.Scanner;

public class Baekjoon2588 {
	
	public class Main {
		public static void main(String[] args) {
			int A = 0, B = 0;
			Scanner scanner = new Scanner(System.in);
			A = scanner.nextInt();
			B = scanner.nextInt();

			System.out.println(A*(B%10));
			System.out.println(A*((B/10)%10));
			System.out.println(A*((B/100)%10));
			System.out.println(A*B);
		}
	}
}