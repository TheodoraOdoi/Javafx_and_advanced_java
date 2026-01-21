package edu.adse2501.sess01_java_util_apis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Java programm to demonstrate the HasSet class and some of its methods
 * 
 * @author Window
 */
public class HashSetDemo
{
    public static void main(String[] args)
    {
        //Create a HashSet of multimedia/design student names
        Set designClass = new HashSet();
        designClass.add("Martin");
        designClass.add("Mark");
        designClass.add("Magalie");
        designClass.add("Kaka");
        designClass.add("Jojez");
        designClass.add("Purvi");
        designClass.add("Reet");
        designClass.add("David");
        designClass.add("Ella");
        designClass.add("Paige");
        designClass.add("Kris");
        designClass.add("Sean");
        designClass.add("Rockey");
        designClass.add("Erick");
        
        //create a string array of art students
        String[] artStudents = {
            "Rockey", "Julius","Paul", "Meiqi", "Kamau", "Levi", "Sean", 
            "Erick", "Joe", "Alejandro"
        };
        
        //create a set from the art class string array
        Set artClass = new HashSet<>(Arrays.asList(artStudents));
        
        //create a set of all students in the campus
        Set allCampusStudents = new HashSet(designClass);
        //Add the students from the art class
        allCampusStudents.addAll(artClass);
        
        //Display all the students in the design class
        displayDesignStudents(designClass);
        
        //Display all the students in the art class
        displayArtStudents(artClass);
        
        //Display all the students in the campus
        displayAlltudents(allCampusStudents);
    }
    
    private static void displayDesignStudents(Set designClass)
    {
        //Display the design class details using a for...each loop.
        //NB. Works in java 7 & prior and current versions
        System.out.printf("""
                           The design class has %d students and their names are: 
                           """, designClass.size() );
        for(Object obj: designClass)
        {
            System.out.println(obj);
        }
    }

    private static void displayArtStudents(Set artClass)
    {
        //Display the details of the art students using functional programming.
        //NB: works in java 8 and later versions.
        System.out.printf("""
                          The art class has %d students and their names are: 
                          """, artClass.size());
        
        artClass.forEach((artStudent) ->
        {
            System.out.println(artStudent);
        });
    }

    private static void displayAlltudents(Set allCampusStudents)
    {
        //TODO: Assignment -> write the 'displayAllStudents(allCampusStudents);
        //that accepts a set of all student names in the campus and display 
        //them using an iterator.
        System.out.printf("""
                          The entire campus has %d students and their names are: 
                          """, allCampusStudents.size());
        
        Iterator<String> iterator = allCampusStudents.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }
        System.out.println();
    }
}
