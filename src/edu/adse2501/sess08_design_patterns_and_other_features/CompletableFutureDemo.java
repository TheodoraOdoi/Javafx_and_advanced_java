package edu.adse2501.sess08_design_patterns_and_other_features;

import java.util.concurrent.CompletableFuture;

/**
 * Java program to demonstrate the completableFuture class & some of 
 * its methods
 * 
 * @author user
 */
public class CompletableFutureDemo
{
    public static void main(String[] args)
    {
        // 1. supplyAsync(): Runs a task asynchonously and returns a completableFuture
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() ->
        {
                System.out.println("Executing asynchronouse task..");
        try
        {
            Thread.sleep(1000); // simulate a delay
        }catch(InterruptedException ie)
        {
            throw new IllegalStateException(ie);
        }
        return "Hello World!";
        });
        
        // 2. thenApply(): process the results for the supplyAsync() when it's ready
        CompletableFuture<String> greetingFuture = future.thenApply(result ->
        {
                System.out.println("Applying transformation to result...");
                return result + "- Greetings from CompletableFuture";
        });
        
        // 3. join(): waits for the computation to complete & retrieve it's result
        System.out.println("Result using join(): " + greetingFuture.join());
        
        // 4. thenAccept(): Consumes the result without returning any additional result
        greetingFuture.thenAccept(result ->
        {
            System.out.println("Consuming result with thenSccept(): " + result);
        });
        
        // 5. whenComplete(): Handles both the tresult & any exception that may occur
        greetingFuture.whenComplete((result, exception) -> 
        {
            if(exception == null)
            {
                System.out.println("whenComplete(): Task completed successfully "
                        + "with result: " + result);
            }
            else
            {
                System.out.println("whenComplete(): Task failed with exception: "
                        + exception.getLocalizedMessage());
            }
        });
        
        // 6. getNow(): Returns the results of completed, else return a default value
        String immediateResult = greetingFuture.getNow("Default CValue");
        System.out.println("Result using getNow(): " + immediateResult);
        
        // make sure the main() thread waits for the asynchronous tasks to complete
        try
        {
            Thread.sleep(2000); // just to ensure asynchronous tasks complete before program exits
        }catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}
