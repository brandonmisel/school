package school;
public class School {
    public static void main(String[] args) {
        Student joe =  Student.addStudent("Joe",Person.Gender.Male,120,10);
        Student jill =  Student.addStudent("Jill",Person.Gender.Female,105,9);
        Student billyJoe =  Student.addStudent("BillyJoe",Person.Gender.Male,210,12);
        Student bobby =  Student.addStudent("Bobby",Person.Gender.Male,168,11);        
        Student ann =  Student.addStudent("Annie",Person.Gender.Female,98,9);        
        Student sean =  Student.addStudent("Sean",Person.Gender.Male,138,11);        
                
        Teacher price = Teacher.addTeacher("Price", Person.Gender.Male, 206,4.7);
        Teacher hudson = Teacher.addTeacher("Hudson", Person.Gender.Female, 106,7.2);
        Teacher anderson = Teacher.addTeacher("Anderson", Person.Gender.Female, 112,3.2);
        Teacher smith = Teacher.addTeacher("Smith", Person.Gender.Male, 152,8.2);
        Teacher jones = Teacher.addTeacher("Jones", Person.Gender.Male, 102,1.2);
        Teacher johnson = Teacher.addTeacher("Johnson", Person.Gender.Female, 102,1.2);
        
        Course geom =  Course.addCourse("Geometry", Course.Type.Math, 1);
        Course photo =  Course.addCourse("Photography", Course.Type.Elective, 3);       
        Course biology =  Course.addCourse("Biology", Course.Type.Science, 2);       
        Course worldHistory =  Course.addCourse("WorldHistory", Course.Type.History, 2);       
        Course apush =  Course.addCourse("AP US History", Course.Type.History, 4);
        Course physics =  Course.addCourse("AP Physics", Course.Type.Science, 1);
        Course alg2 =  Course.addCourse("Algebra 2", Course.Type.Math, 3);
        Course avid =  Course.addCourse("AVID", Course.Type.Elective, 2);
        
        geom.addStudent(bobby,3.0);
        photo.addStudent(jill,2.45);
        biology.addStudent(ann,3.4);
        worldHistory.addStudent(sean,4.1);
        apush.addStudent(joe,3.95);
        physics.addStudent(billyJoe,4.2);
        alg2.addStudent(bobby,2.5);
        
        geom.addTeacher(price);
        photo.addTeacher(anderson);
        biology.addTeacher(smith);
        worldHistory.addTeacher(hudson);
        apush.addTeacher(jones);
        physics.addTeacher(johnson);
        alg2.addTeacher(price);
        avid.addTeacher(hudson);
        
        
        Course.printNames();
        Person.printNames();
        Student.printNames();
        Teacher.printNames();
        
        hudson.printStudentsNames();
        bobby.printTeachersNames();
        
        Student.printStudentsGPAGreaterThan(3.5);
        
        Student studentHighGPA = Student.getHighestGPA();
        
        System.out.println("highest gpa = " + studentHighGPA.getName());
        
        Teacher teacherMostElective = Teacher.mostElectivesCourses();
        System.out.println("teacher most electives = " + teacherMostElective.getName());
        
        anderson.printStudentsNamesInGrade11();
      
        //bobby.printTeachersNamesMeanerThan(7.2);
        // getHighestGPA
        // mostElectiveCourses
        
        
        
        
    }
}
