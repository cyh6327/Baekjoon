package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10811 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i,j;
		List<Integer> arr = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		
		for(int a=0; a<n; a++) {
			arr.add(a+1);
		}
		
		for(int b=0; b<m; b++) {
			i = scan.nextInt();
			j = scan.nextInt();
			for(int c=0; i<=j; c++) {
				arr2.add(arr.get(i-1));
				i++;
			}
			for(int d=0; d<arr2.size(); d++) {
				arr.set(i-2, arr2.get(d));
				i--;
			}
			arr2.clear();
		}
		
		for(Integer e : arr) {
			System.out.print(e + " ");
		}
		
		scan.close();
	}
}
