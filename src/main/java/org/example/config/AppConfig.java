package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){ //default bean name class k name hota he pr small letter hota he first
//        return new Desktop();
//    }
//
//    @Bean
////    @Primary
//    public Laptop laptop(){ //default bean name class k name hota he pr small letter hota he first
//        return new Laptop();
//    }
//
//
//@Bean
//    public Alien alien(@Qualifier("desktop") Computer com){
//        Alien obj = new Alien();
//        obj.setAge(90);
//        obj.setCom(desktop());
//        return obj;
//    }

}
