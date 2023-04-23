package baekjoon;

import java.util.Scanner;

public class Baekjoon14928 {

	public static void main(String[] args) throws Exception {
// 		시간 초과
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		BigInteger n = new BigInteger(br.readLine());
//		BigInteger b = new BigInteger("20000303");
//		
//		bw.write(n.remainder(b) +"");
//		
//		bw.flush();
//		bw.close();

// 		==========================================================
		
		/*
		 * 나머지 연산 분배 법칙 이용 
		 * (A+B)%M == ((A%M) + (B%M))%M
		 * 
		 * 예를 들어 n = 12345 라고 할 때 
		 * n = 12345 = (1*10000)+(2*1000)+(3*100)+(4*10)+(5*1) 이라고 할 수 있음
		 * 
		 * n = abcde 일 때, n%mod 는 분배법칙에 따라
		 * (a10000%mod + b1000%mod + c100%mod + d10%mod + e%mod)%mod 가 됨
		 * 
		 */
		 
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		long remain = 0;

		for (int i = 0; i < n.length(); i++) {
			// 위 분배법칙 로직대로 하려면 n의 가장 왼쪽 수에 대해 a10000...00000을 해줘야 되는데 그러면 결국 큰 수(BigInteger)연산이 되버려서 느려짐 = 시간 초과
			// 따라서 이전에 구한 값(remain)에 10을 계속해서 곱해주게 되면 a10000...00000을 해주는 것과 같음
			remain *= 10;
			System.out.println("remain *= 10 = " + remain);
			// - '0' 을 해줌으로써 int형으로 얻을 수 있음
			remain += (n.charAt(i) - '0');
			System.out.println("remain += (n.charAt(i) - '0') = " + remain);
			remain %= 20000303;
			System.out.println("remain %= 20000303 = " + remain);
		}
		System.out.println(remain);
		scan.close();
	}
}
