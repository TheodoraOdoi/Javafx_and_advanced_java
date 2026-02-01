package edu.adse2501.sess02_generics;

/**
 * A generic class that stores and manages a value of type {@code T}.
 * @param <T> the type of the value held by this class
 * @author Administrator
 */
public class GenericClass<T> {
    /***
     * The store value of generic type{@code T}
     */
    private T varT;

    /**
     * Instantiate a {@code GenericClass} with no initial value
     */
    public GenericClass() { }

    /***
     * Instantiate a {@code GenericClass} with an initial value
     * @param varT the initial value value to be stored
     */
    public GenericClass(T varT) {
        this.varT = varT;
    }
    
    /**
     * Return the stored value
     * @return the varT
     */
    public T getVarT() {
        return varT;
    }

    /**
     * Set the value to be stored
     * @param varT the varT to set
     */
    public void setVarT(T varT) {
        this.varT = varT;
    } 
    
    /**
     * Returns the runtime type name of the stored value.
     *
     * @return the fully qualified type name of {@code T}
     * @throws NullPointerException if the stored value is {@code null}
     */
    public String showType()
    {
        return this.varT.getClass().getTypeName();
    }
}
