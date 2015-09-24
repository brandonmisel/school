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
import java.util.Calendar;
public class Person {
    enum Gender{
        Male,Female
    }
    
    
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    protected static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    private int birthMonth;
    private int birthYear;
    
    
    
    public static Person addPerson(String _name,Gender _gender, int _weight)
    {
        Person temp = new Person(_name,_gender,_weight);
        people.add(temp);
        return(temp);
    }
    public static void addPerson(Person _person)
    {
       people.add(_person);
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
    public void setBirthDate(int _day,int _month,int _year)
    {
        birthMonth = _month;
        birthYear = _year;
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        return(0);
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
     public static void printNames(Gender _gender)
     {
         System.out.println("===printNamesOfGender===:"  +  _gender);
         for(Person temp : people)
         {
             if(temp.gender == _gender)
             System.out.println(temp.getName());
         }
     }
     public static void printAge(int _birthMonth, int _birthYear)
     {
         System.out.println("===printAge===:"  + _birthMonth + _birthYear);
         for(Person temp : people)
         {
             if(temp.getAge() == _birthMonth)
             System.out.println(temp.getAge());
         }
     }
      
     public String toString()
     {
        return(name + " " + gender + " " + weight);
     }

}

