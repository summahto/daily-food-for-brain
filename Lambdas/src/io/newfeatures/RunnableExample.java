package io.newfeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside Runnable");
			}
		});
		
		myThread.run();
		
		Thread myLambdaThread = new Thread(()-> System.out.println("inside Lambda Runnable"));
		myLambdaThread.run();
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		ExecutorService threadPoolEx = new ThreadPoolExecutor(0, 0, 0, null, null);
		List <Callable<String>> callables = new ArrayList<>();
		callables.add(newCallableTask("Task 1.1"));
		callables.add(newCallableTask("Task 1.1"));
		callables.add(newCallableTask("Task 1.1"));
		
		try {
			String result = (String)es.invokeAny((Collection)callables);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static Callable<String> newCallableTask(String s) {
	
		return new Callable() {

			@Override
			public Object call() throws Exception {
				String msg = Thread.currentThread().getName() + "msg";
				return msg;
			}
			
		};
	}

}
