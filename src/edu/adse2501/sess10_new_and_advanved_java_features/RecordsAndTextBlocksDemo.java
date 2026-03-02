package edu.adse2501.sess10_new_and_advanved_java_features;

/**
 * This program demonstrates the use of records and text blocks in Java.
 *
 * - Records: Provides a compact syntax for data classes, automatically
 * generating essential methods like `toString()`, `equals()`, and `hashCode()`.
 * - Text Blocks: Simplifies multi-line strings, making them more readable, and
 * reduces the need for escape sequences.
 * 
 * @author todoi
 */
public class RecordsAndTextBlocksDemo
{
    /**
     * The Person record represents a simple data class with three fields: -
     * name: The name of the person - age: The age of the person - email: The
     * email address of the person
     *
     * The record automatically generates: - A constructor with all fields. -
     * Accessor methods for each field (e.g., name(), age(), email()). -
     * `equals()`, `hashCode()`, and `toString()` methods.
     */
    public record Person(String name, int age, String email)
    {
        // you can add extra fields & methods if needed
        public String greeting()
        {
            return "Hello, my name is " + name;
        }
    }
    
    public static void main(String[] args)
    {
        //create an instance of the person record
        Person person = new Person("Martin Luthur", 35, "m.luthur@example.co.ke");
        
        //display the above person's details using a text block
        String personInfo = """
            Person Information:
            -----------------------------
            Name: %s
            Age: %d
            Email: %s
            -----------------------------
                            """.formatted(person.name(), person.age(), person.email());
        System.out.println(personInfo);
        
        //example of using a text block to create a JSON-like string fo the person
        String personJson = 
            """
                {
                    "name": "%s",
                    "age": "%d",
                    "email": "%s"
                }
            """.formatted(person.name(), person.age(), person.email());
        
        //display the JSON-like representation of the person's details
        System.out.println("JSON representation of Person:");
        System.out.println(personJson);
    }
}
