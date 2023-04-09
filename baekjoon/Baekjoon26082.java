package baekjoon;

import java.util.Scanner;

public class Baekjoon26082 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result = ((b/a)*3)*c;
		
		System.out.println(result);
		
		scan.close();
	}

}
