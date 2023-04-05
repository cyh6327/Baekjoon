package baekjoon;

import java.util.Scanner;

public class Baekjoon23235 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, t = 0;
		int c = 1;
		
		while(true) {
			t = scan.nextInt();
			if(t == 0)
				break;
			for(int i=0; i<t; i++) {
				n = scan.nextInt();
			}
			System.out.println("Case " + c + ": Sorting... done!");
			c++;
		}
		
		scan.close();
	}

}
