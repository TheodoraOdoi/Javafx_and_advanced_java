package edu.adse2501.sess10_new_and_advanved_java_features;

import java.util.Scanner;

/**
 *This program demonstrates the enhanced features of the switch-case construct
 * in Java. The enhanced features include: 
 * 1. Multiple values per case. 
 * 2. Using `yield` to return a value from the switch expression. 
 * 3. Using the switch statement as an expression to assign values. 
 * 4. Thin arrow syntax (`->`) for a cleaner code structure. 
 * 5. Changed scope within each case.
 * @author todoi
 */
public class EnhancedSwitchCaseDemo
{
    public static void main(String[] args)
    {
        // Scannaer object to get input from the user
        Scanner sc = new Scanner(System.in);
        
        // prompt the user for a day of the week in numeric form(1->Sunday,7->Saturday)
        System.out.println("Please enter a number for the day of the week "
                + "1 -> Sunday through to 7 -> Saturday");
        int day = sc.nextInt();
        
        //Demonstrate multiple values per case, yield,expression,thin arrow & scope
        String dayType = getDayType(day);
        
        //Display the results
        System.out.println("The type of day for day " + day + " is: " + dayType);
    }

    /**
     * Method to get the type of day based on the day of the week. It demonstrates
     * various enhancements to the switch...case statement.
     * 
     * @param day integer value representing the day of the week (1 -> Sunday...
     * 7->Saturday).
     * 
     * @return string representing the type of day("weekday" or "weekend")
     */
    private static String getDayType(int day)
    {
        //use switch as an expression to determine the type of day
        String dayType = switch(day)
        {
            //support multiple values per case for weekdays(2-6) & weekend(1-7)
            case 2,3,4,5,6 ->
            {
                //scope example: declare a variable within the case block
                String description = "It's a weekday":
                System.out.println(description);
                //use the yield keyword to return a value from the case block
                yield "weekday";
            }
            case 1,7 ->
            {
                //scope example: declare a variable for weekend cases
                String description = "It's a weekend!":
                System.out.println(description);
                //use the yield keyword to return a value from the case block
                yield "weekend";
            }
            //Default case to handle all other unexpected cases
            default ->
            {
                System.out.println("Sorry, you gave us an invalid day.\nPlease "
                        + "enter a number from 1 - 7");
                yield "Unknown";
            }
        };
        return dayType;
    }
}
