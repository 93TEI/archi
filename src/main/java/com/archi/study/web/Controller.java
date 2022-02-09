package com.archi.study.web;

import com.archi.study.service.RealRobotFactory;
import com.archi.study.service.RobotFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String robotWorld(){
        RobotFactory rf = new RealRobotFactory();


    }
}
