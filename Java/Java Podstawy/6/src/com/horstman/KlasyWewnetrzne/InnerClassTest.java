package com.horstman.KlasyWewnetrzne;

import javax.swing.*;

/**
 * Ten program demonstruje sposób użycia klas wewnętrznych
 *
 * @author Jacob
 * @version 1.0
 */

public class InnerClassTest {
    public static void main(String[] arg) {
        var clock = new TalkingClock(1000, true);
        var jabberer = new TalkingClock(1000,true);
        clock.start();

        //Niech program działa, dopóki użytkownik nie wciśnie przycisku OK
        JOptionPane.showMessageDialog(null, "Zamknąć program?");
        System.exit(0);
    }
}
