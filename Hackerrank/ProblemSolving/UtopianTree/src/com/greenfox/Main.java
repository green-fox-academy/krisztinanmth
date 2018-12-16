package com.greenfox;

import java.io.*;
import java.util.*;

public class Main {

  // Complete the utopianTree function below.
  static int utopianTree(int n) {
    // @spring ...height = height * 2;
    // @summer ... height = height + 1m;
    // at first spring tree is planted and height = 1;
    // how tall will be after n growth cycles .. ?
    // 1 grow cycle is either the spring or the summer ...
    int height = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) {
        height++;
      } else {
        height *= 2;
      }
    }
    return height;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int result = utopianTree(n);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();
    }

    bufferedWriter.close();

    scanner.close();
  }
}

