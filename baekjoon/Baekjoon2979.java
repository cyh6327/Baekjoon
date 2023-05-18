package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2979 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int sum = 0;
		int count = 0;
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			list1.add(scan.nextInt());
			list2.add(scan.nextInt());
		}
		
		for(int j=Collections.min(list1); j<=Collections.max(list2); j++) {
			if(Collections.frequency(list1, j) >= 1) {
				count += Collections.frequency(list1, j);
			}
			if(Collections.frequency(list2, j) >= 1) {
				count -= Collections.frequency(list2, j);
			}
			
			if(count == 1) 
				sum += a;
			else if(count == 2)
				sum += b*2;
			else if(count == 3)
				sum += c*3;
		}
		
		System.out.println(sum);
		
		scan.close();
	}

}
