package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon2338 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger a = new BigInteger(scan.next());
		BigInteger b = new BigInteger(scan.next());
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.divide(b));
		scan.close();
	}

}
