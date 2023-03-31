package baekjoon;

import java.util.Scanner;

public class Baekjoon8545 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		scan.close();
		
	}

}
