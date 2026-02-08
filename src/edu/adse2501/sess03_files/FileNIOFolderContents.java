package edu.adse2501.sess03_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Java program that accepts a directory/folder path from the user, & displaya
 * the files & folders in the directory if it exists.
 * 
 * @author user
 */
public class FileNIOFolderContents
{
    private static Path path2Directory;
    
    public static void main(String[] args)
    {
        //Use a try..with resources to autoclose resources
        try(Scanner sc = new Scanner(System.in))
        {
            //Prompt the user for the desired directory
            System.out.println("Please enter the path to the directory whose "
                    + "contents you wish to list/display -> ");
            
            //Read in the directory/folder name
            path2Directory = Paths.get(sc.next());
            
            //Display the contents of the directory/folder if the path exists
            if(Files.isDirectory(path2Directory))
            {
                System.out.println("The contents of the " + path2Directory
                        + "\n" + "-".repeat(100));
                
                //An object to iterate thru the directory contents
                DirectorySream<Path> directoryStream = 
                        Files.newDirectoryStream(path2Directory);
                for(Path path:directoryStream)
                {
                    System.out.println(path);
                }
                System.out.println("-".repeat(100));
            }
            else
                throw new IOException();
        } catch(IOException ioe)
        {
            System.err.println("The directory path was not found. \nPlease "
                    + "confirm it exists and that you have sufficient "
                    + "permissions to access it and try again.\n");
        } catch (Exception e)
        {
            System.err.println("The error " + e.getLocalizedMessage()
                    + " occurred!");
        }
    }
}
