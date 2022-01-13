package com.horstman.PrzechwytywanieWyjatkow;

import java.util.Scanner;

/**
 * Program wyświetlający stos wywołań wywołania rekursywnej metody
 *
 * @author Jacob
 * @version 1.0 2021.07.22
 */

public class StackTraceTest {
    /**
     * Oblicza silnię liczby
     *
     * @param n: nieujemna liczba całkowita
     * @return n! = 1*2*...*n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        var walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if (n <= 1) {
            r = 1;
        } else {
            r = n * factorial(n - 1);
        }
        System.out.println("return " + r);
        return r;
    }

    public static void main(String... args) {
        try (var in = new Scanner(System.in)) {
            System.out.print("Wpisz n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }
}
