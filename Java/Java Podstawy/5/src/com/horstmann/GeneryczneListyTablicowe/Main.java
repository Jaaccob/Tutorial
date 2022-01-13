package com.horstmann.GeneryczneListyTablicowe;

import com.horstmann.KosmicznaKlasaWszystkichKlas.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){
        //ArrayList<Employee> staff = new ArrayList<>();
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Henryk Kwiatkowski",50000,1989,12,15));
        staff.add(new Employee("Waldemar Kowalski", 50000,1998,10,11));
        System.out.println(staff.get(0).toString());
        staff.set(0,new Employee("Henryk Kwiatek",5000,1980,12,30));
        System.out.println(staff.get(0).toString());
        System.out.println(staff.size());


    }
}
