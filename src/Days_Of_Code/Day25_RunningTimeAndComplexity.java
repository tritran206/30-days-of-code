package Days_Of_Code;

import java.util.Scanner;

public class Day25_RunningTimeAndComplexity {

    //will return true if number is prime otherwise return false
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //takes in numbers and prints whether the number is prime or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int reps = in.nextInt();
        while(reps-->0) {
            int num = in.nextInt();
            if (isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }

}
