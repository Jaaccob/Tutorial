package com.company;

public class Main {

    public static void main(String[] args) {
	    String greeting = "Witaj czytelniku!";
        System.out.println(greeting);
        for (int i=0; i<greeting.length(); i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
