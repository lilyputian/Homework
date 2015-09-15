import java.util.*;

/*
************************************************
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/

Problem Set 1
Problem 4

This program causes something called an infinite loop. This means that the
program never ends because of a logical error.

Why doesn't this program stop running?
There are two errors.
************************************************
*/

public class Problem4 {
    public static void main(String[] args) {
        printFirstSentence();
        printSecondSentence();
    }

    public void printFirstSentence() {
        for(int i = 5; i > 0; i++) {
            System.out.println("This sentence should print 5 times.");
        }
    }

    public void printSecondSentence() {
        int i = 3;
        while(i > 0) {
            System.out.println("This sentence should print 3 times.");
            i++;
        }
    }
}