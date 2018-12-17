package com.greenfox;

import java.math.*;
import java.util.*;

public class Main {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger bigInteger = BigInteger.valueOf(n);

        for (int i = (n - 1); i > 0; i--) {
            bigInteger = bigInteger.multiply((BigInteger.valueOf(i)));
        }

        System.out.print(bigInteger);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}

