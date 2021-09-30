package io.newfeatures.java8.unit2;

public class ThisReferenceExample {
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println(i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisRefExample = new ThisReferenceExample();
		thisRefExample.doProcess(10, i -> {
			System.out.println(i);
			//System.out.println(this); this does not work because the Lambda does not override the this reference
			//and since the this is the reference for thisRefExample, it cannot be used inside a static method
		});
		
		thisRefExample.execute();

	}

}

interface Process{
	public void process(int i);
}
