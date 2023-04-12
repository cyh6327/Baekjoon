package baekjoon;

import java.util.Scanner;

public class Baekjoon27324 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		
		if(n.charAt(0) == n.charAt(1))
			System.out.println(1);
		else 
			System.out.println(0);
		
		scan.close();
	}
}
