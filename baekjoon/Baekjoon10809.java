package baekjoon;

import java.util.Scanner;

public class Baekjoon10809 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		for(int i=97; i<=122; i++) {
			if(str.contains((char)i+"")) {
				System.out.print(str.indexOf((char)i+"") + " ");
			} else {
				System.out.print(-1 + " ");
			}
		}
		
		scan.close();
	}

}
