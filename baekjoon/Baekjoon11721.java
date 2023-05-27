package baekjoon;

import java.util.Scanner;

public class Baekjoon11721 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			sb.append(str.charAt(i));
			if(sb.length() == 10) {
				System.out.println(sb.toString());
				sb.setLength(0);
			}
		}
		System.out.println(sb.toString());
		
		scan.close();
	}

}
