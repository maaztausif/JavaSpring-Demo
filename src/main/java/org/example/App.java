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
        Alien alien = context.getBean("alien",Alien.class);
        System.out.println(alien.getAge());
        alien.program();

//        Desktop desktop =  context.getBean(Desktop.class);
//        Alien alien1 = (Alien)context.getBean("alien");
//        System.out.println(alien1.age);
////        alien1.program();
    }
}
