package baekjoon;

import java.util.Scanner;

public class Baekjoon11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str = scan.next();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}
