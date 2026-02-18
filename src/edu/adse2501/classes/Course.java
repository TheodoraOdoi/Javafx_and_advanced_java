package edu.adse2501.classes;

/**
 * Class to represent a course offered at EICN
 * 
 * <P>
 * A course contains basic info such as
 *  <ul>
 *   <li> Course Code</li>
 *   <li> Course Name</li>
 *   <li> Course Fee (in Kes.)</li>
 *   <li> Course Duration (in months)</li>
 *  </ul>
 * </p>
 * @author todoi
 */
public class Course
{
    /**
     * A string uniquely identifying each course.
     */
    private String courseCode;
    /**
     * A string describing the name/title of the course.
     */
    private String courseName;
    /**
     * A float representing the course fee in Kenya Shillings.
     */
    private float fee;
    /**
     * An integer measuring the duration of the course in months.
     */
    private int duration;

    //====================================
    // CONSTRUCTOR
    //====================================
    /**
     * Default constructor that creates an empty course object.
     * All fields remain uninitialized(null/default primitive values).
     */
    public Course()
    {
    }

    //=====================================
    // ENCAPSULATED FIELDS
    //=====================================
    /**
     * Creates a new course with the specified details.
     * 
     * @param courseCode The unique identifier/code for the course(eg. 'ACCP')
     * @param courseName the full name/title of the course
     * @param courseFee
     * @param courseDuration The length of the course in months
     * @return the courseCode
     */
    public Course(String courseCode, String courseName, float fee, int duration)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.fee = fee;
        this.duration = duration;
    }
    
    /**
     * Retrieves the name of the course
     * @return 
     */
    public String getCourseCode()
    {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    /**
     * @return the courseName
     */
    public String getCourseName()
    {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    /**
     * @return the fee
     */
    public float getFee()
    {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(float fee)
    {
        this.fee = fee;
    }

    /**
     * @return the duration
     */
    public int getDuration()
    {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    //=========================================
    //OVERRIDDEN METHODS
    //=========================================
    /**
     * Returns a formatted string representation of the course.
     * <p>The output includes a line separator and
     *  <ul>
     *   <li>Course Code</li>
     *   <li>Course Name</li>
     *   <li>Course Fee(formatted to 2 decimal places</li>
     *   <li>Course Duration</li>
     *  </ul>
     * </p>
     * 
     * @return  a formatted multi-line string containing the course details
     */
    @Override
    public String toString()
    {
        return String.format("""
                             ---------------------------------------------------
                             Course Code: %s
                             Course Name: %s
                             Course Fee: Kes. %.2f
                             Course Duration: %d months
                             ---------------------------------------------------
                             """
                , getCourseCode(), getCourseName(), getFee(), getDuration());
    }
    
    
    
}
