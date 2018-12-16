package com.greenfox;

import java.util.*;

class Difference {
  private int[] elements;
  public int maximumDifference;

  // Add your code here

  public Difference(int[] arr) {
    this.elements = arr;
  }

  public int computeDifference() {
    Arrays.sort(elements);
    maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    return maximumDifference;
  }

} // End of Difference class

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    Difference difference = new Difference(a);

    difference.computeDifference();

    System.out.print(difference.maximumDifference);
  }
}
