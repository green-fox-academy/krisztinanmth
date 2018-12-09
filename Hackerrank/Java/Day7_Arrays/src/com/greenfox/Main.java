package com.greenfox;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Task
        //Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[(n - 1) - i] + " ");
        }
    }
}
