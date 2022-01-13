package com.horstman.Interfejsy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String... arg){
        var staff = new Employee[3];
        staff[0] = new Employee("Hentyk Kwiatek",35000);
        staff[1] = new Employee("Karol Kowalski",75000);
        staff[2] = new Employee("Tadeusz Nowak", 38000);

        Arrays.sort(staff);

        //Drukowanie informacji o wszystkich obiektach klasy Employee
        for (Employee e : staff){
            System.out.println("name = " + e.getName() +", salary = " + e.getSalary());
        }

    }
}
