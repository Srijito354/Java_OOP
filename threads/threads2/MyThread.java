/*
This program is for demonstrating another way of creating threads.
Which is:
    Creating a class, which extends the Thread class.
*/
package threads.threads2;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}