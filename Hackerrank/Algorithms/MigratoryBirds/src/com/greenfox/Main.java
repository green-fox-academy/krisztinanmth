package com.greenfox;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main {

    /*
    TreeMap class implements Map interface similar to HashMap class. The main
    difference between them is that HashMap is an unordered collection while TreeMap
    is sorted in the ascending order of its keys. TreeMap is unsynchronized collection
    class which means it is not suitable for thread-safe operations until unless synchronized explicitly.
    */

  // Complete the migratoryBirds function below.
  static int migratoryBirds(List<Integer> arr) {
    Map<Integer, Integer> birds = new TreeMap<>();
    for (int element : arr) {
      if (!birds.containsKey(element)) {
        birds.put(element, 1);
      } else {
        // Integer frequencyOfBirds = birds.get(element);
        // birds.put(element, frequencyOfBirds + 1);
        birds.put(element, birds.get(element) + 1);
      }
    }
    return Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    int result = migratoryBirds(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
