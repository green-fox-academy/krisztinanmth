package com.greenfox;

import java.io.*;
import java.util.*;

public class Main {

  // Complete the libraryFine function below.
  static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    int fine = 0;
    if (y2 == y1 && m2 == m1 && d2 < d1) {
      int diff = d1 - d2;
      fine = diff * 15;
    } else if (y2 == y1 && m2 < m1) {
      int diff = m1 - m2;
      fine = diff * 500;
    } else if (y2 < y1) {
      fine = 10000;
    }
    return fine;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] d1M1Y1 = scanner.nextLine().split(" ");

    int d1 = Integer.parseInt(d1M1Y1[0]);

    int m1 = Integer.parseInt(d1M1Y1[1]);

    int y1 = Integer.parseInt(d1M1Y1[2]);

    String[] d2M2Y2 = scanner.nextLine().split(" ");

    int d2 = Integer.parseInt(d2M2Y2[0]);

    int m2 = Integer.parseInt(d2M2Y2[1]);

    int y2 = Integer.parseInt(d2M2Y2[2]);

    int result = libraryFine(d1, m1, y1, d2, m2, y2);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}

