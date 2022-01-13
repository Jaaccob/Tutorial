package com.horstmann.KosmicznaKlasaWszystkichKlas;

import java.time.LocalDate;
import java.util.Objects;

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

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    /**
     * Zwraca nazwe pracownika
     * @return zwraca nazwe pracownika
     */
    /*public final String getName() {
        return name;
    }*/

    public String getName() {
        return name;
    }

    /**
     * Zwraca pensje pracownika
     *
     * @return zwraca pensje pracownika
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Zwraca date zatrudnienia pracownika
     *
     * @return zwraca date zatrudnienia pracownika
     */
    public LocalDate getHireDay() {
        return hireDay;
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

    public boolean equals(Object otherObject) {
        //Szybkie sprawdzenie czy obiekty są identyczne
        if (this == otherObject) return true;

        //Musi zwrócić false, jeśli parametr jawny ma wartość null !
        if (otherObject == null) return false;

        //Jeśli klasy nie pasują, nie mogą być równe
        if (getClass() != otherObject.getClass()) return false;

        //Wiadomo, że otherObject nie jest obiektem null klasy Employee
        Employee other = (Employee) otherObject;

        //Sprawdzanie, czy pola mają identyczne wartości
        return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);

        //lub
        // return Object.equals(name, other.name) && salary == other.salary && Object.equals(hireDay, other.hireDay);


    }

    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name= " + name + " ,salary= " + salary + " ,hireday= " + hireDay + "]";
    }

}



