package baekjoon;

import java.util.Scanner;

public class Baekjoon2908 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		String reverseA = "";
		String reverseB = "";
		
		for(int i=3; i>0; i--) {
			reverseA += a.charAt(i-1);
			reverseB += b.charAt(i-1);
		}
		
		System.out.println(Math.max(Integer.parseInt(reverseA), Integer.parseInt(reverseB)));
		
		scan.close();
	}

}
