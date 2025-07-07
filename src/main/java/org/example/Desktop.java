package org.example;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desctop compiling...");
    }

    @Override

    public void compile() {
        System.out.println("Compile Desktop");
    }
}
