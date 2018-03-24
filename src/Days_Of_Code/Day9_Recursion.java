package Days_Of_Code;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9_Recursion {

    static int factorial(int n){
        if(n<=1) { // base case
            return 1;
        } else{ //recursive case
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

}
