package baekjoon;

import java.util.Scanner;

public class Baekjoon10953 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		int t = scan.nextInt();
		String n = "";
		
		for(int i=0; i<t; i++) {
			n = scan.next().replace(",", "");
			answer = Integer.parseInt(n.charAt(0)+"") + Integer.parseInt(n.charAt(1)+"");
			System.out.println(answer);
		}
		
		scan.close();
	}

}
