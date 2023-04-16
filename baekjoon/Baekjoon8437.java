package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon8437 {
	
	public static void main(String[] args) {
		
		/*
		 * total이 10(=짝수)이라고 가정했을 때 나올 수 있는 경우의 수는
		 * 1(=n) 9(=k) = 8(=num) / 2 8 = 6 / 3 7 = 4 / 4 6 = 2 / 5 5 = 0
		 * total이 11(=홀수)이라고 가정했을 때 나올 수 있는 경우의 수는
		 * 1 10 = 9(=num) / 2 9 = 7 / 3 8 = 5 / 4 7 = 3 / 5 6 = 1
		 * 즉 total=10 num=2 라고 예시를 들면 k=6, n=4
		 * 두 사람 n과 k가 total을 나눠가져야 하니까 total/2 를 가지는 것으로 시작해서
		 * total/2에서 num/2를 더하면 k값, total/2에서 num/2을 빼면 n값
		 * total이 홀수인 경우는 위의 연산식에서 k만 +1을 해주면 맞는 값이 나옴 (홀수를 2로 나누면 나머지가 생기는데 Integer형이여서 그 나머지가 떨어져 나갔으므로)
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger total = scan.nextBigInteger();
		BigInteger num = scan.nextBigInteger();
		BigInteger k = total.divide(new BigInteger("2")).add(num.divide(new BigInteger("2")));
		BigInteger n = total.divide(new BigInteger("2")).subtract(num.divide(new BigInteger("2")));
		
		// total이 짝수일 경우
		if(total.remainder(new BigInteger("2")).equals(new BigInteger("0")))
			System.out.println(k + "\n" + n);
		else	// total이 홀수일 경우 k+1
			System.out.println(k.add(new BigInteger("1")) + "\n" + n);
		
		scan.close();
	}

}
