package com.greenfox;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int returnDay = scanner.nextInt();
    int returnMonth = scanner.nextInt();
    int returnYear = scanner.nextInt();
    int expectedDay = scanner.nextInt();
    int expectedMonth = scanner.nextInt();
    int expectedYear = scanner.nextInt();


    int fine;
    if (returnYear > expectedYear) {
      fine = 10000;
    } else if (returnMonth > expectedMonth && (returnYear >= expectedYear)) {
      fine = 500 * (returnMonth - expectedMonth);
    } else if (returnDay > expectedDay && (returnMonth >= expectedMonth) && (returnYear >= expectedYear)) {
      fine = 15 * (returnDay - expectedDay);
    } else {
      fine = 0;
    }
    System.out.println(fine);

    scanner.close();
  }
}


