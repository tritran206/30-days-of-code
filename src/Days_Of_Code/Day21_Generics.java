package Days_Of_Code;

import java.util.Scanner;

public class Day21_Generics <T> {

    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    A generic array
     **/

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Generics {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Day21_Generics<Integer> intDay21_Generics = new Day21_Generics<Integer>();
        Day21_Generics<String> stringDay21_Generics = new Day21_Generics<String>();
        intDay21_Generics.printArray( intArray  );
        stringDay21_Generics.printArray( stringArray );
        if(Day21_Generics.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}