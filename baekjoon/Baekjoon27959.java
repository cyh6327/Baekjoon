package baekjoon;

import java.util.Scanner;

public class Baekjoon27959 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if(n*100 >= m)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		scan.close();
	}

}
