package com.horstmann.DefiniowaniePodklas;

import java.time.LocalDate;

/**
 * 00Obiekt <code>Manager</code> reprezentuje menadżera w firmie
 * Obiekt jest podklasą klasy <code>Employee</code> @see com.horstmann.DefiniowaniePodklas.Employee
 * Obiekt zyskał nowy parametr
 * <code>bonus</code> reprezentuje bonus dla pensji pracownika
 *
 *  @author Jakub Kozubek
 *  @version 1.0
 *  @see <a href="https://www.google.pl" >Strona główna google</a>
 */

public class Manager extends Employee {
    private double bonus;

    /**
     * @param name Imie i nazwisko pracownika
     * @param salary Pensja
     * @param year Rok przyjęcia do pracy
     * @param month Miesiąc przyjęcia do pracy
     * @param day Dzień przyjęcia do pracy
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    /**
     * Dodatkowy bonus do pensji menadżera
     *
     * @param bonus dodoatkowa pensja dla pracownika
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
