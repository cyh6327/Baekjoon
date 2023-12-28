package baekjoon;

import java.util.Scanner;

public class Baekjoon2522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int a = 1; a <= n-1; a++) {
            for (int i = n-1; i >= a; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(int a = 1; a <= n-1; a++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" ");

            }
            for (int i = n - 1; i >= a; i--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
