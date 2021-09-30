package io.newfeatures;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		
		Greeting helloGreeting = new HelloGreeting();
		Greeting helloRama = new HelloRama();
		greeter.greet(helloRama);
		Greeting lambdaGreeting = () -> System.out.println("Hello World");
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World");
			}
		};
		
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}
	
	

}
