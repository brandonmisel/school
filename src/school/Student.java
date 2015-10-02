package school;
public class Student extends Person{
    private int gradeLevel;
//    private Course theCourse;
    private Course courses[] = new Course[Course.numPeriods];
    private double gradeScore[] = new double[Course.numPeriods];
    
    public static Student addStudent(String _name,
    Gender _gender, int _weight,int _gradeLevel)
    {
        Student temp = new Student(_name,_gender,_weight,
        _gradeLevel);
        addPerson(temp);
        return(temp);
    }    
    Student (String _name,Gender _gender,int _weight,
    int _gradeLevel)
    {
        super(_name,_gender,_weight);
        gradeLevel = _gradeLevel;
    }
    
    public boolean addCourse(Course _course, double _gradeScore)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course,_gradeScore);
        return(true);
    }  
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);
        if (courses[_course.getPeriod()-1] != null)
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course,double _gradeScore)
    {
        courses[_course.getPeriod()-1]=_course;
        gradeScore[_course.getPeriod()-1]=_gradeScore;
    }
    
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return(gradeLevel);
    }    
    public double getGPA()
    {
       double total = 0;
       int numCourses = 0;
       for (int index = 0;index < Course.numPeriods;index++)
       {
           if(courses[index] != null)
           {
               total += gradeScore[index];
               numCourses++;
           }    
       }
       if(numCourses == 0)
              return(0.0);
       return(total/numCourses);         
    }
    public static void printNames()
    {
        System.out.println(
        "===printNamesOf=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
             
    }
    public static Student getHighestGPA()
    {
        Student highGPAStudent = null;
        for (Person temp : people)
        {
            if (temp instanceof Student)
            {
                if(highGPAStudent == null || ((Student)temp).getGPA() > highGPAStudent.getGPA())
                { 
                    highGPAStudent = (Student)temp;
                }
            }
        }
        return(highGPAStudent);
    }
    
    
    public static void printStudentsGPAGreaterThan(double _gpa)
    {
        System.out.println("===printStudentsGPAGreaterThan=== gpa > " + _gpa);
        for (Person temp : people)
        {
            if (temp instanceof Student)
            {
                if(((Student)temp).getGPA() > _gpa)
                    System.out.println(temp.getName());
            }
        }
    }
    public void printTeachersNames()
    {
        System.out.println(getName() + " is a student of");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if(temp.getTeacher() != null)
                System.out.println(temp.getTeacher().getName());
            }
        }
    }
    
}
