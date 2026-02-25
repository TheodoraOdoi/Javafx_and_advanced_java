package edu.adse2501.sess09_java_data_structures;

import java.util.Enumeration;
import java.util.HashTable;

/**
 * This program demonstrates the usage of the Hashtable class in Java. Hashtable
 * is a collection class that stores key-value pairs, where both keys and values
 * are objects. The class is synchronised, making it thread-safe for concurrent
 * access, but it does not allow null keys or null values.
 *
 * Key methods demonstrated include: 
 * - put: To add key-value pairs to the Hashtable. 
 * - get: To retrieve the value associated with a specific key. 
 * - remove: To remove a key-value pair based on the key. 
 * - containsKey and containsValue: To check if a specific key or value exists. 
 * - elements and keys: To iterate over values and keys in the Hashtable.
 * 
 * @author user
 */
public class HashTableDemo
{
    /**
     * main method demonstrates basic operations of the java.util.HashTable
     * class including adding, retrieving, removing elements & checking for the
     * exixtence of specific keys or values.
     * 
     * @param args String array of command line arguments.
     */
    public static void main(String[] args)
    {
        // create a HashTable instance to store integer keys & string values
        HashTable<Integer, String> hashtable = new HashTable<>();
        
        // Adding key-value pairs to the HashTable
        System.out.println("Adding key-value pairs to the HashTable");
        hashtable.put(1, "Apple");
        hashtable.put(1, "Banana");
        hashtable.put(1, "Avocado");
        hashtable.put(1, "Mango");
        
        // Display the entire HashTable
        System.out.println("Initial HashTable: " + hashtable);
        
        // Retrieve a value associated with a specific key
        int keyToRetrieve = 3;
        System.out.println("\nValue associated with key " + keyToRetrieve + " : "
                + hashtable.get(keyToRetrieve));
        
        //Remove a key value pair based on the key
         int keyToRemove = 2;
        System.out.println("\nRemoving key " + keyToRemove + " and its value"
                + "from the hashtable");
        hashtable.remove(keyToRemove);
        System.out.println("Hashtable after");
        
        // checking whether a specific key exists in the Hashtable
         int keyToCheck = 1;
        System.out.println("\nDoes key " + keyToCheck + " exist? "
                + hashtable.containsKey(keyToCheck));
        
        // checking whether a specific value exists in the Hashtable
        String valueToCheck = "Mango";
        System.out.println("Does value '" + valueToCheck + "' exists? "
                + hashtable.containsValue(valueToCheck));
                
        // Iterating over the keys in the Hashtable
        System.out.println("\nIterating over the keys in the Hashtable:");
        Enumeration<Integer>keys = hashtable.keys();
        while(keys.hasMoreElements())
        {
            Integer key = keys.nextElement();
            System.out.println("Key: " + key);
        }
        
        // Iterating over the values in the Hashtable
        System.out.println("\nIterating over the values in the Hashtable:");
        Enumeration<String> values = hashtable.elements();
        while(values.hasMoreElements())
        {
            String value = values.nextElement();
            System.out.println("Value: " + value);
        }
    }
}
