package edu.adse2501.sess02_generics;

/**
 * Generic base class {@code Container} that can hold items of different types.
 * 
 * @param <T> the type of item/content held by this class.
 * @author Administrator
 */
public class Container<T> {
    protected T item;

    /**
     * 
     * @param varT 
     */
    public Container(T varT) {
        this.item = varT;
    }

    /**
     * @return the varT
     */
    public T getVarT() {
        return item;
    }
    
    public void displayItemInfo()
    {
        System.out.println("Item: " + item.toString());
    }
}
