package com.horstmann.DefiniowaniePodklas;

public class PersonTest {
    public static void main(String[] arg){
        var people = new Person[2];

        //Wstawiamy do tablicy <code>people</code> obiektów Student i Employee

        people[0] = new Employee("Henryk Kwiatek",50000,1989,10,1);
        people[1] = new Student("Maria Mrozowska","informatyka");

        //Drukowanie imion i nazwisk oraz opisów wszystkich obiektów klasy<code>Person</code>
        for (Person p : people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
