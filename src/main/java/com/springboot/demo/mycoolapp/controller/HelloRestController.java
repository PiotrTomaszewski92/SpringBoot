package com.springboot.demo.mycoolapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloRestController {
    @GetMapping("/")
    public String showHelloWorld(){
        return "Hello World! Time on server is: "+ LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){return "Run a hard 5k"; }

    @GetMapping("/lucky")
    public String getLuckyDay(){return "Today is your lucky day!!!";}
}

