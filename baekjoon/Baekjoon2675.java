package baekjoon;

import java.util.Scanner;

public class Baekjoon2675 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int r;
		String s;
		String temp;
		String result = "";
		
		for(int i=0; i<t; i++) {
			r = scan.nextInt();
			s = scan.next();
			result = "";
			for(int j=0; j<s.length(); j++) {
				temp = s.substring(j, j+1);
				for(int n=0; n<r; n++) {
					result += temp;
				}
			}
			System.out.println(result);
		}
		
		scan.close();
		
	}

}
