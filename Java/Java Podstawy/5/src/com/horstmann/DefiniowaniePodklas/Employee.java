package com.horstmann.DefiniowaniePodklas;

import java.time.LocalDate;

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

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
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

    @Override
    public String getDescription() {
        return String.format("Pracownik zarabiający %.2f zł", salary);
    }
}

