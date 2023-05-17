package baekjoon;

import java.util.Scanner;

public class Baekjoon10988 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String a = "";
		String revA = "";
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			a += str.charAt(i) + "";
		}
		
		char[] arr2 = new char[str.length()];
		
		for(int j=arr.length-1, k=0; j>=0; j--, k++) {
			arr2[k] = arr[j];
			revA += arr[j] +"";
		}
		
		if(a.equals(revA))
			System.out.println(1);
		else
			System.out.println(0);
		
		scan.close();
	}
}
