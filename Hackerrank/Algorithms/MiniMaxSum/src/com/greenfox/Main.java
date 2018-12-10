package com.greenfox;

import java.util.Scanner;

public class Main {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long mini = Long.MAX_VALUE, maxi = 0, sum = 0;
        for (int i = 0; i < 5; i++) {
            long temp = arr[i];
            if (temp < mini) {
                mini = temp;
            }
            if (temp > maxi) {
                maxi = temp;
            }
            sum += temp;
        }
        long miniSum = sum - maxi;
        long maxiSum = sum - mini;
        System.out.print(miniSum + " " + maxiSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

