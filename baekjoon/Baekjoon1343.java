package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1343 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int leng = 0;
		int n = 0;
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(str, ".", true);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			if(token.equals(".")) {
				sb.append(".");
				continue;
			}
			leng = token.length();
			if(leng%2 == 0 || leng%4 == 0) {
				if(leng/4 > 0) {
					n = leng/4;
					for(int i=0; i<n; i++) {
						sb.append("AAAA");
						leng -= 4;
					}
					if(leng%2 == 0 && leng!=0) {
						sb.append("BB");
					} 
				} else if(leng%2 == 0) {
					sb.append("BB");
				}
			} else {
				sb.setLength(0);
				sb.append(-1);
				break;
			}
		}
		System.out.println(sb.toString());
		
		scan.close();
	}

}
