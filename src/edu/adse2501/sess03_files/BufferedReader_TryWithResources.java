package edu.adse2501.sess03_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 *Java program that demonstrate how to read file contents using methods
 * of the java.io.BufferedReader class without a try...catch block
 * @author user
 */
public class BufferedReader_TryWithResources
{
    // URL to hold the reletive path to the file 'read_files.txt'
    protected URL url2File = this.getClass()
            .getResource("../../files/read_files.txt");
    
    // Main method begins program execution
    public static void main(String[] args) throws IOException
    {
        // Use a try ...with resources
        try(BufferedReader br = new BufferedReader(new FileReader(new File(new BufferedReader_TryWithResources().url2File.getPath()))))
        {
            //Display the contents of the file
            System.out.println("The contents of the are:");
        
            String st;
            int n = 1;
            while((st = br.readLine())!= null)
            {
                System.out.printf("Line &d \n %s \n",n,st);
                n++; // increament the line counter
            }
        } catch (FileNotFoundException fne)
        {
            System.out.println("""
                                Sorry the file was not found.
                                Please check for typos and ensure you have permissions
to access the file & try again.""");
        }catch (Exception e)
        {
            System.err.println("The error: " + e.getLocalizedMessage() 
                    + " occurred!");
        }
        
    }
}
