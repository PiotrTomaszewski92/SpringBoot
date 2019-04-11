package com.springboot.demo.mycoolapp.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloRestController {
    //inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String showHelloWorld(){
        return "Hello World! Time on server is: "+ LocalDateTime.now()+"\n" +
                "<h2>Coach: "+coachName+", team: "+teamName+"</h2>";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){return "Run a hard 5k"; }

    @GetMapping("/lucky")
    public String getLuckyDay(){return "Today is your lucky day!!!";}
}

