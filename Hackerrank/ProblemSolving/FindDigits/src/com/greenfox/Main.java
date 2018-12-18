package com.greenfox;

import java.io.*;
import java.util.*;

public class Main {
    // 102 => digits 1, 0, 2
    // 1 and 2 are divisors, 0 is not as that is arithmetic exception
    // so the function needs to return 2 in this case
    // and also deal with the zero as a digit

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int count = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            int number = Character.getNumericValue(c);
            if (number !=0 && n % number == 0) {
                count ++;
            }
        }
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
