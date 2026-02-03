package edu.adse2501.sess03_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 *Java program that demonstrate how to read file contents using methods
 * of the java.io.BufferedReader class without a try...catch block
 * 
 * @author user
 */
public class BufferedReader_NoTryCatch
{
    // URL to hold the reletive path to the file 'read_files.txt'
    protected URL url2File = this.getClass()
            .getResource("../../files/read_files.txt");
    
    public static void main(String[] args) throws IOException
    {
        // Declare & instantiate a file object
        File readFile = new File(new BufferedReader_NoTryCatch().url2File.getPath());
        
        //Declare & instantiate a java.io.BuferedReader object
        BufferedReader br = new BufferedReader(new FileReader(readFile));
        
        //Display the contents of the file
        System.out.println("The contents of the: " + readFile.getName() + " are:");
        
        String st;
        int n = 1;
        while((st = br.readLine())!= null)
        {
            System.out.printf("Line &d \n %s \n",n,st);
            n++; // increament the line counter
        }
        
        br.close();
    }
}
