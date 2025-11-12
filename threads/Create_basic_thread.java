public class Create_basic_thread{
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread();
        System.out.println("Printing thread state before starting.");
        System.out.println(thread.getState());
        System.out.println("Printing thread state after starting.");
        thread.start();
        System.out.println(thread.getState());
        System.out.println(thread.getName());

        Thread1 t1 = new Thread1("Thread 1");
        t1.start();
        System.out.println(t1.getState());
    }
}

class Thread1{
    String name;

    Thread1(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(name+" thread is in "+this.getState()+" state.");
    }
}