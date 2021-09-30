package io.newfeatures.java8.unit2;

public class MethodRefExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(MethodRefExample::printMessage); //MethodRefExample::printMessage === () -> printMessage
		//whenever we have pass through, we are just passing the control, not doing anything extra
		//if you are just executing the method in your lambda expression, we can use Method Reference for it
		t.start();
		
		

	}

	public static void printMessage() {
		
		System.out.println("Hello World!");
	}

}
