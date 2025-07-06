package org.example;

public class Alien {

    private int age;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public  void program(){
        System.out.println("Coding...");
        lap.compile();

    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
