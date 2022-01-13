package com.horstman.KlasyWewnetrzne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

public class AnonymousInnerClassTest {
    public static void main(String[] arg) {
        var clock = new TalkingClock1();
        clock.start(1000,true);

        //Niech program działa, dopóki użytkonik nie wciśnie przycisku OK
        JOptionPane.showMessageDialog(null,"Zamknąć program?");
        System.exit(0);
    }
}

/**
 * Zegar drukujący informacje o czsaie w równych odstępach czasu
 */
class TalkingClock1{
    /**
     * Uruchamia zegar
     * @param interval odstęp czasu pomiędzy kolejnymi komunikatami (w milisekundach)
     * @param beep wartość true oznacza, że dzwięk ma być odtwarzany
     */
    public void start(int interval, boolean beep) {
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kiedy usłyszysz dźwięk, będzie godzina " + Instant.ofEpochMilli(e.getWhen()));
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        var time = new Timer(interval, listener);
        time.start();
    }
}
