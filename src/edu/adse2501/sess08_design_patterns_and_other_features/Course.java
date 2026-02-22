package edu.adse2501.sess08_design_patterns_and_other_features;

/**
 * Java class that will be used to represent a course object
 * 
 * @author user
 */
public class Course
{
    private String title;
    private int score;
    private long courseCode;

    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * @return the score
     */
    public int getScore()
    {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score)
    {
        this.score = score;
    }

    /**
     * @return the courseCode
     */
    public long getCourseCode()
    {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(long courseCode)
    {
        this.courseCode = courseCode;
    }
    
}
