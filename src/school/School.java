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

        
        Student joe = Student.addStudent("Joe", Person.Gender.Male,180,11);
        Student jill = Student.addStudent("Jill", Person.Gender.Female,130,9);
        Student billyJoe = Student.addStudent("BillyJoe", Person.Gender.Male,162,12);
        Student alex = Student.addStudent("Alex", Person.Gender.Male,143,9);
        Student brenden = Student.addStudent("Brenden", Person.Gender.Male,175,11);
        Student lauren = Student.addStudent("Lauren", Person.Gender.Female,123,11);
        Student julie = Student.addStudent("Julie", Person.Gender.Female,119,10);
        Student james = Student.addStudent("James", Person.Gender.Male,137,10);
        Student noah = Student.addStudent("Noah", Person.Gender.Male,194,9);
        
        Student.printNames();
        Student.printNames(Person.Gender.Male);
        
        Course geom = Course.addCourse("Geometery", Course.Type.Math,4);
        Course aplit = Course.addCourse("AP Literature", Course.Type.English,1);
        Course apush = Course.addCourse("AP US History", Course.Type.History,2);
        Course avid = Course.addCourse("Avid", Course.Type.Elective,1);
        Course alg2 = Course.addCourse("Algebra 2", Course.Type.Math,3);
        Course chem = Course.addCourse("Chemistry", Course.Type.Science,4);
        
        Course.printNamesOfClasses();
        
        
        Student bill = Student.addStudent("Bill", Person.Gender.Male,168,11);
        
        Student bobby = new Student("Bobby", Person.Gender.Male,178,11);
        geom.addStudent(bobby);
        
        System.out.println(bobby.getName());
    }
}
