package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1546 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Integer> arr = new ArrayList<>();
		List<Double> arr2 = new ArrayList<>();
		double sum=0;
		
		for(int i=0; i<n; i++) {
			arr.add(scan.nextInt());
		}
		
		int m = Collections.max(arr);
		
		for(int j=0; j<arr.size(); j++) {
			arr2.add(((double)arr.get(j)/m*100));
			sum += arr2.get(j);
		}
		
		System.out.println(sum/n);
		scan.close();
	}

}
