

//MyTask is-a Thread
class MyTask extends Thread{
	@Override
	public void run() {
		for (int doc=1; doc<=10; doc++) {
			System.out.println("@@printing documents number from " + doc + " printer2");
		}
		
	}
}

class MyThread implements Runnable{
	public void run() {
		
		for (int doc=1; doc<=10; doc++) {
			System.out.println("@@printing documents number from " + doc + " printer3");
		}
	}
}


public class App {
	//this runs the main thread
	public static void main(String[] args) {
		//whatever we print in this thread will be executed by main thread
		//threads always execute the jobs in sequence
		
		//job1
		System.out.println("==Application started==");
		
		//job2
		MyTask myTask = new MyTask();
		myTask.start();
		
		Runnable r = new MyThread();
		Thread task = new Thread(r);
		task.start();
		
		//job3
		for (int doc=1; doc<=10; doc++) {
			System.out.println("##printing documents number from " + doc + " printer1");
		}
		
		
		//job4
		System.out.println("==Application finished==");

	}

}
