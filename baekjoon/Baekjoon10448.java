package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10448 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for(int i=1; sum<1000; i++) {
			sum += i;
			list.add(sum);
		}
		
		list.remove(list.size()-1);
		
		for(int j=0; j<t; j++) {
			int answer = 0;
			int n = scan.nextInt();
			for(int a=0; a<list.size(); a++) {
				for(int b=0; b<list.size(); b++) {
					for(int c=0; c<list.size(); c++) {
						int sum2 = list.get(a)+list.get(b)+list.get(c);
						if(sum2 == n) {
							answer = 1;
						}
					}
				}
			}
			System.out.println(answer);
		}

	
		scan.close();

		
		
	}

}
