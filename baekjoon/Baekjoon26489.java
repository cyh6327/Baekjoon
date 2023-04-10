package baekjoon;

import java.util.Scanner;

public class Baekjoon26489 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		while(scan.hasNext()) {
			String data = scan.nextLine();
			count += 1;
		}
		
		System.out.println(count);
		
		scan.close();
	}

}
