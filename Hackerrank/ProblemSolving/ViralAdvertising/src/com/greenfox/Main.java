package com.greenfox;

import java.io.*;
import java.util.*;

public class Main {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        // first ad => 5 people
        // first day half like it so => 2 people
        // each shares it with 3other friend
        // second day ad reaches => 6 people
        // again floor(recipient / 2 like it) => 3 people
        // they share it ...day 3: ad => 9 people
        // ....
        // n parameter = number of days
        // likedBY = floor(people / 2)
        // shares = likedBy * 3;
        // shares / 3 = likedBy
        // likedBy = shares / 3 = floor(people /2)
        // shares / 3 = floor(people / 2)
        // shares = floor(people / 2) * 3;

        // initiate with first day values
        int peopleSharing = 2;
        int likedBy = 2;
        for (int i = 1; i < n; i++) {
            likedBy += peopleSharing * 3 / 2;
            peopleSharing = peopleSharing * 3 / 2;
        }
        return likedBy;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

