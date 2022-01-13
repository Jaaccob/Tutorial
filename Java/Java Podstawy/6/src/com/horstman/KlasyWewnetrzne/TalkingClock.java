package com.horstman.KlasyWewnetrzne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

public class TalkingClock {
    private int interval;
    private boolean beep;

    /**
     * Tworzy obiekt Talking Clock
     *
     * @param interval: odstęp czasu pomiędzy kolejnymi komunikatami (w mikrosekundach)
     * @param beep:     wartość true oznacza, że dzwięk ma być odtwarzany
     */

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Włączanie zegara
     */

    public void start() {
        class TimePrinter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("Kiedy usłyszysz dzwięk, będzie godzina " + Instant.ofEpochMilli(event.getWhen()));
                if (TalkingClock.this.beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        var listener = new TimePrinter();
        //ActionListener listener = this.new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

        /**
         public class TimePrinter implements ActionListener {
        @Override public void actionPerformed(ActionEvent event) {
        System.out.println("Kiedy usłyszysz dzwięk, będzie godzina " + Instant.ofEpochMilli(event.getWhen()));
        if (TalkingClock.this.beep){
        Toolkit.getDefaultToolkit().beep();
        }
        //if (beep) {
        //    Toolkit.getDefaultToolkit().beep();
        //}
        }
    }*/

}
