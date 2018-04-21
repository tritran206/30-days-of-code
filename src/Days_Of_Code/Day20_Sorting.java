package Days_Of_Code;

import java.util.Scanner;

public class Day20_Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int numSwaps = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n -1; j++) {
                if(a[j] > a[j+1]) {
                    // swaps (a[j], a[j+1]);
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    numSwaps++;
                }
            }
            //catches if array is already in ascending order
            if (numSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in "+numSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
