package edu.adse2501.sess08_design_patterns_and_other_features;

/**
 *Java program to demonstrate composition using a 'has-a' relationship.
 * 
 * @author user
 */
public class Student
{
    
    private String name;
    Course course;
    
    public Student(String name)
    {
        this.name = name;
        this.course = new Course();
        this.course.setScore(88);
        this.course.setTitle("Python Programming");
    }
    
    public static void main(String[] args)
    {
        // instantiate a student object and display its details
        Student s1 = new Student("John Kamau Odoi");
        System.out.println("Student Details;\nName: " + s1.name + "\nCourse "
                + "Title: " + s1.course.getTitle() + "\nScore: " + s1.course.getScore());
    }
}
