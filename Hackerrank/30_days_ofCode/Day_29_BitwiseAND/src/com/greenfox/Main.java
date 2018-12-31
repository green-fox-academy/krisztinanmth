package com.greenfox;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfCases = scanner.nextInt();
    for (int i = 0; i < numberOfCases; i++) {
      int N = scanner.nextInt();
      int K = scanner.nextInt();

      System.out.println(solve(N, K));
    }

    scanner.close();
  }

  static int solve(int N, int K) {
    int result = 0;
    for (int A = 1; A <= N; A++) {
      for (int B = A + 1; B <= N; B++) {
        int current = A & B;
        if (current > result && current < K) {
          result = current;
        }
      }
    }
    return result;
  }
}
