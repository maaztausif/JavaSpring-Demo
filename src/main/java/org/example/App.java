package org.example;

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
//        Laptop lap = new Laptop();
//        Alien alien = (Alien)context.getBean("alien");
//        alien.program();
//
//        Alien alien1 = (Alien)context.getBean("alien");
//        alien1.program();
    }
}
