package com.archi.study.service;

public class RealRobotFactory extends RobotFactory{
    @Override
    public Robot createRobot(String name){
        switch(name){
            case "super" : return new SuperRobot();
            case "power" : return new PowerRobot();
        }
        return null;
    }
}
