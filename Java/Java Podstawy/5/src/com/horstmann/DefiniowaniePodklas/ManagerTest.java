package com.horstmann.DefiniowaniePodklas;

/**
 * Ten program demonstrune dziedziczenie
 * @author Jakub Kozubek
 * @version 1.0
 */


public class ManagerTest {
    public static void main(String[] arg){
        //Tworzenie obiektu Manager
        var boss = new Manager("Karol Parol", 80000,1987,12,15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        //Wstawianie obiektów klasy Manager i Employee do tablicy staff

        staff[0] = boss;
        staff[1] = new Employee("Henryk Kwiatek", 50000, 1989, 10,1);
        staff[2] = new Employee("Arture Kwiatkowski", 40000, 1990, 3,15);

        //Wyświetlanie informacji o wszystkich obiektach klasy Employee

        for (Employee e: staff){
            System.out.println("name= "+e.getName()+", salary= " +e.getSalary());
        }
    }
}
