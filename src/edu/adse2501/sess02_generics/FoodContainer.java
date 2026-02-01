package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Food;

/**
 * 
 * @param <T> a subclass of {@code Food} class
 * @author Administrator
 */
public class FoodContainer<T extends Food> extends Container<T>{
    
    public FoodContainer(T item) {
        super(item);
    }
    
    // Method to display details about the food's expiration date
    public void displayExpirationDate()
    {
        System.out.println("Expiration date of " + item.getName() + ": "
            + item.getExpirationDate());
    }
}
