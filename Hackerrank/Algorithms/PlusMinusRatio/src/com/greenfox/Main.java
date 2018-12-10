package com.greenfox;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
given an array of integers,
calculate the fractions of its elements that are positive, negative, and are zeros...
print the decimal value of each fraction on a new line.
Note: This challenge introduces precision problems...the test cases are scaled to six decimal places,
though answers with absolute error of up to 10 on the minus 4 are acceptable.
*/
public class Main {

    // Complete the plusMinus function below.
    private static DecimalFormat df2 = new DecimalFormat("0.######");

    static void plusMinus(int[] arr) {
        double numberOfPos = 0;
        double numberOfNeg = 0;
        double numberOfZeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                numberOfNeg++;
            } else if (arr[i] > 0) {
                numberOfPos++;
            } else {
                numberOfZeros++;
            }
        }
        System.out.println(df2.format(numberOfPos / arr.length));
        System.out.println(df2.format(numberOfNeg / arr.length));
        System.out.println(df2.format(numberOfZeros / arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
