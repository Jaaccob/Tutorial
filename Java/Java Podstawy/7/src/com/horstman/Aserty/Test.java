package com.horstman.Aserty;

import java.util.Scanner;

public class Test {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        assert x >= 0 : "Niepoprawne dane";
        System.out.println(x);
    
    }
}
