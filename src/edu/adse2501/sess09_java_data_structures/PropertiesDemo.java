package edu.adse2501.sess09_java_data_structures;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Java program to demonstrate the use of Properties class in Java. The 
 * properties class is used to maintain a set of key-value paris, where both the 
 * key and value are strings. The program demonstrates
 *  1. Checking if the properties file exists
 *  2. If the properties file doesn't exist, creating it with default  properties
 *  3. Loading properties from the file
 *  4. Accessing the individual property values
 *  5. Modifying property values
 *  6. Saving modified properties to the file
 * 
 * @author user
*/
public class PropertiesDemo
{
    // set the name of the properties file
    private static final String PROPERTY_FILE = "config.properties";
    
    // main method
    public static void main(String[] args)
    {
        
    }
    
    /**
     * Sets some default properties if the properties file doesn't exist. These
     * properties will be written to the file if no properties are found.
     * 
     * @param properties the Properties object to set default values.
     */
    private static void setDefaultProperties(Properties properties)
    {
        properties.setProperty("username", "admin");
        properties.setProperty("password", "passw0rD12#");
        properties.setProperty("timeout", "60");
        
        // Save the default properties to the file 
        saveProperties(properties);
    }
    
    /**
     * Saves the properties back to the file. When the file exists, it will
     * overwrite the existing files.
     * 
     * @param properties 
     */
    private static void saveProperties(Properties properties)
    {
        try(FileOutputStream output = new FileOutputStream(PROPERTY_FILE))
        {
            // Save the properties to the file
            properties.store(output, "Updated properties file.");
            System.out.println("Properties have been saved to the file.");
        }catch(IOException ioe)
        {
            System.err.println("Error saving to the file");
            ioe.printStackTrace();
        }
    }
}
