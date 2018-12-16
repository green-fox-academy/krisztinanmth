package com.greenfox;

import java.util.*;

public class Main {

  // Complete the miniMaxSum function below.
  static void miniMaxSum(int[] arr) {
    long miniSum = 0;
    long maxiSum = 0;
    long sum = 0;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    miniSum = sum - arr[0];
    maxiSum = sum - arr[arr.length - 1];
    System.out.println(maxiSum + " " + miniSum);
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

