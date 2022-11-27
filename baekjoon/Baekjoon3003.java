package baekjoon;

import java.util.Scanner;

public class Baekjoon3003 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
			
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		int num6 = scanner.nextInt();
        
        System.out.printf("%d %d %d %d %d %d",-(num1-1), -(num2-1), -(num3-2), -(num4-2), -(num5-2), -(num6-8));
        
    }
}
