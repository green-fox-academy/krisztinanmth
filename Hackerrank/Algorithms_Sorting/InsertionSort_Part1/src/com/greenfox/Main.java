package com.greenfox;

import java.util.*;

public class Main {

  // Complete the insertionSort1 function below.
  static void insertionSort1(int n, int[] arr) {
    int temp = arr[n - 1];
    int i;
    for (i = arr.length - 2; (i >= 0) && (arr[i] > temp); i--) {
      arr[i + 1] = arr[i];
      printArray(arr);
    }
    arr[i + 1] = temp;
    printArray(arr);
  }

  private static void printArray(int[] ar) {
    for(int number: ar){
      System.out.print(number + " ");
    }
    System.out.println("");
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

    insertionSort1(n, arr);

    scanner.close();
  }
}

