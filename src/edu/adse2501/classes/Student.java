package edu.adse2501.classes;

import java.time.LocalDate;

/**
 *This class represents a student, extending the basic Person class with 
 * student-specific attributes such as registration number and course.
 * 
 * @author todoi
 */

public class Student extends Person
{
    //TODO: Write javadoc for the fields below
    /**
     * The student's unique university registration number.
     * <p>
     * Typically follows the institution's format, e.g., "SCT221-1234/2022".
     * This field is used to uniquely identify a student within the university system.
     */
    protected String regNo;
    
    /**
     * The name of the academic program or course the student is enrolled in.
     */
    protected String course;
    
    // Default constructor
    public Student()
    {
        super();
    }

    /**
     * Constructs a new Student with only registration number and course.
     * Other person attributes remain uninitialized (will use Person defaults).
     *
     * @param regNo  the student's registration number
     * @param course the academic program/course the student is enrolled in
     */
    public Student(String regNo, String course)
    {
        this.regNo = regNo;
        this.course = course;
    }

    //====================================
    //CONSTRUCTORS
    //=======================================
    /**
     * Constructs a fully initialized Student with all person
     * and student attributes.
     * 
     * @param regNo the student's unique registration number.
     * @param course the academic program or course enrolled in.
     * @param names the full name(s) of the student.
     * @param birthDate the date of birth of the student
     * @param gender the gender ('M', 'F', or other valid code)
     * @param nationality the nationality/citizenship of the person.
     */
    public Student(String regNo, String course, String names, LocalDate birthDate, char gender, String nationality)
    {
        super(names, birthDate, gender, nationality);
        this.regNo = regNo;
        this.course = course;
    }
    
    //========================================
    //GETTERS & SETTERS
    //========================================
    /**
     * Returns the student's registration number.
     * 
     * @return Returns the regNo.
     */
    public String getRegNo()
    {
        return regNo;
    }

    /**
     * Sets the student's registration number.
     * 
     * @param regNo set's the regNo.
     */
    public void setRegNo(String regNo)
    {
        this.regNo = regNo;
    }

    /**
     * Returns the name of the course/program the student is enrolled in.
     * 
     * @return the course name.
     */
    public String getCourse()
    {
        return course;
    }

    /**
     * Sets the academic course/program for this student.
     * @param course the course to set
     */
    public void setCourse(String course)
    {
        this.course = course;
    }

    //==========================================
    //OVERRIDDEN METHODS
    //==========================================
    /**
     * Returns the role of this person as a student.
     *
     * @return "Student"
     */
    @Override
    public String getPersonRole()
    {
        return "Student";
    }
    
     /**
     * Returns a formatted string representation of the student's details.
     * 
     * @return the student's details
     */
    @Override
    public String toString() //object
    {
        return String.format("""
                             %s
                             Rgistration No: %s
                             Course: %s
                             """,
                super.toString(),
                this.regNo,
                this.course   
        );
    }
    
    
}
