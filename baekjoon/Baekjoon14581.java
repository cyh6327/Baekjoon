package baekjoon;

import java.util.Scanner;

public class Baekjoon14581 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String id = scan.next();
		String fan = "fan";
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1 && j==1) {
					System.out.print(":"+id+":");
				} else {
					System.out.print(":"+fan+":");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
