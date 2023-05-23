package baekjoon;

import java.util.Scanner;

public class Baekjoon14916 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int r = n%5;
		int cnt = n/5;
		
		if(r%2 == 0) {
			cnt += r/2;
		} else if(n%2==0 && n<=8) {
			cnt = n/2;
		} else {
			if(n > 3) {
				cnt -= 1;
				n -= cnt*5;
				cnt += n/2;
			}
			if(cnt == 0)
				cnt = -1;
		}
		
		System.out.println(cnt);
		
		scan.close();
	}

}
