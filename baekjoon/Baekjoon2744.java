package baekjoon;

import java.util.Scanner;

public class Baekjoon2744 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		for(int i=0; i<str.length(); i++) {
			if((int)str.charAt(i) <= 89) {
				System.out.print((char)(((int)str.charAt(i))+32));
			} else {
				System.out.print((char)(((int)str.charAt(i))-32));
			}
		}
		
		scan.close();
	}
}
