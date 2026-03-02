package edu.adse2501.sess10_new_and_advanved_java_features;

import static java.nio.file.Files.list;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This program demonstrates the usage of the Predicate.not method in java.
 * The Predicate.not nethod provides a cleaner way to negate predicates, especially
 * useful when filtering collections.
 * 
 * @author todoi
 */
public class PredicateNotDemo
{
    /**
     * filters out empty strings from the list using predicate.not
     * 
     * @param strings the list of the strings to filter
     * 
     * @return a new list containing only non-empty strings 
     */
    static List<String> filterNonEmptyStrings(List<String> strings)
    {
        //define a predicate to check if a string is empty
        Predicate<String> isEmpty = String::isEmpty;
        
        // use predicate.not to negate the isEmpty predicate, keeping only non-empty strings
        return strings.stream()
                .filter(Predicate.not(isEmpty)) // equivalent to : s-> !s.isEmpty()
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args)
    {
        //sample list of strings with some empty strings
        List<String> words = list.of("melon", "", "avocado", "banana", "", "grapes", "apple");
        
        System.out.println("Original list of strings(Fruits)");
        System.out.println(words);
        
        //filter out empty strings using predicate.not
        List<String> nonEmptyWords = filterNonEmptyStrings(words);
        
        System.out.println("\nList of words after filtering out empty strings:");
        System.out.println(nonEmptyWords);
    }
}
