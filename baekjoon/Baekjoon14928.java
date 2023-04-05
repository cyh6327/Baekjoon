package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Baekjoon14928 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 시간 초과
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		BigInteger n = new BigInteger(br.readLine());
//		BigInteger b = new BigInteger("20000303");
//		
//		bw.write(n.remainder(b) +"");
//		
//		bw.flush();
//		bw.close();
		
		// 나머지 연산 분배 법칙 이용
		// (A+B)%M == ((A%M) + (B%M))%M
		String n = br.readLine();
		long remain = 0;

        for(int i=0; i<n.length(); i++){
        	System.out.println("remain*10 = " + remain*10);
        	System.out.println("n.charAt(i) -'0' = " + (n.charAt(i) -'0'));
        	System.out.println("A+B="+(remain*10 + n.charAt(i) - '0'));
        	
            remain=(remain*10 + n.charAt(i) - '0') % 20000303;
            System.out.println("remain = " + remain);
            System.out.println();
        }

	}
}
