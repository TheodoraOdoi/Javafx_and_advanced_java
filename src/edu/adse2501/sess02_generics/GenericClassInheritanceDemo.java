package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Drink;
import edu.adse2501.classes.Fruit;
import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
public class GenericClassInheritanceDemo {
    // main method begins execution
    public static void main(String[] args) {
        // Create a Fruit Object
        Fruit orange = new Fruit("Sweet", 150.0f,"Orange", LocalDate.now()
                .plusDays(7));
        
        // Create an Orange fruit container
        FoodContainer<Fruit> orangeContainer = new FoodContainer<>(orange);
        
        // call/invoke the method from the 'Container' and 'FoodContainer' 
        //classes
        orangeContainer.displayItemInfo(); // Display the fruit's details
        orangeContainer.displayExpirationDate(); // Display the Fruit Exp date
        
        // TODO
        //1. Create a Drink Object
        Drink appleJuice = new Drink("Apple Juice", 500.0f, "Apple", 
                LocalDate.now().plusDays(14));
        
        //2. Create a Juice Container
        FoodContainer<Drink> juiceContainer = new FoodContainer<>(appleJuice);
        
        //3. Invoke the methods from the 'Container' and 'DrinkContainer' classes
        juiceContainer.displayItemInfo();
    juiceContainer.displayExpirationDate();
    }
}
