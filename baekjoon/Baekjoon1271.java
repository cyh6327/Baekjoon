package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1271 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger n = new BigInteger(scan.next());
		BigInteger m = new BigInteger(scan.next());
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		
		scan.close();
	}

}
