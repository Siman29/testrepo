package com.siman.firstJavaApp;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );\
    	ApplicationContext context = new ClassPathXmlApplicationContext("string.xml");
        Vehicle obj = (Vehicle) context.getBean("bike");
        obj.drive();
        
        //Car car = (Car) context.getBean("car");
        //car.drive();
        
        //Tyre objT = (Tyre) context.getBean("tyre");
        //System.out.println(objT);
        
        //((AbstractApplicationContext) context).close();
    }
}
