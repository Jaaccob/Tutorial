package com.horstman.Interfejsy;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class TimerTest {
    public static void main(String... arg){
        var listener = new TimePrinter();

        //utworzenie zegara wywołującego obiekt nasłuchujący co sekunde
        var time = new Timer(1000, listener);
        time.start();

        //Program ma działać dopóki użytkownik nie naciśnie przycisku OK
        JOptionPane.showMessageDialog(null, "Zamknąć program?");
        System.exit(0);

    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("Kiedy usłyszysz dźwięk, będzie godzina " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
