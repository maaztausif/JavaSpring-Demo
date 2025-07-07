package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien");
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
        System.out.println("Coding...");
        com.compile();

    }

    public Computer getCom() {
        return com;
    }

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
