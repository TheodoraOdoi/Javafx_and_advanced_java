package edu.adse2501.sess05_multithreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class ArraySumTask extends RecursiveTask<Long>
{
    private static final int THRESHOLD = 1000;// threshold for splitting tasks
    private final int[] array;
    private final int start;
    private final int end;

    // constructor to initialise a task with an array and bounds (start & end)
    
    public ArraySumTask(int[] array, int start, int end)
    {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute()
    {
        int length = end - start;
        if(length <= THRESHOLD)
        {
            //Base case: when the task is small enough (<= 1000)
            //compute it directly
            long sum = 0L;
            for(int n = start; n < end; n++)
            {
                sum += array[n];
            }
            return sum;
        }
        else
        {
            //when > 1000, split the task recursively
            int middle = start + length / 2;
            ArraySumTask leftTask = new ArraySumTask(array, start, middle);
            ArraySumTask rightTask = new ArraySumTask(array, middle, end);
            
            //fork the 
        }
    }
    
    
}

/**
 * Java program to split a task among a number of threads when its
 * computationally intensive
 * @author todoi
 */
public class ForkJoinDemo
{
    // Declare and initialise an array of numbers
        int[] array = new int[10000];
        for (int n = 0; n < array.length; n++)
        {
            array[n] = n + 1; // Fill the array with numbers (1 - 10000)
        }

        // Create a ForkJoinPool
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // Create the main task for summing the array
        ArraySumTask mainTask = new ArraySumTask(array, 0, array.length);

        // Call/invoke the task and get the result
        long result = forkJoinPool.invoke(mainTask);

        // Display the result
        System.out.println("The sum of the numbers from 1 to " + array.length +
                " is " + result);



}
