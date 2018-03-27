package Days_Of_Code;

import java.util.Scanner;

public class Day10_BinaryNumbers {

//    public static int[] ToBinary (int n) {

//        int binary[] = new int[100];
//        int index = 0;
//
//        while (n > 0) {
//            binary[index++] = n%2;
//            n = n/2;
//        }
//        return binary;
//    }

//    public static void PrintBinary(int[] b){
//        int size = b.length;
//
//        for (int j = size; j >= 0; j--){
//            System.out.println(b[j]);
//        }
//    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int baseTen = in.nextInt();
//        int binary[] = new int[100];
        int count = 0, consecutive = 0;

        while (baseTen > 0) {
//            binary[index++] = baseTen%2;
//            baseTen = baseTen/2;
            int remainder = baseTen%2;
            if (remainder ==1){
                consecutive++;
                baseTen = baseTen/2;
            } else {
                consecutive = 0;
                baseTen = baseTen/2;
                consecutive = Math.max(consecutive, count);
            }
        }

        System.out.println(consecutive);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
