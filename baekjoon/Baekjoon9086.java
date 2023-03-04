package baekjoon;

import java.util.Scanner;

public class Baekjoon9086 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str;
		
		for(int i=0; i<n; i++) {
			str = scan.next().toString();
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length()-1));
		}
		
		scan.close();
	}
}
