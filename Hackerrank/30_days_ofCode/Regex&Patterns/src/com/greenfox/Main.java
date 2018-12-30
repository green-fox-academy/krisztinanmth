package com.greenfox;

import java.util.*;
import java.util.regex.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    String regex = "^[a-z\\.]+@gmail\\.com$";
    Pattern pattern = Pattern.compile(regex);
    List<String> listOfNames = new ArrayList();
    for (int i = 0; i < num; i++){
      String name = scanner.next();
      String email = scanner.next();
      Matcher matcher = pattern.matcher(email);
      if (matcher.find()){
        listOfNames.add(name);
      }
    }
    Collections.sort(listOfNames);
    for (String name : listOfNames){
      System.out.println(name);
    }
    scanner.close();
  }
}

