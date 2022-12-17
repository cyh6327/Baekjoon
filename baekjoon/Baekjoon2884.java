package baekjoon;

import java.util.Scanner;

public class Baekjoon2884 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if(m >= 45) {
			m = m-45;
		} else {
			if(h==0) {
				h = 23;
			} else {
				h = h-1;
			}
			m = (m+60)-45;
		}
		System.out.println(h +" " +m);
}	
}
