package baekjoon;

import java.util.Scanner;

public class Baekjoon15727 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		
		if(l%5 == 0)
			System.out.println(l/5);
		else 
			System.out.println((l/5)+1);
		
		scan.close();
	}

}
