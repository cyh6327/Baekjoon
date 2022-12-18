package baekjoon;

import java.util.Scanner;

public class Baekjoon2525 {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
	
			if((b+c)<60) {
				b = b+c;
			} else if((a + ((b+c) / 60)) >= 24) {
					a = (a + ((b+c) / 60)) - 24;
					b = (b+c) % 60;
			} else {
				a = a + ((b+c) / 60);
				b = (b+c) % 60;
			}
			
			System.out.println(a +" "+b);
		}
}
