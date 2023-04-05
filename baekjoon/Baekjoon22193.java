package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon22193 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		
		System.out.println(a.multiply(b));
		
		scan.close();
	}

}
