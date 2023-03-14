package baekjoon;

/*1. a~z까지 반복문 (65~90) 
반복문 돌 때마다 count++
count가 3이 되면 다시 count를 0으로 초기화하면서 j++(j의 초기값은 3)
2. 입력받은 문자열이 a~z중 일치하면 해당 수=i와 j를 반환 (ex. b면 66, j=1	h면 72,j=4)
3. j리턴*/

import java.util.Scanner;

public class Baekjoon5622 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int count = 3;
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			count = 3;
			for(int j=65; j<=90; j++) {
				if(j!= 65 && j < 83) {
					if((j-2)%3 == 0) {
						count += 1;
					}
				} else if(j >= 83) {
					if(j%3 == 0 && j!=83 && j!=90) {
						count += 1;
					}
				}
				if(str.charAt(i) == (char)j) {
					break;
				}
			}
			sum += count;
		}
		System.out.println(sum);
		
		scan.close();
	}

}
