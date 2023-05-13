package baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Baekjoon2231 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = IntStream.rangeClosed(1, n).toArray();
		int answer = 0;
		
		String num = "";
		int key = 0;
		
		for(int i=0; i<arr.length; i++) {
			num = arr[i] + "";
			key = Integer.parseInt(num);
			for(int j=0; j<num.length(); j++) {
				key += Integer.parseInt(num.charAt(j)+"");
			}
			if(key == n) {
				answer = Integer.parseInt(num);
				break;
			}
		}
		
		System.out.println(answer);
		
		scan.close();
	}

}
