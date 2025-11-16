class Testing_multithreading{
	public static void main(String[] args) throws InterruptedException{
		Thread1 thread1 = new Thread1("Tamara");
		System.out.println("Thread Tamara is in state: "+thread1.getState()+" before being started");
		thread1.setPriority(4);	
		thread1.start();
		System.out.println("Thread Tamara is in state: "+thread1.getState()+" after being started");	
		
		Thread1 thread2 = new Thread1("Sam");
		System.out.println("Thread Sam is in state: "+thread2.getState()+" before being started");	
		thread2.setPriority(3);
		thread2.start();
		System.out.println("Thread Sam is in state: "+thread2.getState()+" after being started");	
	}
}

class Thread1 extends Thread{

	String name;
	Thread1(String name){
		this.name = name;
	}
	
	@Override
	public void run(){
		System.out.println(name + " thread is running.");
	}
}
