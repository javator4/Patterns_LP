package com.sda.singleton;

public class Main {

    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();

        Robot accountingRobot1 = robotFactory.makeRobot("ACCOUNTING_ROBOT");
        Robot drillingRobot = robotFactory.makeRobot("DRILLING_ROBOT");

        accountingRobot1.work();
        drillingRobot.work();

    }
}
