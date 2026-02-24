package edu.adse2501.sess09_java_data_structures;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Java program that demonstrates the usage of the enumeration interface in 
 * java. An enumeration is an interface thet allows us to traverse through
 * legacy collections like Vector, Stack, Hashtable and Properties.
 * 
 * Although its considered a legacy interface, Enumeration is still useful for 
 * working with these legacy collections.
 * 
 * @author todoi
 */
public class EnumerationDemo
{
    /**
     * This method initialises a vector with a list of fruits & uses an
     * Enumeration to iterate thru the vector
     */
    public static void main(String[] args)
    {
        // Create a vector & add some elements(fruits) to it
        Vector<String> fruits = new Vector<>();
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Sweet Melon");
        fruits.add("Grapes");
        fruits.add("Kiwi");
        fruits.add("Avocado");
        fruits.add("Orange");
        fruits.add("Banana");
        
        //Display the initial contents of the vector
        System.out.println("Fruits in the Vector: " + fruits);
        
        //Get an Enumeration object to iterate over the vector elements
        Enumeration<String> fruitEnumeration = fruits.elements();
        
        System.out.println("\nIterating over the Vector elements using an"
                + " Enumeration");
        
        //Wuse the enumeration to traverse thru each element in the vector
        while(fruitEnumeration.hasMoreElements())
        {
            String fruit = fruitEnumeration.nextElement(); //Retrieve the next element(fruit)
            System.out.println(" Fruit: " + fruit);
        }
              
    }
}
