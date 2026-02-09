package edu.adse2501.sess05_multithreading;

import java.awt.BorderLayout;

class MyThread extends Thread
{
    /**
     * Constructor to set the name of the thread
     * @param name 
     */
    public MyThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        System.out.println(getName() + " is running");
        
        //Demonstrate the sleep method
        try
        {
            System.out.println(getName() + " is sleeping for 2 seconds");
            Thread.sleep(2000);
        }catch (InterruptedException ie)
        {
            // Print error message when the thread is interrupted
            System.err.println(this.getName() + " was interrupted!");
            System.err.println("Error: " + ie.getLocalizedMessage());
            Thread.currentThread().interrupt(); // Preserve the interrupted status
        }
        
        // Print completion message after the loop completes
        System.out.println(this.getName() + " has finished executing!");
    }
    
    
}
        
/**
 * Java program to 
 * @author todoi
 */
public class ThreadMethodsDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // 1. Demonstrate the seName() & getName()
        MyThread thread1 = new MyThread("Thread-1"); // set the name using the constructor
        System.out.println("The name of thread1 is: " + thread1.getName());//get the thread's name
        thread1.setName("Renamed Thread-1");//change the name using the setter/mutator
        System.out.println("New name of 'thread-1' is: " + thread1.getName());
        
        // 2. Demonstrate setPriority() & getPriority()
        thread1.setPriority(Thread.MAX_PRIORITY);//set thread1's priority to the highest ie 10
        System.out.println("The priority of 'thread1' is: " + thread1.getPriority());
        
        // 3. Demonstrate isAlive()
        System.out.println("Thread1 is alive? : " + thread1.isAlive());
        
        // 4. Demonstrate start()
        System.out.println("Starting 'thread1' ...");
        thread1.start();
        
        // 5. Demonstrate isDaemon() to find out if 'thread1' is a deamon thread
        System.out.println("Thread1 is a daemon thread? : " + thread1.isDaemon());
        System.out.println("Thread1 is alive? : " + thread1.isAlive());
        
        // 6. Demonstrate join()
        try
        {
            System.out.println("Waiting for 'thread1' to complete...");
            thread1.join();//main thread awaits for thread1 to complete
            System.out.println("Thread1 has completed!");
        }catch(InterruptedException ie)
        {
            System.err.println("Main thread was interruted while waiting .");
        }
        
        // 7. Demonstrate isAlive() again
        System.out.println("Thread1 ia alive after completion? : " + thread1.isAlive());
        
        // 8. Demonstrate Thread.currentThread()
        System.out.println("Current thread is: " +Thread.currentThread().getName());
        
        // 9. Demonstrate
        
      
    }
    
}
