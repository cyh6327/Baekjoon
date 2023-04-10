package baekjoon;

import java.util.Scanner;

public class Baekjoon26575 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		double d,f,p,total = 0;
		
		for(int i=0; i<t; i++) {
			d = scan.nextDouble();
			f = scan.nextDouble();
			p = scan.nextDouble();
			// 반올림을 하면서 정수 타입이 리턴되기 때문에 자릿수를 맞춰줄 때 100이 아닌 100.0으로 나눠줘야 함
			total = Math.round(((d*f)*p)*100)/100.0;
			System.out.printf("$"+"%.2f\n",total);
		}

		scan.close();
	}

}
