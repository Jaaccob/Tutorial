package com.horstmann.GeneryczneListyTablicowe;

import com.horstmann.KosmicznaKlasaWszystkichKlas.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] arg){
        //Wstawienie do listy staff trzech obiektów klasy Employee
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Karol Krakowski", 75000, 1987,12,15));
        staff.add(new Employee("Henryk Kwiatek", 50000, 1989,10,1));
        staff.add(new Employee("Waldemar Kowalski",40000,1990,3,15));

        //Zwiększanie pensji wszystkich pracowników o 5%
        for (Employee e : staff){
            e.raiseSalary(5);
        }

        //Drukowanie informacji o wszystkich obiektach Employee
        for (Employee e : staff){
            System.out.println("Name= " + e.getName() + ", salary= " +e.getSalary() + ", hireDay" + e.getHireDay());
        }
    }
}
