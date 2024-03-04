package main;

public class Course implements PrintInfo {

    private int maxNumberOfStundents;

    private String courseName;

    private String courseId;
    

    public Course(String courseName, String courseId, int maxNumberOfStundents) {

        this.maxNumberOfStundents = maxNumberOfStundents;

        this.courseName = courseName;

        this.courseId = courseId;
    }

    public String getInformation() {
        return courseId + " " + courseName;
    }
}
