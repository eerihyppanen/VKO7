package main;

import java.util.ArrayList;

public class Gifu {

    private String university;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Enrollment> enrollments = new ArrayList<>();


    public Gifu(String university)  {

        this.university = university;
    }


    public void addCourse(Course course) {
        courses.add(course);

    }

    public Course getCourse(int index) {
        return courses.get(index);
    }

    public void getCourses()    {

    }

    public void listCourses()   {
        

        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i) + ") " + courses.get(i).getInformation());
        }

    }

    public void addStudent(Student student) {

        students.add(student);
    }
    
    public Student getStudent(int index) {
        return students.get(index);
    }
    
    public void listStudents()  {
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i) + ") " + students.get(i).getInformation());
        }

    }


    
    public void enrollStudent(Enrollment enrollment ) {
        enrollments.add(enrollment);



    }

    
    public ArrayList<Enrollment> getEnrollments(Course course) {
            
        for (int i = 0; i < enrollments.size(); i++) {
            Enrollment enrollment = enrollments.get(i);
        Student student = enrollment.getStudent();
        System.out.println((i) + ") " + student.getInformation());
        }
        
    }
       
    
    
        
}
