/* Objective
In this challenge, we're going to use loops to help us do some simple math.

Task:
Given an integer, N , print its first 10  multiples. Each multiple N*i  
(where 1<=i<=10 ) should be printed on a new line in the form: N x i = result. in java. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input integer N
        int N = scanner.nextInt();

        // Print the first 10 multiples of N
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }

        scanner.close();
    }
}
