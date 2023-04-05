package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon16099 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger lt,wt,le,we;
		
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			lt = scan.nextBigInteger();
			wt = scan.nextBigInteger();
			le = scan.nextBigInteger();
			we = scan.nextBigInteger();
			
			if(lt.multiply(wt).compareTo(le.multiply(we)) == -1) 
				System.out.println("Eurecom");
			else if (lt.multiply(wt).compareTo(le.multiply(we)) == 1)
				System.out.println("TelecomParisTech");
			else {
				System.out.println("Tie");
			}
		}
		
		scan.close();
	}

}
