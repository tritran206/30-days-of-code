package Days_Of_Code;

import java.io.*;
import java.util.*;

public class Day6_Review {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numWords = in.nextInt();

        for (int i = 0; i < numWords; i++){
            String word = in.next();
            String w1 = "";
            String w2 = "";

            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    w1 = w1 + word.charAt(j);
                } else {
                    w2 = w2 + word.charAt(j);
                }
            }
            System.out.println(w1 + " " + w2);
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
