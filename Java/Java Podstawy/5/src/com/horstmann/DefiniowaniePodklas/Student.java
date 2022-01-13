package com.horstmann.DefiniowaniePodklas;

/**
 * Obiekt <code>Student</code> reprezentujący osobe studiującą
 * Obiekt jest reprezentowany przez 1 parametr
 * <code>major</code> opisujący w czym student sie specjalizuje
 *
 * @author Jakub Kozubek
 * @version 1.0
 */

public class Student extends Person {
    private String major;

    /**
     * @param name Imie i nazwisko studenta przekazane do konstruktora klasy <code>Person</code>
     * @see com.horstmann.DefiniowaniePodklas.Person#Person(String) 
     * @param major Specjalizacja studenta
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    /**
     * @return Zwraca opis studenta
     */
    @Override
    public String getDescription() {
        return "Student specjalizacji " + major;
    }
}
