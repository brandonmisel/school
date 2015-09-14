/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 372008086
 */
import java.util.ArrayList;
public class Person {
    enum Gender{
        Male,Female
    }
    
    
//    public static int numPeople = 10;
    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    
    public static Person addPerson(String _name,Gender _gender, int _weight)
    {
        Person temp = new Person(_name,_gender,_weight);
        people.add(temp);
        return(temp);
    }
    
    
    Person()
    {
        name = "None";
        gender = Gender.Female;
    }
    Person(String _name,Gender _gender, int _weight)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
    }
    public void setName(String _name)
        {
            name = _name;
        }
    public Gender getGender()
        {
            return(gender);
        } 
    public void setGender(Gender _gender)
        {
            gender = _gender;
        }
     public String getName()
        {
            return(name);
        } 
     public void setWeight(int _weight)
        {
            weight = _weight;
        }
     public int getWeight()
        {
            return(weight);
        } 
     public static void printNames()
     {
         System.out.println("===printNames");
         
         for(Person temp : people)
         {
             System.out.println(temp.getName());
         }
     }
     public static void printNamesOfGender(Gender _gender)
     {
         System.out.println("===printNamesOfGender===:"  +  _gender);
         for(Person temp : people)
         {
             if(temp.gender == _gender)
             System.out.println(temp.getName());
         }
     }
     
    }
//    public String toString()
//    {
//        return(name + " " + gender + " " + weight)
//    }


