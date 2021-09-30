package com.sumit.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Car car = (Car) context.getBean("car");
    	car.drive();
    	
//    	Tyre t = (Tyre)context.getBean("tyre");
//    	System.out.println(t);
    }
}
