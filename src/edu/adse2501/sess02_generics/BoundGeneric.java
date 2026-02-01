package edu.adse2501.sess02_generics;

/**
 * This class will be used to demonstrate bound generic classes and generic methods.
 * This class accepts type java.lang.Number or any of its subclasses
 * @param <T> A class that extends the abstract java.lang.Number class.
 * @author Administrator
 */
public class BoundGeneric<T extends Number> {
    protected T[] nums;

    public BoundGeneric() {
    }

    public BoundGeneric(T[] nums) {
        this.nums = nums;
    }

    /**
     * @return the nums
     */
    public T[] getNums() {
        return nums;
    }

    /**
     * @param nums the nums to set
     */
    public void setNums(T[] nums) {
        this.nums = nums;
    }
    
    public T getSum() throws ArithmeticException
    {
        double sum = 0.0d;
        for(T num : nums)
            sum+= num.doubleValue();
        
        T sumOfArray = (T)Double.valueOf(sum);
        return sumOfArray;
    }
    
    //TODO: write an instance method called getAverage() or getMean() that 
    // returns the Arithmetic mean of the value in the T[] nums array.
}
