package com.horstman.WyrazeniaLambda;


import java.awt.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.function.IntConsumer;
import javax.swing.*;

/**
 * Program demonstrujący sposób użycia wyrażeń lambda
 *
 * @author Jacob Kozubek
 * @version 1.0 2020-12-28
 */
public class LambdaTest {

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }


    public static void main(String... args) {
        var planets = new String[]{"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sortowanie alfabetyczne: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sortowanie według długości: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        //var timer = new Timer(1000, System.out::println);

        //var timer = new Timer(1000, event ->
        //        System.out.println("Jest godzina " + new Date()));
        //timer.start();

        //utrzymuje program w działaniu, aż użytkownik kliknie przycisk OK
        //JOptionPane.showMessageDialog(null, "Zamknąć program?");
        //System.exit(0);

        var t = new Timer(1000, event -> {
             System.out.println("Kiedy usłyszysz dzwięk będzie godzina "
                   + Instant.ofEpochMilli(event.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        });


        repeat(10, i -> System.out.println("Odliczanie: " + (9 - i)));


    }
}
