package com.test;

class Super {
    Number method(Number n) {
    	System.out.println("Number method of Super Class called");
    	return n;
    }
    
    public static void main(String args[]) {
    	Super sup = new Sub();
    	Number n = sup.method(1);
    }
}

class Sub extends Super {
    @Override 
    Number method(Number n) {
    	System.out.println("Number method of Sub Class called");
		return n;
	}
}



