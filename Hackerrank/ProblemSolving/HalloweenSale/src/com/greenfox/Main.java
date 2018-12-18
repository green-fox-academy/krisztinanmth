package com.greenfox;

import java.io.*;
import java.util.*;

public class Main {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // s = dollars i have
        // p = original price of the first
        // d = amount every next is cheaper with
        // m = lowest amount

        int sum = 0;
        int count = 0;
        while (sum + p <= s) {
            sum += p;
            p -= d;
            count++;
            if (p < m) {
                p = m;
            }
        }
        return count;
    }
    // 20
    // 17
    // 14
    // 11
    // 8
    // 6

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

