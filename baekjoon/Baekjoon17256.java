package baekjoon;

import java.util.Scanner;

public class Baekjoon17256 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ax = scan.nextInt();
		int ay = scan.nextInt();
		int az = scan.nextInt();
		
		int cx = scan.nextInt();
		int cy = scan.nextInt();
		int cz = scan.nextInt();
		
		int bx = cx-az;
		int by = cy/ay;
		int bz = cz-ax;
		
		System.out.println(bx + " " + by + " " + bz);
		
		scan.close();
	}

}
