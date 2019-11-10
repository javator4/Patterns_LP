package com.sda.singleton;



public class RobotFactory {
    public Robot makeRobot(String robotType) {
        
        if(robotType == "ACCOUNTING_ROBOT") {
            return new AccountingRobot();
        }
        if(robotType == "DRILLING_ROBOT"){
            return new DrillingRobot();
        }
        if(robotType == "BAD_JOKE_ROBOT"){
            return new BadJokeRobot();
        }
        return null;
    }
    
}
