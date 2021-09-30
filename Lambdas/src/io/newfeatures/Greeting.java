package io.newfeatures;

@FunctionalInterface
public interface Greeting {
	
	public void perform();
	
	
	public default int say() {
		return 2;
	}

}
				