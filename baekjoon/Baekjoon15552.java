package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*입력
첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

출력
각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.*/

public class Baekjoon15552 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bf.readLine()); 	//테스트케이스의 개수
		
		String str = null;
		int a = 0;
		int b = 0;
		
		for (int i = 0; i<t; i++) {
			str = bf.readLine();	
			StringTokenizer st = new StringTokenizer(str);	//띄어쓰기 기준으로 문자열 분리해줌
			while (st.hasMoreTokens()) {
		         a = Integer.parseInt(st.nextToken());
		         b = Integer.parseInt(st.nextToken());
		         bw.write(a+b + "");
		         bw.newLine();
		     }
		}
		bw.flush();
		bw.close();
		
	}
	
}
