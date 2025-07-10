package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien = context.getBean(Alien.class);
//        alien.setAge(12);
        System.out.println(alien.getAge());
        alien.program();

//        Desktop myDesk = context.getBean(Desktop.class);
//        myDesk.compile();
//
//        Desktop myDesk1 = context.getBean(Desktop.class);
//        myDesk1.compile();


////        Laptop lap = new Laptop();
//        Alien alien = context.getBean("alien",Alien.class);
//        System.out.println(alien.getAge());
//        alien.program();

//        Desktop desktop =  context.getBean(Desktop.class);
//        Alien alien1 = (Alien)context.getBean("alien");
//        System.out.println(alien1.age);
////        alien1.program();
    }
}
