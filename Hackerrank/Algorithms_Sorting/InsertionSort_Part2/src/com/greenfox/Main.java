package com.greenfox;

import java.util.*;

public class Main {

  // Complete the insertionSort2 function below.
  static void insertionSort2(int n, int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i;
      int temp = arr[i];
      while (j >= 1 && arr[j - 1] > temp) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = temp;
      printArray(arr);
    }
  }

  private static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
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

    insertionSort2(n, arr);

    scanner.close();
  }
}
