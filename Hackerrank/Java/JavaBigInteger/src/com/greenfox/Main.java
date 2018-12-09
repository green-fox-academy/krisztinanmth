package com.greenfox;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // enter your code here. Read input from STDIN. Print output to STDOUT....
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());

        BigInteger sum = BigInteger.valueOf(0);
        BigInteger multiplied;

        sum = sum.add(a).add(b);
        multiplied = a.multiply(b);

        System.out.println(sum);
        System.out.println(multiplied);
    }
}
