package baekjoon;

import java.util.Scanner;

public class Baekjoon10810 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i, j, k;
		int[] arr = new int[n];
		
		for(int a=0; a<m; a++) {
			i = scan.nextInt();
			j = scan.nextInt();
			k = scan.nextInt();
			
			while(true) {
				arr[i-1] = k;
				i++;
				if(i-1==j)
					break;
			}
		}
		
		scan.close();
		
		for(int b : arr) {
			System.out.print(b + " ");
		}
		
	}

}
