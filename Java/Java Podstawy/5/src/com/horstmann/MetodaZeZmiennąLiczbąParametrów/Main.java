package com.horstmann.MetodaZeZmiennąLiczbąParametrów;

public class Main {
    public static void main(String[] arg){
        double m = max(3.1,40.4,-5);
        System.out.println(m);
    }
    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values){
            if (v>largest){
                largest=v;
            }
        }
        return largest;
    }
}
