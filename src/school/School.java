/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 372008086
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Person joe = Person.addPerson("Joe", Person.Gender.Male);
        Person jill = Person.addPerson("Jill", Person.Gender.Female);
        Person billyJoe = Person.addPerson("BillyJoe", Person.Gender.Male);
        Person alex = Person.addPerson("Alex", Person.Gender.Male);
        Person brenden = Person.addPerson("Brenden", Person.Gender.Male);
        Person lauren = Person.addPerson("Lauren", Person.Gender.Female);
        Person julie = Person.addPerson("Julie", Person.Gender.Female);
        Person james = Person.addPerson("James", Person.Gender.Male);
        Person noah = Person.addPerson("Noah", Person.Gender.Male);
        
        Person.printNames();
        Person.printNamesOfGender(Person.Gender.Male);
        
        System.out.println(billyJoe);
    }
}
