package baekjoon;

import java.util.Scanner;

public class Baekjoon27294 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int s = scan.nextInt();
		
		if(t >= 12 && t <=16 && s == 0)
			System.out.println(320);
		else
			System.out.println(280);
		
		scan.close();
	}

}
