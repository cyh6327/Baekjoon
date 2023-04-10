package baekjoon;

import java.util.Scanner;

public class Baekjoon26766 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(" @@@   @@@ \n"
					+ "@   @ @   @\n"
					+ "@    @    @\n"
					+ "@         @\n"
					+ " @       @ \n"
					+ "  @     @  \n"
					+ "   @   @   \n"
					+ "    @ @    \n"
					+ "     @     ");
		}
		
		scan.close();
	}

}
