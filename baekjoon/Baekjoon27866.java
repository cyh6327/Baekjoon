package baekjoon;

import java.util.Scanner;

public class Baekjoon27866 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int i = scan.nextInt();
		
		System.out.println(s.charAt(i-1));
		
		scan.close();
	}

}
