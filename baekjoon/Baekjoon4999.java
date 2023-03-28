package baekjoon;

import java.util.Scanner;

public class Baekjoon4999 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String j = scan.next();
		String d = scan.next();
		int jCnt = 0;
		int dCnt = 0;
		
		for(int i=0; i<j.length(); i++) {
			if(j.charAt(i) == 'a') {
				jCnt += 1;
			}
		}
		
		for(int k=0; k<d.length(); k++) {
			if(d.charAt(k) == 'a') {
				dCnt += 1;
			}
		}
		
		if(jCnt >= dCnt) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
		
		scan.close();
	}

}
