package edu.adse2501.sess03_files;

import java.net.URL;
import java.util.Scanner;

/**
 *Java program to demonstrate how to read file contents using the methods
 * of the java.util.Scanner class.
 * @author user
 */
public class ReadFile_Scanner
{
    // URL to hold the reletive path to the file 'read_files.txt'
    protected URL url2File = this.getClass()
            .getResource("../../files/read_files.txt");
    
    public static void main(String[] args)
    {
        //TODO:Write code with proper try...with resource initialisation and 
        //exception handling to read the contents of above file using the 
        //methods for the Scanner class.
        ReadFile_Scanner program = new ReadFile_Scanner();
 
        // Check if the resource was found
        if (program.url2File == null) {
            System.out.println("""
                                Sorry the file was not found.
                                Please check for typos and ensure you have 
                               permissions to access the file & try again.""");
        }

        // Try-with-resources ensures the Scanner is closed automatically
        try (Scanner scanner = new Scanner(program.url2File.openStream())) 
        {
            //Read line by line (most common & readable)
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (Exception e)
                    {
                    System.err.println("The error: " + e.getLocalizedMessage() 
                            + " occurred!");
                    }

    }
}
