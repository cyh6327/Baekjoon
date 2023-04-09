package baekjoon;

import java.util.Scanner;

public class Baekjoon24736 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String result = "";
		
		for(int i=0; i<2; i++) {
			int t = scan.nextInt();
			int f = scan.nextInt();
			int s = scan.nextInt();
			int p = scan.nextInt();
			int c = scan.nextInt();
			result += (t*6)+(f*3)+(s*2)+(p*1)+(c*2) + " ";
		}
		
		System.out.println(result);
		
		scan.close();
	}

}
