public class Thread_functionality_demo{
    public static void main(String[] args) throws InterruptedException{
        Thread1 t1 = new Thread1("Thread 1");
        System.out.println("Thread state before starting.");
        System.out.println(t1.getState());
        t1.start();
        System.out.println("Thread state after starting.");
        System.out.println(t1.getState());
    }
}

class Thread1 extends Thread{
    String name;

    Thread1(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(name+" thread is running.");
    }
}