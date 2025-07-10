package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com123")
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desctop compiling Constructor...");
    }

    @Override

    public void compile() {
        System.out.println("Compile Desktop");
    }
}
