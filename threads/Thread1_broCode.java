/*
JVM allows multiple threads to run concurrently.
Each threds can execute parts of our thread in parallel with the main thread.
Each thread has a priority.
Threads with a higher priority can be executed in preference compared to threads with lower priority.

JVM continues to execute threads, until one of the following occurs: 
    1. The exit method of the class Runtime has been called.
    2. All user threads have died.

What is the "main" thread?
    -> When the JVM starts up, the thread that calls the main method is the "main" thread.
*/

// Below, we practice with the main thread.

//import threads.threads2.MyThread;

class Thread1_broCode{
    public static void main(String[] args) throws InterruptedException{
        /*
        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("Hehehe");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(3); // The priority of the threads ranges between 1-10, with "1" being the one with the lowest priority and "10" being the one with the highest priority.
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        for (int i = 10; i>=0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("You done, blud!");
        */
       //Thread.currentThread().setPriority(3); // The priority of the threads ranges between 1-10, with "1" being the one with the lowest priority and "10" being the one with the highest priority.

       String name1 = "Bhaalo chhele";
       MyThread thread2 = new MyThread(name1);
       thread2.setDaemon(false);
       thread2.start();
       System.out.println(thread2.isDaemon());
       //System.out.println(thread2.isAlive());
       //thread2.setName(name1);
       //System.out.println(thread2.getName());
       //System.out.println(thread2.getPriority()); // Inherits the priority of the thread that created it. In this case, the 
    }
}

class MyThread extends Thread{
    String name;
    MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        if(this.isDaemon() == true){
            System.out.println(name + " is a daemon-thread, that is running.");
        }
        else{
            System.out.println(name + " is a user-thread, that is running.");
        }

        System.out.println(this.getState());
    }
}