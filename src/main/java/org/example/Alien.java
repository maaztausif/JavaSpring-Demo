package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;


@Component
public class Alien {
    @Value("34")
    private int age;
//    @Autowired
//    @Qualifier("com123")
    private Computer com;

    public Alien() {
        System.out.println("Alien Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//@ConstructorProperties({"age","lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public  void program(){
        System.out.println("ALien is Coding...");
        com.compile();

    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("com123")
    public void setCom(Computer com) {
        this.com = com;
    }
//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }
}
