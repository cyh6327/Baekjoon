package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon24309 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		BigInteger c = scan.nextBigInteger();
		
		BigInteger result = (b.subtract(c)).divide(a);
		System.out.println(result);
		
		scan.close();
	}

}
