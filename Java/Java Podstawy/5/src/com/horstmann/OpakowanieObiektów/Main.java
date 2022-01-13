package com.horstmann.OpakowanieObiektów;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){
        var list = new ArrayList<Integer>();

        list.add(3);
        list.add(new Integer(3));

        int nOne = list.get(0);
        int nTwo = list.get(1).intValue();


        int numberInt = 5;
        String numberString = "12";
        Integer numberInteger = 7;
        System.out.println(numberInteger.intValue());
        System.out.println(numberInteger.toString());
    }


}
