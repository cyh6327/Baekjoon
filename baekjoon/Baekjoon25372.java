package baekjoon;

import java.util.Scanner;

public class Baekjoon25372 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			String pw = scan.next();
			if(pw.length() >= 6 && pw.length() <= 9)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		
		scan.close();
	}

}
