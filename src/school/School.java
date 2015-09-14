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

        
        Person joe = Person.addPerson("Joe", Person.Gender.Male,180);
        Person jill = Person.addPerson("Jill", Person.Gender.Female,130);
        Person billyJoe = Person.addPerson("BillyJoe", Person.Gender.Male,162);
        Person alex = Person.addPerson("Alex", Person.Gender.Male,143);
        Person brenden = Person.addPerson("Brenden", Person.Gender.Male,175);
        Person lauren = Person.addPerson("Lauren", Person.Gender.Female,123);
        Person julie = Person.addPerson("Julie", Person.Gender.Female,119);
        Person james = Person.addPerson("James", Person.Gender.Male,137);
        Person noah = Person.addPerson("Noah", Person.Gender.Male,194);
        
        Person.printNames();
        Person.printNames(Person.Gender.Male);
        
        System.out.println(billyJoe);
    }
}
