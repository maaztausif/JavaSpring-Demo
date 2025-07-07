package org.example;

public class Laptop implements Computer {
//    public Laptop(){
//        System.out.println("laptop constructor");
//    }
    @Override
    public void compile(){
        System.out.println("Compiling laptop....");
    }
}
