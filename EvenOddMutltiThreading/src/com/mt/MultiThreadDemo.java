package com.mt;

class EvenThread extends Thread{
	int limit;
	SharedPrinter printer;
	
	EvenThread(int limit, SharedPrinter printer){
		this.limit = limit;
		this.printer = printer;

	}
	
	@Override
	public void run() {
		int num = 2;
		
		while (num <= limit) {
			printer.printEven(num);
			num = num + 2;
		}
	}
	
	
}

class OddThread extends Thread{
	int limit;
	SharedPrinter printer;
	
	OddThread(int limit, SharedPrinter printer){
		this.limit = limit;
		this.printer = printer;
	}
	
	@Override
	public void run() {
		int num = 1;
		
		while(num <= limit) {
			printer.printOdd(num);
			num = num +2;
			
		}
	}
}

class SharedPrinter{
	
	boolean isOddPrinted = false ;
	
	public SharedPrinter() {	
	}
	
	synchronized void printOdd(int num) {
		while(isOddPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " : " + num);
		isOddPrinted = true;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
	
	synchronized void printEven(int num) {
		while (!isOddPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " : " + num);
		isOddPrinted = false;
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
	
}

public class MultiThreadDemo {

	public static void main(String[] args) {
		SharedPrinter sp = new SharedPrinter();
		OddThread ot = new OddThread(20, sp);
		ot.setName("Odd-Thread");
		EvenThread et = new EvenThread(20, sp);
		et.setName("Even-Thread");
		
		ot.start();
		et.start();
		
		try {
			ot.join();
			et.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
