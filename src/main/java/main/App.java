package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner sc = new Scanner(System.in);

        

        boolean exit = false;
        Course course =null;
        Student student = null;
        Enrollment enrollment = null;

       



        System.out.println("Tervetuloa Gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");

        String university = sc.nextLine();

        Gifu gifu = new Gifu(university);
    

        while(!exit)    {

            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");

            if(sc.hasNext())    {
                int i = 0;
                String stringinput = sc.nextLine();
                i = Integer.parseInt(stringinput);

                switch (i) {
                    case 1:
                        System.out.println("Anna kurssin nimi:");
                        String courseName = sc.nextLine();
                        System.out.println("Anna kurssin ID:");
                        String courseId = sc.nextLine();
                        System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                        String maxNumberOfStundentsString = sc.nextLine();
                        int maxNumberOfStundents = Integer.parseInt(maxNumberOfStundentsString);
                        course = new Course(courseName, courseId, maxNumberOfStundents);
                        gifu.addCourse(course);
                    


                        break;


                    case 2:
                    System.out.println("Anna opiskelijan nimi:");
                    String name = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String id = sc.nextLine();
                    student = new Student(name, id);
                    gifu.addStudent(student);

                        break;


                    case 3:
                        gifu.listCourses();
                        break;


                    case 4:

                        gifu.listStudents();

                        break;


                        
                    case 5:

                    
                    gifu.listCourses();
                    System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                    int courseIndex = Integer.parseInt(sc.nextLine()); // vihdoin opin lyhentämään 
                                                                        //String>int yhteen riviin
                    Course selectedCourse = gifu.getCourse(courseIndex);
                    
                    gifu.listStudents();
                    System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                    int studentIndex = Integer.parseInt(sc.nextLine());
                    Student selectedStudent = gifu.getStudent(studentIndex);
                    enrollment = new Enrollment(selectedStudent, selectedCourse);
                    gifu.enrollStudent(enrollment);

                        break;

                    case 7:



                        System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:");
                        gifu.listCourses();
                        int courseIndex2 = Integer.parseInt(sc.nextLine());
                        Course selectedCourse2 = gifu.getCourse(courseIndex2);

                    
                        break;



                    case 0:

                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;

                        break;

                    default:

                        System.out.println("Väärä syöte.");

                        break;
                }
            }
        }
        sc.close();
    }
}
