package com.sereycode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("Java","GoLang","Scala"),
                new Person("Sam", 28, 100000)
                );
         return  response;
    }
    record Person(String name, int age, double savings){

    }
    record GreetResponse(
            String greet,
            List<String> favProgrammingLang,
            Person person
    ){}
}
