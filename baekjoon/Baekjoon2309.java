package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2309 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			list.add(scan.nextInt());
			sum += list.get(i);
		}
		
		Loop1:
		for(int j=0; j<list.size(); j++) {
			for(int k=1; k<=list.size()-1; k++) {
				if(list.get(j)+list.get(k) == sum-100) {
					list.remove(list.get(j));
					list.remove(list.get(k-1));
					break Loop1;
				}
			}
		}
		
		Collections.sort(list);
		
		for(int num : list) {
			System.out.println(num);
		}
		
		scan.close();
	}

}
