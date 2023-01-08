package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon15552 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		
		//int t = Integer.parseInt(bf.readLine());	//테스트케이스의 개수
		//int a = Integer.parseInt(bf.readLine());
		//int b = Integer.parseInt(bf.readLine());
		//String a = bf.readLine();
		//String b = bf.readLine();
		int a = bf.read();
		int b = bf.read();
		bf.
		
		//StringTokenizer st = new StringTokenizer();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		//bw.write(t);   //버퍼에 있는 값 전부 출력
		/*
		 * for (int i=0; i<t; i++) {
		 * 
		 * bw.write(a+b); }
		 */
		
		/*
		 * bw.write(a); bw.write(b);
		 */
		bw.write(a);
		bw.write(b);
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bw.close();   //스트림을 닫음
	}
	
}
