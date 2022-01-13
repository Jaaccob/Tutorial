package com.horstman.Interfejsy.Clone;

import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Obiekt <code>Employee</code> reprezentuje pracownika w firmie
 * Obiekt jest reprezentowany przez 3 parametry
 * <code>name</code> (Nazwa) reprezentuje imie i nazwisko pracownika
 * <code>salary</code> (Wynagrodzenie)reprezentuje zarobki pracownika
 * <code>hireDay</code> (Dzień wynajmu)reprezentuje date przyjęcia pracownika
 *
 * @author Jakub Kozubek
 * @version 1.1
 * @see <a href="https://www.google.pl" >Strona główna google</a>
 */

public class Employee implements Cloneable {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }


    public Employee clone() throws CloneNotSupportedException {
        //return (Employee) super.clone();
        //Wywołanie metody Object.clone()
        Employee cloned = (Employee) super.clone();
        //Klonowanie pól zmienialnych
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    /**
     * Ustawia datę zatrudnienia na podany dzień.
     *
     * @param year  rok zatrudnienia
     * @param month miesiąc zatrudnienia
     * @param day   dzień zatrudnienia
     */
    public void setHireDay(int year, int month, int day) {
        Date newHideDay = new GregorianCalendar(year, month - 1, day).getTime();

        //Przykład zmiany pola obiektowego
        hireDay.setTime(newHideDay.getTime());
    }


    /**
     * Podnosi pensje (salary) pracownika
     *
     * @param byPercent wartość określająca, o ile procent podnieść pensję (np. 10 = 10%)
     * @since 1.0
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100.0;
        salary += raise;
    }


    public String toString() {
        return getClass().getName() + "[name= " + name + " ,salary= " + salary + " ,hireday= " + hireDay + "]";
    }


}


