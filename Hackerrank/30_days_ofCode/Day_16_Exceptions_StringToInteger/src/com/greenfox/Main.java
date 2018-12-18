package com.greenfox;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            Integer num = Integer.parseInt(S);
            System.out.print(num);
        } catch (Exception e) {
            System.out.print("Bad String");
        }
    }
}

