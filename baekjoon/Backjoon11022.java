package baekjoon;

import java.util.Scanner;

public class Backjoon11022 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int a;
		int b;
		int sum = 0;
		
		for(int i=1; i<=t; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			sum = a + b;
			System.out.println("Case #" +i+ ": "+ a + " + "+ b + " = " + sum);
		}
	}

}
