package edu.adse2501.sess01_java_util_apis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java program that demonstrate an unmodifiable implementation of the list 
 * interface
 * 
 * @author Window
 */
public class UnmodifiableListDemo
{
    public static void main(String[] args)
    {
        // create a mutable list of fruits
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apples");
        mutableList.add("Orange");
        mutableList.add("Mango");
        mutableList.add("Grapes");
       
        //create an unmodifiable view of the fruitlist
        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
        
        //Try reading the elements(fruits) from the unmodifiable list
        System.out.println("The first fruit/element in the unmodifiable list " 
                + "is: " + unmodifiableList.get(0));
        
        //Try to add a new fruit(banana) to the unmodifiable list
        try
        {
            unmodifiableList.add("Banana"); //will throw an exception
        }catch(UnsupportedOperationException uoe)
        {
            System.err.println("Modification attempt failed due to:\n" + 
                    uoe.getLocalizedMessage());
        }
    }
}
