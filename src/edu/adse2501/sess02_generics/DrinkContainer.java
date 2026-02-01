package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Drink;

/**
 * Specialized generic class {@code DrinkContainer} that only holds items of 
 * type T which extends the Food class
 * @author Administrator
 * @param <T> a subclass of {@code Drink} class
 */
public class DrinkContainer<T extends Drink> extends Container<T> {
    
    public DrinkContainer(T drinkItem) {
        super(drinkItem);
    }
    
    // Method to Display drink-specific information
    public void displayVolume()
    {
        System.out.println(item.getName() + " comes in a volume of"
                    + item.getVolume() + " liters");
    }
    
}
