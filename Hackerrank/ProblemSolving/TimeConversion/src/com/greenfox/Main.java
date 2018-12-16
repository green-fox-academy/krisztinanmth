package com.greenfox;

import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

  /*
   * Complete the timeConversion function below.
   */
  static String timeConversion(String s) {

    DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssa");
    Date result = new Date();
    try {
      result =  dateFormat.parse(s);
    } catch (Exception e) { }
    DateFormat dateFormatMilitary =  new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    return (String) dateFormatMilitary.format(result);
  }

  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String s = scan.nextLine();

    String result = timeConversion(s);

    bw.write(result);
    bw.newLine();

    bw.close();
  }
}


