package edu.adse2501.sess06.db_intro;

import edu.adse2501.classes.Course;
import edu.adse2501.db_connection.SQLServerOpenConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 * Java program to display the various courses offered at EICN
 * 
 * @author todoi
 */
public class SQLServerCourses
{
    private static final String COURSE_QUERY = "select * from Course";
    
    public static void main(String[] args)
    {
        //create a list of available courses.
        List<Course> collegeCourses = new ArrayList<>();
        
        //use a try with resources to connect to the sql server db
        try(Connection conn = new SQLServerOpenConnection().createConnection();
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(COURSE_QUERY))
        {
            int n = 0;// integer used for display purpose
            while(rs.next())
            {
                //Add the courses from the course table to the list of available courses
                collegeCourses.add(new Course(rs.getString(1), rs.getString(2),
                        rs.getFloat(3), rs.getInt(4)));
                
                // display the details of the added course
                System.out.println("Displaying the details of course number "
                        + (n + 1));
                System.out.println(collegeCourses.toString());
                n++;
            }
            System.out.println("Number of courses found: " + n);
            for(Course c : collegeCourses) 
            {
                System.out.println(c);
            }
            
        } catch (SQLException ex) 
        {
            System.err.println("Error processing database query: " + ex.getMessage());
            ex.printStackTrace();
        }
        
    }
}
