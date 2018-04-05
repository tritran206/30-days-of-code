package Days_Of_Code;

import java.io.*;
import java.util.*;

public class Day18_QueuesAndStacks {
    Stack<Character> stacky = new Stack<>();
    Queue<Character> queuey = new LinkedList<>();

    void pushCharacter(Character ch) {
        stacky.push(ch);
    }

    void enqueueCharacter(Character ch) {
        queuey.add(ch);
    }

    char popCharacter() {
        return stacky.pop();
    }

    char dequeueCharacter() {
        return queuey.remove();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to a n array of characters;
        char[] s = input.toCharArray();

        // Create Solution object
        Day18_QueuesAndStacks p = new Day18_QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures;
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

    }

}
