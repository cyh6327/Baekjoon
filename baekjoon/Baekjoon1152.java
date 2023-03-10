package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1152 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			st.nextToken();
			count += 1;
		}
		
		System.out.println(count);
		scan.close();
	}

}
